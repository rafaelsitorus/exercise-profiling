![Screenshot 2025-03-14 at 12.32.45.png](..%2F..%2F..%2FDesktop%2FScreenshot%202025-03-14%20at%2012.32.45.png)
![Screenshot 2025-03-14 at 12.32.53.png](..%2F..%2F..%2FDesktop%2FScreenshot%202025-03-14%20at%2012.32.53.png)
![Screenshot 2025-03-14 at 12.35.36.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fzl%2Fxf64c73954v636tjklfpd3th0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_Svmg5R%2FScreenshot%202025-03-14%20at%2012.47.04.png)

Hasil sample time dibawah ini merupakan hasil setelah ketiga method dioptimalisasi, sehingga didapat sample time yang lebih efisien,
alasan dibalik perkembangan signifikan ini adalah dari cara kita sebagai developer melakukan fetching terhadap data, 
daripada membuang computing power dengan iterasi, kita dapat menggunakan modul yang sudah tersedia untuk memberikan ekstra efisiensi terhadap
program kita.
![Screenshot 2025-03-14 at 13.21.14.png](..%2F..%2F..%2FDesktop%2FScreenshot%202025-03-14%20at%2013.21.14.png)

Reflection Tutorial Java Profiling
1. JMeter digunakan untuk pengujian beban dengan mensimulasikan banyak pengguna secara bersamaan untuk mengukur respons aplikasi, 
sedangkan IntelliJ Profiler digunakan untuk profiling kode dengan menganalisis performa CPU, memori, dan thread untuk menemukan bottleneck dalam kode.

2. Profiling membantu menemukan bagian kode yang lambat, konsumsi memori berlebih, dan metode yang sering dipanggil, sehingga kita bisa mengoptimalkan 
bagian yang paling berdampak pada performa.

3. IntelliJ Profiler sangat efektif karena memberikan data real-time, call tree, dan visualisasi penggunaan CPU/memori yang memudahkan analisis bottleneck secara mendalam.

4. Tantangan utama adalah hasil yang inkonsisten, sulitnya mereproduksi masalah di lingkungan yang berbeda, serta banyaknya data mentah yang harus diinterpretasikan. 
Cara mengatasinya adalah dengan melakukan pengujian berulang, menggunakan profiling di lingkungan serupa produksi, serta menganalisis tren daripada satu hasil tunggal.

5. Profiler memberikan wawasan mendalam tentang performa aplikasi, membantu mengidentifikasi metode yang boros sumber daya, dan memungkinkan optimasi berbasis data, bukan asumsi.

6. Jika hasil profiling berbeda dengan JMeter, analisis ulang dilakukan dengan memastikan kondisi lingkungan sama, menelusuri perbedaan pola eksekusi kode, dan membandingkan 
performa dalam skenario beban tinggi maupun individual.

7. Optimasi dilakukan dengan mengurangi kompleksitas algoritma, mengoptimalkan query database, caching, dan parallel processing. Untuk memastikan perubahan tidak merusak fungsionalitas,
dilakukan pengujian regresi, unit testing, dan perbandingan performa sebelum-sesudah optimasi.

