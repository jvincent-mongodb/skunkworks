ReplaceOneModel<Document> celineDoc = new ReplaceOneModel<>(
                                    Filters.eq("_id", 1), 
                                    new Document("name", "Celine Stork")
                                        .append("location", "San Diego, CA"));