import java.util.ArrayList;


public class PaintJob {

    private String name;
    ArrayList<Shape> surfaces = new ArrayList<>();
    ArrayList<Shape> deductions = new ArrayList<>();

    private ArrayList<String> surfaceNames = new ArrayList<>();
    private ArrayList<String> deductionNames = new ArrayList<>();

    public PaintJob(String name) {
        this.name = name;
    }

    public void addSurface(Shape s, String label) {
        surfaces.add(s);
        surfaceNames.add(label);
    }


    public void addSurface(Shape s) {
        surfaces.add(s);
        surfaceNames.add(s.getDescription());
    }

    public void addDeduction(Shape s, String label) {
        deductions.add(s);
        deductionNames.add(label);
    }

    public void addDeduction(Shape s) {
        deductions.add(s);
        deductionNames.add(s.getDescription());
    }


    public double getTotalSurface() {
        double total = 0;
        for (Shape s : surfaces) {
            total += s.getArea();
        }
        return total;
    }

    public double getTotalDeductions() {
        double total = 0.0;
        for (int i = 0; i < deductions.size(); i++) {
            total = total + deductions.get(i).getArea();
        }
        return total;
    }

    public double getPaintableArea() {
        return getTotalSurface() - getTotalDeductions();
    }


    public void printSummary() {
        System.out.println("=== Malerberegner: " + name + " ===");
        System.out.println();

        System.out.println("Overflader:");
        for (int i = 0; i < surfaces.size(); i++) {
            String label = surfaceNames.get(i);
            String desc = surfaces.get(i).getDescription();
            double area = surfaces.get(i).getArea();
            // lidt padding så det ser pænt ud
            System.out.printf("  %-20s %-22s = %6.2f m²%n", label + ":", desc, area);
        }
        System.out.printf("  %-20s %-22s = %6.2f m²%n", "Total:", "", getTotalSurface());

        System.out.println();
        System.out.println("Fradrag:");
        for (int i = 0; i < deductions.size(); i++) {
            String label = deductionNames.get(i);
            String desc = deductions.get(i).getDescription();
            double area = deductions.get(i).getArea();
            System.out.printf("  %-20s %-22s = %6.2f m²%n", label + ":", desc, area);
        }
        System.out.printf("  %-20s %-22s = %6.2f m²%n", "Total:", "", getTotalDeductions());

        System.out.println();
        System.out.printf("Skal males: %.2f m²%n", getPaintableArea());
    }
}