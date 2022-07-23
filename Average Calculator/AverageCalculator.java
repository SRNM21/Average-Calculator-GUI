

import java.util.Scanner;
import java.util.Random;

public class AverageCalculator {
	// last edited 12/05/2022
	
	static String quotes[] = {	
		    "“Failure isn't fatal, but failure to change might be” \n				- John Wooden",
			"“Everything you want is on the other side of fear.”  \n				- Jack Canfield",
			"“Success is most often achieved by those who don't know that failure is inevitable.” \n				 - Coco Chanel",
			"“Only those who dare to fail greatly can ever achieve greatly.” \n 				- Robert F. Kennedy",
			"“If you're not prepared to be wrong, you'll never come up with anything original.” \n				- Ken Robinson"};
		
	static Random r = new Random();
	static int i = r.nextInt(5);
	
	static float g1, g2, g3, g4, g5, g6, g7, g8;
	static float avg;
	
	public static void main(String[] args) {
			
		try(Scanner s = new Scanner(System.in)){
			
			for (int i = 0; i < 1; i++) {
				
				System.out.println("     Enter Grades");
				System.out.print("Filipino :        ");
				g1 = s.nextFloat();
				if (g1 > 100) {
					System.out.println("Invalid Grade, Please try again");
					break;
				}
				else if (g1 < 75) {
					System.out.println("Sorry, but we consider you failed if you failed just one subject.");
					System.out.println("");
					System.out.println(quotes[i]);
					break;
				}
				else {
					System.out.print("English :         ");
					g2 = s.nextFloat();
					if (g2 > 100) {
						System.out.println("Invalid Grade, Please try again");
						break;
					}
					else if (g2 < 75) {
						System.out.println("Sorry, but we consider you failed if you failed just one subject.");
						System.out.println("");
						System.out.println(quotes[i]);
						break;
					}
					else {
						System.out.print("Math :            ");
						g3 = s.nextFloat();
						if (g3 > 100) {
							System.out.println("Invalid Grade, Please try again");
							break;
						}
						else if (g3 < 75) {
							System.out.println("Sorry, but we consider you failed if you failed just one subject.");
							System.out.println("");
							System.out.println(quotes[i]);
							break;
						}
						else {
							System.out.print("Science :         ");
							g4 = s.nextFloat();
							if (g4 > 100) {
								System.out.println("Invalid Grade, Please try again");
								break;
							}
							else if (g4 < 75) {
								System.out.println("Sorry, but we consider you failed if you failed just one subject.");
								System.out.println("");
								System.out.println(quotes[i]);
								break;
							}
							else {
								System.out.print("A.P. :            ");
								g5 = s.nextFloat();
								if (g5 > 100) {
									System.out.println("Invalid Grade, Please try again");
									break;
								}
								else if (g5 < 75) {
									System.out.println("Sorry, but we consider you failed if you failed just one subject.");
									System.out.println("");
									System.out.println(quotes[i]);
									break;
								}
								else {
									System.out.print("E.S.P. :          ");
									g6 = s.nextFloat();
									if (g6 > 100) {
										System.out.println("Invalid Grade, Please try again");
										break;
									}
									else if (g6 < 75) {
										System.out.println("Sorry, but we consider you failed if you failed just one subject.");
										System.out.println("");
										System.out.println(quotes[i]);
										break;
									}
									else {
										System.out.print("P.E. :            ");
										g7 = s.nextFloat();
										if (g7 > 100) {
											System.out.println("Invalid Grade, Please try again");
											break;
										}
										else if (g7 < 75) {
											System.out.println("Sorry, but we consider you failed if you failed just one subject.");
											System.out.println("");
											System.out.println(quotes[i]);
											break;
										}
										else {
											System.out.print("T.L.E. :          ");
											g8 = s.nextFloat();
											if (g8 > 100) {
												System.out.println("Invalid Grade, Please try again");
												break;
											}
											else if (g8 < 75) {
												System.out.println("Sorry, but we consider you failed if you failed just one subject.");
												System.out.println("");
												System.out.println(quotes[i]);
												break;
											}
										}
									}
								}
							}
						}
					}
				}
				
				avg = (g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8)/8;
				
				if (avg >= 98) System.out.println("CONGRATULATIONS!, YOUR AVERAGE IS " + avg + ", WITH HIGHEST HONORS!");
				else if (avg >= 95) System.out.println("CONGRATULATIONS!, YOUR AVERAGE IS " + avg + ", WITH HIGH HONORS!");
				else if (avg >= 90) System.out.println("CONGRATULATIONS!, YOUR AVERAGE IS " + avg + ", WITH HONORS!");
				else System.out.println("CONGRATULATIONS!, YOUR AVERAGE IS " + avg + ", PASSED!");
			} 
		}
	}
}
