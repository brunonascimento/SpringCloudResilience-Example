package br.com.santander.resiliente.app;

/**
 * Created by brunonasc on 13/07/17.
 */
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Person(String name){
        this.name = name;
    };

}
