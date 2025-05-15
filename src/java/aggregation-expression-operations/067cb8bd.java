var students = current().<MqlDocument>getArray("students");

asList(project(fields(
    computed("evaluation", students
        .passArrayTo(students -> gradeAverage(students, "finalGrade"))
        .passNumberTo(grade -> evaluate(grade, of(70), of(85))))
)));