def deserialize_restaurant(doc):
    return Restaurant(name=doc["name"], cuisine=doc["cuisine"])

restaurant_doc = collection.find_one({"name": "Example Cafe"})
restaurant = deserialize_restaurant(restaurant_doc)