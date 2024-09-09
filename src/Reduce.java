public class Reduce {
    public static void main(String[] args) {
        int nums = 100;
        int counter = 0;
        while (nums != 0) {
            boolean even = nums % 2 == 0;
            boolean odd = nums % 2 == 1;

            if (even) {
                nums = nums / 2;
            } else if (odd) {
                nums = nums - 1;
            }
            counter += 1;
        }
        System.out.println(counter);
    }
}
