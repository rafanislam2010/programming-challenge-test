public class Solution {

    /**
     * return the sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * return the difference of a and b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * return the product of a and b.
     */
    public int multiply (int a, int b){
        return a * b;
    }

    /**
     * return the quotient of a and b.
     */
    public double divide (int a, int b){
        // FIXED: (double) forces Java to keep the decimal values
        return (double) a / b;
    }

    /**
     * return the string concatenation of word1 and word2 
     */
    public String concatenate (String word1, String word2){
        // FIXED: Removed the quotes so it uses the actual variables
        return word1 + word2;
    }

    /**
     * Start with a variable x equal to a. Then, IN THIS ORDER:
     *   1. add 4 to x
     *   2. multiply x by 3
     *   3. subtract the ORIGINAL a value from x
     * Return x.
     */
    public int transform(int a) {
        int x = a;
        x = x + 4;
        x = x * 3;
        x = x - a;
        return x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.add(1, 2)); 
    }
}
