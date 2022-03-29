package test;

public class Src {
	public static void initFunc(int[][] array){
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[0].length;j++) {
				array[i][j] = 0;
			}
		}
	}
	public static void main(String[] args) {
		int [][] a = new int[5][5];
		
		initFunc(a);
		hourGlassFunc(a);
	}
	private static void hourGlassFunc(int[][] a) {
		int v = 1;
		for(int i = 0;i<a.length;i++) {
			for(int j = i;j<a[i].length;j++) {
				a[i][j] = v;
				v = v + 1;
			}
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				if(a[i][j] == 0)System.out.print(a[i][j]+"\t");
				else System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
