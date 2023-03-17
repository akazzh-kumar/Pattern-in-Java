class Spiral {
	public static void main(String[] args) {
		int a[][] =new int[5][5];
		int value=1;
		int minRow=0,maxRow=4,minCol=0,maxCol=4;
		
		while(value<=25) {
		for(int col=minCol;col<=maxCol;col++) {
			a[minRow][col]=value;
			value++;
		}
		for(int row=minRow+1;row<=maxRow;row++) {
			a[row][maxCol] = value;
			value++;
		}
		for(int col=maxCol-1;col>=minCol;col--) {
			a[maxCol][col] = value;
			value++;
		}
		for(int row=maxRow-1;row>=minRow+1;row--) {
			a[row][minRow] = value;
			value++;
		}
		minCol++;
		minRow++;
		maxRow--;
		maxCol--;
	}
		
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println();
		}
	}
}