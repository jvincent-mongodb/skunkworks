explicit_binary = Binary.from_uuid(uuid4(), UuidRepresentation.STANDARD)
unspec_collection.insert_one({'_id': 'bar', 'uuid': explicit_binary})