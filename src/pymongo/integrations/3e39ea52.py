import signal

def graceful_reload(signum, traceback):
     """Explicitly close some global MongoClient object."""
     client.close()

signal.signal(signal.SIGHUP, graceful_reload)