package Test;

public class Maxi {
	
	public String maxLength(String[] a) {
		int max = 0;
		String maxStr = "";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max) {
				max = a[i].length();
				maxStr = a[i];
			}
		}
		return maxStr.toUpperCase();
	}

}
