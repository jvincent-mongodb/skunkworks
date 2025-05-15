operations = [
    InsertOne(
        namespace="sample_mflix.movies",
        document={
            "title": "Minari",
            "runtime": 217,
            "genres": ["Drama", "Comedy"]
        }
    ),
    UpdateOne(
        namespace="sample_mflix.movies",
        filter={ "title": "Minari" },
        update={ "$set": { "runtime": 117 }}
    ),
    DeleteMany(
        namespace="sample_restaurants.restaurants",
        filter={ "cuisine": "French" }
    )
]

results = await client.bulk_write(operations)

print(results)