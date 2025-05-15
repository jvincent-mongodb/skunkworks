operations = [
    InsertOne(
        document={
            "name": "Mongo's Deli",
            "cuisine": "Sandwiches",
            "borough": "Manhattan",
            "restaurant_id": "1234"
        }
    ),
    InsertOne(
        document={
            "name": "Mongo's Deli",
            "cuisine": "Sandwiches",
            "borough": "Brooklyn",
            "restaurant_id": "5678"
        }
    ),
    UpdateMany(
        filter={ "name": "Mongo's Deli" },
        update={ "$set": { "cuisine": "Sandwiches and Salads" }}
    ),
    DeleteOne(
        filter={ "restaurant_id": "1234" }
    )
]

results = restaurants.bulk_write(operations)

print(results)