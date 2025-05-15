class Restaurant (TypedDict):
    name: str
    cuisine: str
    borough: str
    restaurant_id: str

operation = pymongo.ReplaceOne(
    { "restaurant_id": "1234" },
    Restaurant(name="Mongo's Pizza", cuisine="Pizza", borough="Brooklyn", restaurant_id="5678")
)