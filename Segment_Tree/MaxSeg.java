package Segment_Tree;

public class MaxSeg {
    static int[] tree;

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void buildST(int arr[], int i, int si, int sj) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2;
        buildST(arr, 2 * i + 1, si, mid);
        buildST(arr, 2 * i + 2, mid + 1, sj);

        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);

    }

    public static int maxSumUtil(int i, int si, int sj, int qi, int qj) {
        if (qj < si || qi > sj) {
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int left = maxSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = maxSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    public static int maxSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return maxSumUtil(0, 0, n - 1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {
            return;
        }
        tree[i] = Math.max(tree[i], newVal);
        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, newVal);
            updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        arr[idx] = newVal;
        updateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);
        // System.out.println();
        // for(int t:tree){
        // System.out.print(t+" ");
        // }
        // System.out.println(maxSum(arr, 0,2));
        System.out.println(maxSum(arr, 2, 5));
        update(arr, 2, 20);
        int max = maxSum(arr, 2, 5);
        System.out.println(max);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
