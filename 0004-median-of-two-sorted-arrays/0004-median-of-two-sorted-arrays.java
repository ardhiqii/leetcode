class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double total = nums1.length + nums2.length;
        boolean odd = false;
        if(total%2 != 0)odd = true;
        double med = Math.ceil(total/2);
        int idxMed = (int) med-1;
        // int idx1 = 0;
        // int idx2 = 0;
        // double result = 0;
        // boolean foundEven = false;
        // boolean max = false;
        // while(idx1 < nums1.length || idx2 < nums2.length){
        //     int curr = 0;
        //     if(idx1 == nums1.length){
        //         max= true;
        //         curr = nums2[idx2];
        //         idx2++;
        //     }
        //     if(idx2 == nums2.length){
        //         max= true;
        //         curr = nums1[idx1];
        //         idx1++;
        //     }
        //     if(!max){
        //         if(nums1[idx1] <= nums2[idx2]){
        //             curr = nums1[idx1];
        //             idx1++;
        //         }else{
        //             curr = nums2[idx2];
        //             idx2++;
        //         }
        //     }
            
        //     if(foundEven){
        //         result+=curr;
        //         return result/2;
        //     }
        //     if(idx1+idx2 == idxMed){
        //         if(odd){
        //             return curr;
        //         }else{
        //             result += curr;
        //             foundEven = true;
        //         }
        //     }
        // }

        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        double result = 0;
        result += arr[idxMed];
        if(!odd){
            result += arr[idxMed+1];
            return result/2;
        }

        return result;
    }
}