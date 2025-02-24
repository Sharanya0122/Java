public class Main{
    public static void main(String[] args){
        int[] numbers = {22, 1, 28, 21, 26, 27, 14, 9};
        int max = numbers[0], min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
