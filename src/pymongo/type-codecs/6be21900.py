import pprint

await collection.insert_one({"num": Decimal("45.321")})
my_doc = await collection.find_one()
pprint.pprint(my_doc)