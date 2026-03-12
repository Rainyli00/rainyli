<h1 align="center">🔢 Sıralama Algoritmaları</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Console_App-333333?style=for-the-badge&logo=windowsterminal&logoColor=white" alt="Console"/>
  <img src="https://img.shields.io/badge/Algoritma-00599C?style=for-the-badge&logo=thealgorithms&logoColor=white" alt="Algoritma"/>
</p>

<p align="center">
  Konsoldan girilen 10 elemanlı bir diziyi farklı sıralama algoritmaları ile sıralayan, menü tabanlı interaktif bir Java uygulaması.
</p>

---

## 📋 İçindekiler

- [Hakkında](#-hakkında)
- [Algoritmalar](#-algoritmalar)
- [Menü Seçenekleri](#-menü-seçenekleri)
- [Dosya Yapısı](#-dosya-yapısı)
- [Kurulum ve Çalıştırma](#-kurulum-ve-çalıştırma)

---

## 📖 Hakkında

Bu proje, temel sıralama algoritmalarının Java diliyle implementasyonunu içerir. Kullanıcı konsoldan 10 elemanlı bir dizi girer ve menü aracılığıyla farklı sıralama yöntemlerini uygulayabilir. Eğitim amaçlı geliştirilmiştir.

---

## 🧠 Algoritmalar

### Kabarcık Sıralama (Bubble Sort)
Dizideki komşu elemanları karşılaştırarak yer değiştirir. Her geçişte en büyük eleman sona yerleşir.

> **Zaman Karmaşıklığı:** $O(n^2)$ &nbsp;|&nbsp; **Alan Karmaşıklığı:** $O(1)$

### Seçerek Sıralama (Selection Sort)
Her adımda dizideki en küçük elemanı bulur ve doğru konuma yerleştirir.

> **Zaman Karmaşıklığı:** $O(n^2)$ &nbsp;|&nbsp; **Alan Karmaşıklığı:** $O(1)$

### Birleştirme Sıralaması (Merge Sort)
Diziyi ikiye bölerek alt dizileri sıralar ve birleştirir (böl ve fethet yaklaşımı).

> **Zaman Karmaşıklığı:** $O(n \log n)$ &nbsp;|&nbsp; **Alan Karmaşıklığı:** $O(n)$

---

## 🎮 Menü Seçenekleri

| # | Seçenek | Açıklama |
|:-:|---------|----------|
| `1` | Yeni Dizi | Mevcut diziyi sıfırlayıp yeni 10 eleman girmenizi sağlar |
| `2` | Seçerek Sıralama | Selection Sort algoritması ile sıralar |
| `3` | Kabarcık Sıralama | Bubble Sort algoritması ile sıralar |
| `4` | Birleştirme Sıralaması | Merge Sort algoritması ile sıralar |
| `5` | Tüm Sıralamalar | Tüm algoritmaları sırasıyla uygular |
| `0` | Çıkış | Programdan çıkış yapar |

---

## 📁 Dosya Yapısı

```
rainyli-main/
├── 📄 README.md            # Proje dokümantasyonu
├── 📄 siralama.java        # Sıralama algoritmaları sınıfı
│   ├── kabarcik()           # Bubble Sort implementasyonu
│   └── secerek()            # Selection Sort implementasyonu
└── 📄 siralamamain.java    # Ana çalıştırma & menü sınıfı
```

---

## 🚀 Kurulum ve Çalıştırma

**Gereksinimler:** Java JDK 8+

```bash
# Derleme
javac -d . siralama.java siralamamain.java

# Çalıştırma
java develop.siralamamain
```

---
Bu proje eğitim amaçlı geliştirilmiştir.
