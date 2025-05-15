from bson.codec_options import CodecOptions,TypeRegistry

codec_options = CodecOptions(
    type_registry=TypeRegistry(
        [PickledBinaryDecoder()], fallback_encoder=fallback_pickle_encoder
  )
)

collection = db.get_collection("test", codec_options=codec_options)
collection.insert_one(
    {"_id": 1, "str": MyStringType("hello world"), "num": MyNumberType(2)}
)
my_doc = collection.find_one()

print(isinstance(my_doc["str"], MyStringType))
print(isinstance(my_doc["num"], MyNumberType))