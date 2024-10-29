package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue=1;//부모에 있어서 사용가능

        protectedValue=1;//상속관계 or 같은 패키지, 지금은 다른 패키지이지만 상속관계이므로 사용가능

        //defaultValue=1;//같은 패키지만 가능 ,컴파일 오류
        // privateValue=1;//접근 불가,컴파일 오류

        publicMethod();
        protectedMethod();
        //defaultMethod();//같은 패키지만 가능 ,컴파일 오류
        //privateMethod();//접근 불가,컴파일 오류

        printParent();
    }
}
