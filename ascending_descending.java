public class Main{
    public static void main(String[] args){
        int[] numbers = {12, 5, 9, 21, 7, 14};
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
