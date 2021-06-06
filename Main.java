/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pemanggilan class Toko
        // inisialisasi objek pada class JPP
        JPP struk = new JPP();
        // memanggil method Display pada class JPP
        struk.Display();
        // memanggil method setAdmin pada class JPP
        struk.setAdmin("Bashar Lentera Jihad Khawariq");
        // memanggil method getAdmin pada class JPP
        System.out.println("Admin : " + struk.getAdmin() + "      06/06/2021");
        System.out.println("=========================================");

        // pemanggilan class Pengirim
        // inisialisasi objek pada class Pengirim
        Pengirim sender = new Pengirim();
        // memanggil method Display pada class Pengirim
        sender.Display();

        // memanggil method setNama pada class Pengirim
        sender.setNama("Pramudya Aji Maulana");
        // memanggil method getNama pada class Pengirim
        System.out.println("Nama                    : " + sender.getNama());

        // memanggil method setNo_HP pada class Pengirim
        sender.setNo_HP("083151548387");
        // memanggil method getNo_HP pada class Pengirim
        System.out.println("No Telepon              : " + sender.getNo_HP());

        // memanggil method setAlamat pada class Pengirim
        sender.setAlamat("Jl Cempaka Putih no.4 Kras,Kediri");
        // memanggil method getAlamat pada class Pengirim
        System.out.println("Alamat                  : " + sender.getAlamat());

        // memanggil method setJenis_Barang pada class Pengirim
        sender.setJenis_Barang("Elektronik");
        // memanggil method getJenis_Barang pada class Pengirim
        System.out.println("Jenis Barang            : " + sender.getJenis_Barang());

        // memanggil method setBarang pada class Pengirim
        sender.setBarang("Kulkas Cosmos");
        // memanggil method getBarang pada class Pengirim
        System.out.println("Elektronik (berupa)     : " + sender.getBarang());

        // memanggil method setBerat pada class Pengirim
        sender.setBerat("20 Kg");
        // memanggil method getBerat pada class Pengirim
        System.out.println("Berat                   : " + sender.getBerat());

        // memanggil method setHarga1 pada class Pengirim
        sender.setHarga1(15000);
        // memanggil method getHarga1 pada class Pengirim
        System.out.println("Biaya Ongkir            : " + sender.getHarga1() + "( Berat > 5kg )");

        // memanggil method setHarga2 pada class Pengirim
        sender.setHarga2(30000);
        // memanggil method getHarga1 pada class Pengirim
        System.out.println("Tarif Jenis Barang      : " + sender.getHarga2() + "( Elektronik )");

        // memanggil method setHarga2 pada class Pengirim
        sender.setTotal(45000);
        // memanggil method getHarga1 pada class Pengirim
        System.out.println("Total                   : " + sender.getTotal());

        // pemanggilan class Penerima
        // inisialisasi objek pada class Penerima
        Penerima receiver = new Penerima();
        // memanggil method Display pada class Penerima
        receiver.Display();

        // memanggil method setNama pada class Penerima
        receiver.setNama("Bashar Lentera Jihad Khawariq");
        // memanggil method getNama pada class Penerima
        System.out.println("Nama                    : " + sender.getNama());

        // memanggil method setNo_HP pada class Penerima
        receiver.setNo_HP("081315453878");
        // memanggil method getNo_HP pada class Penerima
        System.out.println("No Telepon              : " + sender.getNo_HP());

        // memanggil method setAlamat pada class Penerima
        receiver.setAlamat("Jl Jagalan no.3 Ds.Dandong, Kec.Srengat, Kab.Blitar");
        // memanggil method getAlamat pada class Penerima
        System.out.println("Alamat                  : " + sender.getAlamat());

        //penutup
        System.out.println("================================================");
        System.out.println("               TERIMAKASIH                      ");
        System.out.println("                  TELAH                         ");
        System.out.println("          MENGGUNAKAN JASA KAMI                 ");
        System.out.println("================================================");
    }

}
