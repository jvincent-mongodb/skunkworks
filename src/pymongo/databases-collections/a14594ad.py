database = client["test_database"]
await database.create_collection("example_ts_collection", timeseries={"timeField": "timestamp"})