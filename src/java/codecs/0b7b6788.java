BsonTypeClassMap bsonTypeClassMap = new BsonTypeClassMap();
Class<?> clazz = bsonTypeClassMap.get(BsonType.ARRAY);
System.out.println("Java type: " + clazz.getName());