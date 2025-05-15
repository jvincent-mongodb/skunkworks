query = { "$text": { "$search": "a time-traveling DeLorean" } }

cursor = movies.find(query)