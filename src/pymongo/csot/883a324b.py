import motor.motor_asyncio
client = motor.motor_asyncio.AsyncIOMotorClient()
coll = client["test-db"]["test-collection"]
with pymongo.timeout(10):
    await coll.insert_one({"name": "Yngwie"})
    await coll.find_one({"name": "Yngwie"})