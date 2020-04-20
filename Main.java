import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Human h = new Human("Soroosh", "X");
       Computer c = new Computer("O");
       Scanner sc = new Scanner(System.in);
       Board b = new Board();

       b.printBoard();

       while(!b.checkWin(c.token)) {

           System.out.println("Enter row than a col to move:");

           boolean legalMove = false;
           int moveCol = -1;
           int moveRow = -1;

           while(!legalMove) {

               if(sc.hasNextInt()) {
                   moveRow = sc.nextInt() - 1;
                   moveCol = sc.nextInt() - 1;
                   legalMove = true;

                   if (moveCol != 0 && moveCol != 1 && moveCol != 2 && moveRow != 0 && moveRow != 1 && moveRow != 2) {
                       System.out.println("Enter a legal move!");
                       legalMove = false;
                       sc.next();
                   }

                   if (b.grid[moveRow][moveCol] != "-") {
                       System.out.println("This space is full. Enter another move!");
                       legalMove = false;
                       sc.next();
                   }

               } else {
                   System.out.println("Enter a legal move!");
                   sc.next();
               }

               if(legalMove) {
                   b.makeMove(moveRow, moveCol, h.token);
               }

           }

           if(b.checkWin(h.token)) {
               b.printBoard();
               System.out.println("You Won!");
               break;
           }

           
               int cMoveCol = c.determineMoveCol(b, c.token, h.token);
               int cMoveRow = c.determineMoveRow();
               b.makeMove(cMoveCol, cMoveRow, c.token);
           

           b.printBoard();

           if(b.checkWin(c.token)) {
               b.printBoard();
               System.out.println("You Lost!");
               break;
           }

       }

   }

}


