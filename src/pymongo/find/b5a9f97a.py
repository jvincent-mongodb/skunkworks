cursor = sample_restaurants.restaurants.find({"cuisine": "Italian"}, max_time_ms=10000)
                                       .collation(Collation(locale="fr_CA")