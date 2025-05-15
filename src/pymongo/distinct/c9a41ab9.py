results = await restaurants.distinct("borough", {
    "cuisine": "Italian"
})

for restaurant in results:
    print(restaurant)