result = myColl.create_index(
    [("title", "text"), ("genre", "text")],
    default_language="english",
    weights={ "title": 10, "genre": 3 }
)