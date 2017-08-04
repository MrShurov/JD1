package Lesson14;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String firstName;
    private String lastName;
    public int age;
}
