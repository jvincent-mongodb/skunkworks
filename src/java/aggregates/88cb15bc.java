List<Variable<String>> variables = asList(new Variable<>("order_item", "$item"),
        new Variable<>("order_qty", "$ordered"));

List<Bson> pipeline = asList(
        match(expr(new Document("$and",
                asList(new Document("$eq", asList("$$order_item", "$stock_item")),
                        new Document("$gte", asList("$instock", "$$order_qty")))))),
        project(fields(exclude("stock_item"), excludeId())));

Bson innerJoinLookup = lookup("warehouses", variables, pipeline, "stockdata");