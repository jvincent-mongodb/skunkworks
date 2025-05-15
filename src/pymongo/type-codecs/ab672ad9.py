def fallback_encoder(value):
    if isinstance(value, Decimal):
        return Decimal128(value)
    return value