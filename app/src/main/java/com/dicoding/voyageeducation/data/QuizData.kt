package com.dicoding.voyageeducation.data

object QuizData {
    val quizList: List<Quiz> = listOf(
        Quiz(
            id = 1,
           "Spasial",
            profesi = listOf("Architect","Desainer","Aerospace"),
            question = "Sebuah gambar terdiri dari empat kotak dengan pola yang unik di setiap kotak. Jika pola pada kotak pertama adalah A, kotak kedua adalah B, kotak ketiga adalah C, dan kotak keempat adalah D, pola mana yang akan muncul setelah D?",
            options = listOf("E", "F", "G", "H"),
            correctOption = "F"
        ),
        Quiz(
            id = 2,
            "Spasial",
            profesi = listOf("Architect","Desainer","Aerospace"),
            question = "Diberikan suatu gambar tiga dimensi dari sebuah kubus. Jika kubus tersebut dipotong dengan melintang secara horizontal, bagian mana yang akan terlihat pada bagian atas hasil potongan?",
            options = listOf("Permukaan atas kubus", "Permukaan bawah kubus", "Permukaan depan kubus", "Permukaan samping kubus"),
            correctOption = "Permukaan atas kubus"
        ),
        Quiz(
            id = 3,
            "Spasial",
            profesi = listOf("Architect","Desainer","Aerospace"),
            question = "Sebuah gambar menunjukkan susunan tangga yang terdiri dari beberapa anak tangga. Jika seseorang naik satu anak tangga, kemudian turun dua anak tangga, dan terakhir naik tiga anak tangga, pada anak tangga ke berapa orang tersebut berada?",
            options = listOf("Anak tangga pertama", "Anak tangga kedua", "Anak tangga ketiga", "Anak tangga keempat"),
            correctOption = "Anak tangga ketiga"
        ),
        Quiz(
            id = 4,
            "Spasial",
            profesi = listOf("Architect","Desainer","Aerospace"),
            question = "Jika sebuah objek dimulai dari titik A dan bergerak 3 langkah ke utara, 4 langkah ke timur, 2 langkah ke selatan, dan akhirnya 5 langkah ke barat, di mana posisi objek tersebut relatif terhadap titik awalnya?",
            options = listOf("Di utara titik awal", "Di selatan titik awal", "Di barat titik awal", "Di timur titik awal"),
            correctOption = "Di barat titik awal"
        ),
        Quiz(
            id = 5,
            "Spasial",
            profesi = listOf("Architect","Desainer","Aerospace"),
            question = "Diberikan sebuah gambar segitiga dengan sisi-sisi yang berbeda panjang. Jika sudut yang tumpul terletak di sisi yang paling panjang, sudut mana yang akan lebih besar dari 90 derajat?",
            options = listOf("Sudut di sisi paling pendek", "Sudut di sisi sedang", "Semua sudut sama besar", "Tidak ada sudut yang lebih besar dari 90 derajat"),
            correctOption = "Sudut di sisi paling pendek"
        ),
        Quiz(
            id = 6,
            "Linguistik",
            profesi = listOf("Journalist","Writer","Law"),
            question = "Bagaimana Anda biasanya menyampaikan ide atau informasi dengan efektif kepada orang lain?",
            options = listOf("Melalui percakapan langsung.", "Dengan menulis dalam bentuk esai atau artikel.", "Menggunakan grafik dan gambar.", "Dengan memberikan presentasi lisan."),
            correctOption = "Dengan memberikan presentasi lisan."
        ),
        Quiz(
            id = 7,
            "Linguistik",
            profesi = listOf("Journalist","Writer","Law"),
            question = "Apa yang biasanya Anda lakukan ketika menemui kata-kata baru yang tidak dikenal?",
            options = listOf("Mencari artinya dalam kamus.", "Mencoba menebak artinya berdasarkan konteks.", "Bertanya kepada orang lain.", "Mengabaikannya dan melanjutkan membaca."),
            correctOption = "Mencari artinya dalam kamus."
        ),
        Quiz(
            id = 8,
            "Linguistik",
            profesi = listOf("Journalist","Writer","Law"),
            question = "Seorang penulis ingin menyampaikan ide kompleks tentang perubahan iklim kepada khalayak yang luas. Apa yang mungkin menjadi pendekatan yang paling efektif?",
            options = listOf("Menulis artikel ilmiah yang rinci.", "Menyajikan informasi melalui grafik dan visual.", "Menggunakan bahasa sederhana dan contoh konkret.", "Memberikan kuliah panjang secara langsung."),
            correctOption = "Menggunakan bahasa sederhana dan contoh konkret."
        ),
        Quiz(
            id = 9,
            "Linguistik",
            profesi = listOf("Journalist","Writer","Law"),
            question = "Bagaimana Anda biasanya merespon ketika membaca ulasan buku atau film yang menarik perhatian banyak orang?",
            options = listOf("Segera membaca atau menontonnya.", "Menimbang berbagai pendapat sebelum membuat keputusan.", "Mencari informasi tambahan untuk memverifikasi ulasan tersebut.", "Tidak begitu tertarik dengan ulasan orang lain."),
            correctOption = "Menimbang berbagai pendapat sebelum membuat keputusan."
        ),
        Quiz(
            id = 10,
            "Linguistik",
            profesi = listOf("Journalist","Writer","Law"),
            question = "Seorang pembicara umum ingin memastikan bahwa pesan mereka diterima dengan baik oleh audiens yang beragam. Apa yang sebaiknya mereka pertimbangkan?",
            options = listOf("Menggunakan berbagai jenis bahasa tubuh.", "Menggunakan kosakata yang rumit dan teknis.", "Menghindari penggunaan contoh dan analogi.", "Berkonsentrasi hanya pada aspek teoritis."),
            correctOption = "Menggunakan berbagai jenis bahasa tubuh."
        ),
        Quiz(
            id = 11,
            "Logis",
            profesi = listOf("Data Scientist","Programmer","Engineering"),
            question = "Berapakah hasil dari 3^4 - (5 + 2)?",
            options = listOf("76", "78", "80", "74"),
            correctOption = "78"
        ),
        Quiz(
            id = 12,
            "Logis",
            profesi = listOf("Data Scientist","Programmer","Engineering"),
            question = "Suatu segitiga memiliki panjang dua sisi 5 cm dan 3 cm. Berapakah panjang sisi yang tersisa?",
            options = listOf("3 cm", "4 cm", "6 cm", "8 cm"),
            correctOption = "3 cm"
        ),
        Quiz(
            id = 13,
            "Logis",
            profesi = listOf("Data Scientist","Programmer","Engineering"),
            question = "Jika suatu bilangan dikalikan dengan 4 dan hasilnya ditambah 12, kita mendapatkan 36. Apakah bilangan tersebut?",
            options = listOf("6", "8", "9", "10"),
            correctOption = "9"
        ),
        Quiz(
            id = 14,
            "Logis",
            profesi = listOf("Data Scientist","Programmer","Engineering"),
            question = "Jika harga suatu barang awalnya Rp 120.000 dan kemudian di-diskon 20%, berapakah harga barang tersebut setelah diskon?",
            options = listOf("Rp 90.000", "Rp 96.000", "Rp 100.000", "Rp 110.000"),
            correctOption = "Rp 96.000"
        ),
        Quiz(
            id = 15,
            "Logis",
            profesi = listOf("Data Scientist","Programmer","Engineering"),
            question = "Jika suatu bilangan dikurangkan 15 dan hasilnya dikali 3, kita mendapatkan 42. Apakah bilangan tersebut?",
            options = listOf("29", "31", "32", "33"),
            correctOption = "29"
        ),
        Quiz(
            id = 16,
            "Kinestetik",
            profesi = listOf("Athlete","Therapist","Surgeon"),
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
            profesi = listOf("Athlete","Therapist","Surgeon"),
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
            profesi = listOf("Athlete","Therapist","Surgeon"),
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
            profesi = listOf("Athlete","Therapist","Surgeon"),
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
            profesi = listOf("Athlete","Therapist","Surgeon"),
            question = "Bagaimana Anda biasanya merespon terhadap instruksi verbal yang panjang dan kompleks?",
            options = listOf("Saya lebih suka membaca instruksi tersebut.",
                "Saya cenderung mencatat instruksi tersebut.",
                "Saya lebih suka mendengarkan instruksi tersebut.",
                "Saya lebih suka melakukan instruksi tersebut langsung."),
            correctOption = "Saya lebih suka melakukan instruksi tersebut langsung."
        ),
        Quiz(
            id = 21,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Apa pola melodi yang benar dari nada-nada berikut: C - E - D - G - A - C?",
            options = listOf("C - D - E - G - A - C",
                "A - G - E - D - C - A",
                "E - D - G - C - A - C",
                "G - A - C - D - E - G"),
            correctOption = "C - D - E - G - A - C"
        ),
        Quiz(
            id = 22,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Manakah yang merupakan pola melodi yang benar dari opsi berikut: F - A - B - D - G?",
            options = listOf( "F - D - B - G - A",
                "A - G - F - D - B",
                "B - D - F - G - A",
                "D - F - B - A - G"),
            correctOption = "B - D - F - G - A"
        ),
        Quiz(
            id = 23,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Berdasarkan notasi berikut: ♪ ♫ ♩ ♫ ♩ ♪, apakah pola ritme yang benar?",
            options = listOf("Ketukan-ketukan yang merata",
                "Ketukan-ketukan yang meningkat",
                "Ketukan-ketukan yang menurun",
                "Ketukan-ketukan yang bervariasi"),
            correctOption = "Ketukan-ketukan yang bervariasi"
        ),
        Quiz(
            id = 24,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Dari opsi berikut, mana yang merupakan pola ritme yang benar: ♩ ♪ ♫ ♩ ♪?",
            options = listOf("♪ ♫ ♩ ♩ ♪",
                "♩ ♫ ♪ ♫ ♩",
                "♫ ♪ ♩ ♩ ♪",
                "♪ ♫ ♩ ♪ ♩"),
            correctOption = "♫ ♪ ♩ ♩ ♪"
        ),
        Quiz(
            id = 25,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Apakah yang dimaksud dengan 'ostinato' dalam konteks musik?",
            options = listOf("Melodi yang terus berubah",
                "Pola ritme yang berulang-ulang",
                "Gaya musik klasik",
                "Alat musik perkusi"),
            correctOption =  "Pola ritme yang berulang-ulang"
        ),
        Quiz(
            id = 26,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Apa yang dimaksud dengan 'crescendo' dalam musik?",
            options = listOf("Melodi yang semakin lambat",
                "Volume musik yang semakin keras",
                "Pola ritme yang berulang-ulang",
                "Perubahan tempo secara mendadak"),
            correctOption = "Volume musik yang semakin keras"
        ),
        Quiz(
            id = 27,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Manakah yang merupakan instrumen perkusi dari opsi berikut:",
            options = listOf("Piano",
                "Violin",
                "Drum",
                "Saxophone"),
            correctOption = "Drum"
        ),
        Quiz(
            id = 28,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Bentuk musik klasik yang biasanya terdiri dari empat bagian dengan pola A-B-A-B disebut:",
            options = listOf("Sonata",
                "Symphony",
                "Concerto",
                "Opera"),
            correctOption = "Sonata"
        ),
        Quiz(
            id = 29,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Istilah 'fortissimo' dalam notasi musik menunjukkan:",
            options = listOf("Main dengan lembut",
                "Main dengan keras",
                "Main dengan perasaan",
                "Main dengan cepat"),
            correctOption = "Main dengan keras"
        ),
        Quiz(
            id = 30,
            "Musik",
            profesi = listOf("Musician","Composer","Singer"),
            question = "Gaya musik tradisional Jepang yang menggunakan seruling bambu disebut:",
            options = listOf("Koto",
                "Shamisen",
                "Taiko",
                "Shakuhachi"),
            correctOption = "Shakuhachi"
        ),
        Quiz(
            id = 31,
            "Intrapersonal",
            profesi = listOf("Teacher","Counselor","Lecturers"),
            question = "Bagaimana Anda biasanya merespons ketika menghadapi masalah pribadi atau konflik emosional?",
            options = listOf("Berbicara dengan teman terdekat.",
                "Menulis dalam jurnal atau diary.",
                "Berpartisipasi dalam kegiatan sosial.",
                "Mencari bantuan dari ahli kesehatan mental."),
            correctOption = "Menulis dalam jurnal atau diary."
        ),
        Quiz(
            id = 32,
            "Intrapersonal",
            profesi = listOf("Teacher","Counselor","Lecturers"),
            question = "Apa yang biasanya Anda lakukan untuk merencanakan dan mencapai tujuan pribadi Anda?",
            options = listOf("Berdiskusi dengan orang lain.",
                "Menetapkan target dan membuat daftar tugas.",
                "Mencari saran dari teman.",
                "Bergabung dengan kelompok dukungan."),
            correctOption = "Menetapkan target dan membuat daftar tugas."
        ),
        Quiz(
            id = 33,
            "Intrapersonal",
            profesi = listOf("Teacher","Counselor","Lecturers"),
            question = "Seorang individu dengan kecerdasan intrapersonal yang tinggi mungkin menemukan kepuasan terbesar dalam melakukan kegiatan:",
            options = listOf("Bersama dengan kelompok besar.",
                "Yang melibatkan kerjasama tim.",
                "Yang memungkinkan refleksi dan introspeksi diri.",
                "Yang membutuhkan interaksi sosial aktif."),
            correctOption = "Yang memungkinkan refleksi dan introspeksi diri."
        ),
        Quiz(
            id = 34,
            "Intrapersonal",
            profesi = listOf("Teacher","Counselor","Lecturers"),
            question = "Bagaimana Anda mengevaluasi dan mengelola emosi Anda dalam situasi stres?",
            options = listOf("Mengobrol dengan teman.",
                "Mencari solusi praktis.",
                "Merefleksikan perasaan dalam kegiatan kreatif.",
                "Meminta bantuan profesional."),
            correctOption = "Meminta bantuan profesional."
        ),
        Quiz(
            id = 35,
            "Intrapersonal",
            profesi = listOf("Teacher","Counselor","Lecturers"),
            question = "Seorang individu dengan kecerdasan intrapersonal yang kuat mungkin akan sukses dalam pekerjaan yang membutuhkan:",
            options = listOf("Keterampilan berkomunikasi yang baik.",
                "Kemampuan untuk bekerja dalam tim.",
                "Kemampuan untuk mengelola konflik.",
                "Kesadaran diri dan pemahaman emosional yang mendalam."),
            correctOption = "Kesadaran diri dan pemahaman emosional yang mendalam."
        ),
        Quiz(
            id = 36,
            "Naturalistik",
            profesi = listOf("Life Coach","Psychologist","Consultant"),
            question = "Apakah yang paling mungkin dilakukan oleh seseorang dengan kecerdasan naturalistik yang tinggi?",
            options = listOf("Menyusun rencana strategis.",
                "Menggambar peta mental kompleks.",
                "Membedah hewan untuk memahami struktur anatomi.",
                "Menulis puisi dan cerita."),
            correctOption = "Membedah hewan untuk memahami struktur anatomi."
        ),
        Quiz(
            id = 37,
            "Naturalistik",
            profesi = listOf("Life Coach","Psychologist","Consultant"),
            question = "Bagaimana Anda dapat menggunakan kecerdasan naturalistik Anda untuk memahami ekosistem di sekitar tempat tinggal Anda?",
            options = listOf("Membaca buku tentang ekologi.",
                "Mengamati dan mencatat perilaku hewan dan tumbuhan.",
                "Mengikuti pelajaran online tentang lingkungan.",
                "Berdiskusi dengan teman tentang konsep ekologi."),
            correctOption =  "Mengamati dan mencatat perilaku hewan dan tumbuhan."
        ),
        Quiz(
            id = 38,
            "Naturalistik",
            profesi = listOf("Life Coach","Psychologist","Consultant"),
            question = "Seorang peneliti sedang mencari cara untuk melestarikan keanekaragaman hayati di suatu kawasan. Apa yang mungkin menjadi pendekatan yang paling sesuai?",
            options = listOf("Membuat model matematika kompleks.",
                "Mengeksplorasi kearifan lokal dan tradisional.",
                "Menggunakan teknologi canggih untuk pengawasan.",
                "Menulis laporan ilmiah berbasis data statistik."),
            correctOption = "Mengeksplorasi kearifan lokal dan tradisional."
        ),
        Quiz(
            id = 39,
            "Naturalistik",
            profesi = listOf("Life Coach","Psychologist","Consultant"),
            question = "Apa yang bisa dilakukan seseorang dengan kecerdasan naturalistik untuk mengembangkan pemahaman mereka tentang tanaman obat tradisional?",
            options = listOf("Membaca buku tentang tanaman obat.",
                "Mewawancarai ahli farmasi.",
                "Berkebun dan mengenal tanaman secara langsung.",
                "Mengikuti seminar tentang kesehatan herbal."),
            correctOption = "Berkebun dan mengenal tanaman secara langsung."
        ),
        Quiz(
            id = 40,
            "Naturalistik",
            profesi = listOf("Life Coach","Psychologist","Consultant"),
            question = "Bagaimana seseorang dapat mengembangkan kecerdasan naturalistik mereka dalam kehidupan sehari-hari?",
            options = listOf("Mengikuti kursus online.",
                "Menulis esai tentang alam.",
                "Membaca buku tentang keberlanjutan.",
                "Melakukan perjalanan untuk mengamati berbagai ekosistem."),
            correctOption = "Melakukan perjalanan untuk mengamati berbagai ekosistem."
        ),
    )
}