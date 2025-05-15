db = client.get_database(
     'test', read_preference=Secondary([{'dc': 'ny'}, {'dc': 'sf'}]))