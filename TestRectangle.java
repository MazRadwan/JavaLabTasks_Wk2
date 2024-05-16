public class TestRectangle {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(5.0f, 3.0f);
        Rectangle rect2 = new Rectangle(4.0f, 2.0f);

        // caluate and display
        System.out.println(rect1.toString());
        System.out.println("Area is " + rect1.getArea());
        System.out.println("Perimeter is " + rect1.getPerimeter());

        System.out.println(rect2.toString());
        System.out.println("Area is " + rect2.getArea());
        System.out.println("Perimeter is " + rect2.getPerimeter());
    }
    
    
}
