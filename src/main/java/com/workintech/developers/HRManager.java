package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing hiring processes.");
    }


    public void addEmployee(JuniorDeveloper junior) {
        int index = findAvailableIndex(juniorDevelopers);
        if (index != -1) {
            juniorDevelopers[index] = junior;
            System.out.println(junior.getName() + " added to Junior Developers at index " + index);
        } else {
            System.out.println("Junior Developers team is full!");
        }
    }


    public void addEmployee(MidDeveloper mid) {
        int index = findAvailableIndex(midDevelopers);
        if (index != -1) {
            midDevelopers[index] = mid;
            System.out.println(mid.getName() + " added to Mid Developers at index " + index);
        } else {
            System.out.println("Mid Developers team is full!");
        }
    }


    public void addEmployee(SeniorDeveloper senior) {
        int index = findAvailableIndex(seniorDevelopers);
        if (index != -1) {
            seniorDevelopers[index] = senior;
            System.out.println(senior.getName() + " added to Senior Developers at index " + index);
        } else {
            System.out.println("Senior Developers team is full!");
        }
    }


    private <T> int findAvailableIndex(T[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
