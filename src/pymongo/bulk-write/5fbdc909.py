operation = UpdateMany(
    namespace="sample_restaurants.restaurants",
    filter={ "name": "Mongo's Deli" },
    update={ "$set": { "cuisine": "Sandwiches and Salads" }}
)