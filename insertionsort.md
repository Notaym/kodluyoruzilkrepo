# proje 1 / insertion sort

---

### 1. Dizinin Aşamaları

Dizi: [22, 27, 16, 2, 18, 6]

(22) ilk eleman yerinde kalır: [22, 27, 16, 2, 18, 6]

(27) yerinde kalır çünkü 27 > 22: [22, 27, 16, 2, 18, 6]

(16) sıralı kısma eklenir olması gereken yerine yerleşir çünkü şuan en küçük : [16, 22, 27, 2, 18, 6]

(2), sıralı kısma eklenir ve sıralamanın başına yerleşir çünkü şuan en küçük : [2, 16, 22, 27, 18, 6]

(18) sıralı kısma eklenir olması gereken yere yerleşir: [2, 16, 18, 22, 27, 6]

(6) sıralı kısma eklenir olması gereken yerine yerleştirilir: [2, 6, 16, 18, 22, 27]

**Sonuç: [2, 6, 16, 18, 22, 27]**

### 2. Big-O Gösterimi

- **Worst Case (En kötü durum): O(n²)**

### Time Complexity:

dizinin son hali : [2, 6, 16, 18, 22, 27]

- **18, dizinin ortasında bulunduğu için Average Case kapsamına girer.**

### Proje 2: Selection Sort

Dizi: [7, 3, 5, 8, 2, 9, 4, 15, 6]

1. **Adım:**

- Tüm dizideki en küçük eleman: 2

- 2, en başa yerleştirilir: [2, 3, 5, 8, 7, 9, 4, 15, 6]

2. **Adım:**

- şimdi dizideki en küçük eleman: 3

\*3, ikinci sırada zaten doğru yerde: [2, 3, 5, 8, 7, 9, 4, 15, 6]

3. **Adım:**

- şimdi dizideki en küçük eleman: 4

- 4, üçüncü sıraya yerleştirilir: [2, 3, 4, 8, 7, 9, 5, 15, 6]

4. **Adım:**

- Kalan dizideki en küçük eleman: 5

- 5, dördüncü sıraya yerleştirilir: [2, 3, 4, 5, 7, 9, 8, 15, 6]

- **İlk 4 adım sonucunda dizi: [2, 3, 4, 5, 7, 9, 8, 15, 6]**
