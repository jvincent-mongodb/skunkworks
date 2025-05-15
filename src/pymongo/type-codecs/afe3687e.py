class DecimalIntCodec(DecimalCodec):
    @property
    def python_type(self):
        # The Python type encoded by this type codec
        return DecimalInt