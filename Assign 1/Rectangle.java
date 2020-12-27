import java.util.Scanner; 
class Rectangle
{
  int length, breadth, perimeter, area;
  void getdata()
  {
    System.out.println("Enter the length and breadth of the rectangle : ");
    Scanner s = new Scanner(System.in);
    length = s.nextInt();
    breadth = s.nextInt();
  }

  void perimeter_rect()
  {
    perimeter = (2*length) + (2*breadth);
  }

  void area_rect()
  {
    area = length * breadth;
  }

  void display()
  {
    System.out.println("Perimeter : " + perimeter);
    System.out.println("Area : " + area);
  }

  public static void main(String[] args)
  {
    Rectangle r = new Rectangle();
    r.getdata();
    r.perimeter_rect();
    r.area_rect();
    r.display();
  }
}