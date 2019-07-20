

/**
 *
 */

class SearchUtil {

    public int search(int a[], int ele) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Overloaded method
     *
     * @param a array to search
     * @param ele element to search
     * @param pos new position to start at
     * @return position of ele
     */
    public int search(int a[], int ele, int pos) {
        for(int i = pos; i < a.length; i++) {
            if (a[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}


public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10, 30, 40};
        int ele = 30;

        SearchUtil obj = new SearchUtil();

        // result is 2
        int x = obj.search(arr, ele);

        // result is 4
        int y = obj.search(arr, ele, 3);

        System.out.println(" x is " + x);
        System.out.println(" y is " + y);
    }
}

