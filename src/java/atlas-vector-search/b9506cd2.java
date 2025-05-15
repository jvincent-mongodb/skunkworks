Document found = collection.aggregate(pipeline).first();
double score = found.getDouble("vectorSearchScore").doubleValue();

System.out.println("vectorSearch score: " + score);