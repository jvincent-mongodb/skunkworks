from datetime import datetime
from bson import encode, decode
from bson.datetime_ms import DatetimeMS
from bson.codec_options import CodecOptions, DatetimeConversion

before = encode({"date": DatetimeMS(-(2**62))})
after = encode({"date": DatetimeMS(2**62)})
codec_clamp = CodecOptions(datetime_conversion=DatetimeConversion.DATETIME_CLAMP)

before_decoded = decode(before, codec_options=codec_clamp)
after_decoded = decode(after, codec_options=codec_clamp)
print(f"datetime before the range: {before_decoded}")
print(f"datetime after the range: {after_decoded}")