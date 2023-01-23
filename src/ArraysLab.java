public class ArraysLab {
    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 15");
        for (int i = 1; i < 16; i++) {
            System.out.println(i);
        }
        System.out.println("Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");

        }

        System.out.println("\nPrint * symbol using given number");
//HARCAKAN
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------");

        int k = 5;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n\n Create an array 1-11");
        int[] array = new int[11];
        for (int i = 0, q = 1; i < array.length; i++, q++) {
            array[i] = q;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nCreate an array from -10 to 10");
//Harcakan
        int[] array2 = new int[11];
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
            System.out.println(array2[i]);
        }
        for (int i : array2) {
            System.out.println(i + " ");
        }
        System.out.println("\n");

        System.out.println("Given an array, print count of odd elements");
        int[] array3 = {1, 5, 74, 12, 56, 81, 7, 2};
        for (int a : array3) {
            if (a % 2 != 0)
                System.out.print(a + " ");
        }
        System.out.println("\n");
        for (int f : array3) {
            if (f >= -10 && f <= 5)
                System.out.print(f + " ");

        }
        System.out.println("\nGiven an array, print elements which can be divided 3 or 4");

        for (int g : array3) {
            if (g % 3 == 0 || g % 4 == 0)
                System.out.println(g + " ");
        }
        System.out.println("\nGiven an array, print count of even elements");
        int countOfEvens = 0;
        for (int l : array3) {
            if (l % 2 == 0)
                countOfEvens++;
        }
        System.out.println("Count of even elements is " + countOfEvens);

        array3 = new int[]{-4, 5, 8, 12, 44, 63, 9};
        System.out.println("\nGiven an array, print sum of elements");
        int sum = 0;
        for (int s : array3) {
            sum = s + sum;
        }
        System.out.println(sum);
        System.out.println("\nGiven an array, print sum of positive elements");
        sum = 0;
        for (int s : array3) {
            if (s > 0)
                sum = s + sum;
        }
        System.out.println(sum);

        System.out.println("\nGiven an array, print multiplication of elements");
        int mult = 1;
        for (int m : array3) {
            mult = m * mult;
        }
        System.out.println(mult);

        System.out.println("\nGiven an array, find maximal element from array");
        int max = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max)
                max = array3[i];
        }
        System.out.println("Maximum is " + max);

        System.out.println("\nGiven an array, find minimal element from array");
        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min)
                min = array3[i];
        }
        System.out.println("Minimal is " + min);

        System.out.println("\nGiven an array, find the element which is alone");
        array = new int[]{9, 5, 2, 1, 9, 2, 5};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);
        array = new int[]{125, 4, 6, -7, 81, -50, 12};
        int x = 4, y = 6;
        int z = x;
        x = y;
        y = z;
        System.out.println("x= " + x + " y= " + y);
        System.out.println("\n");

        System.out.println("\nSort array in asc.");
        for (int g : array) {
            System.out.print(g + " ");
        }
        boolean qaniderIfmtnume = true;

        int counofforse=0;
        while (qaniderIfmtnume) {
            qaniderIfmtnume = false;
            for (int i = 0; i < array.length - 1 - counofforse; i++) {
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniderIfmtnume = true;
                }
            }
            counofforse++;
        }
        System.out.println();
        for (int g : array) {
            System.out.print(g + " ");
        }


    }
}
