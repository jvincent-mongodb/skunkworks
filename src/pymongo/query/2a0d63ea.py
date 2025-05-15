with collection.watch() as stream:
    for change in stream:
        print(change)