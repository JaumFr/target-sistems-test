import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fiboPrev=0,fiboNext=1,fibo;
    
        System.out.println("digite um valor inteiro e veja se esta em fibonnacci");
        int num = input.nextInt();
        
        boolean encontrado = false;

        while(fiboNext<num) {

            fibo=fiboPrev + fiboNext;
            fiboPrev=fiboNext;
            fiboNext=fibo;
            
            if (fibo == num) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        input.close();
    }
}
