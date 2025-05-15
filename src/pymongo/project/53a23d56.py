results = restaurants.find({ "name" : "Emerald Pub"}, {"grades": 0, "address": 0} )

async for restaurant in results:
    print(restaurant)