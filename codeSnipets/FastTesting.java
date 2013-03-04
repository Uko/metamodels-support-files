public class FastTesting {
    public int spaceship(Object other) {
        if (this == other) {
            return 0;
        } else return 1;
    }

	public String customReturn(String item) {
		return item;
    }
	
    public void methodCall() {
		customReturn(super.toString());
		"sth".length();
    }

    public float middle(float a, float b) {
        float sum = a + b;
        return sum / 2;
    }

    public void lotsOfLiterals() {
        boolean bool = true;
        long longInteger = 659L;
        int hexInt = 0x4a;
        long octLongInt =056L;
        char character = 'j';
        float floatingPoint = 3f;
        double doublePrecision = 6.5E32d;
        String string = "verveine";
        Object nullPointer = null;
    }

    public void loops() {
        int i = 0;
        while (i<10) {
            i++;
        }

        for (int j = 1; j<=10; j+=2) {
            j--;
        }

        do {
            i=i-1;
        } while (i>0);
    }
    
    public void select(int candidate) {
    	switch (candidate) {
		case 1: System.out.print("1");
			break;
		case 2:
		default:
			break;
		}
    }

}
