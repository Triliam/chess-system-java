package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(){}
    public Piece(Board board){
       this.board = board;
       //position = null; mesmo se n atribuir nada, por padrao o java ja atribui nulo
    }

    protected Board getBoard() {
        return board;
    }
}
