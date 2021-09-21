public class Employee {
    String fio;
    String position;
    String email;
    String phoneNum;
    String salary;
    int age;



     Employee(String newFio, String newPosition, String newEmail, String newPhoneNum, String newSalary, int newAge){
         this.fio = newFio;
         this.position = newPosition;
         this.email = newEmail;
         this.phoneNum = newPhoneNum;
         this.salary = newSalary;
         this.age = newAge;
     }

     public void printInfo(){
         System.out.println(fio + "\n" + position + "\n" + email + "\n"+ phoneNum + "\n" + salary + "\n" + age);
     }










}
