public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {8, 9, 3, 6, 7, 4, 2, 1, 5};
        InsertionArray(a);
    }

    public static void InsertionArray(int[] numbers) {
        int pre_index = 0;
        int current = 0;
        for (int i = 1; i < numbers.length; i++) {
            pre_index = i - 1;
            current = numbers[i];
            while (pre_index >= 0 && numbers[pre_index] > current) {
                numbers[pre_index + 1] = numbers[pre_index];  // 将大值原索引位置+1（放到后一位）
                pre_index--;  // 原索引位的值与后面的比较
            }
            numbers[pre_index + 1] = current;
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
