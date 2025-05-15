from decimal import Decimal

num = Decimal("45.321")
await db["coll"].insert_one({"num": num})