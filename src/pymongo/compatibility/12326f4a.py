import pickle
from bson.objectid import ObjectId

oid_bytes = b'\x80\x02cbson.objectid\nObjectId\nq\x00...'
oid = pickle.loads(oid_bytes)
print("ObjectId bytes: {}".format(oid_bytes))
print("ObjectId: {}".format(oid))