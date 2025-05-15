listeners = [MyCommandListener(), MyServerListener(), MyPoolListener()]
client = AsyncMongoClient("<connection URI>", event_listeners=listeners)