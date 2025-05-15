...
'command': {'aggregate': 'collection',
  'pipeline': [{'$match': {'cuisine': 'Bakery'}},
               {'$group': {'_id': '$borough',
                           'count': {'$sum': 1}}}],
  'explain': True,
...