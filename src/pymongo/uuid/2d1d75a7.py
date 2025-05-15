from bson.codec_options import CodecOptions

csharp_opts = CodecOptions(uuid_representation=UuidRepresentation.CSHARP_LEGACY)
csharp_database = client.get_database("database_name", codec_options=csharp_opts)