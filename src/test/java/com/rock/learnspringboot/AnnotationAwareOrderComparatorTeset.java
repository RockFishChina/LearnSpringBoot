package com.rock.learnspringboot;

import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.core.annotation.Order;

import javax.annotation.Priority;
import java.util.ArrayList;
import java.util.List;

/**
 *
 https://www.jianshu.com/p/28f675223ba1

 贵族血统：PriorityOrdered 优先级高于其他的几个（平民血统）
 相同血统的 看order值，值越小优先级越高

 */



public class AnnotationAwareOrderComparatorTeset {
    public static void main(String[] args) {

        List<Object> lst = new ArrayList();
        lst.add(new OrderedA());
        lst.add(new OrderedB());
        lst.add(new OrderedC());
        lst.add(new OrderedD());
        lst.add(new OrderedE());
        lst.sort(AnnotationAwareOrderComparator.INSTANCE);
        System.out.println(lst.get(0).getClass().getName());

    }
}

class OrderedA implements Ordered{
    @Override
    public int getOrder() {
        return 4;
    }
}
class OrderedB implements Ordered{
    @Override
    public int getOrder() {
        return 3;
    }
}
@Order(2)
class OrderedC{
}

@Priority(1)
class OrderedD{
}

class OrderedE implements PriorityOrdered {

    @Override
    public int getOrder() {
        return 5;
    }
}
