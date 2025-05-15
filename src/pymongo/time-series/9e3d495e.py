database = client.get_database("weather")

time_series_options = {
    "timeField": "timestamp"
}

await database.create_collection("october2024", timeseries=time_series_options)