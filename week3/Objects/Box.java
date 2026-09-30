package Box;
public class Box {

    public Box() {};

    private double length;
    private double width;

    public double getLength() {
        return length;
    }
    public double getWidth() {
      return width;
    }

    public void setWidth(double Nwidth) {
        width = Nwidth;
    }
    public void setLength(double Nlength) {
        length = Nlength;
    }

    @Override
    public String toString() {
        return "Box [length=" + this.length + ", width=" + this.width + "]";
    }
    
}