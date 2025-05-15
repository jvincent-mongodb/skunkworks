from typing import TypedDict
from pymongo import MongoClient
from pymongo.collection import Collection

class Movie(TypedDict):
    name: str
    year: int

collection: Collection[Movie] = client.test.test
inserted = collection.insert_one(
    Movie(name="Jurassic Park", year=1993)
)
result = collection.find_one({"name": "Jurassic Park"})
assert result is not None
assert result["_id"] # type:ignore[typeddict-item]