# TP2DPBO2023

## Janji
Saya Ayesha Ali Firdaus NIM 2101990 mengerjakan TP 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program
Program yang dibuat ini terdiri dari enam kelas. Kelas tersebut diantaranya:
- `dbConnection` : Kelas ini berfungsi untuk menghubungkan program kita ke database yang sudah dibuat. Di dalam kelas ini terdapat metode-metode untuk menghubungkan ke databse dan metode untuk menjalankan query mysql.
- `Login` : Kelas ini merupakan sebuah frame yang berfungsi sebagai gerbang masuk ke dalam program utama. kelas ini terhubung ke database untuk dapat menyimpan data user. Pada frame ini terdapat tombol register untuk dapat membuat akun dan berpindah ke frame `Register`.
- `Register` : Kelas ini berfungsi untuk membantu user membuat akun baru jika belum memiliki akun di database. Kelas ini juga terhubung ke database untuk menyimpan data-data user yang di perlukan. Di dalam frame tersebut terdapat tombol register untuk membuat akun dan akan muncul pop up apakah yakin data sudah benar, jika pilihan tidak maka akan mereset semua input dan menggagalkan proses pembuatan akun namun jika iya maka akun akan berhasil dibuat. Kemudian user dapat menekan tombol login untuk dapat kembali ke frame `Login`
- `Home` : Kelas ini merupakan bagian utama dari program ini, kelas ini menampilkan semua data yang ada di database. Data barang yang diambil dari database akan ditampilkan dengan cara menambahkan sebuah Card ke dalam panel di frame tersebut. Kemudian di setiap card tersebut terdapat tombol edit dan hapus yang akan di jelaskan lebih lanjut pada kelas `productCard`. Kemudian pada kelas ini terdapat tombol tambah produk yang berguna untuk menambahkan data produk ke database ke dalam user toko tersebut. Tombol terakhir adalah tombol logout yang berfungsi untuk keluar dari frame `Home` dan akan dibawa kembali ke frame login.
- `productCard` : Kelas ini merupakan sebuah kelas berupa card yang bersisikan data-data mengenai suatu produk yang di jadikan satu kesatuan untuk ditampilkan di frame home. Kemudian terdapat dua tombol yaitu edit dan delete. Pada tombol edit pengguna akan dibawa kedalam form yang bisa digunakan untuk mengubah data produk tersebut. Selanjutnya tombol delete dapat digunakan untuk menghapus data suatu produk dari database toko tersebut.
- `addProduct` : Kelas ini merupakan suatu form yang berguna untuk menambahkah suatu produk ke dalam database toko tersebut oleh pengguna. Data-data yang tertera pada form harus di isi secara lengkap oleh pengguna agar produk yang ingin ditambahkan dapat masuk ke dalam database. Pada frame ini terdapat tombol submi yang berfungsi untuk menambahkan data ke dalam database ketika pengguna sudah mengisi form secara lengkap. Kemudian terdapat tombol cancel yang berguna ketika user membatalkan untuk menambahkan barang.

## Desain GUI
- Login

![login](https://user-images.githubusercontent.com/87317233/231462598-d26cfc49-1026-46a3-8157-b04aeaaa5f9a.png)

- Register

![register](https://user-images.githubusercontent.com/87317233/231462895-66846369-4b24-4576-8708-9f0ce8f76f3c.png)

- Home

![image](https://user-images.githubusercontent.com/87317233/231463030-88ffa005-7863-4e20-8a79-7db12765fd46.png)

- Form Tambah Barang

![image](https://user-images.githubusercontent.com/87317233/231463138-4c67df12-7c6b-41c0-b2fc-4311334aa695.png)

- Card Barang

![image](https://user-images.githubusercontent.com/87317233/231463213-acc53dea-c75c-4682-8f05-83a622b72b1f.png)


## Alur Program
1. User membuat akun terlebih dahulu untuk dapat login
2. Kemudian user melakukan login agar dapat masuk ke dalam program, ketika berhasil login maka user akan di bawa ke frame home.
3. Di halaman home user dapat melihat daftar produk yang dimiliki oleh toko tersebut, namun jika data masih kosong user dapat menambahkan produk ke dalam toko tersebut dengan cara menekan tombol "Tambah Produk", kemudian setelah selesai mengisi form maka pengguna di haruskan menekan tombol "Submit" agar data masuk ke dalam database. Di halaman ini juga terdapat tombol "LogOut" jika pengguna ingin keluar dan kembali ke halaman login.
4. Jika user ingin mengubah data produk yang ada di database toko tersebut, pengguna dapat menekan tombol "Edit" yang ada di bagian bawah setiap produk yang di tampilkan.
5. Jika user ingin menghapus data produk yang ada di databse toko tersebut, pengguna dapat menekan tombol "Delete" yang adai di bagian bawah setiap produk yang di tampilkan.

- Note: Jika ingin menjalankan program dapat menggunakan akun:
Id Toko : bq
password : 123

## Dokumentasi
https://youtu.be/wAWbAW7zp5s
