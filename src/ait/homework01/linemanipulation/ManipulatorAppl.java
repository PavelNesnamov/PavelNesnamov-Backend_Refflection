package ait.homework01.linemanipulation;

import ait.homework01.linemanipulation.infra.TextFileExecutor;

import java.io.IOException;

public class ManipulatorAppl {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Wrong number of argument");
            return;
        }
        TextFileExecutor.execute(args[0],args[1],args[2]);
    }
}
