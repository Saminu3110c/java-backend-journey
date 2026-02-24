public class App {

    public static void main(String[] args) {

        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);

        try {
            service.addStudent(new Student(1, "Ali", "ali@email.com", 20));
            service.addStudent(new Student(2, "Maryam", "maryam@email.com", 22));

            System.out.println(service.getStudent(1));

            service.removeStudent(5); // will throw exception

        } catch (StudentNotFoundException | DuplicateStudentException e) {
            System.out.println(e.getMessage());
        }
    }
}