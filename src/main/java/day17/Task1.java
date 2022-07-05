package day17;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        List<ChessPiece> chessPiecesList = new ArrayList<ChessPiece>();
        chessPiecesList.add(ChessPiece.PAWN_WHITE);
        chessPiecesList.add(ChessPiece.PAWN_WHITE);
        chessPiecesList.add(ChessPiece.PAWN_WHITE);
        chessPiecesList.add(ChessPiece.PAWN_WHITE);

        chessPiecesList.add(ChessPiece.ROOK_BLACK);
        chessPiecesList.add(ChessPiece.ROOK_BLACK);
        chessPiecesList.add(ChessPiece.ROOK_BLACK);
        chessPiecesList.add(ChessPiece.ROOK_BLACK);

        for (ChessPiece str : chessPiecesList){
            System.out.print(str.toString() + " ");
        }


    }
}