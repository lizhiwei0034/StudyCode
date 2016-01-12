package com.lzw.learn.Abstract;
//（defined a Abstract class）定义一个抽象类
abstract class person{
	//property-定义个属性
	private int age;
	private String name;
	//get&set
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//defined a abstract void
	public abstract void tellName();
	public abstract void tellAge();
}
// defined a child class extend the class of person
class student extends person{
	//override tell()
	@Override
	public void tellName() {
		System.out.println(getName());
	}
	@Override
	public void tellAge() {
		System.out.println(getAge());
	}

}


public class Abstract01 {	

	public static void main(String[] args) {

		// instantiation student
		student s=new student();
		s.setAge(24);
		s.setName("lizhiwei");
		s.tellAge();
		s.tellName();
	}

}
