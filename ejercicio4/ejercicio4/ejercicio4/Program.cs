Console.WriteLine("Demo de calculadora");

Console.Write("Empecemos con una suma: ");
const int SUMA = 2 + 2 + 6 + 3 + 2;
Console.WriteLine("2 + 2 + 6 + 3 + 2 = " + SUMA);

Console.Write("Sigamos con una resta: ");
const int RESTA = 2 - 2 - 6 - 3 - 2;
Console.WriteLine("2 - 2 - 6 - 3 - 2 = " +  RESTA);

Console.Write("Continuemos con una multiplicación: ");
const int MULT = 2 * 2 * 6 * 3 * 2;
Console.WriteLine("2 * 2 * 6 * 3 * 2 = " +  MULT);

Console.Write("A continuación una división: ");
const float DIV = 12 / 4;
Console.WriteLine("12 / 4 = " +  DIV);

Console.Write("Por último, una exponencial: ");
double exp = Math.Pow(12, 2);
Console.WriteLine("12 elevado a 2 es " + exp);
