
/*
 * 饱汉模式
 */
public class SingleTon {
 private SingleTon(){}
 private static final SingleTon instance = new SingleTon();
 public static SingleTon getInstance(){
	 return instance;
 }
 
 /**
	 * 创建型：工厂，抽象工厂，单例，建造者 原型
	 * 组织行：适配器，装饰器，组合，桥接，享元   ，代理，外观
	 * 行为型：模板方法，命令，解释器 ，观察者，访问者，中介者，策略，责任链，状态。迭代者，备忘录
	 */
}
