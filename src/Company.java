public class Company {
//    поиск сотрудника в массиве по его имени
    private Employee[] employees;
    private Manager[] managers;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee findEmployee(String searchName){
        for (int i = 0; i < employees.length; i++){
            Employee currentEmployee = employees[i];
            String currentEmployeeName = currentEmployee.getName();
            if(currentEmployeeName.equals(searchName)){
                return employees[i];
            }
        }
        return null;
    }
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public Employee namePart(String searchNamePart){
        for (int i = 0; i < employees.length; i++){
            Employee currentEmployee = employees[i];
            String currentEmployeeName = currentEmployee.getName();
            if(currentEmployeeName.contains(searchNamePart)){
                return employees[i];
            }
        }
        return null;
    }
//    подсчет зарплатного бюджета для всех сотрудников в массиве
    public int budget(){
        int sum = 0;
        for (int i = 0; i < employees.length; i++){
            Employee currentEmployee = employees[i];
            int currentEmployeeBaseSalary = currentEmployee.getBaseSalary();
            sum += currentEmployeeBaseSalary;
        }
        return sum;
    }
//    поиск наименьшей зарплаты в массиве
    public int minSalary(){
        int min = employees[0].getBaseSalary();
        for (int i = 0; i < employees.length; i++){
            Employee currentEmployee = employees[i];
            int currentEmployeeBaseSalary = currentEmployee.getBaseSalary();
            if(min > currentEmployeeBaseSalary){
                min = currentEmployeeBaseSalary;
            }
        }
        return min;
    }
    //поиск наибольшей зарплаты в массиве
    public int maxSalary(){
        int max = employees[0].getBaseSalary();
        for (int i = 0; i < employees.length; i++){
            Employee currentEmployee = employees[i];
            int currentEmployeeBaseSalary = currentEmployee.getBaseSalary();
            if(max < currentEmployeeBaseSalary){
                max = currentEmployeeBaseSalary;
            }
        }
        return max;
    }

//    поиск наименьшего количества подчиненных в массиве менеджеров
    public int quantityMinSubs(){
        int min = managers[0].getNumberOfSubordinates();
        for (int i = 0; i < managers.length; i++){
            Manager currentManager = managers[i];
            int numberOfSubs = currentManager.getNumberOfSubordinates();
            if(min > numberOfSubs){
                min = numberOfSubs;
            }
        }
        return min;
    }
    //поиск наибольшего количества подчиненных в массиве менеджеров
    public int quantityMaxSubs(){
        int max = managers[0].getNumberOfSubordinates();
        for (int i = 0; i < managers.length; i++){
            Manager currentManager = managers[i];
            int numberOfSubs = currentManager.getNumberOfSubordinates();
            if(max < numberOfSubs){
                max = numberOfSubs;
            }
        }
        return max;
    }
    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой)
    // в массиве менеджеров
    public int salaryExtra(){
        int max = managers[0].getSalaryManager(managers[0].baseSalary, managers[0].numberOfSubordinates);
        for (int i = 0; i < managers.length; i++){
            Manager currentManager = managers[i];
            int numberOfSubs = currentManager.getNumberOfSubordinates();
            if(max < numberOfSubs){
                max = numberOfSubs;
            }
        }
        return max;
    }
}
