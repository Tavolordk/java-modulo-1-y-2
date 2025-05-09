package serviceImpl;

import service.FigureService;

public class RectanguloServiceImpl implements FigureService {
    private double largo=0;
    private double ancho=0;

    private RectanguloServiceImpl(double largo, double ancho) {
        this.largo=largo;
        this.ancho=ancho;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    public static class Builder{
        private double largo=0;
        private double ancho=0;

        public Builder largo(double largo){
            this.largo=largo;
            return this;
        }

        public Builder ancho(double ancho){
            this.ancho=ancho;
            return this;
        }

        public RectanguloServiceImpl build(){
            return new RectanguloServiceImpl(largo,ancho);
        }
    }
}
