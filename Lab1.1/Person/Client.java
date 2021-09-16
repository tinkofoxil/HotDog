public class Client extends AbstractPerson {
    private String service;
    private float price;

    Client(String name) {
        super(name);
    }

    @Override
    public String think() {
        return "I'm a client";
    }
}
