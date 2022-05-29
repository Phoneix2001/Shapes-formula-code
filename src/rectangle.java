public class rectangle implements shapes {
    double length , width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double areaofshape() {
        double vv = length*width;
        return vv ;
    }

    @Override
    public double perimeterofthisshape() {
         double v = length + width;
        double ww = 2 *v;
        return ww;
    }
}
