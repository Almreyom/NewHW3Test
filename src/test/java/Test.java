import org.example.Person;
import org.example.School;
import org.example.Student;

import org.junit.jupiter.api.*;

public class Test{
    @org.junit.jupiter.api.Test
    public void testAgeInvalid(){
        Person p = new Person("Reyom",24,"ALkaleej");
        Assertions.assertThrows(IllegalArgumentException.class,() -> p.setAge(24) );
    }
}