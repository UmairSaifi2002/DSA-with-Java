public class Encapsulation {

    public static void main(String[] args) {
        // Encapsulation is defined as the 'wrapping up' of data & methods under asingle unit.
        // It also implement data hiding

        Employee emp = new Employee("John Doe", 30, 50000);

        // Accessing and modifying the private attributes using getters and setters
        System.out.println(emp.getName());   // Output: John Doe
        System.out.println(emp.getAge());    // Output: 30

        emp.setAge(31);                      // Valid update
        System.out.println(emp.getAge());    // Output: 31

        emp.setAge(-5);                      // Invalid update
        System.out.println(emp.getAge());    // Output: 31

        emp.setSalary(60000);                // Valid update
        System.out.println(emp.getSalary()); // Output: 60000

        emp.setSalary(-1000);                // Invalid update
        System.out.println(emp.getSalary()); // Output: 60000
    }
}

class Employee {
    // Private attributes
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

}
