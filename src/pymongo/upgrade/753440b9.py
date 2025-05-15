# Before (SON)
>>> from pymongo import MongoClient
>>> client = MongoClient()
>>> client.options.pool_options.metadata
SON([('driver', SON([('name', 'PyMongo'), ('version', '4.7.0.dev0')])), ('os', SON([('type', 'Darwin'), ('name', 'Darwin'), ('architecture', 'arm64'), ('version', '14.3')])), ('platform', 'CPython 3.11.6.final.0')])

# After (dict)
>>> client.options.pool_options.metadata
{'driver': {'name': 'PyMongo', 'version': '4.7.0.dev0'}, 'os': {'type': 'Darwin', 'name': 'Darwin', 'architecture': 'arm64', 'version': '14.3'}, 'platform': 'CPython 3.11.6.final.0'}