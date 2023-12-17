package com.dicoding.voyageeducation.data

object FakeData {
    val quizList: List<Quiz> = listOf(
        Quiz(
            id = 1,
           "Spasial",
            question = "Sebuah gambar terdiri dari empat kotak dengan pola yang unik di setiap kotak. Jika pola pada kotak pertama adalah A, kotak kedua adalah B, kotak ketiga adalah C, dan kotak keempat adalah D, pola mana yang akan muncul setelah D?",
            options = listOf("E", "F", "G", "H"),
            correctOption = "F"
        ),
        Quiz(
            id = 2,
            "Spasial",
            question = "Diberikan suatu gambar tiga dimensi dari sebuah kubus. Jika kubus tersebut dipotong dengan melintang secara horizontal, bagian mana yang akan terlihat pada bagian atas hasil potongan?",
            options = listOf("Permukaan atas kubus", "Permukaan bawah kubus", "Permukaan depan kubus", "Permukaan samping kubus"),
            correctOption = "Permukaan atas kubus"
        ),
        Quiz(
            id = 3,
            "Spasial",
            question = "Sebuah gambar menunjukkan susunan tangga yang terdiri dari beberapa anak tangga. Jika seseorang naik satu anak tangga, kemudian turun dua anak tangga, dan terakhir naik tiga anak tangga, pada anak tangga ke berapa orang tersebut berada?",
            options = listOf("Anak tangga pertama", "Anak tangga kedua", "Anak tangga ketiga", "Anak tangga keempat"),
            correctOption = "Anak tangga ketiga"
        ),
        Quiz(
            id = 4,
            "Spasial",
            question = "Jika sebuah objek dimulai dari titik A dan bergerak 3 langkah ke utara, 4 langkah ke timur, 2 langkah ke selatan, dan akhirnya 5 langkah ke barat, di mana posisi objek tersebut relatif terhadap titik awalnya?",
            options = listOf("Di utara titik awal", "Di selatan titik awal", "Di barat titik awal", "Di timur titik awal"),
            correctOption = "Di barat titik awal"
        ),
        Quiz(
            id = 5,
            "Spasial",
            question = "Diberikan sebuah gambar segitiga dengan sisi-sisi yang berbeda panjang. Jika sudut yang tumpul terletak di sisi yang paling panjang, sudut mana yang akan lebih besar dari 90 derajat?",
            options = listOf("Sudut di sisi paling pendek", "Sudut di sisi sedang", "Semua sudut sama besar", "Tidak ada sudut yang lebih besar dari 90 derajat"),
            correctOption = "Sudut di sisi paling pendek"
        ),
        Quiz(
            id = 6,
            "Linguistik",
            question = "Bagaimana Anda biasanya menyampaikan ide atau informasi dengan efektif kepada orang lain?",
            options = listOf("Melalui percakapan langsung.", "Dengan menulis dalam bentuk esai atau artikel.", "Menggunakan grafik dan gambar.", "Dengan memberikan presentasi lisan."),
            correctOption = "Dengan memberikan presentasi lisan."
        ),
        Quiz(
            id = 7,
            "Linguistik",
            question = "Apa yang biasanya Anda lakukan ketika menemui kata-kata baru yang tidak dikenal?",
            options = listOf("Mencari artinya dalam kamus.", "Mencoba menebak artinya berdasarkan konteks.", "Bertanya kepada orang lain.", "Mengabaikannya dan melanjutkan membaca."),
            correctOption = "Mencari artinya dalam kamus."
        ),
        Quiz(
            id = 8,
            "Linguistik",
            question = "Seorang penulis ingin menyampaikan ide kompleks tentang perubahan iklim kepada khalayak yang luas. Apa yang mungkin menjadi pendekatan yang paling efektif?",
            options = listOf("Menulis artikel ilmiah yang rinci.", "Menyajikan informasi melalui grafik dan visual.", "Menggunakan bahasa sederhana dan contoh konkret.", "Memberikan kuliah panjang secara langsung."),
            correctOption = "Menggunakan bahasa sederhana dan contoh konkret."
        ),
        Quiz(
            id = 9,
            "Linguistik",
            question = "Bagaimana Anda biasanya merespon ketika membaca ulasan buku atau film yang menarik perhatian banyak orang?",
            options = listOf("Segera membaca atau menontonnya.", "Menimbang berbagai pendapat sebelum membuat keputusan.", "Mencari informasi tambahan untuk memverifikasi ulasan tersebut.", "Tidak begitu tertarik dengan ulasan orang lain."),
            correctOption = "Menimbang berbagai pendapat sebelum membuat keputusan."
        ),
        Quiz(
            id = 10,
            "Linguistik",
            question = "Seorang pembicara umum ingin memastikan bahwa pesan mereka diterima dengan baik oleh audiens yang beragam. Apa yang sebaiknya mereka pertimbangkan?",
            options = listOf("Menggunakan berbagai jenis bahasa tubuh.", "Menggunakan kosakata yang rumit dan teknis.", "Menghindari penggunaan contoh dan analogi.", "Berkonsentrasi hanya pada aspek teoritis."),
            correctOption = "Menggunakan berbagai jenis bahasa tubuh."
        ),
        Quiz(
            id = 11,
            "Logis",
            question = "Berapakah hasil dari 3^4 - (5 + 2)?",
            options = listOf("76", "78", "80", "74"),
            correctOption = "78"
        ),
        Quiz(
            id = 12,
            "Logis",
            question = "Suatu segitiga memiliki panjang dua sisi 5 cm dan 3 cm. Berapakah panjang sisi yang tersisa?",
            options = listOf("3 cm", "4 cm", "6 cm", "8 cm"),
            correctOption = "3 cm"
        ),
        Quiz(
            id = 13,
            "Logis",
            question = "Jika suatu bilangan dikalikan dengan 4 dan hasilnya ditambah 12, kita mendapatkan 36. Apakah bilangan tersebut?",
            options = listOf("6", "8", "9", "10"),
            correctOption = "9"
        ),
        Quiz(
            id = 14,
            "Logis",
            question = "Jika harga suatu barang awalnya Rp 120.000 dan kemudian di-diskon 20%, berapakah harga barang tersebut setelah diskon?",
            options = listOf("Rp 90.000", "Rp 96.000", "Rp 100.000", "Rp 110.000"),
            correctOption = "Rp 96.000"
        ),
        Quiz(
            id = 15,
            "Logis",
            question = "Jika suatu bilangan dikurangkan 15 dan hasilnya dikali 3, kita mendapatkan 42. Apakah bilangan tersebut?",
            options = listOf("29", "31", "32", "33"),
            correctOption = "29"
        ),
        Quiz(
            id = 16,
            "Kinestetik",
            question = "Seorang siswa menemukan kesulitan dalam memahami konsep matematika yang kompleks. Metode pembelajaran yang paling efektif untuk membantunya adalah:",
            options = listOf("Membaca buku-buku matematika lebih intensif.",
                "Membahas konsep dengan teman sekelas.",
                "Menggunakan perangkat lunak simulasi matematika.",
                "Mendengarkan rekaman kuliah matematika."),
            correctOption = "Menggunakan perangkat lunak simulasi matematika."
        ),
        Quiz(
            id = 17,
            "Kinestetik",
            question = "Seorang penari yang ingin memperbaiki teknik tarian mereka akan lebih sukses dengan melakukan:",
            options = listOf("Membaca buku tentang teori tari.",
                "Berbicara dengan instruktur tari.",
                "Menonton video tarian profesional.",
                "Melakukan latihan tarian secara langsung."),
            correctOption = "Melakukan latihan tarian secara langsung."
        ),
        Quiz(
            id = 18,
            "Kinestetik",
            question = "Bagaimana cara terbaik untuk mengingat informasi penting sebelum ujian?",
            options = listOf("Membaca materi sebanyak mungkin.",
                "Membuat catatan tulisan tangan.",
                "Berdiskusi tentang materi dengan teman.",
                "Membuat peta konsep visual."),
            correctOption = "Berdiskusi tentang materi dengan teman."
        ),
        Quiz(
            id = 19,
            "Kinestetik",
            question = "Seorang atlet sedang mengalami kesulitan dalam meningkatkan keterampilan teknisnya. Apa yang harus dia lakukan?",
            options = listOf("Mendengarkan panduan audio tentang teknik tersebut.",
                "Membaca buku petunjuk teknis.",
                "Melakukan latihan fisik berulang-ulang.",
                "Berdiskusi dengan pelatih tentang strategi permainan."),
            correctOption = "Melakukan latihan fisik berulang-ulang."
        ),
        Quiz(
            id = 20,
            "Kinestetik",
            question = "Bagaimana Anda biasanya merespon terhadap instruksi verbal yang panjang dan kompleks?",
            options = listOf("Saya lebih suka membaca instruksi tersebut.",
                "Saya cenderung mencatat instruksi tersebut.",
                "Saya lebih suka mendengarkan instruksi tersebut.",
                "Saya lebih suka melakukan instruksi tersebut langsung."),
            correctOption = "Saya lebih suka melakukan instruksi tersebut langsung."
        ),
    )
}