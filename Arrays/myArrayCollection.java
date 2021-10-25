package Arrays;

public class myArrayCollection implements ArrayCollection{
    @Override
    public  void duplicateZeroes(int[] arr) {
        int zeros = 0;
        for (int number: arr) {
            if (number == 0) zeros++;
        }

        int i = arr.length-1, j = arr.length + zeros-1;

        while( i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;
        }
    }
    private void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }

    @Override
    public int[] greatestElementToTheRight(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length-2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (max < temp) {
                max = temp;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    @Override
    public boolean isMountainArray(int[] arr) {
        int index = 0;
        int N = arr.length;
        while (index + 1 < N && arr[index] < arr[index+1]) {
            index++;
        }
        if ( index == 0 || index == N-1) {
            return false;
        }
        while (index + 1 < N && arr[index] > arr[index+1]) {
            index++;
        }
        return index == N-1;
    }

    @Override
    public void moveZeroes(int[] arr) {
        for (int curr = 0, lastNonZeroIndex = 0; curr < arr.length; curr++) {
            if (arr[curr] != 0) {
                int tmp = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex++] = arr[curr];
                arr[curr] = tmp;
            }
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }

    @Override
    public boolean isDoubleElement(int[] arr) {
        return false;
    }

    @Override
    public void RemoveDuplicates(int[] arr) {

    }
}
