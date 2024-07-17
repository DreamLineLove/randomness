class Cube {
    private int side_length;
    private int surface_area;
    private int volume;

    Cube() {
        side_length = 5;
        surface_area = side_length * side_length;
        volume = side_length * side_length * side_length; 
    }

    Cube(int s) {
        side_length = s;
        surface_area = side_length * side_length;
        volume = side_length * side_length * side_length; 
    }

    int GetSideLength() {
        return side_length;
    }

    int GetSurfaceArea() {
        return surface_area;
    }

    int GetVolume() {
        return volume;
    }
}
