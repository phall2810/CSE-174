import java.util.Scanner;


public class JamaarChase {
   public static void main(String[] args) {
   // Receptions
   int week1Receps = (5);
   int week2Receps = (2);
   int week3Receps = (4);
   // Yards
   int week1Yards = (101);
   int week2Yards = (54);
   int week3Yards = (65);
   // Average Yards Per Catch
   double week1AvYards = (20.2);
   double week2AvYards = (27.0);
   double week3AvYards = (16.2);
   // Touchdowns
   int week1TD = (1);
   int week2TD = (1);
   int week3TD = (2);
   // Total Receptions
   int totalReceps = (week1Receps + week2Receps + week3Receps);
   // Total Yards 
   int totalYards = (week1Yards + week2Yards + week3Yards);
   // Average Yards Through Three Games
   double totalAvYards = ((week1AvYards + week2AvYards + week3AvYards) / 3);
   // Total Touchdowns 
   int totalTD = (week1TD + week2TD + week3TD);

   
   Scanner keyboardReader = new Scanner(System.in);
   System.out.println("What stats would you like to see today?" );
   String response = keyboardReader.next();
   //Reception IF statements 
   if (response.equals("Week1Receptions")) {
   System.out.println(week1Receps);
         }
   if (response.equals("Week2Receptions")) {
   System.out.println(week2Receps);
         }
   if (response.equals("Week3Receptions")) {
   System.out.println(week3Receps);
         }
   if (response.equals("TotalReceptions")) {
   System.out.println(totalReceps);
         }
   //Yards IF statements 
   if (response.equals("Week1Yards")) {
   System.out.println("here are some slashes: //\\\\\\//\\");
         }
   if (response.equals("Week2Yards")) {
   System.out.println(week2Yards);
         }
   if (response.equals("Week3Yards")) {
   System.out.println(week3Yards);
         }
   if (response.equals("TotalYards")) {
   System.out.println(totalYards);
         }
   //Average Yards IF statements 
   if (response.equals("Week1AverageYards")) {
   System.out.println(week1AvYards);
         }
   if (response.equals("Week2AverageYards")) {
   System.out.println(week2AvYards);
         }
   if (response.equals("Week3AverageYards")) {
   System.out.println(week3AvYards);
         }
   if (response.equals("TotalAverageYards")) {
   System.out.printf("%.2f%n", totalAvYards);
         }
   //Touchdown IF statements 
   if (response.equals("Week1Touchdowns")) {
   System.out.println(week1TD);
         }
   if (response.equals("Week2Touchdowns")) {
   System.out.println(week2TD);
         }
   if (response.equals("Week3Touchdowns")) {
   System.out.println(week3TD);
         }
   if (response.equals("TotalTouchdowns")) {
   System.out.println(totalTD);
         }
   Scanner keyboardReaderint = new Scanner(System.in);
   System.out.println("Do you want to check any other stats? ");
   String response2 = keyboardReader.next();
  }   
}