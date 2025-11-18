import java.util.ArrayList;

public class Board {
    Piece[][] board;
    Integer N;

    public Board(Integer N){
        this.N=N;
        board= new Piece[N][N];
    }

    public Boolean addPiece(int row, int col, Piece piece){

        if(row<0||row>=N||col<0||col>=N) return Boolean.FALSE;

        if(board[row][col]!=null){
            return Boolean.FALSE;
        }
        board[row][col]=new Piece(piece.ptype);

        return Boolean.TRUE;
    }

    public Boolean checkBoard(){
        for(int i=0;i<N;i++){
            Piece p=board[i][0];
            int count=0;
            for(int j=0;j<N;j++){
                if(p!=null&&board[i][j]!=null&&board[i][j].ptype==p.ptype) count++;
            }
            if(count==N) return Boolean.TRUE;
        }

        for(int j=0;j<N;j++){
            Piece p=board[0][j];
            int count=0;
            for(int i=0;i<N;i++){
                if(p!=null&&board[i][j]!=null&&board[i][j].ptype==p.ptype) count++;
            }
            if(count==N) return Boolean.TRUE;
        }

        Piece p=board[0][0];
        int i=0;int j=0, cnt=0;
        while(i<N&&j<N){
            if(p!=null&&board[i][j]!=null&&p.ptype==board[i][j].ptype) cnt++;
            i++;j++;

        }
        if(cnt==N) return  Boolean.TRUE;

        p=board[0][N-1];
        i=0;j=N-1;cnt=0;
        while(i<N&&j>=0){
            if(p!=null&&board[i][j]!=null&&p.ptype==board[i][j].ptype) cnt++;
            i++;j--;
        }
        if(cnt==N) return  Boolean.TRUE;


        return Boolean.FALSE;
    }

    public void displayBoard(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]==null){
                    System.out.print("[.]");
                }
                else{
                    System.out.print("["+board[i][j].ptype+"]");
                }
            }
            System.out.println();
        }
    }

    public Boolean checkBoardFilled(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]==null) return Boolean.FALSE;
            }
        }
            return Boolean.TRUE;
    }
}
