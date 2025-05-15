class CommandCounter implements CommandListener {

    private Map<String, Integer> commands = new HashMap<String, Integer>();

    @Override
    public synchronized void commandSucceeded(final CommandSucceededEvent event) {
        String commandName = event.getCommandName();
        int count = commands.containsKey(commandName) ? commands.get(commandName) : 0;
        commands.put(commandName, count + 1);
        System.out.println(commands.toString());
    }

    @Override
    public void commandFailed(final CommandFailedEvent event) {
        System.out.println(String.format("Failed execution of command '%s' with id %s",
                event.getCommandName(),
                event.getRequestId()));
    }
}