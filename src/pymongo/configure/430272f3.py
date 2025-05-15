database.get_collection("test-collection",
                    read_preference=ReadPreference.SECONDARY,
                    read_concern="local",
                    write_concern="majority")