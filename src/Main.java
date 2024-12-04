public class Main {
    public static void main(String[] args) {
        // Task 1
        int [] anIntegerArray = new int[3];
        double [] fractionalArray = {1.57, 7.654, 9.986};
        int [] anArbitraryArray = {8, 12, 16, 20, 24};
        for (int length = 0; length < anIntegerArray.length; length++){
            anIntegerArray [length] = length + 1;
        }

        // Task 2
        for (int length = 0; length < anIntegerArray.length; length++) {
            if (length == anIntegerArray.length - 1) {
                System.out.println(anIntegerArray[length]);
                break;
            }
            System.out.print(anIntegerArray[length] + ", ");
        }
        for (int length = 0; length < fractionalArray.length; length++) {
            if (length == fractionalArray.length - 1) {
                System.out.println(fractionalArray[length]);
                break;
            }
            System.out.print(fractionalArray[length] + ", ");
        }
        for (int length = 0; length < anArbitraryArray.length; length++) {
            if (length == anArbitraryArray.length - 1) {
                System.out.println(anArbitraryArray[length]);
                break;
            }
            System.out.print(anArbitraryArray[length] + ", ");
        }

        // Task 3
        for (int length = anIntegerArray.length; length > 0; ) {
            length--;
            if (length > 0) {
                System.out.print(anIntegerArray[length] + ", ");
            } else System.out.println(anIntegerArray[length]);
        }
        for (int length = fractionalArray.length; length > 0; ) {
            length--;
            if (length > 0) {
                System.out.print(fractionalArray[length] + ", ");
            } else System.out.println(fractionalArray[length]);
        }
        for (int length = anArbitraryArray.length; length > 0; ) {
            length--;
            if (length > 0) {
                System.out.print(anArbitraryArray[length] + ", ");
            }else System.out.println(anArbitraryArray[length]);
        }

        // Task 4
        for (int length = 0; length < anIntegerArray.length; length++){
            if (anIntegerArray[length] % 2 != 0){
                anIntegerArray[length]++;
                if (length == anIntegerArray.length - 1) {
                    System.out.println(anIntegerArray[length]);
                    break;
                }
                System.out.print(anIntegerArray[length] + ", ");
            } else System.out.print(anIntegerArray[length] + ", ");
        }
    }
}