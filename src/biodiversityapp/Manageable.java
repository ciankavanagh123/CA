/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;
import java.util.List;
/**
 *
 * @author adamk
 */
public  interface Manageable<T> {
    void create(T item);
    T read(String id);
    boolean update(String id, T item);
    boolean delete(String id);
    List<T> readAll();
}
