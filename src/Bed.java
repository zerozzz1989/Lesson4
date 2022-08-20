public class Bed {
    int width;
    int height;
    String material;

    public Bed() {
        this(100, 200, "Wood");
    }

    public Bed(int width, int height, String material) {
        this.width = width;
        this.height = height;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "width=" + width +
                ", height=" + height +
                ", material='" + material + '\'' +
                '}';
    }
}
