# 第10章 合成と継承 Composition and Inheritance


abstract修飾子が示すのは実装を持たない抽象メンバを持つかもしれないということである。
抽象クラスのインスタンスを作ることはできない。
```scala
scala> new Element
<console>:13: error: class Element is abstract; cannot be instantiated
       new Element
       ^
```

***

パラメータ無しメソッド - parameterless methods
```scala
def width: Int
```

空括弧メソッド - empty-paren methods 
```scala
def width(): Int
```

