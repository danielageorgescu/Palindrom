package com.itfactory;

import java.util.*;

public class Main {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        System.out.println("Introduceti un numar pentru a fi verificat daca este palindrom sau nu.");
        Scanner scanner = new Scanner(System.in);
        String [] textIntrodus = scanner.nextLine().split("");
        for(String textSeparat: textIntrodus) {
            System.out.print(textSeparat) ;
        }
        List<String> textSeparatInList = new ArrayList<>();
        textSeparatInList.addAll(List.of(textIntrodus));
        System.out.println(textSeparatInList);

        Queue<String>queue = new LinkedList<>();
        queue.addAll(textSeparatInList);
        System.out.println(queue);

        Stack<String>stack = new Stack<>();
         int i = 0;
         while(textIntrodus.length> i) {
             stack.push(textSeparatInList.get(i));
             i++;
         }
         System.out.println(stack);

         if (Objects.equals(queue.poll(), stack.pop())){
             System.out.println(" Numarul este un palindrom.");
         }else{
             System.out.println("Numarul nu este un palindrom");
         }
    }
}
