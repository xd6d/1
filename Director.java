import java.util.Objects;

public class Director extends Employee {
    private final int employeeNumber;
    public Director(String name, int age, int employeeNumber) {
        super(name, age);
        this.employeeNumber=employeeNumber;
    }

    public Director(String name, int age) {
        super(name, age);
        this.employeeNumber=0;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        if (!super.equals(o)) return false;
        return getEmployeeNumber() == ((Director) o).getEmployeeNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmployeeNumber());
    }

    public void yell(String s){
        System.out.println(s + "!!!");
    }

    public Director clone(){
        return new Director(super.getName(), super.getAge(), employeeNumber);
    }

    public Director createDifDirector(String name, int age,int employeeNumber){
        return new Director(name, age,  employeeNumber);
    }
    @Override
    public String toString() {
        return (super.toString()+"\nAmount of employee: "+ employeeNumber);
    }
}
