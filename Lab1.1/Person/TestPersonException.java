public class TestPersonException {
    private static void main(String [] args){
        PersonException person = new PersonException();
        try {
            person.setName("D-@45%");
        }
        catch (IllegalNameException e){
            System.out.println(e.getMessage());
        }
        try {
            person.setAge(123);
        }
        catch (IllegalAssignmentException e){
            System.out.println(e.getMessage());
        }
        try {
            person.setHeight(1.9f);
        }
        catch (IllegalAssignmentException e){
            System.out.println(e.getMessage());
        }

        person.getName();
        person.getAge();
        person.getHeight();
        person.setGender(PersonException.Gender.MALE);
        try {
            person.setName("");
        }
        catch (IllegalNameException e){
            System.out.println(e.getMessage());
        }
        try {
            person.setAge(-2);
        }
        catch (IllegalAssignmentException e){
            System.out.println(e.getMessage());
        }
        try {
            person.setHeight(4.9f);
        }
        catch (IllegalAssignmentException e){
            System.out.println(e.getMessage());
        }

        person.info();
    }
}
