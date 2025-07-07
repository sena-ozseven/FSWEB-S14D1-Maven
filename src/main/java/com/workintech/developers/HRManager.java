package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

    }
    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }



    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (null == juniorDevelopers[index]) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found");
        }
    }
    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (null == midDevelopers[index]) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found");
        }

    }
    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (null == seniorDevelopers[index]) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found");
        }
    }
    @Override
    public void work() {
        System.out.println(getName() + " HR manager starts to working");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
