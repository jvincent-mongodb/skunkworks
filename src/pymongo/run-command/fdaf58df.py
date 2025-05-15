database = client.get_database("sample_mflix")

result = database.command("dbStats")

print(result)