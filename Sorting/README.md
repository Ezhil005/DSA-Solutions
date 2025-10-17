# 📊 Sorting Algorithms in Java

This folder contains Java implementations of classic sorting algorithms — essential for mastering data organization, algorithmic thinking, and interview prep.

---

## 📘 What’s Inside

Sorting is a foundational concept in computer science. These implementations cover:

- Comparison-based sorts (Selection, Bubble, Insertion)
- Efficient divide-and-conquer sorts (Merge, Quick)
- Specialized sorts (Counting, Radix, Bucket)

Each file includes:
- Clean Java code
- Inline comments for clarity
- Time and space complexity notes

---

## 📂 Problem List
- [SelectionSort.java](SelectionSort.java): Sorts an array using the Selection Sort algorithm by repeatedly selecting the minimum element
- [InsertionSort.java](InsertionSort.java): Sorts an array using the Insertion Sort algorithm by placing each element into its correct position in the sorted portion
- [CountingSortWithNegatives.java](CountingSortWithNegatives.java): Implements counting sort for arrays with negative and positive integers by shifting index range
- [MergeSubarray.java](MergeSubarray.java): Merges a subarray from index s to e using two-pointer technique, useful for building Merge Sort
- [MergeSort.java](MergeSort.java): Implements Merge Sort using recursive divide-and-conquer and two-pointer merging
- [LomutoPartition.java](LomutoPartition.java): Implements Lomuto partition scheme used in Quick Sort. Partitions array around pivot (last element) so that all elements less than pivot are moved to the left. Useful for understanding in-place partitioning and Quick Sort internals.
- [SortByFactorCount.java](SortByFactorCount.java): Sorts an array based on the number of factors each element has. Uses a custom comparator with tie-breaking by value.
- [QuickSortLomuto.java](QuickSortLomuto.java): Implements Quick Sort using the Lomuto partition scheme. Recursively sorts the array by selecting the last element as pivot and partitioning around it.
