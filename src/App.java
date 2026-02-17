public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1, "Ali", "ali@email.com", 20);
        Student s2 = new Student(2, "Maryam", "maryam@email.com", 22);
        Student s3 = new Student(3, "John", "john@email.com", 19);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Total students created: " + Student.getStudentCount());

        try {
            s1.updateEmail("aliadamu.email.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
