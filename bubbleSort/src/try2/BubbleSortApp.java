package try2;

public class BubbleSortApp {
    public static void main(String[] args) {
        
        int[] arr = new int[]{1, 9, 4, 6, 11, 10, 3, 15, 2, 13};

        BubbleSort bs = new BubbleSort(arr);
        bs.bubbleSort();
        bs.printData();

        System.out.println("---------------");

        BubbleSort bs2 = new BubbleSort();
        bs2.setArr(arr);
        bs2.bubbleSort();
        bs2.printData();
    }
}
