package assignment_1;
import java.util.Arrays;

    public class Assignment1 {

        // Question 1: Write a program to clone an array
        public static void question1_cloneArray() {
            int[] original = {10, 20, 30, 40, 50};
            int[] cloned = new int[original.length];

            for (int i = 0; i < original.length; i++) {
                cloned[i] = original[i];
            }
            // or int[] cloned = original.clone();
            System.out.println("Cloned Array: " + Arrays.toString(cloned));
        }

        // Question 3: Write a program in Java to remove a specific element from an array
        public static void question3_removeSpecificElement() {
            int[] arr = {10, 20, 30, 40, 50};
            int elementToRemove = 30;

            int[] newArr = new int[arr.length - 1];
            int index = 0;

            for (int num : arr) {
                if (num != elementToRemove) {
                    newArr[index++] = num;
                }
            }
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArr));
        }

        public static void main(String[] args) {
            question1_cloneArray();
            question3_removeSpecificElement();
        }
    }

