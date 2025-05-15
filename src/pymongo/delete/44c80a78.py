query_filter = { 'name': {'$regex': 'Mongo' }}

result = restaurants.delete_many(query_filter, comment="Deleting Mongo restaurants")