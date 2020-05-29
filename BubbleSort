public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 5, 9, 2, 1, 3, 6, 7, 8};
        BubbleArray(a);
    }

    public static void BubbleArray(int[] numbers) {
        int temp = 0;  // 临时变量，用于交换变量值
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {  // 与下一个值比较大小
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
