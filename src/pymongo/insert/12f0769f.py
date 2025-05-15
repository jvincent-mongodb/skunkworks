class Restaurant(TypedDict):
   name: str

document_list = [
   Restaurant(name="Mongo's Burgers"),
   Restaurant(name="Mongo's Pizza")
]

await sample_restaurants.restaurants.insert_many(document_list)