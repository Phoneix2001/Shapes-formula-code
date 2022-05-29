public class triangle implements shapes{
    int height,base;
int a ,b,c;

    public triangle(int height, int base, int a, int b, int c) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double areaofshape() {
       double cc =(height*base)/2;
        return cc;

    }

    @Override
    public double perimeterofthisshape() {
        double bb =(a+b+c);
        return bb;
    }
}
