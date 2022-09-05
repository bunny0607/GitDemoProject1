
public class PrintDuplicateWord {
	public static void main(String[] args) {
		String s ="Fear leads to anger Anger. leads to hatred Hatred. leads to conflict Conflict leads to suffering";
		s = s.replace(".", "");
		String[] s1 =s.toLowerCase().split(" ");
		
		System.out.println("Duplicate words in a given string : ");
		for(int i=0; i<s1.length; i++) {
			int count = 1;
			for(int j=i+1; j<s1.length; j++) {
				if(s1[i].equals(s1[j])) {
					count++;
					 //Set s1[j] to 0 to avoid printing visited word
					s1[j]="0";
				}
			}
			
			if(count>1 && s1[i]!="0") {
				System.out.println(s1[i]);
				System.out.println("count >> " +count);
			}
		}
	}

}
