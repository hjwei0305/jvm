import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MetaspaceDemo {
    public static void main(String[] args) {
        int count = 0;
        while(true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Car.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    if (method.getName().equals("run")){
                        System.out.println("汽车启动前，要先检查检查身体！");
                        return methodProxy.invokeSuper(o,objects);
                    }
                    return methodProxy.invokeSuper(o,objects);
                }
            });
            System.out.println("第"+ count++ +"汽车启动");
            Car car = (Car) enhancer.create();
            car.run();
        }
    }

    static class Car{
        public void run(){
            System.out.println("老司机开车啦！！！");
        }
    }
}
