package day1;

import java.util.Scanner;

public class text5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please select one finger1 2 3");
		 Scanner scanner=new Scanner(System.in);
		 int select=scanner.nextInt();
		 switch(select){
		 case 1:System.out.print("增加1个学生");break;
		 case 2:System.out.print("显示所有学生");break;
		 case 3:System.out.print("退出程序");break;
		 }
	}

}
