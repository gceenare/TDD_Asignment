package za.ac.cput.repository;

import za.ac.cput.domain.Order;

import java.util.List;

//Esethu Gift Mehlo 216125723



public interface iTDDRepository  <Obj, IDtype>{

    List<Order> getAll();

    Obj create(Obj obj);
    Obj read(IDtype id);
    Obj update(Obj obj);
    boolean delete(IDtype id);

}
