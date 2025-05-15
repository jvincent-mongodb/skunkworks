>>> import orjson
>>> from bson import json_util
>>> orjson.dumps({'a': Int64(1)}, default=json_util.default, option=orjson.OPT_PASSTHROUGH_SUBCLASS)