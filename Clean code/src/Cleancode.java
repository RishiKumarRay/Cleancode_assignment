/** * */
final class MinMaxValueFinder {
    /** * */
    private MinMaxValueFinder() {

    }

    static class Limit {

        /**
         *
         */
        private int minvalue;
        /**
         *
         */
        private int maxvalue;
    }

    /**
     * @param arr
     * @param size
     * @return c
     */
    static Limit getMinAndMaxValueOfArray(final int[] arr, final int size) {
        Limit c = new Limit();
        int i;

        if (size == 1) {
            c.maxvalue = arr[0];
            c.minvalue = arr[0];
            return c;
        }

        if (arr[0] > arr[1]) {
            c.maxvalue = arr[0];
            c.minvalue = arr[1];
        } else {
            c.maxvalue = arr[1];
            c.minvalue = arr[0];
        }

        for (i = 2; i < size; i++) {
            if (arr[i] > c.maxvalue) {
                c.maxvalue = arr[i];
            } else if (arr[i] < c.minvalue) {
                c.minvalue = arr[i];
            }
        }
        return c;
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final int[] arr = {1000, 11, 445, 1, 330, 3000};
        final int minmaxsize = 6;
        Limit c = getMinAndMaxValueOfArray(arr, minmaxsize);
        System.out.printf("\na is %d", c.minvalue);
        System.out.printf("\nb is %d", c.maxvalue);
    }
}
