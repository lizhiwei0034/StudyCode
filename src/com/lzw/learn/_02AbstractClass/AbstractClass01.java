package com.lzw.learn._02AbstractClass;


/**
 * 抽象方法的使用
 * 
 * @author mysti_000
 *
 */
// 定义一个抽象类 人
abstract class Person {
	// 定义人的基本公共属性
	private String name;
	private int age;

	// 添加一个构造方法用于传参数
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	// GET/SET方法
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 定义一个抽象方法
	public abstract void show();

}

// 定义一个学生类，继承自人
class Student extends Person {
	// 作为学生，成绩是其特有的属性
	private int score;

	// 子类继承了父类preson 而父类中有构造方法，因此子类中要有构造方法
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	// get/set
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 实现show方法
	public void show() {
		System.out.println("姓名：" + getName() + " 年龄：" + getAge() + " 成绩：" + getScore());
	}

}
//定义一个工人类 也继承自person类
class Worker extends Person{
	//定义工人特有的属性
	private int money ;
	//父类中有构造方法，子类中也要有
	public Worker(String name,int age,int money){
		super(name, age);
		this.money=money;
	}
	//get/set
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	//在子类中显示父类中的抽象方法
	public void show() {
		System.out.println("姓名："+getName()+" 年龄:"+getAge()+" 工资:"+getMoney());
	}
}
public class AbstractClass01 {

	public static void main(String[] args) {
		//实例化学生
		Student s =new Student("李志伟", 24, 10000);
		s.show();
		//实例化工人
		Worker w=new Worker("王爽", 23, 8000);
		w.show();
	}

}
