public class Manager extends Employee {
//    Необходимо создать класс Manager в который нужно добавить следующие методы:
//    getNumberOfSubordinates - получить количество подчиненных
//            setNumberOfSubordinates

    protected int subordinates;

    public Manager(String name, int baseSalary, int age, String gender, int subordinates) {
        super(name, baseSalary, age, gender);
        this.subordinates = subordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.subordinates = numberOfSubordinates;
    }
    public int getNumberOfSubordinates(){
        return subordinates;
    }
//        в классе, метод getSalaryManager будет возвращать значение по формуле -
//         <базовая ставка> * (<количество подчиненных> / 100 * 3).
//        Если количество подчиненных 0, то результат как у обычного рабочего.
    public int getSalaryManager(){
        if(subordinates > 0) {
            return baseSalary * (subordinates / 100 * 3);
        }
        else{
            return baseSalary;
        }
    }

}
