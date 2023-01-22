public class ArraysLoops {
    public static void main(String[] args) {
        int[] x = new int[6];
        x[0] = 1;
        x[1] = 4;
        x[2] = 7;
        x[3] = 8;
        x[4] = 14;
        x[5] = 42;
        System.out.println(x[0] + x[5]);
        System.out.println(x[0] + x[x.length - 1]);

        int[] array = {1, 2, 4, 6, 45, 12};
        System.out.println(array[array.length - 1]);


        int[] a;
        x = new int[]{1, 4, 6};


        int k = 4;

        if (k > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        int b;
        b = k > 4 ? 1 : 0;
        System.out.println(b);

        //k > 0 ? System.out.println("Yes") : System.out.println("No");
        System.out.println(k > 0 ? "Yes" : "No");

        k = 0;

        if (k > 0) {
            System.out.println("Yes");
        } else {
            if (k < 0) {
                System.out.println("No");
            } else System.out.println("it's zero");
        }

        System.out.println("---------");
        int counter = 1;
        while (counter < 11) {
            System.out.print(counter++ + " ");
        }

        int j = 1;
        while (j <= 24) {
            System.out.println("Barev");
            j++;
        }

        System.out.println("-------");

        int h = 21;
        do {
            System.out.println("Barev");
            h++;
        }
        while (h <= 5);


        for (int p = 1; p <= 10; p++) {
            System.out.print(p + " ");
        }
        System.out.println(" ");
        System.out.println("----------");

        String[] names = {"Tigran", "John", "Vahe", "Mary", "Jack", "Oneal"};
        for (int index = 0; index <= names.length - 1; index++) {
            System.out.println(names[index]);
        }
        System.out.println("--------");


        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i]);

        }

        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("--------");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        System.out.println("--------");

        for (int i = 2; i < names.length; i += 2) {
            System.out.println(names[i]);

        }


        int array1[] = {1, -4, 5, -74, 12, 56};
        for (int element : array1) {
            if (element < 0) {
                System.out.println("Yes");
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.println(i + " ");
        }







    }
}
