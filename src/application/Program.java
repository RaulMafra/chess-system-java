package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(new Scanner(System.in));
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(new Scanner(System.in));
			
			ChessPiece capturedPiece = chessMatch.performChessMovie(source, target);
;		}
	}

}
