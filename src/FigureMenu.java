import factory.FigureFactory;
import service.FigureService;

import java.util.Scanner;

public class FigureMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la generadora de Figuras");
        System.out.println("Inserta el tipo de figura a generar");
        String tipoFigura=scanner.nextLine();
        try{
            FigureService figureService = FigureFactory.crearFigura(tipoFigura,scanner);
            System.out.println("El area del " + tipoFigura +" es " + figureService.calcularArea());
            System.out.println("El perimetro del " + tipoFigura +" es " + figureService.calcularPerimetro());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}