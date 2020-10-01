package codes.array;

public class Max {
    public int getMax(int[] arr){
        int len = arr.length;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }
}
