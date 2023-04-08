public class Employee {
//    Необходимо создать класс Employee со следующими методами:
//    getName - получить имя
//    setName
//    getBaseSalary - базовая ставка
//    setBaseSalary
    protected String name;
    protected int baseSalary;
    protected int age;
    protected String gender;

    public static final String MALE = "M";
    public static final String FEMALE = "F";
    public Employee(String name, int baseSalary, int age, String gender) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }

}
