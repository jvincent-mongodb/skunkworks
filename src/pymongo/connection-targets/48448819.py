File "/Library/Python/2.7/site-packages/pymongo/collection.py", line 1560, in count
  return self._count(cmd, collation, session)
  File "/Library/Python/2.7/site-packages/pymongo/collection.py", line 1504, in _count
  with self._socket_for_reads() as (connection, slave_ok):
  File "/System/Library/Frameworks/Python.framework/Versions/2.7/lib/python2.7/contextlib.py", line 17, in __enter__
  return self.gen.next()
  File "/Library/Python/2.7/site-packages/pymongo/mongo_client.py", line 982, in _socket_for_reads
  server = topology.select_server(read_preference)
  File "/Library/Python/2.7/site-packages/pymongo/topology.py", line 224, in select_server
  address))
  File "/Library/Python/2.7/site-packages/pymongo/topology.py", line 183, in select_servers
  selector, server_timeout, address)
  File "/Library/Python/2.7/site-packages/pymongo/topology.py", line 199, in _select_servers_loop
  self._error_message(selector))
pymongo.errors.ServerSelectionTimeoutError: localhost:27017: timed out