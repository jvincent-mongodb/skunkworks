from datetime import datetime
from bson import encode, decode
from bson.datetime_ms import DatetimeMS

out_of_range = DatetimeMS(-(2**62))
val = encode({"date": out_of_range})
decoded = decode(val)
print(decoded)