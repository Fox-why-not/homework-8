import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task-1");

int[] arr = new int[3];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;

double[] arr1 = {1.57, 7.654, 9.986};

boolean[] arr2 = {true, false,true,true};


        System.out.println("Task-2");

for (int i = 0; i < arr1.length; i++) {
System.out.print(arr1[i]);
    if (i < arr1.length - 1) {
        System.out.print(", ");
    }
        }
        System.out.println();

for (int i = 0; i < arr2.length; i++) {
    System.out.print(arr2[i]);
    if (i < arr2.length - 1) {
        System.out.print(", ");
    }
}
        System.out.println();
        System.out.println();

        System.out.println("Task-3");

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Task-4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}