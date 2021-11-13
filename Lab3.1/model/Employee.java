package model;

public class Employee extends AbstractPerson {
    String department;
    int age;
    String phone;
    String position;
    String gender;

    public Employee(String name, String department, int age, String phone, String position, String gender){
        super(name);
        this.department = department;
        this.age = age;
        this.phone = phone;
        this.position = position;
        this.gender = gender;
    }

    public String getName(){return getName();}

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String think(){return "I'm a employee";};
}
