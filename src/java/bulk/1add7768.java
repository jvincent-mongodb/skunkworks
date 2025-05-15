UpdateOneModel<Document> updateDoc = new UpdateOneModel<>(
                                    Filters.eq("_id", 2), 
                                    Updates.set("age", 31));