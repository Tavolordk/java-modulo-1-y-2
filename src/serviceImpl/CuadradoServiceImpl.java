package serviceImpl;

import service.FigureService;

public class CuadradoServiceImpl implements FigureService {
    private double lado=0;

    private CuadradoServiceImpl(double lado) {
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*this.lado;
    }

    public static class Builder{
        private double lado=0;

        public Builder lado(double lado){
            this.lado=lado;
            return this;
        }

        public CuadradoServiceImpl build(){
            return new CuadradoServiceImpl(lado);
        }
    }
}
