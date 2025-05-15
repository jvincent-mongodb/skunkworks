from pymongo.collation import Collation

database = client["test_database"]
database.create_collection("example_collection", collation=Collation(locale='fr_CA'))