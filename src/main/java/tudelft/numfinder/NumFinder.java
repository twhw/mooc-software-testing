package tudelft.numfinder;

public class NumFinder {


    private int smallest;
    private int largest;

    public void find(int[] nums) {
        // for this approach they should be initialized here
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;
        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}
