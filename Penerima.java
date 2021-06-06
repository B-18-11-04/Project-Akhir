/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
public class Penerima extends JPP {

    //menerapkan method setNama
    public void setNama(String Nama) {
        super.Nama = Nama;
    }

    //menerapkan method getNama
    public String getNama() {
        return Nama;
    }
    //menerapkan method setNo_HP

    public void setNo_HP(String No_HP) {
        super.No_HP = No_HP;
    }

    //menerapkan method getNo_HP
    public String getNo_HP() {
        return No_HP;
    }

    public void setAlamat(String Alamat) {
        super.Alamat = Alamat;
    }

    //menerapkan method getAlamat
    public String getAlamat() {
        return Alamat;
    }

    //menerapkan method Display
    public void Display() {
        System.out.println("----------Data Penerima-----------");
    }
}
