query_filter = { 'name': {'$regex': 'Mongo' }}

result = await restaurants.delete_many(query_filter, comment="Deleting Mongo restaurants")