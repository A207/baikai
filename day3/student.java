package day3;

public class student {

	long xuehao;
	String name;
	String phonenumber;
	void introduction(){
		System.out.println("i am  "+name+"   xuehao is  "+xuehao+"   phonenumber is  "+phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student s=new student();
        s.name="baikai";
        s.xuehao=2012214252;
        s.phonenumber="15256058008";
        s.introduction();
       // System.out.println("—ß∫≈ «"+s.xuehao);
	}

}
