# 🔍 Searching Algorithms

This folder contains classic searching techniques implemented in Java. Each algorithm is optimized for different scenarios — from brute-force linear scans to efficient logarithmic-time binary searches. All solutions are written for clarity, edge-case handling, and recruiter visibility.

---

## 📁 File Structure
- [BinarySearch.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/BinarySearch.java)
- [FirstOccurrenceBinarySearch.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/FirstOccurrenceBinarySearch.java)
- [UniqueElementBinarySearch.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/UniqueElementBinarySearch.java)
- [PeakElementBinarySearch.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/PeakElementBinarySearch.java): Finds a peak element in an array using binary search. A peak is defined as an element greater than its neighbors. Handles edge cases and returns the peak value. Time complexity: O(log n).
- [SearchInRotatedSortedArray.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/SearchInRotatedSortedArray.java): Searches for a target value in a rotated sorted array using binary search. Efficiently identifies the sorted half and narrows the search space. Returns the index of the target or -1 if not found. Time complexity: O(log n).
- [SquareRootBinarySearch.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/SquareRootBinarySearch.java): Computes the floor of the square root of a non-negative integer using binary search. Avoids overflow with long arithmetic and handles large inputs efficiently. Time complexity: O(log A).
- [AthMagicalNumber.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/AthMagicalNumber.java): Finds the Ath smallest magical number divisible by either B or C using binary search and LCM logic. Uses inclusion-exclusion to count valid numbers and handles large inputs efficiently. Returns result modulo 10^9 + 7. Time complexity: O(log(A * min(B, C))).
- [PaintersPartitionProblem.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/PaintersPartitionProblem.java): Solves the Painter's Partition Problem using binary search and greedy allocation. Each painter paints contiguous boards, and no board is split. Computes the minimum time required to paint all boards given constraints. Returns result modulo 10000003. Time complexity: O(N log(sum of board lengths)).
- [AggressiveCows.java](https://github.com/Ezhil005/DSA-Solutions/blob/master/SearchingAlgorithms/AggressiveCows.java): Solves the Aggressive Cows problem using binary search on the answer. Finds the largest minimum distance possible between cows placed in stalls. Uses greedy placement and binary search to optimize spacing. Time complexity: O(N log(max - min)).


