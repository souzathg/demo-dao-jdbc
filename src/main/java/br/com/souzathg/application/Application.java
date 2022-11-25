package br.com.souzathg.application;

import br.com.souzathg.model.entities.Department;

public class Application {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
}