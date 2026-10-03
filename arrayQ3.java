public class arrayQ3 {

    public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE;

        for(int i =0; i<number.length; i++){
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        int numbers[] = {9,5,2,6,8,1,3,0};

        System.out.println("smallest no is :" + getSmallest(numbers));
    }
    
}


