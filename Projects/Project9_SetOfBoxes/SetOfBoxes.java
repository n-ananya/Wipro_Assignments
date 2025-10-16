package Project9_SetOfBoxes;

import java.util.*;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Box)) return false;
        Box other = (Box) obj;
        // Compare based on volume (rounded to 2 decimals to handle floating-point issues)
        return Math.round(this.getVolume() * 100.0) == Math.round(other.getVolume() * 100.0);
    }

    @Override
    public int hashCode() {
        // Hash based on rounded volume
        return Objects.hash(Math.round(this.getVolume() * 100.0));
    }

    @Override
    public String toString() {
        return String.format("Length = %.1f Width = %.1f Height = %.1f Volume = %.2f",
                length, width, height, getVolume());
    }
}

public class SetOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxes = new LinkedHashSet<>(); // Keeps insertion order

        System.out.print("Enter the number of Box: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.print("Enter Length: ");
            double length = sc.nextDouble();
            System.out.print("Enter Width: ");
            double width = sc.nextDouble();
            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);
            boolean added = boxes.add(box);

            if (!added) {
                System.out.println("Box with same volume already exists. Skipping...\n");
            }
        }

        System.out.println("Unique Boxes in the Set are:");
        for (Box b : boxes) {
            System.out.println(b);
        }

        sc.close();
    }
}

