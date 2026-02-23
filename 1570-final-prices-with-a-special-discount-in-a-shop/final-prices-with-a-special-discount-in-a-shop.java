class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = Arrays.copyOf(prices, n);
        Stack<Integer> stack = new Stack<>(); // store indices waiting for discount

        for (int i = 0; i < n; i++) {
            // Apply discount to all items in stack where current price <= price at stack top
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                int idx = stack.pop();
                result[idx] -= prices[i];
            }
            stack.push(i);
        }

        return result;
    }
}