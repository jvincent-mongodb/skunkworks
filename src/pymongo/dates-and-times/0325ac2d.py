from datetime import datetime

collection = database["sample_collection"]
find_result = collection.find_one()["date"]
print(f"datetime: {find_result}")
print(f"datetime.tzinfo: {find_result.tzinfo}")