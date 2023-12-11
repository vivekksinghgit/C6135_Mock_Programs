import java.util.Scanner;
public class rightAngleStars {
 

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Take the number of rows as input
            System.out.print("Enter the number of rows: ");
            int numRows = scanner.nextInt();
    
            // Print the right-angled triangle
            printRightAngleTriangle(numRows);
        }
    
        static void printRightAngleTriangle(int numRows) {
            for (int i = 1; i <= numRows; i++) {
                // Print stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
    
                // Move to the next line after each row
                System.out.println();
            }
        }
    }
    
    

