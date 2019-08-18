import java.util.*;

public class Hello{
	public static void main(String[] args){
		System.out.println("输入一个数计算阶乘 ：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.Int();
		System.out.println(n + "的阶乘为：" + fact(n));
	}
	private long fact(int n){
		if(n < 0){
			throw new Exception("计算阶乘不可以为小于0的数");
		}
		if(n == 1){
			return 1;
		}else{
			return fact(n-1)*n;
		}
	}
}
