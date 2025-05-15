Bson filter = Filters.eq("color", "purple");
System.out.println(collection.findOneAndDelete(filter).toJson());