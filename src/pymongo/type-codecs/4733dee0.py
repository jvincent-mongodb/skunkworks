import pprint

new_collection = db.get_collection("test")
pprint.pprint(new_collection.find_one())