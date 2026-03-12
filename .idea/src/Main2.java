public class Main2 {
    public static void main(String[] args) {


        PaintJob stue = new PaintJob("Stue");

        stue.addSurface(new Rectangle(4.0, 2.5), "Væg nord");
        stue.addSurface(new Rectangle(4.0, 2.5), "Væg syd");
        stue.addSurface(new Rectangle(4.0, 5.0), "Loft");

        stue.addDeduction(new Rectangle(1.0, 2.1), "Dør");
        stue.addDeduction(new Circle(0.4), "Rundt vindue");
        stue.printSummary();

        System.out.println();
        System.out.println("---");
        System.out.println();

    }
}