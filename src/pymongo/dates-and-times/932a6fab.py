from datetime import datetime
from bson import encode, decode
from bson.datetime_ms import DatetimeMS
from bson.codec_options import CodecOptions, DatetimeConversion

in_range = encode({"date": datetime(1970, 1, 1)})
out_of_range = encode({"date": DatetimeMS(-(2**62))})
codec_auto = CodecOptions(datetime_conversion=DatetimeConversion.DATETIME_AUTO)

in_decoded = decode(in_range, codec_options=codec_auto)
out_decoded = decode(out_of_range, codec_options=codec_auto)
print(f"in-range date: {in_decoded}")
print(f"out-of-range date: {out_decoded}")