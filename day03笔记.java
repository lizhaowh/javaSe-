1.流程控制语句
	顺序流程控制语句
		
		从上至下,依次执行;
		从左至右,依次执行;
	
	选择流程控制语句
	
		1.if语句
			第一种格式:
				if(关系表达式){ //判断的是一种情况
					语句体;
				}
				
				执行流程:
					如果关系表达式返回的是true,则执行语句体;否则不执行
					
					if所控制的就是他所包含的语句;
					
			第二种格式:
				if(关系表达式){ //判断的是二种情况
					语句体1;
				}else{
					语句体2;
				}
				
				执行流程:
					如果关系表达式返回的是true,则执行语句体1;
					如果关系表达式返回的是false,则执行语句体2;
					
			第三种格式:
				if(关系表达式1){ //判断的是多种情况
					语句体1;
				}else if(关系表达式2){
					语句体2;
				}
				...
				else if(关系表达式n){
					语句体n;
				}else{
					语句体n+1;
				}
					
				执行流程:
					如果关系表达式1返回为true,则执行语句体1;
					如果关系表达式2返回为true,则执行语句体2;
					如果关系表达式n返回为true,则执行语句体n;
					如果上面的条件都不满足,则执行语句体n+1;
				
				
				如果if语句有多少的判断条件,只会被执行一次;
				
				int a = 10;
				int b = 20;
				int c = 30;
				int d = 40;
				int temp = a;
				if(b > temp){
					temp = b;
				}
				if(c > temp){
					temp = c;
				}
				if(d > temp){
					temp = d;
				}
				
				int max = temp;
				
		2.switch语句
		
			switch语句格式：
			  switch(表达式) {
			  		case 值1:
			  			语句体1;
			  			break;
			  		case 值2:
			  			语句体2;
			  			break;
			  		...
			  		default:
			  			语句体n+1;
			  			break;
			  }
			  格式解释：
			  		表达式:byte,short,int,char
			  			JDK5以后可以是枚举
			  			JDK7以后可以是字符串
			  		case:就是要和表达式进行比较的值
			  		break:表示中断,结束的意思。
			  		default:表示所有的情况都不匹配的时候，就执行语句体n+1。和if语句的else相似。
			  执行流程：
			  		A:计算出表达式的值
			  		B:拿计算出来的值和case后面的值依次比较，一旦有对应的值，就执行该处的语句，在执行过程中，遇到 break，就结束。
			  		C:如果所有的case都不匹配，就会执行default控制的语句，然后结束。
					
					
					
			case穿透:
				当我们成功匹配一个case值后,然后我们执行完成该case下的语句,并没有中断(break)的时候,会直接执行下面的
				case后的语句体,并不再进行匹配.
				
		什么时候使用if,什么时候使用switch?
			如果我们判断的是一个范围,使用if.
			
			如果我们判断的是某几个值(这些值是有数量的,一般情况不会很多),使用switch
			
		
	循环流程控制语句
		我们为什么要使用循环(在什么情况下使用循环):
			我们需要反复的执行,同一块代码的时候.简化了我们对代码的书写.
	
		1.for
			格式:
				for(初始化值;判断条件语句;控制循环语句){
					循环体;
				}
				
			执行流程：
				A:执行初始化语句:只会被执行一次
				B:执行判断条件语句，看结果是true还是false
					如果是true，就继续执行
					如果是false，就结束循环
				C:执行循环体语句
				D:执行控制条件语句
				E:回到B继续
			
		2.while
			格式:
				基本格式:
					while(判断条件语句){
						循环体;
					}
					
				扩展的:
					初始化语句;
					while(判断条件语句){
						循环体;
						控制循环语句;
					}
		
		3.do...while
	
		 do...while循环的基本格式：
		  		do {
		  			循环体语句;
		  		}while(判断条件语句);
		  扩展格式：
		  		初始化语句;
		  		do {
		  			循环体语句;
		  			控制条件语句;
		  		}while(判断条件语句);
		  执行流程：
		  		A:执行初始化语句;
		  		B:执行循环体语句;
		  		C:执行控制条件语句;
		  		D:执行判断条件语句，看是true还是false
		  			如果是true，回到B继续
		  			如果是false，就结束
	
	
2.三种循环的区别：
		A:do...while至少执行一次循环体
		B:for,while循环先判断条件是否成立，然后决定是否执行循环体
	
	for和while的小区别：
			for循环的初始化变量，在循环结束后，不可以被访问。而while循环的初始化变量，是可以被继续使用的。
			如果初始化变量，后面还要继续访问，就使用while，否则，推荐使用for。
			
		一般情况下,当我们已经有确定的循环次数的时候使用for.
				当我们不知道循环次数的时候使用while
	
	循环的使用推荐：
			for -- while -- do...while	
	
	
3.跳转语句
	break :中断的意思
		使用场景:
			switch语句中
			循环中
			
		作用:
			结束switch语句
			结束循环体
	
	continue:继续的意思
		使用场景:
			只能在循环中
		
		作用:
			在循环中,结束本次循环,进行下一次循环.
			
			continue 代码之前的是执行的,之后的代码才不执行.
	
	
	
	
	
	