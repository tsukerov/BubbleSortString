class Bubble {
    public static void main(String args[]) {
        String nums[] = { "OneOne", "Three3", "Aa", "18Eighteen", "Four",
                "Hello, my friend!", "Delete", "Java!!!", "Christmas", "Happy New Year!" };
        int a, b;
        int size;
        String t = new String();

        size = nums.length; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // This is the bubble sort.
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(nums[b-1].length() > nums[b].length()) { // if out of order
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

        // display sorted array
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
