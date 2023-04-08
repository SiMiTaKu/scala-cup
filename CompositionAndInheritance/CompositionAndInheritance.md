# 第10章 合成と継承 Composition and Inheritance
[パラメータ無しメソッドの定義](#anchor1)

abstract修飾子が示すのは実装を持たない抽象メンバを持つかもしれないということである。
抽象クラスのインスタンスを作ることはできない。
```scala
scala> new Element
<console>:13: error: class Element is abstract; cannot be instantiated
       new Element
       ^
```

***
<a id="anchor1"></a>
## パラメータ無しメソッドの定義
**パラメータ無しメソッド - parameterless methods**
```scala
def width: Int
```

**空括弧メソッド - empty-paren methods** 
```scala
def width(): Int
```

### パラメータ無しメソッドの推奨パターン
>パラメーターがなく、ミュータブルな状態へのアクセスがオブジェクトのフィールドの読み出しだけの時<br>
> 🚨 特にミュータブルな状態を書き換えないことが大切<br>
> **統一形式アクセスの原則**

### フィールドアクセス or メソッド呼び出し
下記二つは外から見ると全く同じ。<br>
違いはフィールドアクセスの方がメソッド呼び出しよりも僅かに早いこと。
でもクラスが初期化されるときに計算されているため、メモリを消化する。<br>
メソッド呼び出しの場合は呼び出した時に初めて評価される。
```scala
abstract class Element {
  def contents: Array[String]
  def height:   Int = contents.length
  def width:    Int = if(height == 0) 0 else contents(0).length
}
```
```scala
abstract class Element {
  def contents: Array[String]
  val height:   Int = contents.length
  val width:    Int = if(height == 0) 0 else contents(0).length
}
```

引数を取らないあらゆる関数呼び出しでは空括弧は省略可能。
