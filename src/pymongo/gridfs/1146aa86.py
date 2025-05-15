file = await bucket.open_download_stream(ObjectId("66b3c86e672a17b6c8a4a4a9"))
contents = await file.read()