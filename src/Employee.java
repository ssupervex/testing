public class Employee {
    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;
    public Employee (String name, String position,String email, int phoneNumber, int salary, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printEmployeeInfo() {
        System.out.println("ФИО: " + name + ", Должность: " + position + ", Эл.почта: " + email + ", Номер телефона: " + phoneNumber + ", ЗП: " + salary + ", Возраст: "+ age);
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван", "Электрик", "gvn@mail.ru", 123456789, 70000, 33);
        employee1.printEmployeeInfo();
    }
}

