public class Puppy{
	int puppyAge;
	//整数类型 为 puppyAge
	public Puppy(String name) {
		//String name 文字列名字
		System.out.println("小狗的名字是"+name);
		//构造器 构造方法，带有文字列的方法，系统输出小狗的名字是+name
	}
	
	public void setAge(int age) {
		puppyAge = age;
		//设定Age 整型为age
	}
	
	public int getAge() {
		System.out.println("小狗年龄"+ puppyAge);
		return puppyAge;
		
	}
	
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("tommy");
		//实例化对象 myPuppy
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("变量值" + myPuppy.puppyAge);
	}
}