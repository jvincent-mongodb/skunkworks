from pymongo import MongoClient
from datetime import datetime
from pytz import timezone

utc_datetime = datetime(2002, 10, 27, 6, 0, 0)
pacific = timezone("US/Pacific")
local_datetime = pacific.localize(utc_datetime)

print(f"datetime before storage: {local_datetime}")
collection.insert_one({"date": local_datetime})
find_result = collection.find_one()["date"]
print(f"datetime after storage: {find_result}")