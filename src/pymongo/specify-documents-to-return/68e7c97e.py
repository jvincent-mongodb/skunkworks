results = restaurants.find({ "cuisine" : "Italian"}) \
                     .sort("name", pymongo.ASCENDING) \
                     .limit(5) \
                     .skip(10)

async for restaurant in results:
    print(restaurant["name"])