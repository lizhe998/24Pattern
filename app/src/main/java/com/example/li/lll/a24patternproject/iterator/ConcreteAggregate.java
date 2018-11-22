package com.example.li.lll.a24patternproject.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类。
 * @param <T>
 */
public class ConcreteAggregate<T> implements Aggregate<T> {


    private List<T> items =new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
    }

    public int count(){
        return items.size();
    }
    public T getItems(int index){
        return items.get(index);
    }
    public void setItems(T item){
        items.add(item);
    }

}
