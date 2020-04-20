public class Board {

   int size = 3;
   String[][] grid = new String[size][size];

   public Board() {
       for(int row = 0; row < size; row++) {
           for(int col = 0; col < size; col++) {
               grid[row][col] = "-";
           }
       }
   }

   public void printBoard() {
       System.out.println("Updated board:");
       for(int row = 0; row < size; row++) {
           for(int col = 0; col < size; col++) {

               System.out.print(grid[row][col] + " ");
           }
           System.out.print("\n");
       }
   }

   public void makeMove(int row, int col, String token) {

       if(grid[row][col].equals("-")){
           grid[row][col] = token;
       }

   }

   public boolean moveHasRoom(int row, int col) {
       if(grid[row][col].equals("-")) {
           return true;
       }
       return false;
   }

   public boolean checkWin(String token) {

       boolean a = checkWinA(token);
       boolean b = checkWinB(token);
       boolean c= checkWinC(token);
       boolean d = checkWinD(token);
       boolean e = checkWinE(token);
       boolean f = checkWinF(token);
       boolean g = checkWinG(token);
       boolean h = checkWinH(token);

       return a || b || c || d || e || f || g || h;
   }



   public boolean checkWinA(String token) {

       if(grid[2][0].equals(token) && grid[2][1].equals(token) && grid[2][2].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinB(String token) {

       if(grid[1][0].equals(token) && grid[1][1].equals(token) && grid[1][2].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinC(String token) {

       if(grid[0][0].equals(token) && grid[0][1].equals(token) && grid[0][2].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinD(String token) {

       if(grid[0][2].equals(token) && grid[1][2].equals(token) && grid[2][2].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinE(String token) {

       if(grid[0][1].equals(token) && grid[1][1].equals(token) && grid[2][1].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinF(String token) {

       if(grid[0][0].equals(token) && grid[1][0].equals(token) && grid[2][0].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinG(String token) {

       if(grid[2][0].equals(token) && grid[1][1].equals(token) && grid[0][2].equals(token)){

           return true;

       }
       return false;

   }
   public boolean checkWinH(String token) {

       if(grid[2][2].equals(token) && grid[1][1].equals(token) && grid[0][0].equals(token)){

           return true;

       }
       return false;

   }



}

