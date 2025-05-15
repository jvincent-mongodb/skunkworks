results = restaurants.find({ "cuisine" : "Italian"}).limit(5)

async for restaurant in results:
    print(restaurant["name"])