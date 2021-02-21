import java.util.Scanner;

public class Vacaciones{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);

    System.out.println("         Bienvenido a The Coca-Cola Company");
    System.out.println("");
    System.out.println("");

    System.out.println("Escriba su nombre: ");
    String name = sc.nextLine();

    System.out.println("");

    System.out.println("Bienvenidx "+name+". Ingrese el numero de su departamento: ");
    int claveDepartamento = sc.nextInt();

    System.out.println("");

    System.out.println(name+" del departamento "+claveDepartamento+". ¿Cuanto tiempo tiene en la empresa? Ingrese solo el numero");
    int antiguedad = sc.nextInt();

    System.out.println("");

    if(claveDepartamento == 1){

      if(antiguedad == 1){
        System.out.println(name+" tiene 6 dias de vacaciones.");
      } else if(antiguedad>=2 && antiguedad<=6){
        System.out.println(name+" tiene 14 dias de vacaciones.");
      } else{
        System.out.println(name+" tiene 20 dias de vacaciones");
      }
    
    } else if(claveDepartamento == 2){

      if(antiguedad == 1){
        System.out.println(name+" tiene 7 dias de vacaciones.");
      } else if(antiguedad>=2 && antiguedad<=6){
        System.out.println(name+" tiene 15 dias de vacaciones.");
      } else{
        System.out.println(name+" tiene 22 dias de vacaciones");
      }
    } else if(claveDepartamento == 3){

      if(antiguedad == 1){
        System.out.println(name+" tiene 10 dias de vacaciones.");
      } else if(antiguedad>=2 && antiguedad<=6){
        System.out.println(name+" tiene 20 dias de vacaciones.");
      } else{
        System.out.println(name+" tiene 30 dias de vacaciones");
      }
    } else{
       System.out.println("La clave ingresada no coincide con los departamentos de la empresa.");
    }

    System.out.println("Disfruta de tus vacaciones "+name+"!");
  }
}