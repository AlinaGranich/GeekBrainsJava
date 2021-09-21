public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Колтунов.A",
                "Programmer",
                "Kol@mail.ru",
                "89214567890",
                "300000",
                 31);

        employee.printInfo();

        Employee [] employees = new Employee[5];
        employees [0] = new Employee(
                "Alina",
                "HR",
                "Alina@mail.ru",
                "89818974087",
                "90000",
                18);
        employees [1] =  new Employee(
                "Alisa",
                "Project manager",
                "Progect@mail.ru",
                "89218974085",
                "150000",41);
        employees [2] = new Employee(
                "Alex",
                "QA",
                "Alexxx@gmail.com",
                "9816753454",
                "50000",
                25);
        employees [3] = new Employee(
                "Gloria",
                "CPO",
                "CPO@mail.ru",
                "89818988974","350000",30);
        employees [4] = new Employee(
                "Phillip",
                "PM",
                "PM@gmail.com",
                "89816453947","300000",28);
        for(int i = 0; i  < employees.length; i++) {
            if (employees[i].age > 40) employees[i].printInfo();


        }



    }



}
