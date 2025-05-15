result = collection.create_index([("<GeoJSON object field>", "2dsphere")])

print(f'Index created: {result}')