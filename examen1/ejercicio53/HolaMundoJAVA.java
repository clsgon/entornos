import java.util.Scanner;
public class HolaMundoJAVA{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("¿Cómo te llamas?");
    String nombre = sc.nextLine();
    System.out.println("Hola, " + nombre + " estas haciendo el turno A");
  }
}
