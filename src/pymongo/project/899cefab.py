results = restaurants.find({ "name" : "Emerald Pub"}, {"_id": 0, "name": 1, "cuisine": 1, "borough": 1})

async for restaurant in results:
    print(restaurant)