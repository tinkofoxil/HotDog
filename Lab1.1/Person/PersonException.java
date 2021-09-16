import java.lang.Exception;
import java.util.Scanner;

public class PersonException {
    private final int MAX_AGE = 200;

    private final double MAX_HEIGHT = 3;
    private int age;

    private float height;
    private String name;
    private Scanner scanner = new Scanner(System.in);
    private boolean isNameValid = false;
    private boolean isAgeValid = false;
    private boolean isHeightValid = false;
    private Gender gender;

    public enum Gender {
        MALE(1, "Male"), FEMALE(2, "Female"), OTHER(1024, "Other");

        private Gender(int i, String str) {
            value = i;
            strValue = str;
        }

        private final int value;
        private final String strValue;

        public int getValue() { return value; }
        public String getStrValue() { return strValue; }
    }

    PersonException() {}

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) throws IllegalAssignmentException {
        if(age < 0)
            throw new IllegalAssignmentException("Age is invalid");

        this.age = age;
        isAgeValid = true;
    }

    public void setName(String name) throws IllegalNameException {
        if(name.isEmpty())
            throw new IllegalNameException("String is empty");

        this.name = name;
        isNameValid = true;
    }

    public void setHeight(float height) throws IllegalAssignmentException {
        if(height >= MAX_HEIGHT || height < 0)
            throw new IllegalAssignmentException("Height is invalid");

        this.height = height;
        isHeightValid = true;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public float getHeight() { return height; }

    public void info() {
        if(isValid())
            System.out.println(this.toString());
        else
            System.out.println("Object has an incorrect value");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", height: " + height + ", gender: " + Gender.MALE;
    }

    public boolean isValid() { return isAgeValid && isHeightValid && isNameValid; }
}
