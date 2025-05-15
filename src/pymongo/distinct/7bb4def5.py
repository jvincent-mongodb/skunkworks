results = await restaurants.distinct("name", 
    { "borough": "Bronx", 
      "cuisine": "Pizza" }, 
    comment="Bronx pizza restaurants"
)