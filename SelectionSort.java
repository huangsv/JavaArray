public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {7, 8, 6, 3, 1, 2, 4, 9, 5};
        SelectionArray(a);
    }
    
    public static void SelectionArray(int[] numbers) {
        int min_index = 0;
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            min_index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_index]) {  //寻找最小值的索引
                    min_index = j;  // 更新最小值的索引
                }
            }
            temp = numbers[i];  // 将第一个值的位置与比较值的位置交换
            numbers[i] = numbers[min_index];  // 将最小值放置在第一个位置
            numbers[min_index] = temp;  // 将比值放在最小值原先的位置
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
