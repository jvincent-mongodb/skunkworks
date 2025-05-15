class MyCommandListener(CommandListener):
    def succeeded(self, event: CommandSucceededEvent):
        print(f"Command {event.command_name} succeeded")

    # Include other event method implementations here

class MyServerListener(ServerListener):
    def heartbeat_started(self, event: ServerHeartbeatStartedEvent):
        print(f"Heartbeat started on server with id: {event.connection_id}")

    # Include other event method implementations here

class MyPoolListener(ConnectionPoolListener):
    def connection_created(self, event: ConnectionCreatedEvent):
        print(f"Connection {event.connection_id} created")

    # Include other event method implementations here