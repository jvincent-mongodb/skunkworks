import pprint
from bson.codec_options import CodecOptions

decimal_int_codec = DecimalIntCodec()
type_registry = TypeRegistry([decimal_codec, decimal_int_codec])
codec_options = CodecOptions(type_registry=type_registry)

collection = db.get_collection("test", codec_options=codec_options)
collection.insert_one({"num": DecimalInt("45.321")})

my_doc = collection.find_one()
pprint.pprint(my_doc)