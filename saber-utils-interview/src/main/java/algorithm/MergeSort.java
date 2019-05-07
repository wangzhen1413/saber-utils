package algorithm;

/**
 * @author Aria
 * @time on 2018/12/17.
 */
public class MergeSort {

    /**
     * 归并排序
     * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
     * 分而治之思想
     * 时间复杂度为O(nlogn)
     * 稳定排序方式
     *
     * @param nums 待排序数组
     * @return 输出有序数组
     */
    public static int[] sort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边，没有减一
            sort(nums, low, mid);
            // 右边，加一
            sort(nums, mid + 1, high);
            // 左右归并
            merge(nums, low, mid, high);
        }
        return nums;
    }

    /**
     * 将数组中low到high位置的数进行排序
     *
     * @param nums 待排序数组
     * @param low  待排的开始位置
     * @param mid  待排中间位置
     * @param high 待排结束位置
     */
    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        // 左指针
        int left = low;
        // 右指针
        int right = mid + 1;
        int k = 0;

        // 把较小的数先移到新数组中
        while (left <= mid && right <= high) {
            if (nums[left] < nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        // 把左边剩余的数移入数组
        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        // 把右边边剩余的数移入数组
        while (right <= high) {
            temp[k++] = nums[right++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            //覆盖进来排序的这一段
            nums[k2 + low] = temp[k2];
        }
    }
}
