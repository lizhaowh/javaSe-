1.集合
	集合是容器.
	
	作用:让我们存储数据使用的.
	
	数组也是一个容器,但是数组的长度不可变(一个数组当创建完成之后,其长度就是固定的).
	
	集合的长度是可变的.
	
2.我们学习集合,学习的是什么?
	如何存储元素
	
	如何获取元素
	
	如何修改元素
	
	如何删除元素
	
3.我们要使用集合来存储元素
	第一步:我们需要创建一个集合对象
		ArrayList<String> list = new ArrayList<String>();
		
	ArrayList<E>:
  		大小可变数组的实现
	
4.泛型
	什么是泛型:
		就是用来确定集合中存储的数据类型.
		泛型只能是引用数据类型.
		可以把泛型理解为一个标签,贴在容器(集合),表示该容器存储的到底是什么类型的数据.
	
5.ArrayList集合
	添加功能:
		boolean add(E e);//向集合中添加指定的元素.
		void add(int index,E e);//在指定的索引出添加(插入)元素.
		
	获取元素
		public E get(int index):返回指定索引处的元素
			
	集合长度
		public int size():返回集合中的元素的个数
			
	删除元素
		public boolean remove(Object o):删除指定的元素，返回删除是否成功
		public E remove(int index):删除指定索引处的元素，返回被删除的元素
			
	修改元素
		public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
		
	
6.如果你看到,打印一个对象的引用,打印的不是地址值,而是元素值.那么该类中有toString()方法	
	
	
7.集合中存储元素
	存储字符串类型 --> 因为String是java给我们提供的.
	
	存储自定义对象 --> 我们需要提供一个类,
	
	
	
	
	
	
	
	
	
	
	
	