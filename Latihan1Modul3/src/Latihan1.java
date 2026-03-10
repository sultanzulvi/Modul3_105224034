import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka (desimal) : ");
        double a = input.nextDouble();

        System.out.print("Masukan angka (desimal) : ");
        double b = input.nextDouble();

        System.out.print("Masukan operasi matematika : ");
        char op = input.next().charAt(0);

        switch(op){
            case '+':
            System.out.print(a + + + b );
            break;

            case '-':
            System.out.print(a - b);
            break;

            case '*':
            System.out.print(a * b);
            break;

            case '/':
                if( b != 0){
                System.out.print(a / b);
                break;
                }else{
                    System.out.println("angka kedua tidak boleh 0!!");
                }
            }

            input.close();
        }
    }

