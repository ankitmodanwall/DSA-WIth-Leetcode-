#include <stdlib.h>
int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}



int arrayPairSum(int* nums, int numsSize) {
    int m = 0;
    qsort(nums, numsSize, sizeof(int), compare);

    for (int i = 0; i < numsSize; i += 2) {
        m += nums[i];
    }

    return m;
}