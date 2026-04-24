class Employee{
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void showInfo(){
        System.out.println("Name: " + this.name + " Base Salary: " + this.baseSalary);
    }

    double calculateSalary(){
        return baseSalary;
    }
}

class Manager extends Employee{

    public Manager(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * 0.20);
    }
}

class Developer extends Employee{

    private int overtimeHours;
    private double hourlyRate;

    public Developer(String name, double baseSalary, int overtimeHours, double hourlyRate){
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + (overtimeHours * hourlyRate);
    }
}


class Intern extends Employee{

    public Intern(String name, double baseSalary, int overtimeHours, double hourlyRate){
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() * 0.50;
    }
}

public class poly4 {
    public static void main(String[] args) {

        Employee[] employee = new Employee[3];

        employee[0] = new Developer("Sude", 1000, 5, 4);
        employee[1] = new Manager("Yusuf", 2000);
        employee[2] = new Intern("Ayse", 1500, 0, 0);

        for (Employee e : employee) {
            e.showInfo();
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println("------------");
        }
    }
}
