package org.example;

import java.util.Scanner;
public class DemoAA {

        void function(String st) {
            if ((st == null) || (st.length() <= 1))
                System.out.println(st);
            else {
                System.out.print(st.charAt(st.length() - 1));
                function(st.substring(0, st.length() - 1));
            }
        }

        public static void main(String[] args) {
            String st = "abc d efg";
            DemoAA obj = new DemoAA();
            obj.function(st);
        }
    }
