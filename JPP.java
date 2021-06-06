/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
public class JPP {
    //mendefinisikan variabel

    private String Admin;
    int harga1;
    int harga2;
    int total;
    String Barang;
    String Nama;
    String Berat;
    String Alamat;
    String Pesan;
    String No_HP;
    String Jenis_Barang;

    //menerapkan method Display
    public void Display() {
        System.out.println(" <<< Selamat Datang Di JPP >>> ");
        System.out.println("- - (Jasa Pengiriman Paket) - -");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("<< Daftar Tarif Ongkir JPP >>");
        System.out.println("Berat < 5kg = Rp.10.000");
        System.out.println("Berat > 5kg = Rp.15.000");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("<< Daftar Tarif Jenis Barang JPP >>");
        System.out.println("Electronik = Rp.30.000");
        System.out.println("Pecah Belah = Rp.25.000");
        System.out.println("Selain itu = 20.000");
        System.out.println("____________________________________");
    }

    //menerapkan method setAdmin
    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    //menerapkan method getAdmin
    public String getAdmin() {
        return Admin;
    }
}
