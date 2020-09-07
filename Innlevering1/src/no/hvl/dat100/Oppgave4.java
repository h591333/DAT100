package no.hvl.dat100;
import java.util.Scanner;
public class Oppgave4 {
	
	public static void main(String[] args) {
		double skatt=0, it;
		Scanner sc=new Scanner(System.in);
		System.out.println("Skriv in Inntekt");
		it=sc.nextDouble();
		if(it<=174500) {
			skatt=0;//Step 0
		}
		else if(it<=245650) {
			skatt=0.019*(it-174500);//Step 1
		}
		else if(it<=617500) {
			skatt=0.042*(it-174500);//Step 2
		}
		else if(it<=964800) {
			skatt=0.132*(it-174500);//Step 3
		}
		else if(it<=964801) {
			skatt=0.162*(it-174500);//Step 4
		}
		System.out.println("Trinnskatten er på "+skatt);
	}
	
}