class Operations{
    int add(int a, int b){
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        Operations op = new Operations();

        System.out.println("Addition of Integers 5 and 7 : " + op.add(5, 7));
        System.out.println("Addition of double 5.0 and 7.0 : " + op.add(5, 7));
        System.out.println("Addition of String \"Hello\" and \" World\" : " + op.add("Hello", "World"));
    }
}
