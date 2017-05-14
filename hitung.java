import java.util.*;


public class Hitung
{
	public static void main(String[] args)

	{
		int score = 0;
		int benar=0;
		int salah=0;
		int jml_soal = 20;

		Scanner scan = new Scanner(System.in);

		System.out.println("Terdapat 20 soal matematika\ntentang penjumlahan\njika nilai benar anda mendapat score 1\njika salah score anda dikurangi 1\n\n");

		for (int i=1;i<=jml_soal;i++)
		{

			Random r = new Random();
			int a = 1+r.nextInt(20);
			int b = 1+r.nextInt(30);

			int pertanyaan = a+b;
			System.out.print(i+". hasil dari "+a+"+"+b+"= ");

			int jawaban = scan.nextInt();


			if (pertanyaan==jawaban)			
			{
				score++;
				benar++;	 
			}
			else
			{
				if (score==0)
					score=0;
				else
					score--;
				salah++;		 	 
			}
		}

		score = 100/jml_soal*benar;

		System.out.println("\n\nBenar: "+benar);
		System.out.println("Salah: "+salah);
		System.out.println("total score: "+score);
	}
}