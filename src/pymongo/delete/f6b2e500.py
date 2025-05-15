from pymongo.collation import Collation

query_filter = { "borough": "Brooklyn" }

result = await restaurants.delete_many(query_filter, collation=Collation(locale='fr_CA'))