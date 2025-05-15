var lastName = current().getString("lastName");
var employeeID = current().getString("employeeID");

asList(project(fields(
    computed("username", lastName
        .append(employeeID)
        .toLower())
)));