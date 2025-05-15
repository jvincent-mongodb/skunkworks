try:
    with pymongo.timeout(10):
        coll.insert_one({"name": "Yngwie"})
        time.sleep(10)
        # The deadline has now expired. The next operation will raise
        # a timeout exception.
        coll.find_one({"name": "Yngwie"})
except PyMongoError as exc:
    if exc.timeout:
        print(f"block timed out: {exc!r}")
    else:
        print(f"failed with non-timeout error: {exc!r}")