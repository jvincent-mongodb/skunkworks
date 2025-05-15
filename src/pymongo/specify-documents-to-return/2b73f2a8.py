results = restaurants.find({ "cuisine" : "Italian"}, sort={"name": pymongo.ASCENDING} )

async for restaurant in results:
    print(restaurant["name"])