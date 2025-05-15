import pickle
from bson.objectid import ObjectId

oid = ObjectId()
oid_bytes = pickle.dumps(oid, protocol=2)
print("ObjectId: {}".format(oid))
print("ObjectId bytes: {}".format(oid_bytes))