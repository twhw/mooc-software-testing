package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this
        nf.find(new int[] {4, 3, 2, 1});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

        nf.find(new int[] {1, 3, 1, 10});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

        nf.find(new int[] {3434, 65656, 2, 0});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

        nf.find(new int[] {-1212, 3, 0, 1});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

        nf.find(new int[] {-4, 3, 2, -1}); // nf keeps the largest of the previous test due to wrong position of initialization
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

//        nf.find(null); // java.lang.NullPointerException
//        System.out.println(nf.getLargest());
//        System.out.println(nf.getSmallest());
    }
}
