## merge sort

---

### **sort türüne göre dizinin aşamaları**

- ### Parçalara ayırma

  **Dizi:** [16,21,11,8,12,22]

1.  aşama diziyi iki'ye bölersin.**[16,21,11],[8,12,22]**

2.  aşama elde edilen diziler de ikiye bölünür **[16],[21,11]** ve **[8],[12,22]**

3.  aşama işlemi tekrarlarsın **[21],[11],[12],[22]**

4.  aşama **[16],[21],[11],[8],[12],[22]** artık tek elemanlı diziler kaldı

- ### Tekrar birleştirme

1. İlk olarak, en küçük parçaları birleştir:

**[21] ve [11] → [11, 21]**

**[12] ve [22] → [12, 22]**

2. Sıradaki birleşimler:

**[16] ve [11, 21] → [11, 16, 21]**

**[8] ve [12, 22] → [8, 12, 22]**

3. Son birleşim:

**[11, 16, 21] ve [8, 12, 22] → [8, 11, 12, 16, 21, 22]**

### Big-O: O(n log n)
