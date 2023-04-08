public class Director extends Manager{
//    Необходимо создать класс Director, метод getSalaryDirector должен возвращать
//    результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
//    Если количество подчиненных 0, то результат как у обычного рабочего.

    public Director(String name, int baseSalary, int age, String gender, int subordinates) {
        super(name, baseSalary, age, gender, subordinates);
    }

    public int getSalaryDirector(int baseSalary, int numberOfSubordinates){
        if(numberOfSubordinates > 0) {
            return baseSalary * (numberOfSubordinates / 100 * 9);
        }
        else{
            return baseSalary;
        }
    }
}
