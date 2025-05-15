from bson.codec_options import TypeRegistry

decimal_codec = DecimalCodec()
type_registry = TypeRegistry([decimal_codec])