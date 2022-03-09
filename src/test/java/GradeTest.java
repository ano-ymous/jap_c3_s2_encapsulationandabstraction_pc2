import com.java.main.Grade;
import com.java.main.Student;
import com.java.main.Subject;
import org.junit.jupiter.api.BeforeEach;

public class GradeTest {
    @BeforeEach
    public void setUp(){
        Grade grade = new Grade(5);
        Subject[] subjects = new Subject[3];
        for(int i=0; i<subjects.length; i++){
            subjects[i] = new Subject("M1","Maths");
        }
        Student[] students = new Student[5];

    }
}
