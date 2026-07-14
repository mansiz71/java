public class MaxElement {
    public static void main(String[] args) {
        int [] arr={4,6,9,34,1};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
