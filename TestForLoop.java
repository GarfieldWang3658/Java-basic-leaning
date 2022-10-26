public class TestForLoop{
	public static void main(String[] args) {
		
		for(int x = 10;x < 20;x = x+1) {
			//int是初始化条件，x<20布尔条件，x=x+1循环条件（更新值）
			System.out.println("x的值是"+ x);
			System.out.println("\n");
		}
	}
}