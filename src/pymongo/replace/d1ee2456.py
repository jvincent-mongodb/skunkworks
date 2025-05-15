restaurants = database["restaurants"]

query_filter = {"name" : "Pizza Town"}
replace_document = { "name" : "Mongo's Pizza",
                     "cuisine" : "Pizza",
                     "address" : {
                         "street" : "123 Pizza St",
                         "zipCode" : "10003"
                     },
                     "borough" : "Manhattan"
                   }

result = restaurants.replace_one(query_filter, replace_document)