/**
 * tipedata_number
 */
public class tipedata_number {

    public static void main(String[] args) {
        // byte 
        // Tipe data number : byte memiliki Size 1 byte, dengan range angka (-128 sampai 127)
        
        byte iniByte = 100;

        // short
        // Tipe data number : short memiliki Size 2 byte, dengan range angka (-32,768 sampai 32,767)

        short iniShort = 1000;

        // int
        // Tipe data int : int memiliki Size 4 byte, dengan range angka (-2,147,483,648 sampai 2,147,483,647)
        
        int iniInt = 100000;

        // long 
        // Tipe data long : long memiliki Size 8 byte, dengan range angka (-9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807)
        
        long iniLong = 1000000000;

        // float 
        // float : adalah tipe data untuk menampung bilangan decimal/ bilangan koma.
        float iniFloat = 10.4f;

        // double 
        // double : adalah tipe data yang menampung bilangan decimal yang dapat menampung 15 - 16 angka di belakang koma.
        double iniDouble = 3.141592653589793d;


        // Number literals 
        // pada Java terdapat beberapa literals
        // Decimal : Basis bilangan 10, yang artinya adalah digit 0 sampai 9. (Default Literal pada Java)
        int iniDecimal = 10;
       
        // Hexadecimal : Basis 16, dimana digitnya adalah dari 0 sampai 9 dan A sampai F. Untuk membuat Hexadecimal wajib menambahkan 0x di awal angka. (Contoh : 0xFFFFFF)
        int iniHexa = 0xffffff;
        
        // Binary : Basis 2, dimana digitnya adalah 0 dan 1. Untuk membuatnya Binary wajib menambahkan 0b di awal. (Contoh : 0b10101010)
        int iniBinary = 0b101010;


        // Konversi Tipe Data Number
        // Java mendukung konversi tipe data number. misal kita ingin melakukan konversi dari tipe data long ke int, atau sebaliknya, berlaku juga untuk tipe data number lainnya.
        // Konversi tipe data number pada Java ada 2 : 
    
        // 1. Widening casting (Otomatis)
        // adalah kondisi dimana tipe data dengan daya tampung lebih kecil di konversi ke daya tampung yang lebih besar, dan konversi tersebut akan di lakukan secara otomatis. dengan urutan seperti berikut 
        // byte -> short -> int -> long -> float -> double
       

        // 2. Narrowing Casting (Manual)
        // adalah melakukan konversi number secara manual dengan cara menyebutkan tipe data secara jelas ketika ingin melakukan konversi.
        // CONTOH : 
        // int iniInt = 1000;
        // byte iniByte = (byte) iniInt;
        // short iniShort = (short) iniInt;

        // NOTE : Jika melakukan konversi Narrowing, ketika datanya melebihi kapasitas tipe data yang dituju, maka yang akan di tampilkan adalah nominal minimal dari tipe data number tersebut.
        // Misalnya ketika data int = 1000000 di konversi ke short maka yang di tampilkan adalah -32,768, karena nilai tersebut adalah nilai minimal dari short.

        short iniShort2 = 1000;
        byte iniByte2 = (byte) iniShort2;


        System.out.println("Berikut adalah tipe data Number pada Java :");
        System.out.println("Ini adalah tipe data number Byte : " + iniByte);
        System.out.println("Ini adalah tipe data number Short : " + iniShort);
        System.out.println("Ini adalah tipe data number Int : " + iniInt);
        System.out.println("Ini adalah tipe data number Long : " + iniLong);
        System.out.println("Ini adalah tipe data number Float : " + iniFloat);
        System.out.println("Ini adalah tipe data number Double : " + iniDouble);
        System.out.println("Ini adalah tipe data number Decimal : " + iniDecimal);
        System.out.println("Ini adalah tipe data number Hexadecimal : " + iniHexa);
        System.out.println("Ini adalah tipe data number Binary : " + iniBinary);
        System.out.println("Ini adalah hasil konversi tipe data Number Short ke Byte : " + iniByte2);



    }
}