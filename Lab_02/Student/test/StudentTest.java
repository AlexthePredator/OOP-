import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void newStudentTest() {
        Student s1 = new Student("Mario", "Rossi");

        Assert.assertEquals("Mario", s1.getFirstName());
        Assert.assertEquals("Rossi", s1.getLastName());

    }
}