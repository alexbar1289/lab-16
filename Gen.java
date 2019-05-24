//Простой обощенный класс
// Т это параметр типа,
// который будет заменен реальным типом при создании объекта типа Gen
public class Gen<T> {
    T ob;
    //передать конструктору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }
    //возвратить объект ob
    T getob() {

        return ob;
    }
    void showType() {
        System.out.println("Типов Т является " + ob.getClass().getName());
    }
}