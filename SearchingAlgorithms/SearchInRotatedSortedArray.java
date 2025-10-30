# Search in Rotated Sorted Array 🔍

This project implements an efficient binary search algorithm to find a target value in a rotated sorted array. The solution runs in **O(log n)** time and handles both halves of the rotated array intelligently.

## Problem Statement

Given a sorted array that has been rotated at an unknown pivot, search for a target value `k`. If found, return its index. If not found, return `-1`.

### Example

```java
Input:
arr = {10, 11, 12, 13, 17, 20, 23, 25, 26, 1, 3, 5, 6, 8}
k = 5

Output:
11

public class Main {
    public static int searchsorted(int[] arr,int k) {
        int n=arr.length;
        int l=0; int r=n-1;
        while (l<=r){
            int m=l+(r-l)/2;
            if (arr[m]==k)
                return m;
            if (arr[l]<arr[m]){
                if (arr[l]<=k && k<arr[m])
                    r=m-1;
                else
                    l=m+1;
            }
            else if (arr[m]<arr[r]){
                if (k<=arr[r]&&arr[m]<k)
                    l=m+1;
                else
                    r=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={10,11,12,13,17,20,23,25,26,1,3,5,6,8};
        int k=5;
        System.out.println(searchsorted(arr,k));
    }
}