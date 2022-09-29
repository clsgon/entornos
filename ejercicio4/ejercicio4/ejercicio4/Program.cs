Console.WriteLine("Demo de calculadora");

Console.Write("Empecemos con una suma: ");
const int SUMA = 3 + 2 + 6 + 3 + 12;
Console.WriteLine("3 + 2 + 6 + 3 + 12 = " + SUMA);

Console.Write("Sigamos con una resta: ");
const int RESTA = 2 - 12 - 6 - 13 - 2;
Console.WriteLine("2 - 12 - 6 - 13 - 2 = " +  RESTA);

Console.Write("Continuemos con una multiplicación: ");
const int MULT = 2 * 2 * 6 * 3 * 12;
Console.WriteLine("2 * 2 * 6 * 3 * 12 = " +  MULT);

Console.Write("A continuación una división: ");
const float DIV = 12 / 3;
Console.WriteLine("12 / 3 = " +  DIV);

Console.Write("Por último, una exponencial: ");
double exp = Math.Pow(12, 7);
Console.WriteLine("12 elevado a 7 es " + exp);

Console.WriteLine();