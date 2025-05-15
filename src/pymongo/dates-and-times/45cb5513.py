from pymongo import MongoClient
from datetime import datetime
from bson.codec_options import CodecOptions

options = CodecOptions(tz_aware = True)
collection = database.get_collection("sample_collection", options)
find_result = collection.find_one()["date"]

print(f"datetime: {find_result}")
print(f"datetime.tzinfo: {find_result.tzinfo}")