results = restaurants.distinct("borough")

for restaurant in results:
    print(restaurant)