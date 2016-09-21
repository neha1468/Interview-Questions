public class SamplePal {

	private String name = "ab12";

	public static void main(String[] args) {
		SamplePal a = new SamplePal();
		a.printName();
	}

	public int printName() {
		int operations = 0;
		char strName[] = this.name.toCharArray();
		int strLength = strName.length - 1;
		System.out.println("Start String : " + this.name);
		for (int i = 0; i < (strLength + 1) / 2; i++) {
			while (strName[i] != strName[strLength - i]) {
				if (strName[i] > strName[strLength - i]) {
					strName[strLength - i]++;
				} else {
					strName[strLength - i]--;
				}

				operations++;
			}
		}
		String test = new String(strName);
		System.out.println("Final String : " + test);
		System.out.println("Operations : " + operations);
		return operations;
	}
}
