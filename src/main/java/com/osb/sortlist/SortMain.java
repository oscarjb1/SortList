package com.osb.sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class SortMain {

    private static final String[] NAMES = new String[]{
        "Oscar Blancarte",
        "Juan Perez",
        "Gabriel German",
        "Liliana Castro",
        "Alfredo Alvarado",
        "Rebeca Hernandez",
        "Sofia Galindo",
        "Samuel Alvarez",
        "Manuel Orozco"
    };

    public static void main(String[] args) {

        //Ordenar empleados que estan preparados para ser ordenados
        List<SortEmployee> lstSortEmployees = getSorteableEmployeeList();
        Collections.sort(lstSortEmployees);
        printList("lstSortEmployess ==>", lstSortEmployees);

        //Ordenar empleados que no estan preparados para ser ordenados
        List<Employee> lstEmployees = getEmployeeList();
        Collections.sort(lstEmployees, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        printList("lstEmployees ==>", lstEmployees);

        //Ordenas Empleados con Lambda Expresion
        Collections.sort(lstEmployees, (x, y) -> x.getName().compareToIgnoreCase(y.getName()));
        printList("lstEmployees Lambda ==>", lstEmployees);
    }

    private static void printList(String title, List list) {
        System.out.println(title);
        list.forEach(x -> System.out.println("\t" + x.toString()));
        System.out.println("");
    }

    private static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        for (String name : NAMES) {
            employees.add(new Employee(name));
        }
        return employees;
    }

    private static List<SortEmployee> getSorteableEmployeeList() {
        List<SortEmployee> employees = new ArrayList<>();
        for (String name : NAMES) {
            employees.add(new SortEmployee(name));
        }
        return employees;
    }
}
