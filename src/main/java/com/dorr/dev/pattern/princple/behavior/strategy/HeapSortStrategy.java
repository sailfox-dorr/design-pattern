package com.dorr.dev.pattern.princple.behavior.strategy;


public class HeapSortStrategy extends SortStrategy{
    @Override
    public int[] sort(int[] arr) {
        heapSort(arr);
        return arr;
    }

    public static void heapSort(int[] arr) {
        int last = arr.length / 2 - 1; // 最后一个有孩子节点的下标
        for(int i = last; i>=0; i--) {
            // 原地建堆
            sift(arr, i, arr.length-1);
        }

        // 交换数组的第一个与最后一个元素
        for(int i = arr.length-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            sift(arr,0,i-1);
        }
    }

    public static void sift(int[] arr, int parent, int end) {
        // 从下标为0算，parent的左孩子坐标为2 * parent + 1， 右孩子2 * parent + 2
        while (true) {
            int left = 2 * parent + 1;
            if (left > end) return;
            int right = left + 1;
            if (right < end && arr[left] < arr[right]) {
                left = right;
            }
            if (arr[parent] < arr[left]) {
                int temp = arr[parent];
                arr[parent] = arr[left];
                arr[left] = temp;
                parent = left;
            } else {
                break;
            }
        }

    }
}
