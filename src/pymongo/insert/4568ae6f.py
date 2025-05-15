document_list = [
   { "name" : "Mongo's Burgers" },
   { "name" : "Mongo's Pizza" }
]

await sample_restaurants.restaurants.insert_many(document_list)