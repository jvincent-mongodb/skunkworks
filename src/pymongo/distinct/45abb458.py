results = await restaurants.distinct("borough")

for restaurant in results:
    print(restaurant)