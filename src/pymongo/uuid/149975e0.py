from bson.codec_options import CodecOptions, DEFAULT_CODEC_OPTIONS
from bson.binary import Binary, UuidRepresentation
from uuid import uuid4

# Using UuidRepresentation.CSHARP_LEGACY
csharp_opts = CodecOptions(uuid_representation=UuidRepresentation.CSHARP_LEGACY)

# Store a legacy C#-formatted UUID
input_uuid = uuid4()
collection = client.testdb.get_collection('test', codec_options=csharp_opts)
collection.insert_one({'_id': 'foo', 'uuid': input_uuid})

# Using UuidRepresentation.UNSPECIFIED
unspec_opts = CodecOptions(uuid_representation=UuidRepresentation.UNSPECIFIED)
unspec_collection = client.testdb.get_collection('test', codec_options=unspec_opts)

# UUID fields are decoded as Binary when UuidRepresentation.UNSPECIFIED is configured
document = unspec_collection.find_one({'_id': 'foo'})
decoded_field = document['uuid']
assert isinstance(decoded_field, Binary)

# Binary.as_uuid() can be used to convert the decoded value to a native UUID
decoded_uuid = decoded_field.as_uuid(UuidRepresentation.CSHARP_LEGACY)
assert decoded_uuid == input_uuid