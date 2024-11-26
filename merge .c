#include <stdio.h>
#define MAX 10

int a[10];
int b[10];
void merge(int low, int mid, int high)
{
    int l1, l2, i;
    for (l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++)
    {

        if (a[l1] <= a[l2])
            b[i] = a[l1++];
        else
            b[i] = a[l2++];
    }
    while (l1 <= mid)
        b[i++] = a[l2++];
    for (i = low; i <= high; i++)
        a[i] = b[i];
}
void Sort(int low, int high)
{
    int mid;
    if (low < high)
    {
        mid = (low + high) / 2;
        Sort(low, mid);
        Sort(mid + 1, high);
        merge(low, mid, high);
    }
    else
    {
        return 0;
    }
}
int main()
{
    int i;
    printf("\n enter the unsorted sequence elements: ");
    for (i = 0; i < MAX; i++)
        scanf("%d", &a[i]);
    printf("list of unsorted \n ");

    for (i = 0; i < MAX; i++)
        printf("%d", a[i]);
    Sort(0, MAX);
    printf("\n list of sorted \n ");
    for (i = 0; i < MAX; i++)
        printf("%d", a[i]);
    return 0;
}
