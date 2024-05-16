public class TestRectangle {
    public static void main(String[] args) {
    
        Rectangle rect1 = new Rectangle(5.0f, 3.0f);
        Rectangle rect2 = new Rectangle(7.5f, 4.5f);

     
        System.out.println(rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println(rect2.toString());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}

