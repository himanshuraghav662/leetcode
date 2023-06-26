 int k=0;
        int n=0;
        int j=0;
        int m=nums[0];
        
        for(int i=0;i<nums.length;i++){
        if(nums[i]==m){
        if(k==0 || k==1){
         nums[j]=nums[i];
         k++;
         j++;
        }
        else{
            k++;
        }
        }
        else{
            k=0;
            m=nums[i];
            nums[j]=nums[i];
            j++;
            k++;
        }
        }
      
        return j; 











      int n=nums.length;
int k=1;
int count=1;
for(int i=1;i<n;i++)
{
if(nums[i]!=nums[i-1])
{
nums[k]=nums[i];
k++;
count=1;
}
else if(count<2){
nums[k]=nums[i];
k++;
count++;
}
}
return k;
