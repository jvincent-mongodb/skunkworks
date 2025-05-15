from datetime import datetime
from bson.datetime_ms import DatetimeMS
from bson.codec_options import DatetimeConversion
from pymongo import MongoClient

client = AsyncMongoClient(datetime_conversion=DatetimeConversion.DATETIME_AUTO)
await client.db.collection.insert_one({"x": datetime(1970, 1, 1)})

await client.db.collection.insert_one({"x": DatetimeMS(2**62)})

async for x in client.db.collection.find():
   print(x)