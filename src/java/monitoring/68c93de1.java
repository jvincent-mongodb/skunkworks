class ConnectionPoolLibrarian implements ConnectionPoolListener {

    @Override
    public void connectionCheckedOut(final ConnectionCheckedOutEvent event) {
        System.out.println(String.format("Let me get you the connection with id %s...",
                event.getConnectionId().getLocalValue()));
    }

    @Override
    public void connectionCheckOutFailed(final ConnectionCheckOutFailedEvent event) {
        System.out.println("Something went wrong! Failed to checkout connection.");
    }

}