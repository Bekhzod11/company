package company.service;

import company.models.Employee;
import company.models.Position;
import company.models.Section;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

private Scanner scanner = new Scanner(System.in);

private List<Employee> employeeList;

private List<Section> sectionList;

private List<Position> positionList;

    public EmployeeServiceImpl(List<Employee> employeeList, List<Section> sectionList, List<Position> positionList) {
        this.employeeList = employeeList;
        this.sectionList = sectionList;
        this.positionList = positionList;
    }




    @Override
    public void addEmployee() {
        System.out.println("Last name:");
        String lastName= scanner.next();
        System.out.println("First name:");
        String firstName= scanner.next();
        System.out.println(" Patron:");
        String patron= scanner.next();
        System.out.println("Birthday:");
        String birthday= scanner.next();
        System.out.println("Gender:");
        String gender = scanner.next();

        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) + "->" + sectionList.get(i).getName());
        }
        int n = scanner.nextInt()-1;
        Section section = sectionList.get(n);



        for (int i = 0; i < positionList.size(); i++) {
            System.out.println((i+1) + "->" + positionList.get(i).getName());
        }
        int n1 = scanner.nextInt()-1;
        Position position = positionList.get(n1);
        double salary = scanner.nextDouble();
        Employee e1 = new Employee(lastName,firstName,patron,birthday,gender,section,position,salary);
        employeeList.add(e1);

    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public void listEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
