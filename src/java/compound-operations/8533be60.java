public void bookARoom() {
    // Creates a filter to match documents representing available rooms
    Bson filter = Filters.eq("reserved", false);

    // Retrieves a document that represents the first available room
    Document myRoom = this.collection.find(filter).first();

    // Prints a message if no documents representing available rooms are found
    if (myRoom == null){
        System.out.println("Sorry, we are booked " + this.guest);
        return;
    }

    String myRoomName = myRoom.getString("room");

    // Prints a message that guest that successfully booked the room
    System.out.println("You got the " + myRoomName + " " + this.guest);

    // Creates an update document to mark a room as reserved
    Bson update = Updates.combine(Updates.set("reserved", true), Updates.set("guest", guest));
    
    // Creates a filter that matches the "_id" field of the first available room
    Bson roomFilter = Filters.eq("_id", myRoom.get("_id", Integer.class));

    // Updates the first matching document to mark it as reserved
    this.collection.updateOne(roomFilter, update);
}