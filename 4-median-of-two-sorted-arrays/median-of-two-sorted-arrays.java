class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Binary Search TC O(log(n+m)) SC O(1)
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int low=0,high=n1;
        int left=(n1+n2+1)/2;
        int n=n1+n2;
        while(low<=high){
            int mid1 = (low+high)/2;
            int mid2 = left-mid1;
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return (double)Math.max(l1,l2);
                return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
        
        //Brute Force pointer SC O(1)
            // int n1=nums1.length;
            // int n2=nums2.length;
            // int n=n1+n2;
            // int idx2=n/2;
            // int idx1=idx2-1;
            // int idxel1=Integer.MIN_VALUE, idxel2=Integer.MIN_VALUE;
            // int cnt=0,i=0,j=0;
            // while(i<n1 && j<n2){
            //     if(nums1[i]<nums2[j]){
            //         if(cnt==idx1) idxel1=nums1[i];
            //         if(cnt==idx2) idxel2=nums1[i];
            //         cnt++;
            //         i++;
            //     }
            //     else{
            //         if(cnt==idx1) idxel1=nums2[j];
            //         if(cnt==idx2) idxel2=nums2[j];
            //         cnt++;
            //         j++; 
            //     }
            // } 
            // while(i<n1){
            //     if(cnt==idx1) idxel1=nums1[i];
            //     if(cnt==idx2) idxel2=nums1[i];
            //     cnt++;
            //     i++;
            // }
            // while(j<n2){
            //     if(cnt==idx1) idxel1=nums2[j];
            //     if(cnt==idx2) idxel2=nums2[j];
            //     cnt++;
            //     j++;
            // }
            // if(n%2==1){
            //     return (double)idxel2;
            // }
            // return (double)((idxel1+idxel2)/2.0);


        //Brute Force with space complexity O(n)
            // int n1=nums1.length;
            // int n2=nums2.length;
            // int[] nums = new int[n1+n2];
            // int i=0,j=0,x=0;
            // while(i<n1&&j<n2){
            //     if(nums1[i]<nums2[j]){
            //         nums[x++]=nums1[i++];
            //     }
            //     else{
            //         nums[x++]=nums2[j++];
            //     }
            // }
            // while(i<n1){
            //     nums[x++]=nums1[i++];
            // }
            // while(j<n2){
            //     nums[x++]=nums2[j++];
            // }
            // int n=n1+n2;
            // if(n%2==1){
            //     return (double)nums[n/2];
            // }
            // else{
            //     return (double)(nums[n/2]+nums[n/2-1])/2.0;
            // }
    }
}