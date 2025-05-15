operation = InsertOne(
    namespace="sample_restaurants.restaurants",
    document={
        "name": "Mongo's Deli",
        "cuisine": "Sandwiches",
        "borough": "Manhattan",
        "restaurant_id": "1234"
    }
)