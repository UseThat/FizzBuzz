public class FizzBuzz {
    public static void main(String[] args) {
        int number;
        for(int i = 0; i<100;i++){
            number = i+1;
            checkNumber(number);

        }
    }

    public static void checkNumber(int number){

        if(number % 3 == 0 && number % 5 == 0){

            System.out.println("FizzBuzz");
        }else{
            if(number % 3 == 0){

                System.out.println("Fizz");
            }else{
                if(number % 5 == 0){

                    System.out.println("Buzz");
                }
            }
        }
    }
}
