public class Factors{

    public static void main(String[] args){

        int number = 368;

        System.out.print("The factors of " + number + " are: ");
        for(int i=1; i<=number; ++i){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}