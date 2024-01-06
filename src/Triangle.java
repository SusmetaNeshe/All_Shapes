
public class Triangle extends Shape2D {
   private int width;
 
   public Triangle () {
      this(1);
   }
   
   public Triangle (int width) {
      super();
      this.setWidth(width);
   }
   
   //TODO
   public int getWidth() {
      return width;
   }
   
   public Triangle setColor(Color color) {
      super.setColor(color);
      return this;
   }
   
   public String toString() {
      return "Triangle: {color:" + super.getColor() + ", width: " + width + "}";
   }
   
   public boolean equals (Object o) {
      if ( o!= null) {
         if(o instanceof Triangle) {
            Triangle other = (Triangle) o;
            if (this.width == other.width)
               return true;
         }
      }
      return false;
   }
   
   
   public int hashCode() {
      int result = 1;
      result = 31 * result + width;
      return result;
   }
     
   public Triangle setWidth (int width) {
      if (width <= 0)
         throw new IllegalArgumentException("Invalid width: " + width);
      this.width = width;
      return this;    
   }
   
   @Override
   public double perimeter() {
      // TODO Auto-generated method stub
         return 3* width;
   }

   @Override
   public double area() {
      // TODO Auto-generated method stub
      return (width * width) / 2.0;

   }

   @Override
   public void draw(char ch) {
      for (int i = 1; i <= width; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(ch);
          }
          System.out.println();
      }
  }
   public static void main(String [] args) {
      Shape shape = new Triangle();
      Triangle triangle = (Triangle) shape;
      triangle.setColor(Color.BLUE);
      System.out.print(shape);
   }
}