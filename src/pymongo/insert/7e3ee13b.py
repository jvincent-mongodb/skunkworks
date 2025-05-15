document_list = [
    { "name" : "Mongo's Burgers" },
    { "name" : "Mongo's Pizza" },
    { "name" : "Mongo's Tacos" }
 ]

 sample_restaurants.restaurants.insert_many(document_list, bypass_document_validation = True)