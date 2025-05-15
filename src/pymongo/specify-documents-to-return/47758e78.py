results = restaurants.find({ "borough" : "Manhattan"}).skip(10)

for restaurant in results:
    print(restaurant["name"])