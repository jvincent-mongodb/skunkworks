class Restaurant:
   def __init__(self, name, cuisine):
      self.name = name
      self.cuisine = cuisine

restaurant = Restaurant("Example Cafe", "Coffee")
restaurant_dict = vars(restaurant)

await collection.insert_one(restaurant_dict)