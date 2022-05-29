public class Main {
    public static void main(String[] args) {
        shapes triangle1 = new triangle(15,20,5,12,13);
        System.out.println("Area of the triangle is : "+triangle1.areaofshape());
        System.out.println("Perimeter of the triangle is : "+triangle1.perimeterofthisshape());
        shapes rectangle1 =new rectangle(20,30);
        System.out.println("Area of the rectangle is : "+rectangle1.areaofshape());
        System.out.println("Perimeter of the rectangle is : "+rectangle1.perimeterofthisshape());
shapes squre1 = new squre(20);
        System.out.println("Area of the square is :" + squre1.areaofshape());
        System.out.println("Perimeter  of the square is :" + squre1.perimeterofthisshape());
        shapes pentagon1 = new pentagon(43,43);

        System.out.println("Area of the pentagon is : "+pentagon1.areaofshape());


    }
}