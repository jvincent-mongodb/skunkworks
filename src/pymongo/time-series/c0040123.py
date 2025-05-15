from datetime import datetime

collection = database["october2024"]

document_list = [
    { "temperature": 77, "location": "New York City", "timestamp": datetime(2024, 10, 22, 6, 0, 0) },
    { "temperature": 74, "location": "New York City", "timestamp": datetime(2024, 10, 23, 6, 0, 0) }
]

collection.insert_many(document_list)