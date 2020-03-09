import java.util.Scanner;

public class TicTacToe {
	
	boolean pelia = true;
	
	
	
	public static void main(String[] args) {
		
		char[][] peliLauta = {{' ', '-', '-', '-', '-', '-', ' ' }, 
							  {'|', ' ', '|', ' ', '|', ' ', '|'},
							  {'|', '-', '+', ' ', '+', '-', '|'},
							  {'|', ' ', '|', ' ', '|', ' ', '|'},
							  {'|', '-', '+', ' ', '+', '-', '|'},
							  {'|', ' ', '|', ' ', '|', ' ', '|'},
							  {' ', '-', '-', '-', '-', '-', ' '}};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert");
		int index = scanner.nextInt();
		
		switch (index) {
			case 1:
				peliLauta[1][1] = 'X';
				break;
			case 2:
				peliLauta[1][3] = 'X';
				break;
			case 3:
				peliLauta[1][5] = 'X';
				break;
			case 4:
				peliLauta[3][1] = 'X';
				break;
			case 5:
				peliLauta[3][3] = 'X';
				break;
			case 6:
				peliLauta[3][5] = 'X';
				break;
			case 7:
				peliLauta[5][1] = 'X';
				break;
			case 8:
				peliLauta[5][3] = 'X';
				break;
			case 9:
				peliLauta[5][5] = 'X';
				break;
		}
		printPeliLauta(peliLauta);
	}

	public static void printPeliLauta(char[][] peliLauta) {

		for (int i = 0;i < peliLauta.length;i++) {
			for (int k = 0;k < peliLauta.length;k++) {
				System.out.print(peliLauta[i][k]);
			}
			System.out.println();
		}
	}
	
}
