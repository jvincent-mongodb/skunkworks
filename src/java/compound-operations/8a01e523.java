public void bookARoom(){
    // Creates an update document to mark a room as reserved
    Bson update = Updates.combine(Updates.set("reserved", true), Updates.set("guest", guest));
    
    // Creates a filter to match a document representing an available room
    Bson filter = Filters.eq("reserved", false);

    // Updates the first document that matches the filter to mark it as reserved
    Document myRoom = this.collection.findOneAndUpdate(filter, update);
   
    // Prints a message when there are no available rooms
    if (myRoom == null){
        System.out.println("Sorry, we are booked " + this.guest);
        return;
    }

    // Prints the name of the guest that successfully booked the room
    String myRoomName = myRoom.getString("room");
    System.out.println("You got the " + myRoomName + " " + this.guest);
}