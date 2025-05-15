# Each process creates its own instance of MongoClient.
def func():
    db = pymongo.MongoClient().mydb
    # Do something with db.

proc = multiprocessing.Process(target=func)
proc.start()