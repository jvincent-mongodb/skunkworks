from bson.codec_options import CodecOptions

csharp_opts = CodecOptions(uuid_representation=UuidRepresentation.CSHARP_LEGACY)
csharp_collection = client.testdb.get_collection("collection_name", codec_options=csharp_opts)