import java.util.*;


class Main {
  public static void main(String[] args) {
    /*3. Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os
seguintes divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente.*/
  
    Scanner grava = new Scanner(System.in);
    int n=0, x;
    System.out.println("Digite um valor: ");
    n = grava.nextInt();
    for(x = 1;x <= n; x++){
      if(n % x == 0){

        System.out.print(" " + x);

        
      }
      
    }
    
    
    
    
  }
}
