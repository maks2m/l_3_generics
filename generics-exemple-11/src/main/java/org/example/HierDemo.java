package org.example;
// Пример обобщенного суперкласса и подкласса со своим параметром

class Gen<T> {
    T ob; //объявить объект типа Т

    // передать конструктору ссылку на объект типа Т
    Gen(T o) {
        this.ob = o;
    }

    // возвратить ссылку оb
    T getOb() {
        return this.ob;
    }
}

// Подкласс, производный от класса Gen,
// где определяется второй параметр типа V
class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        this.ob2 = o2;
    }

    V getOb2() {
        return this.ob2;
    }
}

class HierDemo {
    public static void main(String[] args) {

        // Создадим объект типа Gen2 для символьных строк целых чисел
        Gen2<String, Integer> siOb = new Gen2<String, Integer>("Значение: ", 99);
        System.out.print(siOb.getOb());
        System.out.println(siOb.getOb2());
    }
}
/*
  Здесь Т тип, передаваемый классу Gen, а V - тип, характерный для класса Gen2.
Параметр типа V используется при объявлении объекта оb2, а также в качестве типа,
возвращаемого методом getob2().
  В методе main() создается объект класса Gen2, в котором тип String подставляется
вместо параметра типа Т, а тип Integer - вместо параметра типа V.
Данная программа выдает следующий вполне ожидаемый результат:
-------------------------------------------------------------
Значение: 99
 */