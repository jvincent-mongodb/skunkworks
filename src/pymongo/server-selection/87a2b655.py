def prefer_local(server_descriptions):
    servers = [
        server for server in server_descriptions if server.address[0] == "localhost"
    ]
    return servers