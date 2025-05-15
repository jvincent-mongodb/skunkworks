from bson.binary import UuidRepresentation

client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             uuidRepresentation=UuidRepresentation.STANDARD)