abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}

// A concrete subclass of Employee
class SalariedEmployee extends Employee {
    private double salary; // Annual salary

    public SalariedEmployee(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of SalariedEmployee class");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Employee e = new SalariedEmployee("George W.", "Houston, TX", 43, 70000.00);
        
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}
