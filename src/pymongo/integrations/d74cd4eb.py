# You must call patch_all() *before* importing any other modules
from gevent import monkey
_ = monkey.patch_all()
from pymongo import MongoClient
client = MongoClient()