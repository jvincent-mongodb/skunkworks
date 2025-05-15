database = client.get_database("my_db")

hello = database.command("hello")

print(hello)