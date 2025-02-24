public class Main {
    public static void main(String[] args){
        int[] numbers = {22, 1, 28, 21, 7, 14};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}
