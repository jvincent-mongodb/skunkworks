public static MqlNumber gradeAverage(MqlArray<MqlDocument> students, String fieldName) {
    var sum = students.sum(student -> student.getInteger(fieldName));
    var avg = sum.divide(students.size());
    return avg;
}

public static MqlString evaluate(MqlNumber grade, MqlNumber cutoff1, MqlNumber cutoff2) {
    var message = grade.switchOn(on -> on
        .lte(cutoff1, g -> of("Needs improvement"))
        .lte(cutoff2, g -> of("Meets expectations"))
        .defaults(g -> of("Exceeds expectations")));
    return message;
}