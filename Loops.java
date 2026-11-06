// Elinor Stoutimore
// 10/28/2026
// Creates 5 methods with standard loop alogorithms to create several unique patterns
public class Loops {
    public static void main(String [] args) {
        pyramid(5);
    }

    //precondition: the rows variable must be greater than 0 intitially
    //postcondition: there are as many rows of stars as the rows variable stores and each row contains two more stars than the previous row
    public static void stars(int rows) {
        int i = 1;
        String star = "*";
        String finalResult = "*";
        System.out.println(star);
        while (i < rows) {
            finalResult = finalResult + star + star;
            i++;
            System.out.println(finalResult);
        }

    }

    //precondition: the rows variable must be greater than 0 intially
    //postcondition: theer are as many rows of numbers as the rows variable stores and each number in the row correposnds in amount and type to the row number it is on. will never output a negative number.
    public static void triangle (int rows) {
        int numberStored = 1;
        int i = 1;
        int numbersInRow = numberStored;
        while (i < rows) {
            while (numbersInRow > 0) {
                System.out.print(numberStored);
                numbersInRow = numbersInRow - 1;
            }          
            System.out.println();
            numberStored = numberStored + 1;
            numbersInRow = numberStored;
            i++;
        }

    }

    //precondition: the start variable must be an odd number greater than 0 intially
    //postcondition: first row will correspond in amount and type to the start variable number and every descending row is an odd number with the correct corresponding number and type. will never return a negative number.
    public static void odds(int start) {
        int numberStored = start;
        int numbersInRow = numberStored; 
        for (int i = numberStored; i > 0; i = i - 2) {
            for (;numbersInRow > 0; numbersInRow = numbersInRow - 1) {
                System.out.print(numberStored);
            }
            System.out.println();
            numberStored = numberStored - 2;
            numbersInRow = numberStored;

        }
    }
    //preconditon: the maxE must contain something greater than 0 initally
    //postcondition: dependent on whether or not maxE conatins an odd/even number, one O/E will print and every other row contains the same letter(s) until maxE is reached, then the pattern continues but decreasing the number of letters in a row until 1 letter in a row is reached again.
    public static void eo(int maxE) {
    
        String letter = "";

        if (maxE % 2 == 0) {
            letter = "O";
        }
            else {
                letter = "E";
            }
        for (int i = 1; i <= maxE; i++) {
            for (int lettersInRow = i; lettersInRow>0; lettersInRow--) {
                System.out.print(letter);
            }
            if(letter.equals("E")){
                letter = "O";
            }
            else if (letter.equals("O")) {
                letter = "E";
            }
            System.out.println();

        }
        for (int g = maxE - 1; g > 0; g--) {
            for (int lettersInRow = g; lettersInRow > 0; lettersInRow--) {
                System.out.print(letter);
            }
            if (letter.equals("E")){
                letter = "O";
            }
            else if (letter.equals("O")) {
                letter = "E";
            }
            System.out.println();
        }


    }
    

        //Precondition: rows must conatin a value greater than 0 initially
        //Postcondition: a pyramid will be built first starting with 1 as many times as rows * 2 - 1 then increasing one in number stored and 2 in amount of times that number appears in a row. additionally, an additonal space will be added the the start of every row after the first to create the pyramid shape
        public static void pyramid(int rows) {
        int numberStored = 1;
        int numbersInRow = rows * 2 - 1; 
        int finalNumberInRow = numbersInRow;
        String space = "";
        for (int i = rows; i > 0; i = i - 1) {
            System.out.print(space);
            space = space + " ";
            for (;numbersInRow > 0; numbersInRow = numbersInRow - 1) {
                System.out.print(numberStored);
            }
            System.out.println();
            numberStored = numberStored + 1;
            finalNumberInRow = finalNumberInRow - 2;
            numbersInRow = finalNumberInRow;

        }

            }


    }



