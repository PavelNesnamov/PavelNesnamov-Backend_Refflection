package ait.homework01.lineManipulation.intra;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class TextFileExecutor {
    public TextFileExecutor() {
    }

    public static void execute(String fromFile, String toFile, String action) {
        try (
                BufferedReader in = new BufferedReader(new FileReader(fromFile));
                PrintWriter wr = new PrintWriter(new FileWriter(toFile));
        ) {
            List<String> text = new ArrayList();

            for (String str = in.readLine(); str != null; str = in.readLine()) {
                text.add(str);
            }

            char[] chars = action.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            action = new String(chars);
            Class<?> clazz = Class.forName("ait.linemanipulation.model." + action);
            Manipulation manipulator = (Manipulation) clazz.getDeclaredConstructor().newInstance();
            manipulator.action(text);
            text.forEach((s) -> wr.println(s));
            wr.flush();
        } catch (FileNotFoundException var14) {
            System.out.println("Wrong file name");
        } catch (IOException var15) {
            System.out.println("Wrong reading data");
        } catch (ClassNotFoundException var16) {
            System.out.println("Wrong name of operation");
        } catch (InstantiationException var17) {
            System.out.println("no default constructor");
        } catch (IllegalAccessException var18) {
            System.out.println("default constructor isn't public");
        } catch (Exception var19) {
            System.out.println("Unknown ERROR");
        }

    }
}