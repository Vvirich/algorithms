package java;

public class FirstNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    }

    static Integer find(final int[] array) {
        Integer value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i--] + 1 == array[i]) {
                value = array[i];
            }
        }
        return value;
    }
}
