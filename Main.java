package przykladowy_project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int liczbaA = 6;
//		int liczbaC = 2;
//		
//		int wynik = sumaAB(liczbaA, liczbaC);
//		double dziel = dzielenie(liczbaA,liczbaC);

		
		Scanner scan = new Scanner(System.in);	
	    System.out.println("Wybierz dzia³anie (1 - dodawanie, 2 - odejmowanie, 3 - mnozenie, 4 - dzielenie)");
	    String answer = scan.nextLine();	    
	    Integer intAnswer = Integer.parseInt(answer);

        String patternString = "^[1-4]{1}$";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(answer);
        boolean matches = matcher.matches();
	    
		while(!matches) {
			System.out.println("B³êdna odpowiedz, wprowadz ponownie liczbe z zakresu 1-4");
		    answer = scan.nextLine();
		    intAnswer = Integer.parseInt(answer);
		}
		
		String numberA;
		String numberB;
		
        switch(intAnswer) {
        	case 1:
        		System.out.println("Wybra³eœ dodawanie");
        		System.out.println("Podaj pierwsz¹ liczbe:");
                numberA = scan.nextLine();
                System.out.println("Podaj drug¹ liczbe:");
                numberB = scan.nextLine();
        		System.out.print("Wybra³eœ 1 - dodawanie, liczba A to " + numberA + ", liczba B to " + numberB + " wynik operacji to ");
        		printOnScreen(addition(Integer.parseInt(numberA),Integer.parseInt(numberB)));
        		break;
        	case 2:
        		System.out.println("Wybra³eœ odejmowanie");
        		System.out.println("Podaj pierwsz¹ liczbe:");
                numberA = scan.nextLine();
                System.out.println("Podaj drug¹ liczbe:");
                numberB = scan.nextLine();
                System.out.print("Wybra³eœ 2 - odejmowanie, liczba A to "+numberA+", liczba B to "+numberB+" wynik operacji to ");
        		printOnScreen(subtraction(Double.parseDouble(numberA),Double.parseDouble(numberB)));
        		break;
        	case 3:
        		System.out.println("Wybra³eœ mno¿enie");
        		System.out.println("Podaj pierwsz¹ liczbe:");
                numberA = scan.nextLine();
                System.out.println("Podaj drug¹ liczbe:");
                numberB = scan.nextLine();
                System.out.print("Wybra³eœ 3 - mnozenie, liczba A to "+numberA+", liczba B to "+numberB+" wynik operacji to ");
        		printOnScreen(multiplication(Double.parseDouble(numberA),Double.parseDouble(numberB)));
        		break;
        	case 4:
        		System.out.println("Wybra³eœ dzielenie");
        		System.out.println("Podaj pierwsz¹ liczbe:");
                numberA = scan.nextLine();
                System.out.println("Podaj drug¹ liczbe:");
                numberB = scan.nextLine();
                System.out.print("Wybra³eœ 4 - dzielenie, liczba A to "+numberA+", liczba B to "+numberB+" wynik operacji to ");
                
                if(division(Double.parseDouble(numberA),Double.parseDouble(numberB)) == -1) {
                	System.out.print("Nie dziel przez zero");
                }
                else {
                	printOnScreen(division(Double.parseDouble(numberA),Double.parseDouble(numberB)));
                }
        		break;
        }
	}
	
	public static double addition(int A, int B) {
		int lA = A;
		int lB = B;
		int suma = lA + lB;
		return suma;
	}
	
	public static double subtraction(double A, double B) {
		return A - B;
	}
	
	public static double multiplication(double A, double B) {
		return A * B;
	}
	
	public static double division(double A, double B) {
		if(B == 0) {
			return -1;
		}
		else {
			return A/B;
		}
	}
	
	public static void printOnScreen(Double answer) {
		if(null == answer) {
			System.out.print("B³¹d");
		}
		else {
			System.out.print(answer.toString().replaceAll("[.]",","));
		}
		
	}

}
