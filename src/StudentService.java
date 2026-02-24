import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {
        if (repository.existsById(student.getId())) {
            throw new DuplicateStudentException(
                    "Student with id " + student.getId() + " already exists."
            );
        }
        repository.save(student);
    }

    public Student getStudent(int id) {
        Student student = repository.findById(id);

        if (student == null) {
            throw new StudentNotFoundException(
                    "Student with id " + id + " not found."
            );
        }

        return student;
    }

    public void removeStudent(int id) {
        if (!repository.existsById(id)) {
            throw new StudentNotFoundException(
                    "Student with id " + id + " not found."
            );
        }
        repository.deleteById(id);
    }

    public List<Student> getStudentsAboveAge(int age) {
        return repository.findAll().stream()
                .filter(student -> student.getAge() > age)
                .collect(Collectors.toList());
    }
}