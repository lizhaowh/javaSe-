	
快捷键:

	alt + shfit + s --> c 无参构造
	alt + shfit + s --> o 有参构造
	alt + shfit + s --> r getters AND setters
	
1.Scanner类
	获取字符串:
		String next();
		String nextLine();
		
	next()方法和nextLine()方法区别:
		都可以获取一个字符串.
		
		获取键盘录入数据,需要结束(要告诉方法什么时候结束,当我们点击回车键的时候就代表结束了(\r\n))
		
		next()方法遇到一个tab键和\r\n都代表结束.但是它不获取tab和\r\n的数据.
		
		nextLine()方法可以将这一行中所有的数据都获取到,包括tab键和\r\n

2.String:字符串类,常量
  		由多个字符组成的一串数据  --> 其实就是使用字符串成的串
  		字符串其本质是一个字符数组
  
  构造方法：把其它类型的数据转换成字符串
  		String(String original):把字符串数据封装成字符串对象
  		String(char[] value):把字符数组的数据封装成字符串对象
  		String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
  
  注意：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。		
		
3.常量分类:常量在程序运行过程中,其值是不可以发生改变的值
	字符常量
	字符串常量
	整数常量
	小数常量
	布尔常量
	空常量
	
	常量池:位置在方法区中
			为什么把常量池规划在方法区中?
			方法区的作用:是公共的部分,共有的区域.
	
	我们可以使用final来修饰变量,该变量就会变成常量,会把这个常量的值存在常量池中.
	
	
	
	通过构造方法创建的字符串对象和直接赋值方式创建的字符串对象有什么区别呢?
			通过构造方法创建字符串对象是在堆内存。
			直接赋值方式创建对象是在方法区的常量池。

	==:
		基本数据类型：比较的是基本数据类型的值是否相同
		引用数据类型：比较的是引用数据类型的地址值是否相同	


4. String类的判断功能：

	Object:是类层次结构中的根类，所有的类都直接或者间接的继承自该类。
	如果一个方法的形式参数是Object，那么这里我们就可以传递它的任意的子类对象。

	  boolean equals(Object obj):比较字符串的内容是否相同(必须掌握)
	  boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
	  boolean startsWith(String str):判断字符串对象是否以指定的str开头
	  boolean endsWith(String str):判断字符串对象是否以指定的str结尾(掌握)


5.String类的获取功能：
	int length():获取字符串的长度，其实也就是字符个数(必须要掌握)
		在字符串中获取长度是length()方法;
		在数组中获取长度是length属性;
	
	char charAt(int index):获取指定索引处的字符(掌握)
	int indexOf(String str):获取str在字符串对象中第一次出现的索引(掌握)
	String substring(int start):从start开始截取字符串
	String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end(包头不包尾)(掌握)
		截取获取的是一个新的字符串,并不印象其原来字符串
		

6.String类的转换功能：
  char[] toCharArray():把字符串转换为字符数组(必须要掌握)
  		把字符数组转换为字符串--> String的构造方法 new String(char[] chs);
  
  String toLowerCase():把字符串转换为小写字符串
  String toUpperCase():把字符串转换为大写字符串(掌握)
	在转换的时候,只能对英文字符操作
	
  字符串的遍历：
  		A:length()加上charAt()
  		B:把字符串转换为字符数组，然后遍历数组	
	
7.其他功能
	去除字符串两端空格	
		String trim()
		
	按照指定符号分割字符串	
		String[] split(String str)
	
	
8. StringBuilder:是一个可变的字符串。字符串缓冲区类。

	String和StringBuilder的区别：
		String的内容是固定的。因为String是常量
		StringBuilder的内容是可变的。	
	
9.构造方法：
		StringBuilder()
	
	成员方法：
		public int capacity():返回当前容量(初始容量16字符)
		
		public int length():返回长度（字符数）


10.StringBuilder的成员方法
	添加功能
   		public StringBuilder append(任意类型):添加数据，并返回自身对象
    反转功能
   		public StringBuilder reverse()
		
11.StringBuilder和String的相互转换
	
	StringBuilder -- String
			public String toString():通过toString()就可以实现把StringBuilder转成String
	
	String -- StringBuilder
			StringBuilder(String str):通过构造方法就可以实现把String转成StringBuilder
			使用StringBuilder类中的添加方法(append),把字符串添加到StringBuilder对象中.		
		
		
		
		
		
		
		
		
		
		
		
		


		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
总结:
	String类
		是一个不可变的字符序列
		每一个字符串都是Stirng对象"abc"
		字符串有是一个常量
		
		构造:
			String s = new String(String s);
				把字符串转换成字符串
			String s = new String(char[] arr);
				把指定的字符数组转换成字符串对象.
			String s = new String(char[] arr,int index,int count);
				把指定的字符数组,通过指定的索引index开始(包括index索引对应的元素),转count个
				
		判断功能:返回的都是boolean类型的
			boolean equals(String s);
				判断的是,两个字符串的内容是否相同(和地址值没有关系).区分大小写
			
			boolean equalsIgnoreCase(String s);
				判断的是,两个字符串的内容是否相同(和地址值没有关系).不区分大小写
				
			boolean startsWith(String s);
				判断是否以指定的字符串开头
			
			boolean endsWith(String s);
				判断是否以指定的字符串结尾
				
		获取功能:
			int length();
				获取的是字符串的长度,其实就是字符串中字符的个数
				
			char charAt(int index);
				根据指定的索引,获取该索引对应的字符.
				
			String substring(int index);
				截取某个字符串,以index开始(包括index索引对应的元素)一直到字符串末尾.
				
				返回的是一个新的字符串,和原来字符串没有关系
				
			String substring(int startIndex,int endIndex);
				截取某个字符串,以startIndex开始(包括startIndex索引对应的元素)一直到endIndex对应的字符结束(不包括endIndex索引对应的元素).
				
				
		转换功能:
			char[] toCharArray();
				把指定的字符串转换为字符数组
				
			String toLowerCase();
				把指定的字符串转换为小写(只能转英文字母)
			
			String toUpperCase();
				把指定的字符串转换为大写(只能转英文字母)
				
		去除空格:
			String trim();
				去除的是字符串两端的空格
				
		切割的方法:
			String[] split(String s);
			
			把指定的字符串以某种格式进行切割,返回的是一个Stirng[]
			
		
	
	StringBuilder类
		是一个可变的字符序列(操作的也是字符串)

		构造:
			StringBuilder sb = new StringBuilder();
				创建一个新的StringBuilder,空的
				
			StringBuilder sb = new StringBuilder(String s);
				创建一个新的StringBuilder,会把s字符串转换成sb对象
			
		
		获取的方法
			int length();
				获取长度的,其实获取的也是字符的个数
				
			int capacity();获取的容量值(初始值,默认值是16)
			
		添加的方法
			StringBuilder append(任何类型的数据);
			
		反转的方法
			StringBuilder reverse();
			
		把StringBuilder转换成字符串:
			String toString();
			
			
			
			
			
			
			
			
			
			
		
