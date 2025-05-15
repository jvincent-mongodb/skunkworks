change_pipeline = { "$match": { "operationType": "update" }},

with collection.watch(pipeline=change_pipeline) as stream:
    for change in stream:
        print(change)