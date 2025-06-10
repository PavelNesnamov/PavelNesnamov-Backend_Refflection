package ait.homework01.lineManipulation;

import ait.homework01.lineManipulation.intra.TextFileExecutor;

public class ManipulatorAppl {

    public static void main(String[] args) {
     if (args.length != 3) {
         System.out.println("Wrong number of arguments");
         return;
     }
     TextFileExecutor.execute(args[0], args[1], args[2]);
    }
}
