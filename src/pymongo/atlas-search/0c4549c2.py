client = pymongo.MongoClient("<connection-string>")
result = client["sample_mflix"]["movies"].aggregate([
         {
            "$search": {
              "index": "pymongoindex",
              "compound": {
              "mustNot": [
                  {
                      "text": {
                          "query": [
                              "Comedy"
                          ],
                          "path": "genres"
                      }
                  }
              ],
              "must": [
                  {
                      "text": {
                          "query": [
                              "New York"
                          ],
                          "path": "title"
                        }
                     }
                  ],
               }
            }
         },
         { "$limit": 10 },
         {
           "$project": {
           "_id": 0,
           "title": 1,
           "score": { "$meta": "searchScore" }
      }
    }
])

for i in result:
   print(i)