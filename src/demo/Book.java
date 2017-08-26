/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author ueda
 */
public class Book {
    public int id;
    public String name;
    public String author;
    public String publisher;
    
    public Book(){
        id=0;
        name="Sherlock Holme";
        author="Conan Doy";
        publisher="Kim Dong";
    }
    
    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
    
}
