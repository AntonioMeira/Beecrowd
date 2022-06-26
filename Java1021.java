/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada	Exemplo de Saída
576.73

NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

4.00

NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
2 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
0 moeda(s) de R$ 0.01

91.01

NOTAS:
0 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
2 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
1 moeda(s) de R$ 0.01

*/



import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner leitor = new Scanner(System.in);
		double valor = leitor.nextDouble();
		leitor.close();
		int nota_100 = (int)valor/100;
		valor = valor- nota_100*100;
		int nota_50 = (int)valor/50;
		valor = valor- nota_50*50;
		int nota_20 = (int)valor/20;
		valor = valor- nota_20*20;
		int nota_10 = (int)valor/10;
		valor = valor- nota_10*10;
		int nota_5 = (int)valor/5;
		valor = valor- nota_5*5;
		int nota_2 = (int)valor/2;
		valor = valor- nota_2*2;
		int m_1 =(int)valor/1;
		valor = valor- m_1*1;
		int m_050= (int)(valor*100)/50;
		valor = valor- m_050*0.5;
		int m_025= (int)(valor*100)/25;
		valor = valor- m_025*0.25;
		int m_010= (int)(valor*100)/10;
		valor = valor- m_010*0.1;
		int m_005= (int)(valor*100)/5;
		valor = valor- m_005*0.05;
		int m_001= (int)(valor*100)/1;
		valor = valor- m_001*0.01;
		System.out.println("NOTAS:");
		System.out.printf("%d nota (s) de R$ 100.00\n",nota_100);
		System.out.printf("%d nota (s) de R$ 50.00\n",nota_50);
		System.out.printf("%d nota (s) de R$ 20.00\n",nota_20);
		System.out.printf("%d nota (s) de R$ 10.00\n",nota_10);
		System.out.printf("%d nota (s) de R$ 5.00\n",nota_5);
		System.out.printf("%d nota (s) de R$ 2.00\n",nota_2);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda (s) de R$ 1.00\n",m_1);
		System.out.printf("%d moeda (s) de R$ 0.50\n",m_050);
		System.out.printf("%d moeda (s) de R$ 0.25\n",m_025);
		System.out.printf("%d moeda (s) de R$ 0.10\n",m_010);
		System.out.printf("%d moeda (s) de R$ 0.05\n",m_005);
		System.out.printf("%d moeda (s) de R$ 0.01\n",m_001);
	}
}
