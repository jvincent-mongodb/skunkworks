database = client["test_database"]
database.create_collection("example_ts_collection", timeseries={"timeField": "timestamp"})