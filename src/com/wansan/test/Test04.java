package com.wansan.test;
/*
 * java初始化顺序
 * 1.初始化静态代码块
 * 2.需要初始化父类的Object
 * 3.对成员变量进行初始化就是说会将其变成0或者null
 * java程序的加载顺序
 * 1.加载静态方法和静态代码块
 * 2.当运行子类继承父类的时候需要首先对父类进行加载,这个时候是
 * 需要运行父类的无参构造器的,如果父类中有无参构造和有参构造,这个
 * 时候需要在子类中加一条有参构造器其中需要用super来调用.
 * static关键字：static方法就是没有this的方法。在static方法内部不能调用非静态方法,
 * 反过来是可以的.而且可以在没有创建任何对象的前提下,仅仅通过类本身来调用static方法.
 * 这实际上正是static方法的主要用途
 * final:final类不能继承,final方法不能被被重写(真爽,只是点少了好多)
 * 继承：子类继承父类当运行new子类的时候,首先需要调用父类的构造方法,然后再调用子类的构造方法。
 * 当子类向上转型的时候可以直接调用可以直接调用父类的方法和属性,但是会失去子类的方法和属性。
 * 当子类重写了父类的方法时,向上转型调用的是子类重写后方法.向下转型可能会发生错误, Girl g1=new MMGirl(); //向上转型
Girl是父类 MMGirk是子类
                   g1.smile();

                   MMGirl mmg=(MMGirl)g1;    //向下转型,编译和运行皆不会出错

                   mmg.smile();

                   mmg.c();

                   Girl g2=new Girl();

           //MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错
 */
public class Test04 extends Test02{
	//这样写会直接打印出这个对象出来
	private Test01 test0123=new Test01();
	public String i;
	public String geti() {
		this.i=i;
		return i;
	}
  public Test01 getTest0123() {
		return test0123;
	}
	public void setTest0123(Test01 test0123) {
		this.test0123 = test0123;
	}
static {
	  System.out.print("abds");
  }
  public Test04(){
	  System.out.print("sssdd"+i);
	  
  }
  public static void main(String[] args) {
	  Test04 test=new Test04();
	  System.out.println( test.geti()+test.getTest0123());
	  //Test02 test02=new Test02();
     //  Test04 test04=(Test04) test02;

}
  
  
}
