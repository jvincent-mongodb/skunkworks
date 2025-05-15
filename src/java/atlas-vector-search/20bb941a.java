// Create an instance of the BinaryVector class as the query vector
BinaryVector queryVector = BinaryVector.floatVector(
    new float[]{0.0001f, 1.12345f, 2.23456f, 3.34567f, 4.45678f});

// Specify the index name for the vector embedding index
String indexName = "mflix_movies_embedding_index";

// Specify the path of the field to search on
FieldSearchPath fieldSearchPath = fieldPath("plot_embedding");

// Limit the number of matches to 1
int limit = 1;

// Create a pre-filter to only search within a subset of documents
VectorSearchOptions options = exactVectorSearchOptions()
    .filter(gte("year", 2016));

// Create the vectorSearch pipeline stage
List<Bson> pipeline = asList(
        vectorSearch(
                fieldSearchPath,
                queryVector,
                indexName,
                limit,
                options),
        project(
                metaVectorSearchScore("vectorSearchScore")));