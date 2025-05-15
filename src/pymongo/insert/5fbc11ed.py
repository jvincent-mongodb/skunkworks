class Restaurant(TypedDict):
    name: str

document_list = [
   Restaurant(name="Mongo's Burgers"),
   Restaurant(name="Mongo's Pizza")
]

sample_restaurants.restaurants.insert_many(document_list)