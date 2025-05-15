results = restaurants.find({ "name" : "Emerald Pub"}, {"name": 1, "cuisine": 1, "borough": 1})

for restaurant in results:
    print(restaurant)