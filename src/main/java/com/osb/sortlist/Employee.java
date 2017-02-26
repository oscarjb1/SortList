package com.osb.sortlist;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Employee {
    private String name;
    
    public Employee(){
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
