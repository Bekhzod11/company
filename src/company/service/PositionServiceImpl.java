package company.service;

import company.models.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositionServiceImpl  implements  PositionService{

private Scanner scanner = new Scanner(System.in);
private List<Position> positionList;

    public PositionServiceImpl(List<Position> positionList) {
        this.positionList = positionList;
    }

    @Override
    public void addPosition() {

        System.out.println("Name:");
        String name = scanner.next();
        System.out.println("Desc: ");
        String desc = scanner.next();
        Position p1 = new Position(name,desc);
        positionList.add(p1);
    }

    @Override
    public void deletePosition() {

    }

    @Override
    public void editPosition() {

    }

    @Override
    public void listPositions() {
        for (Position position : positionList) {
            System.out.println(position);
        }
    }
}
