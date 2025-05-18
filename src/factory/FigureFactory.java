package factory;

import service.FigureService;
import serviceImpl.CirculoServiceImpl;
import serviceImpl.CuadradoServiceImpl;
import serviceImpl.RectanguloServiceImpl;
import serviceImpl.TrianguloServiceImpl;

import java.util.Scanner;

public class FigureFactory {
    public static FigureService crearFigura(String tipo, Scanner scanner){
        switch (tipo.toLowerCase()){
            case "circulo":
                System.out.println("INSERTA EL RADIO");
                double radio=scanner.nextDouble();
                double diametro=radio*2;
                scanner.close();
                return new CirculoServiceImpl.Builder().diametro(diametro).radio(radio).build();
            case "cuadrado":
                System.out.println("INSERTA LADO");
                double lado =scanner.nextDouble();
                scanner.close();
                return new CuadradoServiceImpl.
                        Builder().
                        lado(lado).
                        build();
            case "rectangulo":
                System.out.println("INSERTA LARGO");
                double largo=scanner.nextDouble();
                System.out.println("INSERTA ANCHO");
                double ancho=scanner.nextDouble();
                scanner.close();
                return new RectanguloServiceImpl
                        .Builder().
                        largo(largo).
                        ancho(ancho).build();
            case "triangulo":
                System.out.println("INSERTA ALTURA");
                double altura=scanner.nextDouble();
                System.out.println("INSERTA BASE");
                double base=scanner.nextDouble();
                scanner.close();
                return new TrianguloServiceImpl.Builder().base(base).altura(altura).build();
            default:
                throw new IllegalArgumentException("Figura no soportada: " + tipo);
        }
    }
}
