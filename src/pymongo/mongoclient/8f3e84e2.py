from typing import TypedDict

class Movie(TypedDict):
    name: str
    year: int

client: AsyncMongoClient[Movie] = AsyncMongoClient()