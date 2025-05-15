class Restaurant(TypedDict):
   name: str

await sample_restaurants.restaurants.insert_one(Restaurant(name="Mongo's Burgers"))