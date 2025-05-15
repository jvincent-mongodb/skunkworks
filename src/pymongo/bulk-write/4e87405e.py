operation = ReplaceOne(
    namespace="sample_restaurants.restaurants",
    filter={ "restaurant_id": "1234" },
    replacement={
        "name": "Mongo's Pizza",
        "cuisine": "Pizza",
        "borough": "Brooklyn",
        "restaurant_id": "5678"
    }
)