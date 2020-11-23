##G计201 刘园园  2020322078

## StudentHomeworkProcessing

## 一.实验目的：
     (1). 掌握字符串String及其方法的使用
     (2). 掌握文件的读取/写入方法
     (3). 掌握异常处理结构
## 二.实验内容：
     在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
     文件A包括两部分内容：
       一是学生的基本信息；
       二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
         (1). 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
         (2). 允许提供输入参数，统计古诗中某个字或词出现的次数
         (3). 输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
         (4). 考虑操作中可能出现的异常，在程序中设计异常处理程序
## 三.实验要求：
      (1). 设计学生类（可利用之前的）；
      (2). 采用交互式方式实例化某学生；
      (3). 设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
## 四.实验过程：
      创建information,Student,Text三个类，满足以下要求：
     (1). 先创建一个学生类，定义有关学生的属性。定义了学生的姓名、性别、年龄、学号、班级、专业、课程名称、上课地点、上课时间、授课教师。
          设置set/get方法，使toString方法打印输出。创建有参和无参构造方法。
     (2). 在information中，自定义两个方法（filenane）（instantiation）。在测试类中实例化有关学生的属性。
     (3). 在测试类text中，
       ①. 使用information类中自定义的方法（instantiation），调用学生类中的参数，实例化对象，赋值。  
          输出学生的姓名、性别、年龄、学号、班级、专业、课程名称、上课地点，上课时间以及授课教师。
       ②. 使用information类中自定义的方法（filenane），文件字节输入，输出流方法使用字节数组读写数据，以字节为单位处理数据。  
       ③. 在try-catch语句中的try块部分创建输入流，在catch块部分检测如果有异常就处理异常。   
       ④. 先获取输入流，程序可以通过这个通道将程序中的数据写入到目的地（E盘）将输入的文本来源于文本文件B读取 。
          然后创建名为（E）的输出流,(FileWriter)流顺序的向文件写入内容,并把处理好的结果写入到文本文件A中,即只要不关闭流，
          每次调用write方法就顺序地向文件写入内容。最后通过调用close()方法，可以保证操作系统把流缓冲区的内容写到它的目的地，直到流被关闭。  
       ⑤. 使用FileReader方法，调用.write方法将学生的基本信息进行输出。  
       ⑥. 用for循环使j的初始值等于7，j求余2不等于零为奇数加上“，”，j求余2等于零为偶数加上“。”。   
       ⑦. 自定义一个get方法，实现了古诗中某个字或词出现的次数
## 五.核心代码：
```
      for(int j = 7;j<=238;j=j+7,x+=7) {//x=x+7
	if(j%2==0) {//==余数    j等于7，j小于字符长度的情况下，如果字符长度除以2余数等于0，
	for(int i=x;i<j;i++) {//数组遍历
		char c=w[i];
		target.write(c);//循环
}
		target.write("。\n");
		}else {
		for(int i=x;i<j;i++) {
		char c=w[i];
		target.write(c);
}
		target.write(",");
 }
}
	FileReader ss = new FileReader(mac);//获取输入流
		BufferedReader read=new BufferedReader(ss);//缓冲输入流
		String s = read.readLine(); //按行读取
		String k=word;			
		int num = Get(s, k);    
		System.out.println(k + " 字出现的次数是： " + num);
		source.close();
		target.close();//关闭结束循环
  }
	 }
	
```	
## 六.系统运行截图：
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/ZqDaDiccbgkhaTQicGw5jUDl2Qc6ibngZEeuiapJqmVian3nxK1Cib9NhNiavpsaQN8m8SPYy8gwWct7lQ/0)
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/ZqDaDiccbgkhaTQicGw5jUDl2Qc6ibngZEeuiapJqmVian3lSuE8ibKbzSYasVEbCpiciaa90KFZAzLECU4/0)
## 七.编程感想:
      通过本次实验掌握字符串String及其方法的使用，知道了然后获取输入流，掌握了异常处理语句的用法。

