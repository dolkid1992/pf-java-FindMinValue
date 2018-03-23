public class FindMinValue {
    public static int minValue(int []array){
        int min = array[0];
        int index = 0;

        for (int i = 1; i< array.length; i++){
            if(array[i]<min){
                min = array[i];
                index = 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int []elements = {4, 12, 7, 8,1,6,9};
        int index =  minValue(elements);
        System.out.println("The smallest element in the array is: "+ elements[index]);
    }
}
