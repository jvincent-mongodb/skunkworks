collection.with_options(read_preference=ReadPreference.SECONDARY,
                        read_concern="local",
                        write_concern="majority")