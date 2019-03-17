public class FindMode{
   public static void main(String[] args){
     int[] arr={1,5,3,2,6,1,1};
     int mode = 0;
     int count = 0;
     for(int j=0;j<arr.length;j++){
      int tempMode = arr[j]; //what is the element I am looking at (Can hold the element being examined)
      int tempCount=0; //count how many times it shows up 
      for(int p=0;p<arr.length;p++)
         if(arr[p]==tempMode)
            tempCount++;
      if (tempCount>count){
         mode = tempMode;
         count = tempCount;
      }
   }
   System.out.println("The mode is :"+mode+". freq:"+count);
 }
}       