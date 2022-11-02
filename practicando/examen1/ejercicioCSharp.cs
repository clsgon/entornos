using System;

namespace Practicando{

  class Program{
    
    static void Main(string[] args){
      
     Console.WriteLine("Hola, ¿Qué tal?, estoy practicando para el examen");
     Console.WriteLine();
     
     Console.Write("Introduce tu nombre: ");
     string name = Console.ReadLine();
     
     Console.Write("Introduce tu edad: ");
     int age = int.Parse(Console.ReadLine());        
     
     Console.Write("Introduce el nombre de lo que estes estudiando actualmente: ");
     string studies = Console.ReadLine();

     Console.WriteLine("Te llamas " + name + ", tienes " + age + " años y estudias " + studies);
    }
  }
}