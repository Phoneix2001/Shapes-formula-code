public class squre implements shapes{
    double a;

    @Override
    public double areaofshape() {
        double kk = a *a;
        return kk;
    }

    public squre(double a) {
        this.a = a;
    }

    @Override
    public double perimeterofthisshape() {
        double uu =4*a;
        return uu;
    }
}
