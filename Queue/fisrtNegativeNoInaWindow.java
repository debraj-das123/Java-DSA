package Queue;



import java.util.LinkedList;
import java.util.Queue;

public class fisrtNegativeNoInaWindow {

    public static void printnegative(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();

        int n = arr.length;
        int i = 0;
        int j = k;

        while (i < n - k + 1) {

            if (q.isEmpty()) {
                for (int x = i; x < j; x++) {
                    if (arr[x] < 0) {
                        q.add(arr[x]);
                    }
                }
            }

            if (q.isEmpty()) {
                System.out.print("0 ");
            } else {
                System.out.print(q.peek() + " ");
            }

            if (i < n - k) {
                if (!q.isEmpty() && q.peek() == arr[i]) {
                    q.poll();
                }

                if (arr[j] < 0) {
                    q.add(arr[j]);
                }
            }

            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        printnegative(arr, k);
    }
}
