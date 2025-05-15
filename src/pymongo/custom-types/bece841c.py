from bson.codec_options import CodecOptions

codec_options = CodecOptions(type_registry=type_registry)
collection = db.get_collection("test", codec_options=codec_options)