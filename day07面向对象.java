1.面向对象的思想:
	面向对象是基于面向过程.
	
	面向过程:
		完成某件事情的是过程(步骤),是一种解决问题的思路.强调的是整个过程.
		
	面向对象:
		强调的是对象, 找谁帮助我们去完成某件事情.
		
	无论是面向对象还是面向过程,只不过是解决问题的思路不同而已.最终的目的就是为了更加方便以及合理的去解决问题.
	
	面向对象的特点:
		更加符合我们思考习惯的思想.
		
		把复杂的事情,简单化(对我们来说简单了,但是对完成这件事情的人,还是很复杂)
		
		我们从执行者,变成了指挥者.
		
	
	例子:
		如何把大象装进冰箱
			打开冰箱
			把大象放进冰箱
			关闭冰箱
			
			面向过程去理解,强调的是动作
		
		通过面向对象去理解:
			冰箱打开
			冰箱放入大象
			冰箱关闭
		
			强调的是:冰箱(对象)
		
		Scanner 类 --> 通过这个类创建出来的对象 
		
		
2.类和对象之间的关系
	我们学习编程语言，其实就是为了把现实世界的事物模拟出来，实现信息化。
	
	我们是如何表示现实世界的事物的呢?
			A:属性	就是事物的描述信息(名词)
			B:行为	就是事物能够做什么(动词)
			举例： 学生
			
	
	Java语言最基本的单位是类，所以，我们在后面的学习过程中，是通过类来体现现实世界事物的。
	
	类：是一组相关的属性和行为的集合
	对象：就是该事物的具体体现
			举例：
				类		学生
				对象	班长		
		
		
3.类的定义
	类的定义：
			类是用来描述现实世界的事物的
	
	事物：
			属性	事物的描述信息
			行为	事物能够做什么
	
	类是如何和事物进行对应的呢?
			类：
				成员变量
				成员方法
	
	需求：写一个学生类
	
	学生事物：
			属性：姓名，年龄...
			行为：学习，吃饭...
	
	学生类：
			成员变量：姓名,年龄
			成员方法：学习,吃饭
	
	成员变量：和我们前面学习过的变量的定义是一样的。
			位置不同：类中，方法外
			初始化值：不需要给初始化值
	成员方法：和我们前面学习过的方法的定义是一样的。
			去掉static关键字		
		
		
5.类的使用
	Student是一个学生事物描述类，main方法不适合放在它里面。
	
	使用一个类，其实就是使用该类的成员。(成员变量和成员方法)
	而我们要想使用一个类的成员，就必须首先拥有该类的对象。
	我们如何拥有一个类的对象呢?
			创建对象就可以了?
	我们如何创建对象呢?
			格式：类名 对象名 = new 类名();
	对象如何访问成员呢?
			成员变量：对象名.变量名
			成员方法：对象名.方法名(...)
		
		
6.成员变量和局部变量的区别：
 	A:在类中的位置不同
 		成员变量：类中，方法外
 		局部变量：方法中或者方法声明上(形式参数)
 	B:在内存中的位置不同
 		成员变量：堆内存
 		局部变量：栈内存
 	C:生命周期不同
 		成员变量：随着对象的创建而存在，随着对象的消失而消失
 		局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 	D:初始化值的问题
 		成员变量：有默认值
 		局部变量：没有默认值。必须先定义，赋值，最后使用		
	
7.private关键字
	私有的
	
	a.是一个权限修饰符
	
	b.可以修饰成员(成员变量,成员方法)
	
	c.被private修饰的成员,只能在本类中访问.
		
	私有成员变量,其实就是为了保证数据的安全.
	
	我们去定义一个描述某种事物的类,作用就是用来封装数据的.
		
	如果我们把成员变量私有化,我们需要提供两个方法来操作数据:
		获取数据:
			提供一个方法,该方法是有返回值的,返回值的类型和数据本身是相同的
		
		设置数据
			提供一个方法,该方法是有参数的,参数的数据类型和成员变量的数据类型是一致的.
		
		
8.封装:
	面向对象的三大特征: 封装,继承和多态
		
	什么是封装:
		把不需要对外界公开的内容,隐藏起来.
		
	原理:
		把不需要对外界公开的内容,隐藏起来.提供两个功能的访问方式.
		
	好处:
		提高代码的安全性
		提高代码的复用性
		
		
9.this关键字
	
	每个类中都有一个this,this代表的是通过该类所产生的对象的引用(地址值).
	
	简单理解:谁来调用我,我就代表谁.
		
	this:代表所在类的对象引用
			方法被哪个对象调用，this就代表那个对象
	
	使用场景：
			局部变量隐藏成员变量	
			
10.构造方法
	构造方法是不是方法 --> 是方法  --> 就符合方法的某些特点
	
	定义格式:
		权限修饰符(public) 类名(){}

	构造方法的作用:
		一个是为了,创建对象使用.
		为了,对成员变量进行初始化.
		
	如果调用构造方法:
		通过new关键字调用构造方法.其实就是创建对象.
		
	构造方法的注意事项：
		A:如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法供我们使用。
		B:如果我们给出了构造方法，系统将不在提供默认的无参构造方法供我们使用。
			这个时候，如果我们想使用无参构造方法，就必须自己提供。
			推荐：自己给无参构造方法
		C:构造方法也是可以重载的
	
	成员变量赋值：
		A:setXxx()方法
		B:带参构造方法	
		
		使用set方法赋值,是不改变其对象本身的地址值的.
		使用构造方法赋值,会新产生一个对象.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		