public class Square {
    private int size;  // the size of a side of the square

    public Square(int size){
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPerimeter() {
        return 4*size;
    }

    public int getArea(){
        return size*size;
    }

}
