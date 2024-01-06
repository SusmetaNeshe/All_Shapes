
public class Sphere extends Shape3D{
   
   private int radius;
   
   public Sphere() {
      this(1);
   }
   
   public Sphere(int radius) {
      super();
      setRadius(radius);
   }
   
   // getter for radius
   public int getRadius() {
      return radius;
   }
   
   public Sphere setRadius(int radius) {
      //TODO throw exception if <=o
      if (radius <= 0)
         throw new IllegalArgumentException("Invalid radius: " + radius);
      this.radius = radius;
      return this;
   }
   
   public Sphere setColor( Color color) {
      super.setColor(color);
      return this;
   }

   @Override
   public double volume() {
      // TODO Auto-generated method stub
      // 4/3 * pi * r^3
      return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
   }

   @Override
   public double area() {
      // TODO Auto-generated method stub
      // 4 * pi * r^2
      return 4.0 * Math.PI * Math.pow(radius, 2);
   }

   @Override
   public void draw(char ch) {
      // TODO Auto-generated method stub
      // just draw the circle with the given radius  
      int scaledRadius = (int) Math.ceil(radius);

      for (int i = -scaledRadius; i <= scaledRadius; i++) {
          for (int j = -scaledRadius; j <= scaledRadius; j++) {
              if (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(scaledRadius, 2)) {
                  System.out.print(ch);
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }
   
   public boolean equals (Object o) {
      //TODO 
      if ( o!= null) {
         if(o instanceof Sphere) {
            Sphere other = (Sphere) o;
            if (this.radius == other.radius)
               return true;
         }
      }
      return false;
   }
   
   public int hasCode() {
      int result = 1;
      result = 29 * result + radius;
      return result;
   }
   
   public String toString() {
      return "Sphere : { Color: " + super.getColor() + ", radius: " + radius + "}";              
   }
}