database = client.get_database("sample_mflix")

result = database.cursor_command("find", "movies", filter={"runtime": 11})

print(result.to_list())