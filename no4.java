
class User {
    public static void main(String[] args) {
        Cube one = new Cube(10);
        Cube two = new Cube(3);
        Cube three = new Cube(5);

        System.out.println("Cube " + one.GetSideLength() + " cm");
        System.out.println("Surface Area = " + one.GetSurfaceArea() + " cm squared");
        System.out.println("Volume = " + one.GetVolume() + " cm cubed");
        System.out.println();

        System.out.println("Cube " + two.GetSideLength() + " cm");
        System.out.println("Surface Area = " + two.GetSurfaceArea() + " cm squared");
        System.out.println("Volume = " + two.GetVolume() + " cm cubed");
        System.out.println();

        System.out.println("Cube " + three.GetSideLength() + " cm");
        System.out.println("Surface Area = " + three.GetSurfaceArea() + " cm squared");
        System.out.println("Volume = " + three.GetVolume() + " cm cubed");
        System.out.println();
    }
}
