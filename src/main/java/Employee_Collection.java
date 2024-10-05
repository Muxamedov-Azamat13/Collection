import java.util.ArrayList;
import java.util.List;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */

public class Employee_Collection {
    private List<Employee_Directory> employeList;

    public List<Employee_Directory> getEmployeeExperience(int experience){
        List<Employee_Directory> employeeExperience = new ArrayList<>();
        for (Employee_Directory employee : employeList){
            if (employee.getExperience() == experience){
                employeeExperience.add(employee);
            }
        }
        return employeeExperience;
    }

    public List<String> getPhoneNumber(String name){
        List<String> phoneNumber = new ArrayList<>();
        for (Employee_Directory employee : employeList){
            if (employee.getName().equalsIgnoreCase(name)){
                phoneNumber.add(employee.getNumberPhone());
            }
        }
        return phoneNumber;
    }

    public Employee_Directory getId (int id){
        for (Employee_Directory employee : employeList){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee_Directory employee){
        employeList.add(employee);
    }

}
