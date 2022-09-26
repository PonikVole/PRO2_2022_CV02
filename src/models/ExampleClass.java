package models;

public class ExampleClass {
    public int publicNumber = 11;               //public = veřejná pro všechny
    protected int protectedNumber = 20;         //protected = pro tuto třídu + pro třídy, které z této classy dědí (extends)
    private int privateNumber = 30;             // private = pouze pro tuto třídu

    public void publicMethod(){

    }
    protected void protectedMethod(){

    }
    private void privateMethod(){

    }

}
