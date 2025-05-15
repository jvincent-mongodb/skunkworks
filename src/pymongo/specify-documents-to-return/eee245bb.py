results = restaurants.find({ "cuisine" : "Italian"}, sort={"name": pymongo.ASCENDING} )

for restaurant in results:
    print(restaurant["name"])