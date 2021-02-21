/* Tabla de multiplicar ingresando como parametro el numero de calculo. Muestre la multiplicacion del 1 al 10. con estructura while, y 
el segundo ejercicio con estructura for */


import java.util.Scanner;

public class Tablas{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int cont = 1, op = 0;

    System.out.println("             MENU");
    System.out.println("1. Con ciclo while");
    System.out.println("2. Con ciclo for");
    System.out.println("Seleccione: ");
    int opcCiclo = sc.nextInt();
    
    System.out.println("Ingrese el número del que desea obtener su tabla: ");
    int n = sc.nextInt();
    System.out.println("");

    switch(opcCiclo){
      case 1:
        while(cont <= 10){
          op = (cont * n);
          System.out.println(n+" x "+cont+" = "+op);
          cont++;
        }
        break;

      case 2:
        for(cont = 1; cont <= 10; cont++){
          op = (cont * n);
          System.out.println(n+" x "+cont+" = "+op);
        }
        break;

      default:
        System.out.println("Opcion no valida");
        break;
    }

  }
}
