type_registry = TypeRegistry(fallback_encoder=fallback_encoder)
codec_options = CodecOptions(type_registry=type_registry)
collection = db.get_collection("test", codec_options=codec_options)