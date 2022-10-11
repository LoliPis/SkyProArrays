public class Main {
    public static void main(String[] args) {
        //Ex1
        System.out.println("Задание номер один");
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        String[] arrayThree = {"Hello", "Word", "!"};
        //Ex2
        System.out.println("Задание номер два");
        for (int i = 0; i < arrayOne.length; i++) {
            if (i != arrayOne.length) {
                System.out.print(arrayOne[i] + ",");
            } else {
                System.out.println(arrayOne[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i != arrayTwo.length) {
                System.out.print(arrayTwo[i] + ",");
            } else {
                System.out.println(arrayTwo[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arrayThree.length; i++) {
            if (i != arrayThree.length) {
                System.out.print(arrayThree[i] + ",");
            } else {
                System.out.println(arrayThree[i]);
            }
        }
        System.out.println();
        //Ex3
        System.out.println("Задание номер три");
        for (int length = arrayOne.length - 1; length >= 0; length--) {
            if (length != 0) {
                System.out.print(arrayOne[length] + ",");
            } else {
                System.out.print(arrayOne[length]);
            }
        }
        System.out.println();
        for (int length = arrayTwo.length - 1; length >= 0; length--) {
            if (length != 0) {
                System.out.print(arrayTwo[length] + ",");
            } else {
                System.out.print(arrayTwo[length]);
            }
        }
        System.out.println();
        for (int length = arrayThree.length - 1; length >= 0; length--) {
            if (length != 0) {
                System.out.print(arrayThree[length] + ",");
            } else {
                System.out.print(arrayThree[length]);
            }
        }
        System.out.println();
        //Ex4
        System.out.println("Задание номер четыре");
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
            }
            System.out.print(arrayOne[i] + " ");
        }
    }
}