JsonWriterSettings settings = JsonWriterSettings.builder().outputMode(JsonMode.EXTENDED).build();

try (JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(System.out)), settings)) {
    jsonWriter.writeStartDocument();
    jsonWriter.writeObjectId("_id", new ObjectId("507f1f77bcf86cd799439012"));
    jsonWriter.writeInt64("myNumber", 11223344);
    jsonWriter.writeEndDocument();
    jsonWriter.flush();
}