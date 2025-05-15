# set query with point at MongoDB headquarters and a maxDistance of 1000 meters
query = {
 "location.geo": {
          "$near": {
            "$geometry": {
             # Search around this location
                            "type": "Point",
                            "coordinates": [-73.986805, 40.7620853]
                         },
            "$maxDistance": 1000 # Distance in meters (1 km)
                   }
                }
        }

# fetches the _id and theaterId fields
projection = { "theaterId": 1 }

nearby_places = location.find(query, projection)

for i in nearby_places:
    print(i)