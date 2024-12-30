import java.util.Scanner;

class Shape {
    int d1, d2, d3;

    Shape(int d1, int d2, int d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
}

class Box extends Shape {
    Box(int length, int breadth, int height) {
        super(length, breadth, height); 
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, h;

        System.out.println("Enter the dimensions for the box");
        System.out.print("Length: ");
        l = sc.nextInt();
        System.out.print("Breadth: ");
        b = sc.nextInt();
        System.out.print("Height: ");
        h = sc.nextInt();

        Box box = new Box(l, b, h);
        
        System.out.println("\nThe Entered dimensions for the box are as follows:");
        System.out.println("Length: " + box.d1);
        System.out.println("Breadth: " + box.d2);
        System.out.println("Height: " + box.d3);
        
        sc.close();
    }
}
