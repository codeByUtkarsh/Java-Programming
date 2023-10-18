package Heaps;

import java.util.PriorityQueue;

import PriorityQueue.Priority;

public class WeakestK {

    static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        public Row(int s, int i) {
            this.soldier = s;
            this.idx = i;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldier == r2.soldier) {
                return this.idx - r2.idx;
            } else {
                return this.soldier - r2.soldier;
            }
        }
    }

    public static void main(String args[]) {
        int rows[][] = { { 1, 0, 0, 0, }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < rows.length; i++) {
            int count = 0;
            for (int j = 0; j < rows[0].length; j++) {
                if(rows[i][j]==1){
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R"+pq.remove().idx);
        }
    }

}
