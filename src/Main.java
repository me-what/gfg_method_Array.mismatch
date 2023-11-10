import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1

        int array1[] = { 2, 7, 11, 22, 37 };

        int array2[] = { 2, 7, 11, 22, 37 };

        int array3[] = { 2, 7, 19, 31, 39, 56 };

        int index1 = Arrays.mismatch(array1, array2);

        int index2 = Arrays.mismatch(array1, array3);

        int index3 = Arrays.mismatch(array2, array3);

        System.out.println(
                "The index at which array1 and array2 have first unequal element: "
                        + index1);

        System.out.println(
                "The index at which array1 and array3 have first unequal element: "
                        + index2);

        System.out.println(
                "The index at which array2 and array3 have first unequal element: "
                        + index3);
        System.out.println();


        // 2
        double array_1[]
                = { 11.21, 22.31, 33.15, 44.18, 55.19, 66.666 };

        double array_2[]
                = { 11.21, 22.31, 33.15, 44.18, 55.19, 66.666 };

        double array_3[] = { 11.21, 22, 33, 44, 55, 66 };

        int index_1 = Arrays.mismatch(array_1, array_2);
        int index_2 = Arrays.mismatch(array_1, array_3);
        int index_3 = Arrays.mismatch(array_2, array_3);

        System.out.println(
                "The index at which array1 and array2 have first unequal element: "
                        + index_1);

        System.out.println(
                "The index at which array1 and array3 have first unequal element:"
                        + index_2);

        System.out.println(
                "The index at which array2 and array3 have first unequal element: "
                        + index_3);
    }
}