from typing import TypedDict

class Movie(TypedDict):
    name: str
    year: int

client: MongoClient[Movie] = MongoClient()