database = client.get_database("my_db")

hello = await database.command("hello")

print(hello)