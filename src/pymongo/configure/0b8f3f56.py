from pymongo.collation import Collation

database = client["test_database"]
await database.create_collection("example_collection", collation=Collation(locale='fr_CA'))