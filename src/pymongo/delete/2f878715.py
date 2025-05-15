from pymongo.collation import Collation

query_filter = { "borough": "Brooklyn" }

result = restaurants.delete_many(query_filter, collation=Collation(locale='fr_CA'))