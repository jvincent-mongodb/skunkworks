from typing import TypedDict, NotRequired
from pymongo import MongoClient
from pymongo.collection import Collection
from bson import ObjectId

class Movie(TypedDict):
     _id: NotRequired[ObjectId]
    name: str
    year: int

client: MongoClient = MongoClient()
collection: Collection[Movie] = client.test.test
inserted = collection.insert_one(Movie(name="Jurassic Park", year=1993))
result = collection.find_one({"name": "Jurassic Park"})
assert result is not None
assert result["_id"]