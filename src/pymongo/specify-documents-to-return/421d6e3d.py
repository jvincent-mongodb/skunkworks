results = restaurants.find({ "cuisine" : "Italian"}, limit=5, sort={"name": pymongo.ASCENDING}, skip=10)

for restaurant in results:
    print(restaurant["name"])