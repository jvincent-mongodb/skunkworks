async with bucket.open_upload_stream(
    "my_file", chunk_size_bytes=1048576, metadata={"contentType": "text/plain"}
) as grid_in:
    await grid_in.write("data to store")