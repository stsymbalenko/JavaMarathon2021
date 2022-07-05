package day17;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
       List<List<ChessPiece>> chessPieceList = new ArrayList<>();

        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(0,ChessPiece.ROOK_BLACK);
        chessPieceList.add(new ArrayList<ChessPiece>());
       chessPieceList.get(0).add(1,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(2,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(3,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(4,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(5,ChessPiece.ROOK_BLACK);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(6,ChessPiece.KING_BLACK);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(0).add(7,ChessPiece.EMPTY);

        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(0,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(1,ChessPiece.ROOK_WHITE);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(2,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(3,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(4,ChessPiece.PAWN_BLACK);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(5,ChessPiece.PAWN_BLACK);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(6,ChessPiece.EMPTY);
        chessPieceList.add(new ArrayList<ChessPiece>());
        chessPieceList.get(1).add(7,ChessPiece.PAWN_BLACK);

     chessPieceList.get(2).add(0,ChessPiece.PAWN_BLACK);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(1,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(2,ChessPiece.KNIGHT_BLACK);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(3,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(4,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(5,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(6,ChessPiece.PAWN_BLACK);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(2).add(7,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());

     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(0,ChessPiece.QUEEN_BLACK);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(1,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(2,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(3,ChessPiece.BISHOP_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(4,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(5,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(6,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(3).add(7,ChessPiece.EMPTY);

     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(0,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(1,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(2,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(3,ChessPiece.BISHOP_BLACK);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(4,ChessPiece.PAWN_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(5,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(6,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(4).add(7,ChessPiece.EMPTY);


     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(0,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(1,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(2,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(3,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(4,ChessPiece.BISHOP_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(5,ChessPiece.PAWN_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(6,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(5).add(7,ChessPiece.EMPTY);

     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(0,ChessPiece.PAWN_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(1,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(2,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(3,ChessPiece.QUEEN_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(4,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(5,ChessPiece.PAWN_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(6,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(6).add(7,ChessPiece.PAWN_WHITE);


     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(0,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(1,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(2,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(3,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(4,ChessPiece.EMPTY);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(5,ChessPiece.ROOK_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(6,ChessPiece.KING_WHITE);
     chessPieceList.add(new ArrayList<ChessPiece>());
     chessPieceList.get(7).add(7,ChessPiece.EMPTY);

    ChessBoard chessBoard = new ChessBoard(chessPieceList);
    chessBoard.print();


    }
}
