/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.*;

public class Demo {
    static ArrayList<Book> books=new ArrayList<Book>();
    
    public static void addBook(){
        Book b1=new Book();
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter book ID: ");
        int newID=scanner.nextInt();
        System.out.println("Enter book name: ");
        String newName=scanner.next();
        System.out.println("Enter author: ");
        String newAuthor=scanner.next();
        System.out.println("Enter publisher: ");
        String newPublisher=scanner.next();
        b1.id=newID;
        b1.name=newName;
        b1.author=newAuthor;
        b1.publisher=newPublisher;
        books.add(b1);
        System.out.println("--------List books---------");
        for(Book bk:books){
            System.out.println("ID: "+bk.id+" -- Name: "+bk.name+" -- Author: "+bk.author+" -- Publisher: "+bk.publisher);
            System.out.println("\n=============================");
            
        }
        
        
    }
    
    public static void searchBook(){
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String bookInput=scanner.nextLine();
        for(int i=0;i<books.size();i++){
            Book b;
            b=books.get(i);
            if(bookInput.equalsIgnoreCase(b.name)){
                System.out.println("ID: "+b.id);
                System.out.println("Name: "+b.name);
                System.out.println("Author: "+b.author);
                System.out.println("Publisher: "+b.publisher);
                count++;
            }
        }
        if(count==0){
            System.out.println("The information can't be found");
        }
        System.out.println("================================");
        
        
    }
    
    public static void bookMenu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("You want: \n1. Add a book \n2. Search a book \n3. Display the list \n4. Exit");
        System.out.println("You choose: ");
        int select=scanner.nextInt();
        switch(select){
            case 1: addBook();
            break;
            case 2: searchBook();
            break;
            case 3: listBook();
            break;
            case 4: Exit();
            break;
            default:
                System.out.println("Wrong key pressed");
                    
        }
    }
    
    public static void listBook(){
        for(Book b: books){
            System.out.println("ID: "+b.id+" -- Name: "+b.name+" -- Author: "+b.author+" -- Publisher: "+b.publisher);
            System.out.println("");
        }
    }
    public static void Exit(){
        
    }

    public static void main(String[] args) {
        Book b2=new Book(1,"Detective 1","Danh 1","VN 1");
        Book b3=new Book(2,"Detective 2","Danh 2","VN 2");
        Book b4=new Book(3,"Detective 3","Danh 3","VN 3");
        Book b5=new Book(4,"Detective 4","Danh 4","VN 4");
        Book b6=new Book(5,"Detective 5","Danh 5","VN 5");
        
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        
        bookMenu();
        
        
    }
}
