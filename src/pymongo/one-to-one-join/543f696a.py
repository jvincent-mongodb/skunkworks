await products_coll.delete_many({})

product_data = [
    {
        "id": "a1b2c3d4",
        "name": "Asus Laptop",
        "category": "ELECTRONICS",
        "description": "Good value laptop for students"
    },
    {
        "id": "z9y8x7w6",
        "name": "The Day Of The Triffids",
        "category": "BOOKS",
        "description": "Classic post-apocalyptic novel"
    },
    {
        "id": "ff11gg22hh33",
        "name": "Morphy Richardds Food Mixer",
        "category": "KITCHENWARE",
        "description": "Luxury mixer turning good cakes into great"
    },
    {
        "id": "pqr678st",
        "name": "Karcher Hose Set",
        "category": "GARDEN",
        "description": "Hose + nosels + winder for tidy storage"
    }
]

await products_coll.insert_many(product_data)