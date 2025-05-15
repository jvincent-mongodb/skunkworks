from decimal import Decimal

num = Decimal("45.321")
db["coll"].insert_one({"num": num})