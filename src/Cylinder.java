
public class Cylinder extends Shape3D{
   private int radius, height;
   
   public Cylinder() {
      this(1,1);
      
   }
   
   public Cylinder(int radius, int height) {
      super();
      setRadius(radius).setHeight(height);   
  }
   
   //TODO incloud getters for radius and height
   public int getRadius() {
      return radius;
   }
   public int getHeight() {
      return height;
   }
   
   public Cylinder setRadius(int radius) {
      //TODO check throw exception <=0
      if (radius <= 0)
         throw new IllegalArgumentException("Invalid radius: " + radius);
      this.radius = radius;
      return this;
   }
   
   public Cylinder setHeight(int height) {
      //TODO check throw exception <=0 
      if (height <= 0)
         throw new IllegalArgumentException("Invalid height: " + height);
      this.height = height;
      return this;
   }
   
   public Cylinder setColor ( Color color) {
      super.setColor(color);
      return this;
   }
   
   @Override
   public double volume() {
      // TODO Auto-generated method stub
      // pi * r^2 * h
      
      return Math.PI* Math.pow(radius, 2)*height;
   }

   @Override // surface area
   public double area() {
      // TODO Auto-generated method stub
      //Use formula 
      // 2 pi r h+ 2 pi r^2
      return 2 * Math.PI* radius * height +2 * Math.PI* Math.pow(radius, 2);
   }

   @Override
    public void draw(char ch) {
       int diameter = 2 * (int) radius;
       int spaces;

       // Draw upper half circle
       for (int i = 0; i < radius; i++) {
           spaces = (int) (Math.sqrt(radius * radius - (radius - i) * (radius - i)));
           for (int j = 0; j < diameter; j++) {
               if (j < diameter / 2 - spaces || j > diameter / 2 + spaces) {
                   System.out.print(" ");
               } else {
                   System.out.print(ch);
               }
           }
           System.out.println();
       }

       // Draw body
       for (int i = 0; i <= height ; i++) {
           for (int j = 1; j <= diameter + 1 ; j++) {
               System.out.print(ch);
           }
           System.out.println();
       }
       
       // Draw bottom half circle
       for (int i = radius - 1; i >= 0; i--) {
           spaces = (int) (Math.sqrt(radius * radius - (radius - i) * (radius - i)));
           for (int j = 0; j < diameter; j++) {
               if (j < diameter / 2 - spaces || j > diameter / 2 + spaces) {
                   System.out.print(" ");
               } else {
                   System.out.print(ch);
               }
           }
           System.out.println();
       }
   }
  
   
   public String toString() {
      return "Cylinder{" + "radius: " + radius + ", height: " + height + ", color='" + super.getColor() + '\'' + '}';
  }
   
   public boolean equals(Object o) {
      //TODO
      //Check radius and height
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Cylinder cylinder = (Cylinder) o;

          return Double.compare(cylinder.radius, radius) == 0 &&
                 Double.compare(cylinder.height, height) == 0;
      }
   
   public int hashCode() {
      int result = 1;
      result = 31 * result + radius;
      result = 31 * result + height;
      return result;
   }  
}