package Handle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text {//

	public static void filenane(){
		File mac = new File("E:\\MENTA.txt");//读取e盘的文件
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入要统计次数的字：");
		String word=scanner.next();
		try {
			Student student = new Student();//调用
			Scanner scanner1 = new Scanner(System.in);//实例化学生
			//请输入姓名，性别，学号，年龄，班级，专业;
			System.out.print("姓名：");
			student.name = scanner1.next();
			System.out.print("性别：\n");
			student.sex = scanner1.next();
			System.out.print("年龄：\n");
			student.age = scanner1.next();
			System.out.print("学号：\n");
			student.number = scanner1.next();
			System.out.print("班级：\n");
			student.grade = scanner1.next();
			System.out.print("专业：\n");
			student.major = scanner1.next();
			System.out.print("课程名称：\n");
			student.courseName = scanner1.next();
			System.out.print("上课地点：\n");
			student.locationOfClass = scanner1.next();
			System.out.print("上课时间：\n");
			student.schoolTime = scanner1.next();
			System.out.print("授课教师：\n");
			student.lectureTeacher = scanner1.next();
			
			
			
//			student.major = scanner.next();//文本
			System.out.println(student.toString());
			FileReader source = new FileReader(mac);//获取输入流
			FileWriter target  = new FileWriter("E:\\MENTB.txt");//指定输出流的目的地
			int d=(int)mac.length();//获取文件的长度
			char[] w = new char[d];//放到char数组里   //使用FileReader方法，调用.write方法将学生的基本信息进行输出。
			source.read(w);//读取数组的内容
			int x=0;//数组下标读取从零开始
			target.write(student.toString());
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
			
				
		} catch (FileNotFoundException fnfe) {//有异常就抛出异常
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
		public static int Get(String s,String k){//自定义一个get方法，实现统计了古诗中某个字或词出现的次数
			  int i, j, count = 0;
			  int len1 = s.length(); 
			  int len2 = k.length(); 
			  for(i=0; i<len1-len2; i++){
			   for(j=0; j<len2; j++){ 
			    if(k.charAt(j) != s.charAt(j + i)){
			     break;
			    }
			   }
			   if(j>=k.length()){
			    count++;
			   }
			  }
			  return count;
			  }

	}
		
	
	


