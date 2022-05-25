package com.mchindwhite;

public class CombinationLock {
    private byte first;
    private byte second;
    private byte third;

    public CombinationLock(byte first, byte second, byte third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(byte first) {
        this.first = first;
    }

    public void setSecond(byte second) {
        this.second = second;
    }

    public void setThird(byte third) {
        this.third = third;
    }

    //method open
    public boolean openLock(byte first, byte second, byte third){
        if(first == this.first && second == this.second && third == this.third) {
            return true;
        } else {
            return false;
        }
    }

    //method changeCombo-the person must know the current combo
    public boolean changeCombo(byte first, byte second, byte third, byte newFirst, byte newSecond, byte newThird) {
        if(openLock(first, second, third)) {
            setFirst(newFirst);
            setSecond(newSecond);
            setThird(newThird);
            System.out.println(first + " " + second + " " + third);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CombinationLock lock = new CombinationLock((byte)1,(byte)2,(byte)3);
        System.out.println(lock.first);
        System.out.println(lock.second);
        System.out.println(lock.third);
        System.out.println(lock.openLock((byte) 1, (byte) 2, (byte) 3)); //true
        System.out.println(lock.openLock((byte) 25, (byte) 37, (byte) 15)); //false

        System.out.println(lock.changeCombo((byte) 1, (byte) 2, (byte) 3, (byte) 25, (byte) 37, (byte) 15));
        System.out.println(lock.first);
        System.out.println(lock.second);
        System.out.println(lock.third);
        System.out.println(lock.openLock((byte) 1, (byte) 2, (byte) 3)); //false
        System.out.println(lock.openLock((byte) 25, (byte) 37, (byte) 15)); //true


    }
}

//Data_Structures_and_Problem_Solving_Using_Java__4ed__Weiss.pdf

/* A combination lock has the following basic properties: the combo(sequence of numbers) is hidden, the lock can be opened by
providing the combo, and the combo can be changed by someone who know the current combo.
Design a class with public methods "open" and "changeCombo" and private data fields that store the combo. The combo should be set in the constructor
Let's assume the combination consists of numbers from 1-127, and the person just has to match all 3 numbers (rather than 3 turns to the left 4 turns to the right, etc)
*/
