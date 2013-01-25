   public interface FigureGeometry
   {
     double PI = 3.14f;
   
     double perimeter();
     // Returns perimeter of this figure.
   
     double area();
     // Returns area of this figure.
      
     void setScale(int scale);
     // Scale of this figure is set to "scale".
      
     double weight();
     // Precondition: Scale of this figure has been set.
     //
     // Returns weight of this figure. Weight = area X scale.
   }
