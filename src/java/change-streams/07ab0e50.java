CreateCollectionOptions collectionOptions = new CreateCollectionOptions();
collectionOptions.changeStreamPreAndPostImagesOptions(new ChangeStreamPreAndPostImagesOptions(true));

database.createCollection("myColl", collectionOptions);