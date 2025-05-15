>>> def dict_to_SON(data_as_dict: dict[Any, Any]):
...     data_as_SON = SON()
...     for key, value in data_as_dict.items():
...         data_as_SON[key] = dict_to_SON(value) if isinstance(value, dict) else value
...     return data_as_SON
>>>
>>> dict_to_SON(data_as_dict)
SON([('driver', SON([('name', 'PyMongo'), ('version', '4.7.0.dev0')])), ('os', SON([('type', 'Darwin'), ('name', 'Darwin'), ('architecture', 'arm64'), ('version', '14.3')])), ('platform', 'CPython 3.11.6.final.0')])