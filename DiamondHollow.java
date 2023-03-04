class DiamondHollow{
	public static void main(String[] args) {
		int n=5;
			for (int i=1;i<n;i++) {
				for(int j=i;j<=n;j++){
					System.out.print("  ");
				}
				for(int j=1;j<i;j++){
					if(i==j || j==1 ){
						System.out.print("* ");
					}
					else 
						System.out.print("  ");
				}
				for(int j=1;j<=i;j++){
					if(i==n || j==i ){
						System.out.print("* ");
					}
					else 
						System.out.print("  ");
				}
			System.out.println();
			}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<n;j++){
				if(i==j){
				System.out.print("* ");
			}
			else 
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				if(j==n){
				System.out.print("* ");
			}
			else 
				System.out.print("  ");
			}

			System.out.println();
		}
	
	}
}
/*

         14           
      23 24 25 
   32 33 34 35 36 
41 42 43 44 45 46 47
   52 53 54 55 56
      63 64 65 
         74

*/
