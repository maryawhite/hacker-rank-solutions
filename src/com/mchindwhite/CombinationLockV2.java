package com.mchindwhite;

public class CombinationLockV2 {
    private int first;
    private int second;
    private int third;

    public CombinationLockV2(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    //method to open
    public boolean openLock(int first, int second, int third) {
        if(first == this.first && second == this.second && third == this.third) {
            return true;
        } else {
            return false;
        }
    }

    //method to change
    // we set the combo when we instantiated the class so we need to use this.first = newFirst.
    public boolean changeCombo(int first, int second, int third, int newFirst, int newSecond, int newThird){
        if(openLock(first, second, third)) {
            this.first = newFirst;
            this.second = newSecond;
            this.third = newThird;

            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "CombinationLockV2{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public static void main(String[] args) {
        CombinationLockV2 lockV2 = new CombinationLockV2(25, 37, 15);
        System.out.println(lockV2.openLock(25, 37, 15)); //true
        System.out.println(lockV2.openLock(15, 25, 37)); //false
        System.out.println(lockV2);

        lockV2.changeCombo(25, 37, 15, 5, 6, 7);
        System.out.println(lockV2.openLock(5, 6, 7));  //true
        System.out.println(lockV2.openLock(25, 37, 15));  //false
        System.out.println(lockV2);

    }
}
//Data_Structures_and_Problem_Solving_Using_Java__4ed__Weiss.pdf

/* A combination lock has the following basic properties: the combo(sequence of numbers) is hidden, the lock can be opened by
providing the combo, and the combo can be changed by someone who know the current combo.
Design a class with public methods "open" and "changeCombo" and private data fields that store the combo. The combo should be set in the constructor
*/
