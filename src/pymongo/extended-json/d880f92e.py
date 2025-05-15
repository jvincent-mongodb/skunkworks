from bson.json_util import loads

ejson_str = '''[
   {"foo": [1, 2]},
   {"bar": {"hello": "world"}},
   {"code": {
      "$scope": {},
      "$code": "function x() { return 1; }"
   }},
   {"bin": {
      "$type": "80",
      "$binary": "AQIDBA=="
   }}
]'''

doc = loads(ejson_str)
print(doc)