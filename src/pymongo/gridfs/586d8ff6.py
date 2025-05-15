file = await bucket.open_download_stream_by_name("my_file")
contents = await file.read()