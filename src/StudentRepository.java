import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

    private Map<Integer, Student> students = new HashMap<>();

    public void save(Student student) {
        students.put(student.getId(), student);
    }

    public Student findById(int id) {
        return students.get(id);
    }

    public void deleteById(int id) {
        students.remove(id);
    }

    public boolean existsById(int id) {
        return students.containsKey(id);
    }

    public Collection<Student> findAll() {
        return students.values();
    }
}