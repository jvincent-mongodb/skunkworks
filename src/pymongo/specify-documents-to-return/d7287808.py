results = restaurants.find({ "borough" : "Manhattan"}, skip=10)

async for restaurant in results:
    print(restaurant["name"])