import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GameController {
    Board board;
    Deque<Player> playerList;

    public GameController(int n){
        board=new Board(n);
        Player p1=new Player(new Piece(PieceType.O),1);
        Player p2=new Player(new Piece(PieceType.X),2);
        playerList=new ArrayDeque<>();
        playerList.add(p1);
        playerList.add(p2);
        board.displayBoard();

    }

    public void StartGame(){
        while(true){

            Player p=playerList.pop();
            System.out.print("Enter the position for Player-"+p.id+":");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();   // reads first integer
            int col = sc.nextInt();

            if(board.addPiece(row,col,p.piece)==Boolean.FALSE){
                System.out.println("Cannot add piece of Player to"+row+","+col+". Try Again");
                playerList.addFirst(p);
            }
            else{
                playerList.add(p);
                board.displayBoard();
                if(isWinner()) {
                    System.out.println("We got the Winner: Player-" + p.id);
                    break;
                }
            }

            if(board.checkBoardFilled()==Boolean.TRUE){
                System.out.println("GAME is TIE");
                break;
            }
        }
    }
    public Boolean isWinner(){

        return board.checkBoard();

    }
}
