Map<BsonType, Class<?>> replacements = new HashMap<BsonType, Class<?>>();
replacements.put(BsonType.ARRAY, Set.class);
BsonTypeClassMap bsonTypeClassMap = new BsonTypeClassMap(replacements);

Class<?> clazz = bsonTypeClassMap.get(BsonType.ARRAY);
System.out.println("Java type: " + clazz.getName());