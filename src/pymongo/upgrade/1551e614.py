$ python3 -We insert.py
Traceback (most recent call last):
  File "insert.py", line 4, in <module>
    client.test.test.insert({})
  File "/home/durin/work/mongo-python-driver/pymongo/collection.py", line 2906, in insert
    "instead.", DeprecationWarning, stacklevel=2)
DeprecationWarning: insert is deprecated. Use insert_one or insert_many instead.