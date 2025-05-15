client = AsyncMongoClient(replicaSet='repl0',
                          readPreference=ReadPreference.SECONDARY_PREFERRED,
                          localThresholdMS=35)