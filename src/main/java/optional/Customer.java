package optional;

import java.util.Optional;

public class Customer {
    public static final Customer DEFAULT = new Customer("Default");
    private static int nextId;
    private final int id;
    private final String name;

    public Customer(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public static Customer getDefault() {
        return DEFAULT;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
