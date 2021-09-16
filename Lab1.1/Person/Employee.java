public final class Employee extends AbstractPerson {
    final private String department;
    final Position position;

    Employee(String name, String department, Position position) {
        super(name);
        this.department = department;
        this.position = position;
    }

    enum Position {
        MANAGER, SELLER
    }

    @Override
    public String think() { return "I'm a employee"; }
}
