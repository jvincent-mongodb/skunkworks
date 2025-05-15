listeners = [MyCommandListener(), MyServerListener(), MyPoolListener()]
client = MongoClient("<connection URI>", event_listeners=listeners)