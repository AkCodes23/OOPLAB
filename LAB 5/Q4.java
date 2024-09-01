class Complex {
    int real;
    int imaginary;

    Complex() {
        real = 0;
        imaginary = 0;
    }

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }
    
    Complex add(int value) {
        return new Complex(real + value, imaginary);
    }

    
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 7);
        Complex c2 = new Complex(3, 4);
        
        Complex result1 = c1.add(10);
        result1.display();
        
        Complex result2 = c1.add(c2);
        result2.display();
    }
}
