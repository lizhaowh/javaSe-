day07:
	面向对象:强调的对象
	
	面向过程:强调的是过程
	
	面向对象和面向过程,只是完成某件事情的思路不同而已.
		
	面向对象三个特点:
		是更加符合我们思考习惯的思想
		
		把复杂的事情简单化
		
		我们从执行者变成了指挥者
		
	面向对象的三大特征:
		封装
		继承
		多态
		
	封装:
		把不需要对外界公开的信息,隐藏起来.同时提供getXxx()方法和setXxx()方法 
		
	如何进行封装?
		使用private关键字,就能过达到封装的效果
		
	this关键字:
		this代表当前类产生对象的引用,谁来调用我,我就代表谁.
		
	this使用场景:
		区分成员变量和局部变量重名.
		
	成员变量和局部变量的区别?
		定义位置不同:
			成员变量:类中,方法外
			局部变量:在方法中,或者方法的声明上
			
		在内存中的位置不同:
			成员变量: 堆
			局部变量: 栈
		
		声明周期不同:
			成员变量:随着对象的创建而产生,随着对象的消失而消失
			局部变量:随着方法的调用而产生,随着方法使用完毕而消失
			
		初始值不同:
			成员变量:有默认值的,不需要手动给出值.
				int --> 0
				double --> 0.0
				float --> 0.0
				boolean --> false
				char --> '\u0000'
				引用数据类型 --> null
				
			局部变量:没有默认值,在使用之前,必须要给出一个初始值
			
			
	如何定义一个标准类:
		成员变量 
		空参构造
		根据成员变量产生的带参构造
		getXxx()和setXxx()方法 
		其他成员方法
		
	如何使用定义好的标准类:
		在测试类中,创建该类的对象,传入属性值即可.
		传值的时候有两种方式:
			构造
			通过setXxx方法
			
	构造方法:
		作用:用来给成员变量进行初始化值的.
			 可以通过构造创建对象.
		
		
		
day08:Scanner类,String类,StringBuilder类
	Scanner类:
		nextInt():获取整数的(int类型)
		next():获取字符串
		nextLine():获取字符串
	
	String类:
		构造:
			把一个字符串对象,转换为字符串对象:
				String s = new String(String s);
			把字符数组转换为字符串对象:
				String s = new String(char[] chs);
			
			把字符数组中的一部分转换为字符串
				String s = new String(char[] chs,int index,int count);
		
		判断功能:
			判断字符串内容是否相同,区分大小写
				boolean equals(String s);
				
			判断字符串内容是否相同,但是不区分大小写
				boolean equalsIgnoreCase(String s);
				
			判断字符串是否以什么开头?
				boolean startsWith(String s);
			
			判断字符串是否以什么结尾?
				boolean endsWith(String s);
				
		获取功能:
			获取字符串的长度,获取字符串中字符的个数:
				int length();
			
			获取指定索引位置上的字符:
				char charAt(int index);
			
			获取字符串中的一部分(从指定的索引开始,到字符串某尾结束):
				String substring(int index);
			
			获取字符串中的一部分(从指定的索引开始,到指定的索引结束(但是包头不包尾))
				String substring(int startIndex,int endIndex);
	
			获取指定字符串在大字符串中第一次出现的索引外置:
				int indexOf(String s);
				
		
		转换功能:
			把字符串转换为字符数组:
				char[] toCharArray();
				
			把字符串转换为大写:
				String toUpperCase();
				
			把字符串转换为小写:
				String toLowerCase();
				
		去除字符串两端空格的功能:
			String trim();
			
		以某种字符串进行切割:
			String[] split(String s);
			
		
	StringBuilder类:
		构造:
			StringBuilder sb = new StringBuilder();
			
			StringBuilder sb = new StringBuilder(String s);
			
		添加方法:
			StringBuilder append(任意类型的数据);
			
		反转的功能:
			StringBuilder reverse();
			
		获取长度:
			length();
			
		转换功能:
			把StringBuilder转换为String
				调用StringBuilder中的toString()方法 
				
				
			把String 转换为StringBuilder
				StringBuilder sb = new StringBuilder(String s);
				
				append(String s);
		
	
day09集合
	
	对象数组:
		该数组中存储的元素是对象.
		
		类名[] 数组名 = new 类名[长度];//存储的元素是有该类所产生的对象.
		
	
	集合:ArrayList
		是一个长度可变的数组. 底层就是数组.
		
		构造:
			ArrayList<Object> list = new ArrayList<Object>();
	
		成员方法:
			添加:
				boolean add(Object obj);
				void add(int index,Object obj);
	
			修改:
				Object set(int index,Object obj);//返回的是被修改的元素
				
			删除:
				boolean remove(Object obj);//指定元素删除
				Object remove(int index);//指定索引删除元素,返回的是被删除的元素
	
			获取:
				Object get(int index);//根据指定的索引获取元素
				int size();//获取集合中的元素个数
	
	
	
	
	
day10: IO流

	1.IO流的分类:
		输入流(收入)
			FileReader 
			
		输出流(支出)
			FileWriter 
	
	
	2. 输出流(是写数据的)FileWriter 
		在我们电脑中,只有两个东西: 文件,和文件夹
		在我们电脑中,存储的是:二进制 --> 字节 --> 字符(两个字节)
		
		第一步:
			创建文件输出流对象,并关联文件路径
			FileWriter fw = new FileWriter("文件路径");//属性文件路径的使用;需要使用\\
				//异常: 目前只需要抛就可以,目前抛的都是IOException
				/*
					文件路径不存在:
						系统会自动创建出来一个空的文件(会根据你写的文件类型来创建不同的文件)
						
					如果文件存在:
						会将该文件内容清空
				*/
				
		第二步:写内容
			需要调用FileWriter中的写的方法write
			可以写入一个字符串:
			fw.write(String s);
			//写的时候,并没有直接写入到文件中,而是写入到了缓冲(内存中,就是一个字符数组);
			
		第三步:如何把在缓冲中的内容,写入的文件
			//在内存中的东西,我们需要刷新出来
			fw.flush();
			
		第四步:我们的流是和本地资源进行关联的
			fw.close();
			
			
	3.路径的问题
		相对路径:
			相对于项目而言
		
		绝对路径:
			从根盘符开始的路径
		
		
	4.flush方法和close方法的区别
		flush():实时刷新
			刷新:把缓冲中的数据,刷新到文件中. 刷新之后还可以继续使用该流操作数据
			
		close():
			关闭流,释放资源. 在关闭之前会有刷新的动作. 当流被关闭之后就不能再使用.
			
			如果缓冲中的数据已经满了,会自动刷出到文件中.
		
		
	5.写出的方法
	  void write(String str):写一个字符串数据
	  void write(String str,int index,int len):写一个字符串中的一部分数据
	  void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
	  void write(char[] chs):写一个字符数组数据
	  void write(char[] chs,int index,int len):写一个字符数组的一部分数据
		 
	6.如何实现数据的换行?
		\n可以实现换行，但是windows系统自带的记事本打开并没有换行，这是为什么呢?因为windows识别的换行不是\n，而是\r\n
		windows:\r\n
		linux:\n
		mac:\r
			
	7.如何实现数据的追加写入?
			FileWriter(String fileName, boolean append);
			如果追加append--> true,默认false不追加
		
		
	8.文件输入流:FileReader 
		第一步:创建文件输入流对象,并关联文件 
			FileReader fr = new FileReader("文件路径");//该文件必须要存在.如果不存在会报错(文件找不到异常)
			
		第二步:读数据(一次读一个字符)
			int fr.read(); //一次读取一个字符,并且把回车换行符也读到了
		
		
	9.缓冲流
		BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
  		BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
		
	10.缓冲流的特殊功能：
		BufferedWriter
				void newLine():写一个换行符，这个换行符由系统决定
		BufferedReader
				String readLine():一次读取一行数据，但是不读取换行符	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		