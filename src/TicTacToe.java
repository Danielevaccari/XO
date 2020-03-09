
public class TicTacToe {

	public static void main(String[] args) {
		
		char[][] peliLauta = { {' ', '-', '-', '-', '-', '-', ' ' }, 
								{'|', ' ', '|', ' ', '|', ' ', '|'},
								{'|', '-', '+', ' ', '+', '-', '|'},
								{'|', ' ', '|', ' ', '|', ' ', '|'},
								{'|', '-', '+', ' ', '+', '-', '|'},
								{'|', ' ', '|', ' ', '|', ' ', '|'},
								{' ', '-', '-', '-', '-', '-', ' '}};
		
		for (int i = 0;i < peliLauta.length;i++) {
			for (int k = 0;k < peliLauta.length;k++) {
				System.out.print(peliLauta[i][k]);
			}
			System.out.println();
			System.out.print("moi!");
		}
	}
}
