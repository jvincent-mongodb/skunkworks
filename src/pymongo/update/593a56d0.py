from pymongo.collation import Collation

restaurants = database["restaurants"]

query_filter = {'cuisine' : 'Pizza'}
update_operation = { '$set' : 
    { 'cuisine' : 'Pasta' }
}

result = restaurants.update_many(query_filter, update_operation,
                                 collation=Collation(locale='fr_CA'))