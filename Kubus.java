public class Kubus {
    // Atribut
    private double sisi;
    private double volume;

    // Method untuk mengisi nilai sisi
    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }

    // Method untuk menghitung dan mengisi nilai volume
    public void computeAndSetVolume() {
        this.volume = sisi * sisi * sisi; // Volume kubus = sisi^3
    }

    // Method untuk mengambil (menampilkan) nilai volume
    public double getVolume() {
        return this.volume;
    }
}
