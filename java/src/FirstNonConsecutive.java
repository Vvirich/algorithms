public class FirstNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] + 1 != array[i]) {
                return array[i];
            }
        }
        return null;
    }
}
