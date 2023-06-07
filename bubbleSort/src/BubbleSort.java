public class BubbleSort {
    
    public static boolean bubbleSort(int[] arr)
    {
        if (arr.length == 0 || arr == null)
            return false;

        int temp = 0;
        boolean bSwaped = false;

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < ((arr.length - 1) - i); j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    bSwaped = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (bSwaped == false)
            {
                return true;
            }
            else
            {
                // 스왑변수 초기화.
                bSwaped = false;
            }
        }
        return true;
    }

    public static void printData(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        
        int[] arr1 = new int[]{2, 1, 3, 4, 5};
        BubbleSort.bubbleSort(arr1);
        BubbleSort.printData(arr1);
        
        int[] arr2 = new int[]{1, 9, 4, 6, 11, 10, 3, 15, 2, 13};
        BubbleSort.bubbleSort(arr2);
        BubbleSort.printData(arr2);

        System.out.println();

        int[] arr3 = new int[]{78, 45, 1, 4, 5, 7, 45, 6, 2};
        BubbleSort.bubbleSort(arr3);
        BubbleSort.printData(arr3);
        
        // System.out.println(Arrays.toString(arr));
    }
}
