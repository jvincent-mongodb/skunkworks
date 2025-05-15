await orders_coll.delete_many({})

order_data = [
    {
        "customer_id": "elise_smith@myemail.com",
        "orderdate": datetime(2020, 5, 30, 8, 35, 52),
        "product_name": "Asus Laptop",
        "product_variation": "Standard Display",
        "value": 431.43
    },
    {
        "customer_id": "tj@wheresmyemail.com",
        "orderdate": datetime(2019, 5, 28, 19, 13, 32),
        "product_name": "The Day Of The Triffids",
        "product_variation": "2nd Edition",
        "value": 5.01
    },
    {
        "customer_id": "oranieri@warmmail.com",
        "orderdate": datetime(2020, 1, 1, 8, 25, 37),
        "product_name": "Morphy Richards Food Mixer",
        "product_variation": "Deluxe",
        "value": 63.13
    },
    {
        "customer_id": "jjones@tepidmail.com",
        "orderdate": datetime(2020, 12, 26, 8, 55, 46),
        "product_name": "Asus Laptop",
        "product_variation": "Standard Display",
        "value": 429.65
    }
]

await orders_coll.insert_many(order_data)