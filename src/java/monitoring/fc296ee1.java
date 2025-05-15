class IsWriteable implements ClusterListener {

    private boolean isWritable;

    @Override
    public synchronized void clusterDescriptionChanged(final ClusterDescriptionChangedEvent event) {
        if (!isWritable) {
            if (event.getNewDescription().hasWritableServer()) {
                isWritable = true;
                System.out.println("Able to write to server");
            }
        } else {
            if (!event.getNewDescription().hasWritableServer()) {
                isWritable = false;
                System.out.println("Unable to write to server");
            }
        }
    }
}