class Outer {
    String msg = "Outer msg";

    class Inner {
        String msg = "Inner msg";

    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        System.out.println(outer.msg);

        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.msg);
    }
}
