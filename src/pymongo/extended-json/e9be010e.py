from bson import Code, Binary
from bson.json_util import dumps, CANONICAL_JSON_OPTIONS

doc = [
   {'foo': [1, 2]},
   {'bar': {'hello': 'world'}},
   {'code': Code('function x() { return 1; }', {})},
   {'bin': Binary(b'\x01\x02\x03\x04', 128)}
]

ejson_str = dumps(doc, json_options=CANONICAL_JSON_OPTIONS)
print(ejson_str)