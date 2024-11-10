public class EmployeesArr {
    public static void main (String[] args){
        Employee[] employeesArr = new Employee[5];
        employeesArr[0]= new Employee("Ефимов Ефим", "Электрогазосварщик","elg@mail.ru", 987654321, 75000, 32);
        employeesArr[1]= new Employee("Сергеев Сергей", "Водитель","vdl@mail.ru", 789456123, 65000, 42);
        employeesArr[2]= new Employee("Михеев Михаил", "Сторож","str@mail.ru", 321654987, 35000, 75);
        employeesArr[3]= new Employee("Кирилов Кирилл", "Грузчик","grz@mail.ru", 147258369, 60000, 20);
        employeesArr[4]= new Employee("Антонов Антон", "Резчик","rzch@mail.ru", 741852963, 73000, 34);
        employeesArr[0].printEmployeeInfo();
        employeesArr[1].printEmployeeInfo();
        employeesArr[2].printEmployeeInfo();
        employeesArr[3].printEmployeeInfo();
        employeesArr[4].printEmployeeInfo();
    }
}
