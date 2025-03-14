# 📱 AndroidUnitTest: Pengujian Unit & Instrumental pada Aplikasi Konversi Suhu

## 📌 Deskripsi Proyek
Proyek **AndroidUnitTest** adalah aplikasi Android sederhana yang mengonversi suhu antara **Celsius dan Fahrenheit**.  
Untuk memastikan aplikasi berjalan dengan benar, dilakukan **dua jenis pengujian**:
1. **Unit Test** → Menguji fungsi konversi suhu secara langsung.
2. **Instrumental Test** → Menguji interaksi pengguna dengan UI aplikasi menggunakan **Espresso**.

## 🛠️ Teknologi yang Digunakan
- **Bahasa**: Kotlin
- **Framework Testing**: JUnit & Espresso
- **Lingkungan**: Android Studio

---

## 📂 Struktur Folder
```
AndroidUnitTest/
│── manifests/
│   └── AndroidManifest.xml
│── kotlin+java/
│   └── com.example.androidunittest/
│       ├── MainActivity.kt
│       ├── util/
│       │   ├── TemperatureConverter.kt
│── androidTest/
│   └── com.example.androidunittest/
│       ├── ExampleInstrumentedTest.kt
│       ├── MainActivityTest.kt
│       ├── TemperatureConverterInstrumentedTest.kt
│── test/
│   └── com.example.androidunittest/
│       ├── ExampleUnitTest.kt
│       ├── TemperatureConverterTest.kt
│── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   ├── drawable/
│   ├── mipmap/
```

### 📁 **Penjelasan Struktur Folder**
- **`kotlin+java/com.example.androidunittest/`** → Berisi kode utama aplikasi.
  - `MainActivity.kt` → Aktivitas utama aplikasi.
  - `util/TemperatureConverter.kt` → Fungsi konversi suhu.
- **`androidTest/`** → Berisi **instrumental test** untuk menguji UI.
  - `MainActivityTest.kt` → Menguji input dan tombol di UI.
  - `TemperatureConverterInstrumentedTest.kt` → Menguji fungsi dengan perangkat nyata/emulator.
- **`test/`** → Berisi **unit test** untuk menguji logika konversi suhu.
  - `TemperatureConverterTest.kt` → Menguji fungsi konversi Celsius-Fahrenheit.
- **`res/layout/`** → Berisi file tata letak UI (`activity_main.xml`).
- **`res/drawable/ & res/mipmap/`** → Berisi aset gambar dan ikon aplikasi.

## ✅ Cara Menjalankan Pengujian
### 1️⃣ **Menjalankan Unit Test**
```bash
./gradlew test
```
### 2️⃣ **Menjalankan Instrumental Test**
```bash
./gradlew connectedAndroidTest
```

## 👤 Nama Kontributor
**Hidayat Nur Hakim**  
**2208107010063**  
**2025**

