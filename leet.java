public int searchInsert(int[] numbs, int target) {
    int left = 0;
    int right = numbs.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (numbs[mid] == target) {
            return mid;  // Target found, return its index
        } else if (numbs[mid] < target) {
            left = mid + 1;  // Target is in right half
        } else {
            right = mid - 1;  // Target is in left half
        }
    }
    
    return left;  // Target not found, return insertion position
}
