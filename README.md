# PicassoTest

https://yadi.sk/i/KFuXiAGRtyZvf

Странно, но выставление весов в activity_main.xml делает что-то с Picasso и RecyclerView начинает жутко тормозить. Вызывается куча onBindViewHolder для невидимых итемов. Иногда сам перекидывает позицию скролла на первый элемент.
