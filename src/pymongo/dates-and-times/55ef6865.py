from datetime import datetime
from bson import encode, decode
from bson.datetime_ms import DatetimeMS
from bson.codec_options import CodecOptions, DatetimeConversion

val = encode({"date": datetime(1970, 1, 2)})
codec_ms = CodecOptions(datetime_conversion=DatetimeConversion.DATETIME_MS)
decoded = decode(val, codec_options=codec_ms)
print(decoded)