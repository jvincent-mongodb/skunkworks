async for file_doc in bucket.find({}):
    print(file_doc)