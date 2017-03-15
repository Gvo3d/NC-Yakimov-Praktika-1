package org.yakimovdenis;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            print(args);
        } else {
            sort("This is test text for second task of java NetCracker courses homework".split(" "));
        }
    }

    public static void print(String[] args) {
        if (args.length > 0) {
            for (int argumentNumber = 0; argumentNumber < args.length; argumentNumber++)
                System.out.println(args[argumentNumber]);
        }
    }

    //Bubbles sort algoritm
    public static void sort(String[] args) {
        if (null != args && args.length > 0) {
            String bubble;
            for (int j = 0; j < args.length - 1; j++) {
                boolean endingFlag = true;
                for (int i = 0; i < args.length - j - 1; i++) {
                    if (args[i].compareTo(args[i + 1]) > 0) {
                        bubble = args[i];
                        args[i] = args[i + 1];
                        args[i + 1] = bubble;
                    } else endingFlag = false;
                }
                if (endingFlag) break;
            }
            print(args);
        }
    }
}
