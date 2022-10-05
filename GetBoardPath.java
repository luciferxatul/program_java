package recursion2;
import java.util.ArrayList;

public class GetBoardPath {

	public static ArrayList<String> getBoardPath(int cv, int ev){
		
		if (cv == ev) {
			ArrayList<String> base = new ArrayList<String>();
			base.add("\n");
			return base;	
		}
		
		if (cv > ev) {
			ArrayList<String> base = new ArrayList<String>();
			return base;
		}
		ArrayList<String> ans = new ArrayList<String>(); 
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> smallAns = getBoardPath(cv + dice, ev);
			
			for (String val: smallAns) {
				ans.add(dice + val);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBoardPath(0, 10));

	}

}
