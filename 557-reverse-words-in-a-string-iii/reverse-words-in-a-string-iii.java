class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        for(int i=0;i<=arr.length;i++)
        {
            if(i==arr.length||arr[i]==' ')
            {
                arr=reverse(arr,left,i-1);
                left=i+1;
            }
        }
        return new String(arr);
    }
    public static char[] reverse(char[] arr,int left,int right)
    {
        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
}