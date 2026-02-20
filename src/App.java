public class App {
    public static void main(String[] args) throws Exception {
        // Student s1 = new Student(1, "Ali", "ali@email.com", 20);
        // Student s2 = new Student(2, "Maryam", "maryam@email.com", 22);
        // Student s3 = new Student(3, "John", "john@email.com", 19);

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        // System.out.println("Total students created: " + Student.getStudentCount());

        // try {
        //     s1.updateEmail("aliadamu.email.com");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

         StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Ali", "ali@email.com", 20);
        Student s2 = new Student(2, "Maryam", "maryam@email.com", 22);
        Student s3 = new Student(3, "Safiya", "safiya@email.com", 23);
        Student s4 = new Student(4, "Saminu", "saminu@email.com", 25);
        // Testing duplicate id
        //  Student s = new Student(2, "Aisha", "aisha@email.com", 22);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);
        // manager.addStudent(s);


        // manager.printAllStudents();

        // System.out.println("Finding student with ID 1:");
        // System.out.println(manager.findStudentById(1));

        // manager.removeStudentById(1);
        // manager.removeStudentById(7);

        // System.out.println("After removal:");
        // manager.printAllStudents();

        // System.out.println("\n\nStudent above age: ");
        // System.out.println(manager.getStudentsAboveAge(20));
        // System.out.println("\n\nNumber of Students above age: " + manager.countStudentsAboveAge(20));

        // System.out.println(manager.getAllStudentEmails());

        // System.out.println(manager.emailExists("aminu@email.com"));

        // Getting to understand "==" and equals()
        // String x = "java";
        // String y = "java";

        // System.out.println(x == y);        // ?
        // System.out.println(x.equals(y));   // ?

        // String p = new String("java");
        // String q = new String("java");

        // System.out.println(p == q);        // ?
        // System.out.println(p.equals(q));   // ?
    }
}
