from pymongo import AsyncMongoClient

uri = "<connection string URI>"
client = AsyncMongoClient(uri)

try:
    database = client["sample_fruit"]
    collection = database["fruits"]

    await collection.insert_many([
        { "_id": 1, "name": "apples", "qty": 5, "rating": 3, "color": "red", "type": ["fuji", "honeycrisp"] },
        { "_id": 2, "name": "bananas", "qty": 7, "rating": 4, "color": "yellow", "type": ["cavendish"] },
        { "_id": 3, "name": "oranges", "qty": 6, "rating": 2, "type": ["naval", "mandarin"] },
        { "_id": 4, "name": "pineapple", "qty": 3, "rating": 5, "color": "yellow" },
    ])

    await client.close()

except Exception as e:
    raise Exception("Error inserting documents: ", e)