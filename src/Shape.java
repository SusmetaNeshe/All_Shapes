public abstract class Shape {
   private Color color;
   
   public void Shape() {
      color = color.RED;   
   }
   
   public void Shape (Color color) {
      this.color = color;      
   }
   
   public Color getColor() {
      return color;
   }
   
   public Shape setColor(Color color) {
      this.color = color;
      return this;
   }
   
   public abstract double area();
   
   public abstract void draw (char ch);
}
