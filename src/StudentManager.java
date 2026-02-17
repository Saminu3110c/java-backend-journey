import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student newStudent) {
        // Prevent duplicate student IDs
        for (Student student : students) {
            if (student.getId() == newStudent.getId()) {
                throw new IllegalArgumentException("Student with the id: " + newStudent.getId() + " already exist!");
            }
        }
        students.add(newStudent);

    }

    public void removeStudentById(int id) {
        // throw exception when id not found
        if(!(students.removeIf(student -> student.getId() == id))){
            throw new IllegalArgumentException("Student not found!");
        }

    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void printAllStudents() {
        students.forEach(System.out::println);
    }

    // Adding new method
    // public List<Student> getStudentsAboveAge(int age){
    //     List<Student> studentsAboveAge = new ArrayList<>();
    //     for(Student student : students){
    //         if(student.getAge() > age){
    //             studentsAboveAge.add(student);
    //         }
    //     }
    //     return studentsAboveAge;
    // }

    // Using API stream (Better way)
    public List<Student> getStudentsAboveAge(int age) {
        return students.stream()
                .filter(student -> student.getAge() > age)
                .collect(Collectors.toList());
    }


}

