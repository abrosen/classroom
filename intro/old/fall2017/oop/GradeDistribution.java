package oop;

public class GradeDistribution {
	
	
	private int numA;
	private int numB;
	private int numC;
	private int numD;
	private int numF;
	
	
	public int getNumA() {
		return numA;
	}
	
	public void setNumA(int numA) {
		this.numA = numA;
	}
	
	
	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	public int getNumC() {
		return numC;
	}

	public void setNumC(int numC) {
		this.numC = numC;
	}

	public int getNumD() {
		return numD;
	}

	public void setNumD(int numD) {
		this.numD = numD;
	}

	public int getNumF() {
		return numF;
	}

	public void setNumF(int numF) {
		this.numF = numF;
	}

	public int getTotalGrades() {
		return numA + numB + numC + numD + numF;
	}
	
	
	public int percentA() {
		return (int) (((double) getNumA() / getTotalGrades()) * 100);
	}
	
	public int percentB() {
		return (int) (((double) getNumB() / getTotalGrades()) * 100);
	}
	public int percentC() {
		return (int) (((double) getNumC() / getTotalGrades()) * 100);
	}
	public int percentD() {
		return (int) (((double) getNumD() / getTotalGrades()) * 100);
	}
	public int percentF() {
		return (int) (((double) getNumF() / getTotalGrades()) * 100);
	}
	
	
	public void printDist() {
		
		
		System.out.println("0    10   20   30   40   50   60   70   80   90   100%");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out.println("***************************************************");
		
		for(int i = 0 ; i < this.percentA()/2 ; i++) {
			System.out.print("*");
		}
		System.out.println("*");
		
		
		for(int i = 0 ; i < this.percentB()/2 ; i++) {
			System.out.print("*");
		}
		System.out.println("*");
		
		
		for(int i = 0 ; i < this.percentC()/2 ; i++) {
			System.out.print("*");
		}
		System.out.println("*");
		
		
		for(int i = 0 ; i < this.percentD()/2 ; i++) {
			System.out.print("*");
		}
		System.out.println("*");
		
		for(int i = 0 ; i < this.percentF()/2 ; i++) {
			System.out.print("*");
		}
		System.out.println("*");
		
		
	}
	
	public static void main(String[] args) {
		GradeDistribution dist =  new GradeDistribution();
		dist.setNumA(2);
		dist.setNumB(4);
		dist.setNumC(8);
		dist.setNumD(4);
		dist.setNumF(2);
		System.out.println(dist.getTotalGrades());

		System.out.println(dist.percentA());
		dist.printDist();
	}

}
