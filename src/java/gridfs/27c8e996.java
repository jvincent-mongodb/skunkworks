gridFSBucket.find().forEach(new Consumer<GridFSFile>() {
    @Override
    public void accept(final GridFSFile gridFSFile) {
        System.out.println(gridFSFile);
    }
});