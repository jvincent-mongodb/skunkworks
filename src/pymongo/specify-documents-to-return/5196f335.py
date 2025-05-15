results = restaurants.find({ "cuisine" : "Italian"}).limit(5)

for restaurant in results:
    print(restaurant["name"])