import java.lang.String;

public class TestPerson{
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        PersonException personExc = new PersonException();

        person.setName("Batman");
        person.setAge(34);
        person.setHeight(1.88f);
        person.getName();
        person.getAge();
        person.getHeight();
        person.isValid();
        person.info();
    }
}
