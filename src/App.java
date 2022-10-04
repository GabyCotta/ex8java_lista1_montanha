import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
     
          Scanner dinheiro= new Scanner(System.in);
          Scanner mês = new Scanner(System.in);

          System.out.print("Quantas horas você trabalhou esse mês ?");
          int mes= mês.nextInt();

           System.out.print("Quantos você ganha por hora?");
          float ganho= dinheiro.nextFloat();

          Float salario= ganho * mes;
          System.out.print("Seu salário:"+salario);







    }
}