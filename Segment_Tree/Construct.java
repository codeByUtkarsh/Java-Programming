package Segment_Tree;

public class Construct {
    static int[] tree;

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static int buildST(int[] arr, int idx, int st, int end) {
        if (st == end) {
            return tree[idx] = arr[st];

        }
        int mid = (st + end) / 2;

        int left = buildST(arr, 2 * idx + 1, st, mid);
        int right = buildST(arr, 2 * idx + 2, mid + 1, end);
        return tree[idx] = left + right;

    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {

        if (qj <= si || qi >= sj) { //non overlapping condition
            return 0;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int[] arr, int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if (idx > sj || idx <si) {
            return;
        }
        tree[i] += diff;
        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;
        updateUtil(0, 0, n - 1, idx, diff);
    }

    public static void main(String args[]) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = input.length;
        init(n);
        buildST(input, 0, 0, n - 1);

        System.out.println(getSum(input, 2, 5));
        update(input, 2, 2);
        System.out.println(getSum(input, 2, 5));
    }
}
