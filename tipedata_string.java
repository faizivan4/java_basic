public class tipedata_string {
    public static void main(String[] args) {
        // String adalah tipe data yang berisikan kumpulan kosong atau lebih karakter/ String adalah text

        String firstName = "Faiz ";
        String lastName = "Ivan Dharmawan";

        System.out.println(firstName);
        System.out.println(lastName);

        // Menggabungkan String
        // Cara menggabungkan string adalah dengan tanda plus (+)
        // CONTOH :
        System.out.println(firstName + lastName);


        // Escape Sequence (Karakter khusus)
        // Escape sequence/karakter khusus seperti ENTER, TAB, kutip dua, dll.
        // yang tersedia di Java : 
        // ENTER = \n
        // TAB = \t 
        // ' = \'
        // \ = \


        // String Text Block 
        /*
         adalah fitur pada Java yang berguna untuk membuat String dengan multiline sekaligus.
         cara nya dengan menggunakan kutip dua 3x (""") pada awal dan akhir data string/kalimat
         contoh :
         */
        String cerita = """
                \n \nNama saya faiz ivan dharmawan, saya mempunyai mimpi besar untuk memiliki perusahaan 
                teknologi yang dapat membantu orang banyak dalam menyelesaikan masalah sehari-hari mereka dengan bantuan teknologi.
                saya belum tau ide apa yang akan saya jalankan tetapi saya yakin dan percaya suatu saat nanti saya dapat mewujudkannya.
                saya mempunyai prinsip hidup, bekerjalah dalam diam, biarlah kesuksesan mu menggema setelahnya 
                
                        """;

                System.out.println(cerita);
    }
}


// soure :
// https://www.programmerzamannow.com/pemrograman/java/dasar/tipe-data-string