package company.service;

import company.models.Employee;
import company.models.Position;
import company.models.Section;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SectionServiceImpl implements SectionService{

    private List<Section> sectionList = new ArrayList<>();
    private List<Position> positionList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void addSection() {
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Description:");
        String desc = scanner.next();
        Section s1= new Section(name,desc);
        sectionList.add(s1);
    }

    @Override
    public void deleteSection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) + "->" + sectionList.get(i).getName());
        }
        int n = scanner.nextInt();
        sectionList.remove(n);
    }

    @Override
    public void editSection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i+1) + "->" + sectionList.get(i).getName());
        }
        int n = scanner.nextInt()-1;
        System.out.println("New section name: ");
        String name = scanner.next();
        System.out.println("New desc name: ");
        String desc = scanner.next();
        sectionList.get(n).setName(name);
        sectionList.get(n).setDesc(desc);
    }

    @Override
    public void listSections() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println(sectionList.get(i));
        }
    }

    @Override
    public void postionMenu() {
    boolean a = true;
    PositionService positionService = new PositionServiceImpl(positionList);
    while (a){
        System.out.println("1->Addpostion;2->deletePosition;3->editPostion: 4->ListPosition");
        int n = scanner.nextInt();
switch (n){
    case 1->{
        positionService.addPosition();
    }
    case 2->{
        positionService.deletePosition();
    }
    case 3->{
        positionService.editPosition();
    }
    case 4->{
        positionService.listPositions();
    }
}
    }
    }

    @Override
    public void employeeMenu() {
EmployeeService employeeService = new EmployeeServiceImpl(employeeList,sectionList,positionList);
boolean a = true;

while (a){
    System.out.println("1->add employee;2 ->deleteEmployee: 3->listEmployee");
    int n =scanner.nextInt();
    switch (n){
        case 1->{
            employeeService.addEmployee();
        }
        case 2->{
            employeeService.deleteEmployee();
        }
        case 3->{
            employeeService.listEmployee();
        }
    }
}
    }
}
