import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bb = selectFootMenuListByType();
		System.out.println(bb.size());
		 
	}

	public static List<String> selectFootMenuListByType() {
		List<String> aa = new ArrayList<String>();
		
		for(int i=0;i<5;i++){
			aa.add("1");
		}
		return aa;
	}
	
}
