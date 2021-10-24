package chapter_9;

public class objectSorting {

    public static void main(String[] args) {

        Employee[] team = new Employee[5];
        team[0] = new Employee(99, "FirstName", "LastName", 10_500);
        team[1] = new Employee(100, "FirstName1", "LastName1", 9_500);
        team[2] = new Employee(101, "FirstName2", "LastName2", 13_850);
        team[3] = new Employee(102, "FirstName3", "LastName3", 11_300);
        team[4] = new Employee(103, "FirstName4", "LastName4", 17_850);

        printEmployee(team);
        bubbleSort(team);

        System.out.println("\nAfter sorting by salary");

        printEmployee(team);


    }

    public static void bubbleSort(Employee[] array) {

        int a, b;
        Employee temp;
        int hightSubscript = array.length - 1;
        for (int i = 0; i < hightSubscript; i++)
            for (int j = 0; j < hightSubscript; j++)
                if (array[j].getSalary() > array[j + 1].getSalary()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void printEmployee(Employee[] array) {
        for (Employee employee : array)
            System.out.println(employee);
    }

}

class Employee {
    private int empNum;
    private String lastName;
    private String firstName;
    private double salary;

    public Employee(int empNum, String lastName, String firstName, double salary) {
        this.empNum = empNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("Employee info: [ %s %s ] salary: [ $%s ]", firstName, lastName, salary);
    }


}
