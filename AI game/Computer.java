public class Computer extends Player {

   public Computer(String token) {

       super("Bit Bucket", token);
   }

   public int determineMoveCol(Board b, String ctoken, String htoken){
       int col = 1;
       for(int i=1; i < 2; i++){
           if(b.grid[i][2] == "-"){
               col = i;
           }
       }

       return col;

   }

   public int determineMoveRow(){

       int row = (int )(Math.random() * 3);

       return row;

   }


}

