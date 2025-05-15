database = client.get_database("sample_mflix")

result = await database.command("dbStats")

print(result)