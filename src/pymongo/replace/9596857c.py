restaurants = database["restaurants"]

query_filter = {"name" : "Food Town"}
replace_document = { "name" : "Food World",
                     "cuisine" : "Mixed",
                     "address" : {
                         "street" : "123 Food St",
                         "zipCode" : "10003"
                     },
                     "borough" : "Manhattan"
                   }

result = restaurants.replace_one(query_filter, replace_document, upsert = True)