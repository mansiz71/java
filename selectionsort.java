public class selectionsort {
    public static void main(String[] args) {
        int [] myArray={64,34,25,12,22,90,5};
        int n=myArray.length;
        for(int i=1;i<n;i++)
        {
            int insertIndex=i;
            int currentvalue=myArray[i];
            int j=i-1;
            while (j>=0 && myArray[j]>currentvalue) {
                myArray[j+1]=myArray[j];
                insertIndex=j;
                j--;
                
            }
            myArray[insertIndex]=currentvalue;
        }
        System.out.println("sorted array");
        for(int value:myArray){
            System.out.println(value+"");
        }
    }
}
