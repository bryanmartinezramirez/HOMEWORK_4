public class AggregationDriver {
    public static void main(String[] args) {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook(
                "Clean Code",
                "Robert C. Martin",
                "Prentice Hall");

        Course oneInstructorCourse = new Course(
                "CS 5800 - Advanced Software Engineering",
                nima,
                cleanCode);

        Instructor secondInstructor = new Instructor(
                "Maria",
                "Gonzalez",
                "3-2640");
        Textbook secondTextbook = new Textbook(
                "Design Patterns",
                "Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides",
                "Addison-Wesley");

        Course twoInstructorCourse = new Course(
                "CS 5800 - Object-Oriented Design",
                new Instructor[]{nima, secondInstructor},
                new Textbook[]{cleanCode, secondTextbook});

        System.out.println("PART 4: AGGREGATION");
        System.out.println("===================");
        oneInstructorCourse.print();
        twoInstructorCourse.print();
    }
}
