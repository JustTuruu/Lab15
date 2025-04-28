# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй
`feature/calculator-enhancement`-ийг `develop` руу нэгтгэхэд `src/main/java/labxx/sict/must/edu/mn/Calculator.java` дээр merge conflict гарсан. Conflict нь `multiply` функцын Javadoc коммент дээр байсан.

## Шийдвэрлэлтийн Алхмууд
1. `feature/calculator-enhancement` салбарт `git merge develop` ажиллуулсан.
2. `Calculator.java` дээрх conflict-ийг тодорхойлсон.
3. Файлыг засварлаж, хоёр салбарын Javadoc комментийг нэгтгэсэн: оновчлолтын тайлбар болон IEEE 754 стандартын тайлбарыг хослуулсан.
4. `git add src/main/java/labxx/sict/must/edu/mn/Calculator.java` ажиллуулсан.
5. `git commit` ажиллуулж merge-ийг дуусгасан.
6. Салбарыг push хийж, PR үүсгэсэн.

## Гүйцэтгэсэн Git командууд
```
git checkout feature/calculator-enhancement
git merge develop
# Conflict тодорхойлогдсон
# Файлыг засварласан
git add src/main/java/labxx/sict/must/edu/mn/Calculator.java
git commit -m "Resolve merge conflict in Calculator.java"
git push origin feature/calculator-enhancement
```

## Шийдсэн өөрчлөлт
Хоёр салбарын өөр өөр документацыг нэгтгэсэн:
1. Онцлогын салбараас: "Enhanced multiplication method with improved performance. Optimized for handling large numbers efficiently."
2. Develop салбараас: "Implementation follows IEEE 754 standard for floating-point arithmetic."

Параметр болон буцаах утгын тайлбарууд нь онцлогын салбарын хувилбарыг хадгалсан.