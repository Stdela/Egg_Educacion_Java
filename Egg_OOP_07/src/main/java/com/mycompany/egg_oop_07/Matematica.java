/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.egg_oop_07;

/**
 *
 * @author delam
 */
public class Matematica {
    private Integer num1;
    private Integer num2;

    public Matematica() {
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Matematica(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    
}
