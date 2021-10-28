import java.util.Objects;

public abstract class Employee {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return ("Name: "+ name + "\nAge: " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
