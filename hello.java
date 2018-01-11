import java.util.*;
public class hello{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			String test = s.nextLine();
			if("start".equalsIgnoreCase(test)){
				System.out.println(getnum());
			}
			else if("stop".equalsIgnoreCase(test)){
				break;
			}
			else{
				System.out.println("Ã»ÓÐ¸ÃÖ¸Áî£¡");
			}
		}
	}
	//获取1-6之间的随机数
	public static int getnum(){
		Random rm = new Random();
		return rm.nextInt(6);
	}
}
