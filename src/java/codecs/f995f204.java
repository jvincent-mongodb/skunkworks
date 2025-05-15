public class PowerStatusCodec implements Codec<PowerStatus> {

    @Override
    public void encode(BsonWriter writer, PowerStatus value, EncoderContext encoderContext) {
        if (value != null) {
            writer.writeBoolean(value.equals(PowerStatus.ON) ? Boolean.TRUE : Boolean.FALSE);
        }
    }

    @Override
    public PowerStatus decode(BsonReader reader, DecoderContext decoderContext) {
        return reader.readBoolean() ? PowerStatus.ON : PowerStatus.OFF;
    }

    @Override
    public Class<PowerStatus> getEncoderClass() {
        return PowerStatus.class;
    }
}