class Operations {
    int a;
    int b;
    double c;
    double d;
    String str1;
    String str2;

    Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Operations(double c, double d) {
        this.c = c;
        this.d = d;
    }

    Operations(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    int add(int a, int b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Operations opInt = new Operations(5, 7);
        Operations opDouble = new Operations(5.0, 7.0);
        Operations opString = new Operations("Hello", " World");

        System.out.println("Addition of Integers 5 and 7: " + opInt.add(opInt.a, opInt.b));
        System.out.println("Addition of Doubles 5.0 and 7.0: " + opDouble.add(opDouble.c, opDouble.d));
        System.out.println("Addition of Strings \"Hello\" and \" World\": " + opString.add(opString.str1, opString.str2));
    }
}
