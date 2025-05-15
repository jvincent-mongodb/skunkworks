with open("file.bson", "rb") as file:
       data = file.read()
       document = bson.decode(data)
       print(document)