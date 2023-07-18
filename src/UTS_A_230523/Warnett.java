/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A_230523;

/**
 *
 * @author Lenovo
 */
public class Warnett {
    private String kodePelanggan;
    private String namaPelanggan;
    private String jenisPelanggan;
    private int jamMasuk;
    private int jamKeluar;
    private int tarif;
    private int total;

    public Warnett(String kodePelanggan, String namaPelanggan, String jenisPelanggan, int jamMasuk, int jamKeluar) {
        this.kodePelanggan = kodePelanggan;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.tarif = (jenisPelanggan.equals("vip")) ? 10000 : 15000;
        this.total = hitungTotal();
    }

    public int lamaJam() {
        return jamKeluar - jamMasuk; 
    }

    public int hitungTotal() {
        int lama = lamaJam();
        return lama * tarif;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public int getJamKeluar() {
        return jamKeluar;
    }

    public int getTarif() {
        return tarif;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        // Membuat objek warnet
        Warnett pelanggan1 = new Warnett("014", "Aditya", "vip", 10, 15);

        // Mengakses atribut-atribut
        System.out.println("Kode Pelanggan: " + pelanggan1.getKodePelanggan());
        System.out.println("Nama Pelanggan: " + pelanggan1.getNamaPelanggan());
        System.out.println("Jenis Pelanggan: " + pelanggan1.getJenisPelanggan());
        System.out.println("Jam Masuk: " + pelanggan1.getJamMasuk());
        System.out.println("Jam Keluar: " + pelanggan1.getJamKeluar());
        System.out.println("Tarif: " + pelanggan1.getTarif());
        System.out.println("Total Biaya: " + pelanggan1.getTotal());
    }
}

   