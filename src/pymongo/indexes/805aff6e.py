query = { "type": "movie", "genre": "Drama" }
sort = [("type", pymongo.ASCENDING), ("genre", pymongo.ASCENDING)]

cursor = movies.find(query).sort(sort)