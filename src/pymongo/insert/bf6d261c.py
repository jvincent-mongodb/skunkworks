class Restaurant(TypedDict):
    name: str

sample_restaurants.restaurants.insert_one(Restaurant(name="Mongo's Burgers")