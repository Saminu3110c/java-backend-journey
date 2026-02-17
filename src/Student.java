public class Student {

    private static int studentCount = 0;

    private int id;
    private String name;
    private String email;
    private int age;

    public Student(int id, String name, String email, int age) {
        if (age < 16) {
            throw new IllegalArgumentException("Age must be at least 16");
        }

        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    // Mini challenge
    public void updateEmail(String newEmail){
        // if(newEmail.contains("@")){
        //     this.email = newEmail;
        // }
        // else {
        //     throw new IllegalArgumentException("Use a valid email format");
        // }

        // For better validation
        if (newEmail == null || !newEmail.contains("@") || newEmail.trim().isEmpty()) {
            throw new IllegalArgumentException("Use a valid email format");
        }
        this.email = newEmail;

       
    }


    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age + '}';
    }
}
