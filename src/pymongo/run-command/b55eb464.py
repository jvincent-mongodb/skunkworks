from pymongo.read_preferences import Secondary

database = client.get_database("my_db")

hello = database.command("hello", read_preference=Secondary())

print(hello)