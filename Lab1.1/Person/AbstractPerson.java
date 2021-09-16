public abstract class AbstractPerson implements HumanInterface {
    protected String name;

    AbstractPerson(String name) {
        this.name = name;
    }

    public abstract String think();
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}
