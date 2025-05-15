import pprint

collection.insert_one({"num": Decimal("45.321")})
my_doc = collection.find_one()
pprint.pprint(my_doc)