import java.util.*;
public class hello{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			String test = s.nextLine();
			if("start".equalsIgnore(test)){
				System.out.println(getnum());
			}else{
				System.out.println("没有该指令！");
			}
		}
	}
	public static int getnum(){
		Random rm = new Random();
		return rm.nextInt(6) + 1;
	}
}
