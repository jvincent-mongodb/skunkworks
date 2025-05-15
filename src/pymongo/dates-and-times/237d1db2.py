from pymongo import MongoClient
from datetime import datetime
from bson.codec_options import CodecOptions
import pytz
from pytz import timezone

pacific = timezone("US/Pacific")
options = CodecOptions(tz_aware = True, tzinfo = pacific)
collection = database.get_collection("sample_collection", options)

find_result = (await collection.find_one())["date"]
print(f"datetime: {find_result}")
print(f"datetime.tzinfo: {find_result.tzinfo}")