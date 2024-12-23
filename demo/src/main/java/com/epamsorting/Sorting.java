package com.epamsorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    private List<Integer> arr=new ArrayList<>();

    public void add(){
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }else if(isNumeric(input)==false){
                System.out.println("Please enter a valid Integer");
                i--;
                continue;
            }
            int number = Integer.parseInt(input);
            arr.add(number);
        }  
    }

    public static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    

    public List<Integer> getSorted() {
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            
            int temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
        return arr;
    }

}
