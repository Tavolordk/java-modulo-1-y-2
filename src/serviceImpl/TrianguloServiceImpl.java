package serviceImpl;


import service.FigureService;

public class TrianguloServiceImpl implements FigureService {
    private double base=0;
    private double altura=0;

    private TrianguloServiceImpl(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public double calcularPerimetro() {
        return 2*base+2*altura;
    }

    public static class Builder{
        private double base=0;
        private double altura=0;
        public Builder base(double base){
            this.base=base;
            return this;
        }
        public Builder altura(double altura){
            this.altura=altura;
            return this;
        }
        public TrianguloServiceImpl build(){
            return new TrianguloServiceImpl(base,altura);
        }
    }
}
