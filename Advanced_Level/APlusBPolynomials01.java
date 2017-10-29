package test;
import java.util.Scanner;
public class APlusBPolynomials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		int count = p1.getNumOfNonzeroTerms() + p2.getNumOfNonzeroTerms();
		double[] list = new double[count];
		Polynomial newP = p1.selfPlusAnother(p2,list);
		newP.printSelfDate();
	}
}

 class Polynomial {
	private int k;//多项式非零项数
	private double[][] nk;//存储多项式指数和系数
	
	public Polynomial() {
		//创建项数为k项的多项式的构造方法
		Scanner input = new Scanner(System.in);
		//System.out.println("输入多项式的非零项数：");
		
		
		
		int k1 = input.nextInt();
        k = k1;
		
		this.nk = new double[k][2];
		//System.out.println("输入每一项的指数和系数：");
		for(int i = 0; i < k; i++) {
			
			this.nk[i][0] = input.nextDouble();//nk[i][0]存储指数
			
			this.nk[i][1] = input.nextDouble();//nk[i][1]存储系数
		}
	}
	
	public Polynomial(int m) {
		k = m;
		nk = new double[m][2];
	}
	
	public int getNumOfNonzeroTerms() {
		//访问项数方法
		return this.k;
	}
	
	public double[][] getCoefficients() {
		//访问包含系数和指数二维数组的方法
		return this.nk;
	}
	
	public void setNumOfNonzeroTerms(int k) {
		this.k = k;
	}
	
	public void setCoefficients(double[][] nk) {
		this.nk = nk;
	}
	
	public Polynomial selfPlusAnother(Polynomial p,double[] list) {
		//两个多项式加法方法
	    
		//建立两个多项式的指数的并集并排序
		int countOfTailNewExpList = 0;
		int i0,i1;
		for(i0 = 0; i0 < p.k; i0++) {
			//将p的各个指数移入list
			list[i0] = p.nk[i0][0];
	
		} 
		int num = 0;
		for(; i0 < p.k + this.k; i0++) {
			//将this的各个与p中指数不同的指数移入list
			
			for(i1 = 0; i1 < p.k; i1++) {
				
				if(this.nk[num][0] == p.nk[i1][0])
					break;
			}
			
			if(i1 == p.k) {
				list[p.k + countOfTailNewExpList] = this.nk[num][0];
				countOfTailNewExpList++;
			}
			num++;
		}
		countOfTailNewExpList += p.k;
		//对list的元素选择排序法排降序
		double maxElement;
		int indexOfMaxExp;
		for(int j0 = 0; j0 < countOfTailNewExpList; j0++) {
			maxElement = list[j0];
			indexOfMaxExp = j0;
			for(int j1 = j0+1; j1 < countOfTailNewExpList; j1++) {
				if(list[j1] > maxElement) {
					maxElement = list[j1];
					indexOfMaxExp = j1;
				}
			}
			if(indexOfMaxExp != j0) {
				list[indexOfMaxExp] = list[j0];
				list[j0] = maxElement;
			}
		}
		Polynomial newP = new Polynomial(countOfTailNewExpList);
		for(int i = 0; i < countOfTailNewExpList; i++) {
			//更新指数
			newP.nk[i][0] = list[i];
		}
		for(int i = 0; i < countOfTailNewExpList; i++){
			//更新系数，将自身的系数加到新多项式中
			for(int j = 0; j < this.k; j ++)
				if(newP.nk[i][0] == this.nk[j][0])
					newP.nk[i][1] += this.nk[j][1];
		}
		for(int i = 0; i < countOfTailNewExpList; i++){
			//更新系数，将参数多项式的系数加到新多项式中
			for(int j = 0; j < p.k; j ++)
				if(newP.nk[i][0] == p.nk[j][0])
					newP.nk[i][1] += p.nk[j][1];
		}
		return newP;
	}

	public void printSelfDate() {
		System.out.print(this.k);
		for(int i = 0; i < this.k; i++) {
			if(this.nk[i][1] == 0)
				continue;
			System.out.print(" " + (int)this.nk[i][0]);
			System.out.print(" " + (int)(this.nk[i][1] * 10) / 10.0);
		}
	}
}