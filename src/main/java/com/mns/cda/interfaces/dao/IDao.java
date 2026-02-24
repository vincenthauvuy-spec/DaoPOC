package com.mns.cda.interfaces.dao;

public interface IDao<T> {
     void create(T o);
     T read(int id);
     void update(T o);
     void delete(int id);
}
