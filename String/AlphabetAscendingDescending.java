package String;

public class AlphabetAscendingDescending {

	public static void main(String[] args) {
		String str = "kajal";
        char a[] = str.toCharArray();
        System.out.println("ascending orders:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
            System.out.println(" ");
            System.out.println(" descending order:");
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        char temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
                System.out.print(a[i] + " ");
            }
            


	}

}
