results = collection.find({ "name": "Dunkin' Donuts" })

print(await results.next())