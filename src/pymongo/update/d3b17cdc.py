restaurants = database["restaurants"]

query_filter = {'borough' : 'Manhattan'}
update_operation = { '$set' : 
    { 'borough' : 'Manhattan (north)' }
}

result = restaurants.update_many(query_filter, update_operation, upsert = True)