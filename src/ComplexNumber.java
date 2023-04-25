class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(String complexString) {
        String[] parts = complexString.split("[+i]");
        this.real = Double.parseDouble(parts[0]);
        this.imaginary = Double.parseDouble(parts[1]);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real, this.imaginary + num.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber num) {
        return new ComplexNumber(this.real - num.real, this.imaginary - num.imaginary);
    }


    @Override
    public String toString() {
        return "(" + this.real + " + " + this.imaginary + ")";
    }
}