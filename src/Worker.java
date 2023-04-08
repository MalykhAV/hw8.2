public class Worker extends Employee {
//    Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату,
//    базовую ставку.
    public Worker(String name, int baseSalary, int age, String gender){
        super(name, baseSalary, age, gender);
    }
    public int getSalaryWorker(){
        return baseSalary;
    }
}
