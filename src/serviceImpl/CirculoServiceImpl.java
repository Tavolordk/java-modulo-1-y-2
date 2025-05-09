package serviceImpl;

import service.FigureService;

public class CirculoServiceImpl implements FigureService{
    private double radio =0;
    private double diametro=0;
    private static final double PI=3.1416;
    private CirculoServiceImpl(double radio, double diametro) {
        this.radio=radio;
        this.diametro=diametro;
    }

    @Override
    public double calcularArea() {
        return PI*this.radio*this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return PI*this.diametro;
    }

    public static class Builder {
        private double radio =0;
        private double diametro=0;

        public Builder radio(double radio) {
            this.radio = radio;
            return this;
        }

        public Builder diametro(double diametro) {
            this.diametro = diametro;
            return this;
        }

        public CirculoServiceImpl build() {
            return new CirculoServiceImpl(radio, diametro);
        }
    }
}
