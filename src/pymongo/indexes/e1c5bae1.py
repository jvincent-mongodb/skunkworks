query = { "title": "Batman" }
sort = [("title", 1)]

cursor = movies.find(query).sort(sort)