orders_coll.delete_many({})

order_data = [
    {
        "customer_id": "elise_smith@myemail.com",
        "orderdate": datetime(2020, 5, 30, 8, 35, 52),
        "product_id": "a1b2c3d4",
        "value": 431.43
    },
    {
        "customer_id": "tj@wheresmyemail.com",
        "orderdate": datetime(2019, 5, 28, 19, 13, 32),
        "product_id": "z9y8x7w6",
        "value": 5.01
    },
    {
        "customer_id": "oranieri@warmmail.com",
        "orderdate": datetime(2020, 1, 1, 8, 25, 37),
        "product_id": "ff11gg22hh33",
        "value": 63.13
    },
    {
        "customer_id": "jjones@tepidmail.com",
        "orderdate": datetime(2020, 12, 26, 8, 55, 46),
        "product_id": "a1b2c3d4",
        "value": 429.65
    }
]

orders_coll.insert_many(order_data)