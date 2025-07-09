class Employee {
    private int pwd;           // Private - accessible via setter/getter
    protected int Salary;      // Protected - accessible in subclass
    public int empid;          // Public - accessible from anywhere

    // Setter for private pwd
    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    // Getter for private pwd
    public int getPwd() {
        return pwd;
    }
}

public class Hr extends Employee {
    public static void main(String[] args) {
        // Create an object of Hr
        Hr h = new Hr();

        // Set values using direct access and setter
        h.setPwd(1254);      // Access private variable via setter
        h.Salary = 50000;    // Protected variable - allowed
        h.empid = 10001;     // Public variable - allowed

        // Display all values
        System.out.println("Password (via getter): " + h.getPwd());
        System.out.println("Salary: " + h.Salary);
        System.out.println("Employee ID: " + h.empid);
    }
}
