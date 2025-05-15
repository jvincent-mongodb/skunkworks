# Polygon representation of Manhattan
query = {
   "location.geo": {
      "$geoWithin": {
         "$geometry": {
            # Search around this location
            "type": "Polygon",
            "coordinates":
               [[[-73.925492, 40.877410],
               [-73.910372, 40.872366],
               [-73.935127, 40.834020],
               [-73.929049, 40.798569],
               [-73.976485, 40.711432],
               [-74.015747, 40.701229],
               [-74.018859, 40.708367],
               [-74.008007, 40.754307],
               [-73.925492, 40.877410]]]
         }
      }
   }
}

# fetches the _id and theaterId fields
projection = { "theaterId": 1 }

nearby_places = collection.find(query, projection)

async for i in nearby_places:
      print(i)