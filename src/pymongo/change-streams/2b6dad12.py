database = client["sample_restaurants"]
collection = database["restaurants"]

query_filter = { "name": "Blarney Castle" }
update_operation = { '$set' : 
    { "cuisine": "Irish" }
}

result = collection.update_one(query_filter, update_operation)