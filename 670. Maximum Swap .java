class Solution {
    public int maximumSwap(int num) {
       int x=num;
       int count=0;
       while(x>0){
        x=x/10;
        count++;
       } 
       x=num;
       int arr[]=new int[count];
       for(int i=count-1;i>=0;i--){
        int rem=x%10;
        arr[i]=rem;
        x=x/10;
       }

       int right[]=new int[count];
       int max=count-1;
        for(int i=count-1;i>=0;i--){
       if(arr[i]>arr[max]){
       max=i;
       }
       right[i]=max;
       }
     int swap=-1;
     int numindex=-1;
    for(int i=0;i<count;i++){
        if(arr[i]<arr[right[i]]){
        swap=i;
        numindex=right[i];
        break;
        }
    }
    if(swap==-1)
    return num;
    else{
        int temp=arr[swap];
        arr[swap]=arr[numindex];
        arr[numindex]=temp;
    }
    x=0;
    for(int i=0;i<count;i++){
       int tem=arr[i];
       x=tem+(x*10);
    }
return x;
    }
}
