import java.util.*;


class Main {
  public static void main(String[] args) {
    /*1. Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE.*/
    
    int n, count=1;
    int res = 0;
    Scanner grava = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    n = grava.nextInt();

    while(count <= n){

      res = count + n;
      count++;
      
    }
    System.out.println("Resultado: " + res);
    
    
    
  }
}
