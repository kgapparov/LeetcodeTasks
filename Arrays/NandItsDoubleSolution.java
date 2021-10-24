package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NandItsDoubleSolution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (map.containsKey(arr[i]*2)) {
                    return true;
                }
            } else {
                if (map.get(0) > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
