class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int max_product= Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int product = 1;
            for(int j=i;j<n;j++) {
                product*=arr[j];
                max_product = Math.max(product,max_product);
            }
           
        }
        return max_product;
    }
}