import java.util.*;


class Main {
  public static void main(String[] args) {
    /*4. Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de
operações de depósito e saque.
O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
realizadas até que o usuário digite o código de operação “3”.
Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
CONTA PREFERENCIAL (se o saldo for positivo).
Utilize o laço DO-WHILE*/
  
    Scanner grava = new Scanner(System.in);
    int menu=0;
    double saldo = 0;
    double saque;
    double deposito;
    System.out.println("Digite o saldo da sua conta: ");
    saldo = grava.nextDouble();
    
    
    do{

      System.out.println("\nMenu \n1 - Deposito\n2 - Saque\n3 - Sair\n\nDigite uma operação: ");
    menu = grava.nextInt();
      switch(menu){

        case 1:
          
        System.out.println("\nOperação de DEPOSITO\n Digite o valor de deposito: ");
          deposito = grava.nextDouble();
          saldo = saldo + deposito;
          System.out.print("Novo saldo R& " + saldo);
          break;

        case 2:
          
        System.out.println("\nOperação de SAQUE\n Digite o valor de saque: ");
          saque = grava.nextDouble();
          saldo = saldo - saque;
          System.out.print("Novo saldo R& " + saldo);
          break;

        case 3:
          System.out.println("Sistema encerrado!");
              if(saldo == 0){
                System.out.println("CONTA ZERADA\n Saldo: " + saldo);
              }else if(saldo < 0)
              {
                System.out.println("CONTA ESTOURADA\n Saldo: " + saldo);
              }else if(saldo > 0)
              {
                System.out.println("CONTA PREFERENCIAL\n Saldo: " + saldo);
              }
          break;
        default:
          System.out.print("Entrada invalida!");
      }
    }while(menu != 3);
    
    
    
    
  }
}
