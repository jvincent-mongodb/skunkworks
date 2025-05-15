from datetime import datetime
from pytz import timezone

utc_datetime = datetime(2002, 10, 27, 6, 0, 0)
pacific = timezone("US/Pacific")
local_datetime = pacific.localize(utc_datetime)

print(f"UTC datetime: {utc_datetime}")
print(f"Local datetime: {local_datetime}")