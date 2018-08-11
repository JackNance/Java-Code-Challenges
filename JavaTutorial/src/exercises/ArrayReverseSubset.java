package exercises;

public class ArrayReverseSubset {

	    private static void reverseArray(int[] arr, int interval) {
	 
	        for (int i = 0; i < arr.length; i = i + interval) {
	 
	            int rightIndex = i + interval;
	            int arrLen = arr.length;
	            rightIndex = rightIndex > arrLen ? arrLen - 1 : (rightIndex - 1);
	            int leftIndex = i;
	 
	            //WHILE LEFT INDEX < RIGHT INDEX, SWAP LEFT & RIGHT.  INCREMENT LEFT & DECREMENT RIGHT *AFTER* EACH SWAP
	            while (leftIndex < rightIndex) {
	                int temp = arr[leftIndex];
	                System.out.println("Temp: " + temp);
	                //SINCE WE ARE USING POSTFIX NOTATION, THE VALUE IS USED FIRST WITH CURRENT VALUE *THEN* INCREMENTED  
	                arr[leftIndex++] = arr[rightIndex];
	                //System.out.println("LeftIndex " + leftIndex + " replaced by RightIndex " + rightIndex);
	                arr[rightIndex--] = temp;
	                //System.out.println("RightIndex " + rightIndex + " replaced by Temp " + temp);
	            }
	        }
	    }
	 
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int interval = 3;
	 
	        reverseArray(arr, interval);
	 
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }
	
}
