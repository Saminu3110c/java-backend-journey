public class App {
    public static void main(String[] args){
        try {

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
            // System.out.println(manager.findStudentById(7));

            // manager.removeStudentById(1);
            // manager.removeStudentById(7);

            // System.out.println("After removal:");
            // manager.printAllStudents();

            // System.out.println("\n\nStudent above age: ");
            // System.out.println(manager.getStudentsAboveAge(20));
            // System.out.println("\n\nNumber of Students above age: " + manager.countStudentsAboveAge(20));

            // System.out.println(manager.getAllStudentEmails());

            System.out.println(manager.emailExists("aminu@email.com"));

            
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
