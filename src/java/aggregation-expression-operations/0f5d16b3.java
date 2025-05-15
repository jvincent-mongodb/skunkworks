var warehouses = current().getMap("warehouses");

asList(project(fields(
    computed("totalInventory", warehouses
        .entries()
        .sum(v -> v.getValue()))
)));