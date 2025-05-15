// Insert three Flower instances
Flower roseFlower = new Flower("rose", false, 25.4f, Arrays.asList(new String[] {"red", "pink"}));
Flower daisyFlower = new Flower("daisy", true, 21.1f, Arrays.asList(new String[] {"purple", "white"}));
Flower peonyFlower = new Flower("peony", false, 19.2f, Arrays.asList(new String[] {"red", "green"}));
collection.insertMany(Arrays.asList(roseFlower, daisyFlower, peonyFlower));

// Update a document
collection.updateOne(
        Filters.lte("height", 22),
        Updates.addToSet("colors", "pink")
);

// Delete a document
collection.deleteOne(Filters.eq("name", "rose"));

// Return and print all documents in the collection
List<Flower> flowers = new ArrayList<>();
collection.find().into(flowers);
System.out.println(flowers);