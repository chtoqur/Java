package try2;

import java.util.Arrays;

public class BubbleSort {

    public int[] arr;

    public BubbleSort()
    {
        arr = null;
    }

    public BubbleSort(int[] arr)
    {
        this.arr = arr;
    }

    public BubbleSort(int num)
    {
        this.arr = new int[num];
    }

    public boolean bubbleSort()
    {
        if (this.arr.length == 0 || this.arr == null)
            return false;

        int temp = 0;

        for (int i = 0; i < this.arr.length; i++)
        {
            for (int j = 0; j < ((this.arr.length - 1) - i); j++)
            {
                if (this.arr[j] > this.arr[j + 1])
                {
                    temp = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = temp;
                }
            }
        }
        return true;
    }
    
    public boolean bubbleSort(int[] arr)
    {
        if (arr.length == 0 || arr == null)
            return false;

        int temp = 0;

        // 1. 마지막자리를 정하는 루틴
        for (int i = 0; i < arr.length - 1; i++)
        {
            // 2. 
            for (int j = 0; j < ((arr.length - 1) - i); j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return true;
    }

    public void printData(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public void printData()
    {
        System.out.println(Arrays.toString(this.arr));
    }

    public int[] getArr() {
        return this.arr;
    }

    public boolean setArr(int[] arr) {

        if (this.arr != null)
            return false;

        for (int i = 0; i < arr.length; i++)
        {
            this.arr[i] = arr[i];
        }
        return false;
    }
}
