import org.example.Person;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestingClass {
    private Person p1;
    private Student s1;


    @BeforeAll
    public static void init(){
        System.out.println("Star before all");
    }

    @Test
    public void testPerson() {
        String name = "Ali";
        int age = 23;
        String address = "Riyadh";

        String actual = "Name: " + name + ", Age: " + age + ", Address: " + address;
        String expected = "Name: Reyom, Age: 23, Address: Riyadh";
        Assertions.assertEquals(expected, actual);
    }

}
