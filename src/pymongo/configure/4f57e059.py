client = MongoClient(replicaSet='repl0',
                     readPreference=ReadPreference.SECONDARY_PREFERRED,
                     localThresholdMS=35)