Obervable 观察对象
Oberver  是观察者

股票是被观察对象
股民是观察者
  股票改变，股民都能收到相应的信息。

主要表现： 观察者一个改变 就通知观察者 ,是一种一对多的 消息处理机制,
具体实现方法：被观察对象（observale）通过数组保存(观察者) ，一旦观察对象 改变值立即通知  （update）
setChanged();
notifyObservers();


Java 提供了 Observer 模式的默认实现，下面我们就看一下 Java 对 观察者模式的支持。
Java 对 观察者模式的支持 主要体现在 Observable  类和 Observer 接口。

(1) Observable  类代表 被观察者 （java.util.Observable ）
        主要方法有：
        void setChanged() ： 设置被观察者的状态已经被改变
        void addObserver(Observer  observer) ： 添加观察者
        int countObservers() ： 返回所有观察者的数目
        void deleteObserver(Observer  observer) ：删除指定观察者 
        void deleteObservers() ： 删除所有观察者
        boolean hasChanged() ： 被观察者的状态是否被改变，如果是则返回true，否则返回false
        void notifyObservers()  ： 通知所有观察者（没有参数）
        void notifyObservers(Object arg) ： 通知所有观察者（带参数，参数一般设定为被改变的属性）
        void clearChanged() ：清除被观察者状态的改变（即调用 hasChanged() 时会返回 false）
(2) Observer 接口代表 观察者 （java.util.Observer ）
        它只有一个抽象方法需要被具体的观察者类实现（很重要 ）：
        void update(Observable observable, Object arg) ：当 被观察者 调用 notifyObservers(*) 方法
时，会根据被观察者的 hasChanged() 方法 来判断 它的状态是否被改变， 如果被观察者的状态被改变了，则
会调用 观察者 的 update 方法，参数 observable 为 被观察者对象， arg 为调用 notifyObservers( Object arg )
 时传入的参数 arg ，如果调用的是 notifyObservers() 方法， 则 arg 为 null（ 注意 ：应该把这个参数 arg 
 设定为 被观察者的 被改变的属性）。