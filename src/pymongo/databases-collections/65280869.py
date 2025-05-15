client.get_database("test-database",
                    read_preference=ReadPreference.SECONDARY,
                    read_concern="local",
                    write_concern="majority")