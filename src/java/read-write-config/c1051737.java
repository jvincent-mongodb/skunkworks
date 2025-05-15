TagSet tag1 = new TagSet(new Tag("dc", "ny"));
TagSet tag2 = new TagSet(new Tag("dc", "sf"));
TagSet tag3 = new TagSet();

ReadPreference readPref= ReadPreference.secondary(Arrays.asList(tag1, tag2, tag3));

MongoDatabase database = mongoClient.getDatabase("test_database")
                      .withReadPreference(readPref);