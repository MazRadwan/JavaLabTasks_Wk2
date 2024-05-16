package JavaLabTasks_Wk2;
public class Rectangle{
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
    }

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
     //getter
     public float getLength(){
         return length;
     }
     //setter
     public void setWidth(float width){
        this.width = width;
     }
     public double getArea(){
         return length * width;
     }
     public double getPerimeter(){
        return 2 * (length + width);
     }

     public String toString(){
        return "Rectangle[length=" + length + ", width=" + width + "]";
     }
}