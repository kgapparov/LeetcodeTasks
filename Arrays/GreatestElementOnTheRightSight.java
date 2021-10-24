package Arrays;

public class GreatestElementOnTheRightSight {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = max;
            if (tmp > max) max= tmp;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
