public class WhileTest {
 public static void main(String[] args){
		boolean t = true;
		boolean f = false;
		while(f){
    		System.out.println("絶対に表示されない文");
		}
		int i = 0;
		while(i < 30){
    		System.out.println(i);
            i++;
		}
		System.out.println("------------------------------");
		i = 0;
		while(t){
    		System.out.print(i+"/");
            i++;
		}
    	System.out.println("絶対に表示されない文");
	}
}
