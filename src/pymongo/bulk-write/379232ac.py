class Restaurant (TypedDict):
    name: str
    cuisine: str
    borough: str
    restaurant_id: str

operation = pymongo.InsertOne(Restaurant(
    name="Mongo's Deli", cuisine="Sandwiches", borough="Manhattan", restaurant_id="1234"))