public class variable {
    public static void main(String[] args) {
        /* Variable
         * adalah tempat menyimpan data. pada java kita harus menentukan tipe data yang ingin digunakan.
         * Pada java, tipe data yang sudah ditentukan/dibuat tidak bisa di rubah.
         * 
         * Ketentuan membuat Variable :
         * 1. nama variable tidak boleh ada SPASI 
         * 2. nama variable tidak boleh angka semua 
         * 3. Best Practice membuat nama variable adalah menggunakan camelcase, Contoh (namaAwal, namaTengah, tanggalLahir)
         */

         String firstName = "Faiz";
         String lastName = "Ivan Dharmawan";
         int Age = 58;
         Boolean married = true;

         System.out.println("Your First Name : " + firstName);
         System.out.println("Your age : " + Age);
         System.out.println("Your married status : " + married);


        // Membuat variable menggunakan Variable lain 
        String fullName = firstName + "" + lastName;
        System.out.println(fullName);
        
        /* Catatan : saat membuat variable baru dengan menggunakan data variable lain seluruhnya
        yang terjadi sebenernya adalah data dari variable yang sudah ada, di duplikasi, dan variable tersebut tetap independen dan tidak saling terpengaruh.
        */

        String name1 = " Ivan";
        String name2 = name1;
        
        name1 = "Faiz";
        
        System.out.println(name1 + name2);

        // Penulisan variable menggunakan kata kunci Var 
        /*
         * Pada Java versi 10 keatas mendukungitg penggunaan kata kunci Var, Java akan otomatis mendeteksi tipe datanya sesuai dgn data yang dimasukan.
         * penggunaan kata kunci var HARUS langsung dengan data nya. 
         */
        
         var firstName = "Eko";
         var lastName = "Kurniawan";
         var completeName = firstName + " " + lastName;
         
         var value = 1000; // int
         var amount = 1000000L; // long


        // Final Variable
        /*
         * digunakan untuk membuat variable yang bersifat constant atau tetap dan nilai/data nya tidak bisa di ubah lagi.
         * seperti const pada javascript 
         */
        
         final var namaSiswa = "Faiz";
         namaSiswa = "Dayong"; // akan error karena data dari variable namaSiswa sudah di deklarasikan
        }
}
