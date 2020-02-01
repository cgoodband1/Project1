/**
 * 
 * @author <Chase Goodband>
 * @version<10/4/2019>
 *
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class project2 {

	public static void main(String[] args) throws IOException {
		
		 priority poor = new priority(160);
		 priority fair = new priority(160);
		 priority good = new priority(160);
		 priority vgood = new priority(160);
		 priority excellent = new priority(160);
		
		 FileInputStream fstream = new FileInputStream("Countries2.csv");
		 BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));

		 String strLine = reader.readLine(); //Title line
		 
		 while ((strLine = reader.readLine()) != null)   {
			 String[] parts = strLine.split(Pattern.quote(","));
			 
			 country c = new country(parts[0], 
					 parts[1], 
					 parts[2],
					 Long.parseLong(parts[3]), 
					 Double.valueOf(parts[4]).doubleValue(), 
					 Integer.parseInt(parts[5]));
			 /*
			 Let us define five groups of countries based on GDP per capita: POOR countries as
			 those with GDP per capita <1 thousand, FAIR no less than 1 thousand but <5
			 thousand, GOOD no less than 5 thousand but <20 thousand, VGOOD no less than 20
			 thousand but <50 thousand, and EXCELLENT no less than 50 thousand.*/
			 
			 if (c.getGDPPerCapita() >= 50000) {
				 excellent.insert(c);
			 }
			 else if(c.getGDPPerCapita() >= 20000){
				 vgood.insert(c);
			 }
			 else if(c.getGDPPerCapita() >= 5000){
				 good.insert(c);
			 }
		     else if(c.getGDPPerCapita() >= 1000){
					 fair.insert(c);
		     }
		     else {
				 poor.insert(c);
		     }
//			 c.print();

		 }
		 

		 //Close the input stream
		 fstream.close();
		 
		 System.out.println("Poor countries");
		 
				System.out.println();
				System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
				System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
			
				
		 
		poor.print();
//		
		
		System.out.println("fair countries");
		System.out.println();
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
		System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
		fair.print();
		
		System.out.println("good countries");
		System.out.println();
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
		System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
		good.print();

		System.out.println("VGood countries");
		System.out.println();
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
		System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
		vgood.print();

		System.out.println("Excellent countries");
		System.out.println();
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
		System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
		excellent.print();
		
		
		stack s0 = new stack(160);
		while ( ! poor.isEmpty()) {
			country removedCountry = poor.remove();
			s0.push(removedCountry);
		}
		while ( ! fair.isEmpty()) {
			country removedCountry = fair.remove();
			s0.push(removedCountry);
		}
		while ( ! good.isEmpty()) {
			country removedCountry = good.remove();
			s0.push(removedCountry);
		}
		while ( ! vgood.isEmpty()) {
			country removedCountry = vgood.remove();
			s0.push(removedCountry);
		}
		while ( ! excellent.isEmpty()) {
			country removedCountry = excellent.remove();
			s0.push(removedCountry);
		}
		
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name", "Code", "Capital", "Population", "GDP", "Happiness Rank");

		s0.printStack();
	}
	
}
	
