public class pentagon implements shapes{
    double a ,s;

    public pentagon(double a,double s) {
        this.a = a;
        this.s =s;
    }

    @Override
    public double areaofshape() {
       double ye = (5.0/2.0)*s*a;
        return ye;
    }

    @Override
    public double perimeterofthisshape() {
        double pp = 5*a;
        return pp;
    }
}
