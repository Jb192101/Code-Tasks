// Link: https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            nums1[0] = nums2[0];
        }

        int ind1 = 0, ind2 = 0;
        int ind3 = 0;
        int[] medArray = new int[m+n];
        while(ind3 != m + n) {
            if(ind1 == m) {
                medArray[ind3] = nums2[ind2];
                ind2++;
                ind3++;
                //System.out.println("1: " + Arrays.toString(medArray));
                continue;
            }
            if(ind2 == n) {
                medArray[ind3] = nums1[ind1];
                ind1++;
                ind3++;
                //System.out.println("2: " + Arrays.toString(medArray));
                continue;
            }
            if(nums1[ind1] > nums2[ind2]) {
                medArray[ind3] = nums2[ind2];
                ind2++;
                ind3++;
                //System.out.println("3: " + Arrays.toString(medArray));
            } else {
                medArray[ind3] = nums1[ind1];
                ind1++;
                ind3++;
                //System.out.println("4: " + Arrays.toString(medArray));
            }
        }

        for(int k = 0; k < n + m; k++) {
            nums1[k] = medArray[k];
        }
    }
}