restaurants = database["restaurants"]

query_filter = {'name' : 'Bagels N Buns'}
update_operation = { '$set' : 
    { 'name' : '2 Bagels 2 Buns' }
}

result = restaurants.update_one(query_filter, update_operation)