public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        for(int j=0; j<arr.length; j++) {
            if(arr[j] > maxValue) {
                maxValue = arr[j];
            }
        }
        return maxValue;
    }
}
