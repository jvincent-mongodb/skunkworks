ValidationOptions collOptions = new ValidationOptions().validator(
    Filters.or(Filters.exists("commander"), Filters.exists("first officer")));
database.createCollection("ships",
    new CreateCollectionOptions().validationOptions(collOptions));