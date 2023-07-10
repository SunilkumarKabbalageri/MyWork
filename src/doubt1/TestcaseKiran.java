package doubt1;

public class TestcaseKiran {
	public static void main(String[] args) {
		long no = 9880127431L;
		int k = 0;
		String s1 = no + "";
		// int sum = 0;
		String m1 = "ok";
		//System.out.println(m1);
		while (no != 0) {
			int sum = 0;
			for (int i = k; i < s1.length(); i++) {
				int x = (int) s1.charAt(i) - 48;
				sum = sum + x;
				if (sum % 2 == 0) {
					m1 = m1 + sum;
					k = i + 1;
					break;
				} else if (sum % 2 == 1) {
					m1 = m1 + sum;
					k=i+1;
					break;
				}

			}
			
		}
//		System.out.println(m1);

	}

}
