day01 - day10

day01:
	1.java的语言平台
		javaSE:标准版
		javaME:嵌入式,小型版
		javaEE:企业版
	
	2.jre,jvm,jdk
		jdk:开发工具包,包含了 jre,jvm 
		jre:java的运行环境, 包含了jvm和核心类库
		jvm:java的虚拟机
		
	3.java跨平台原理
		平台:操作系统
		
		是因为,在不同的操作系统中,都有对应的jvm
		
	4.Dos命令
		打开命令窗口: win + r --> cmd
		切换盘符 --> 盘符 :
		显示当前目录下的所有的文件,以及文件夹 --> dir
		进入下以及目录 --> cd
		返回上以及目录 --> cd..
		返回根目录 --> cd\(cd/)
		清屏:cls
		退出: exit
		
	5.常量:在程序运行过程中,其值不可方生改变的值
		分类:
			字符串常量 "fsdf"
			字符常量
			整数常量  10;
			小数常量
			布尔常量
			空常量
		
	6.变量:在程序执行过程中,在一定范围之内,可以发生改变的值
	
	7.如何定义一个变量
		数据类型 变量名 = 初始值;
		
	8.数据类型
		java是一种强类型语言,给每一种数据都规定了一种数据类型.
		
		分类:
			基本数据类型(4类8种):
				整数
					byte	1   -128到127
					short	2
					int 	4
					long	8
				浮点
					float	4
					double	8
				
				字符 
					char	2	0 到 65535
				
				布尔
					boolean 1
					
			引用数据类型:数组,类,接口
			
			整数默认的是int,如果想定义一个long类型的数据,需要在数据后加L
			浮点默认的是double,如果想定义给float类型的数据,需要在数据后加F
				
				
	9.标识符
		就是给类,方法,变量等起名字的符号
		
		组成规则:
			字符(英文大小写字符,数字字符,汉字字符(不推荐))
			下划线_
			美元符号$
		
		命名规则:要见名知意
			方法,变量:
				如果是一个单词,小写
				如果是多个单词,第一个单词小写,从第二个单词开始首字符大小
				
			类,接口
				如果是一个单词,首字母大写
				如果是多个单词,每个首字母大写
				
			包:
				所有的都小写.
				一般是一个公司的域名倒置.多包使用.来分隔
				
	
	10.关键字
		被java赋予特有含义的单词
		class,int,long,public,void,return,false,true,break,continue
		
	11.数据类型的转换
		隐式转换:
			把小的数据类型直接转换为大的数据类型
			
		强制转换:
			把大的数据类型转换为小的数据类型
			格式:
			目标数据类型 变量名 = 目标数据类型(值);
		
	12.注释
		对我们写的代码进行解释说明的文字.这些文字不被java编译
		
		分类:
			单行注释
				//
			多行注释:
				/* 内容 */
			
			文档注释:
				/** 内容 */
		
		
		
day02:
	1.eclipse的使用
	
	2.运算符
		运算符:是常量和变量参与运算的符号
		表达式:由常量或者变量组成的符合java语法的式子.一个单独的变量或者常量也是一个表达式
		
		算术运算符
			+,-,*,/,%,++,--
		
		赋值运算符
			=,+=,*=,-=,/=,%=
		
		关系运算符
			>,>=,<,<=,!=,==
		
		逻辑运算符
			&,|,!,^
			&&,||
		
		三元运算符
			格式:
			(关系表达式) ? 表达式1 : 表达式2;
	
	3.键盘录入
		三个步骤:
			导包:import java.util.Scanner;
			创建对象
				Scanner sc = new Scanner(System.in);
			获取数据
				int a = sc.nextInt();
				String line = sc.next();
				String line = sc.nextLine();
		
		
day03:
	流程控制语句:
		顺序结构
			我们写的代码是从上至下,从左至右执行
		
		判断结构
			if
				1.if(关系表达式){}
				
				2.
					if(关系表达式){
						表达式1;
					}else{
						表达式2;
					}
					
				3. 
					if(关系表达式1){
						表达式1;
					}else if(关系表达式2){
						表达式2;
					}
					...
					else{
						表达式n + 1;
					}
			
			switch:
				格式:
					switch(表达式){
						case 值1:
							语句体1;
							break;
						case 值2:
							语句体2;
							break;
						...
						default:
							语句体n + 1;
							break;
					}
		
		循环结构
			1.for循环
				格式
					for(初始化语句;条件判断语句;控制循环语句){
						循环体;
					}
		
			2.while循环
				格式:
					while(条件判断语句){
						循环体;
					}
					
					初始化语句;
					while(条件判断语句){
						循环体;
						控制循环语句;
					}
					
			3.do...while 
				格式:
					do{
						循环体;
					}while(条件判断语句);
		
		
					初始化语句;
					do{
						循环体;
						控制循环语句;
					}while(条件判断语句);
		
		break关键字:中断的意思
			使用场景:
				switch,循环.
				
		continue关键字:继续
			只能在循环中使用:结束本次循环,进入下次循环.
			
day04:数组
	1.随机数:Random 
		导包: import java.util.Random;
		
		创建对象:
			Random r = new Random();
			
		获取随机数:
			int a = r.nextInt(int n);//获取的数据是 [0,n)
			
		获取1到100之间的数[1,100];
			int value = r.nextInt(100) + 1;
		
	2.数组
		一维数组
			定义格式:int[] arr;
			
			动态初始化:确定的数组的长度
				数据类型[] 数组名 = new 数据类型[长度];
				
				int[] arr = new int[3];
			
			静态初始化:
				数据类型[] 数组名 = {值1,值2,值3...};
				
				int[] arr = {1,2,3};
		
		
		二维数组
			动态初始化:确定的数组的长度
			数据类型[][] 数组名 = new 数据类型[m][n];//m确定的是二维数组中一维数组的格式,n:一维数组中的元素个数
			静态初始化:
				数据类型[] 数组名 = {{值1,值2,值3...},{值1,值2,值3...},{值1,值2,值3...}...};
		
	3.内存分布
		栈 --> 和方法(局部)
		
		堆 --> new出来的对象
		
		方法区 --> 字节码文件,常量
		
		本地方法区
		
		寄存器
		
	
	
day05:方法	
	1.如何定义一个方法
		修饰符 返回值类型 方法名(参数列表){
			方法体;
			return 返回值;
		}
		
		带返回值的方法:
		
		public static int getNum(int num){
			return num;
		}
		
		不带返回值的方法:
		public static void print(int num){
			for(int i = 0; i < num; i++){
				System.out.println(i);
			}
		}
		
		
	2.方法调用:
		有返回值的方法:
			单独调用
			
			赋值调用(推荐)
			
			输出调用
			
		没有返回值的方法:
			只能单独调用
		
		
	3.方法的重载
		在同一个类中:
			方法名相同,参数列表不同,和返回值类型无关.
			
			参数列表不同:
				数据类型不同
				参数的个数不同
				
				
		
day06:练习		

day07:面向对象
	1.面向对象 
		面向过程:
			完成一件事情的步骤,强调的是过程.
			
		面向对象:
			强调的是对象.
			
		面向对象和面向对象是思考解决问题的思路.
		
	2.类和对象
		类是对事物的描述(属性和行为).
			类是属性和行为的一个集合.
		
		对象:是类的具体体现.
		
	3.面向对象的特点
		符合我们思考习惯的思想
		
		把复杂的事情简单化
		
		把我们从执行者变成了指挥者
		
	4.面向对象的三大特征
		封装
		继承
		多态
	
	5.封装
		把不需要对外界公开的属性隐藏起来.并对其提供公开的访问方式.
		
		好处:
			提高代码的复用性
			提高代码的安全性
			
	6.private关键字
		可以修饰成员(成员变量和成员方法)
		
		private是封装的一种方式.使用private关键字可以完成封装.
		
	7.构造方法
		格式:
			修饰符 类名(){}
			
		构造方法是没有返回值类型的,连void也没有
		
		构造方法是可以重载的.
		
		构造方法的作用:
			对成员变量进行初始化
			
			提供我们创建(构建)对象
		
		如果我们没有给出任何的构造方法,系统会默认给出一个无参构造
		
		如果我们给出了任何一个构造,系统将不会再给出构造.
		
		建议:
			当我们在定义的时候,给出无参构造,再给出有参构造.
		
	8.this关键字
		this代表有当前类所参数对象的引用.谁来调用我,我就代表谁.
		
		使用场景:
			区分成员变量和局部变量重名的问题.
			
	9.成员变量和局部变量的区别:
		定义的位置不同:
			成员变量:
				在类中,方法外
			局部变量:
				方法中,或者在方法的声明上
				
		在内存中的外置不同:
			成员变量: 堆
			
			局部变量: 栈
			
		生命周期不同:
			成员变量:
				随着对象的创建而产生,随着对象的消失而消失
				
			局部变量:
				随着方法的调用而产生,随着方法的消失而消失
				
		初始化值不同:
			成员变量:
				有默认的初始化值.
				
			局部变量:
				没有默认的初始化值,在我们使用的时候必须要给一个初始值.
				
		
		
	我们对面向对象的操作:
		定义一个类:
			把成员变量私有化
			提供公共的访问方式: getXxx(),setXxx();
			提供无参构造
			提供有参构造.
			其他的成员方法
			
	
day08:
	1.String类
		字符串是一个不可改变的字符序列.
		
		构造:
			String s = new String(String s);
			
			String s = new String(char[] arr);
			
			String s = new Stirng(char[] arr,int index,int count);
			
		判断功能:
			boolean equals(String s);
			boolean equalsIgnoreCase(String s);
			boolean startsWith(Stirng s);
			boolean endsWith(String s);
			
		获取功能:
			int length();
			int indexOf(String s);
			char charAt(int index);
			String substring(int startIndex);
			String substring(int startIndex,int endIndex);
			
		转换功能:
			char[] toCharArray();
			String toLowerCase();
			String toUpperCase();
			
		去除两端空格:
			String trim();
			
		切割字符串:
			String[] split(String s);
				
	2.StringBuilder类
		是可变的字符序列.
		构造:
			StringBuilder sb = new StringBuilder();
			
			StringBuilder sb = new StringBuilder(String s);
			
		成员方法:
			StringBuilder append(任意类型);
			StringBuilder reverse();
			int length();
			
			
		转换功能:
			String  -- StringBuilder 转换
			
			String  --> StringBuilder :
				StringBuilder sb = new StringBuilder(String s);
				sb.append(String s);
				
			StringBuilder --> String :
				StringBuilder中的toString();
				String中的构造也可以: new String(StringBuilder sb);
				
			
day09:
	1.对象数组
		数组中存储的是对象.
		
	2.集合
		集合是一个容器.
		
		ArrayList集合是一个可以变数组.
		
		构造:
			ArrayList<Object> list = new ArrayList<Object>();
		
		添加:
			boolean add(Object obj);
			void add(int index,Object obj);
			
		修改:
			Object set(int index,Object obj);
			
		删除:
			boolean remove(Object obj);
			Object remove(int index);
			
		获取:
			Object get(int index);
			int size();
		
	3.泛型:
		用来确定集合中存储的数据类型.
		
		泛型只能是引用数据类型.
		
	4.什么时候使用集合	
		如果一个容器中,已经确定了要存储元素的个数,而且数量不改变.使用数组.
		
		添加的元素个数不确定. 
		
		集合就是用来存储数据的.
		
	
day10:IO流
	1.IO流作用:
		使用操作数据的.
		
		读和写.
		
	2.IO流的分类:
		输入流:读 
			FileReader("文件路径");
				int read(); //返回的是读取的字符,把该字符转换成int类型
				int	read(char[] arr);//返回的是读取到有效的字符个数.
			
				是把换行符也读出来了.
				
			BufferedReader(new FileReader("文件路径"));
				String readLine();//不读换行符
			
		输出流:写
			FileWriter("文件路径")
				write(String s);
				write(String s,int index,int count);
				write(int ch);
				write(char[] arr);
				write(char[] arr,int index,int count);
			
			BufferedWriter(new FileWriter("文件路径"));
				newLine();//就是根据系统来确定给什么换行符.
		
	3.数据源和数据目的
		数据源:
			文件 
			键盘录入
			集合 
			数组	

		数据目的:
			文件 
			集合 
			控制台
			
	4.如果我们在读和写的时候,操作的是同一个文件.
		我们保证要不所有的数据读出来.可以先存放到一个容器中(集合);
		在集合中操作数据
		写入到文件中
		
	5.我们的流使用完成之后必须要关闭,释放资源.
		
	6.flush和close方法的区别
		
		
		
		
		
		
		
		
		
		