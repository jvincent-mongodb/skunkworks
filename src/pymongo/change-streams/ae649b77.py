change_pipeline = { "$match": { "operationType": "update" }},

async with await collection.watch(pipeline=change_pipeline) as stream:
    async for change in stream:
        print(change)