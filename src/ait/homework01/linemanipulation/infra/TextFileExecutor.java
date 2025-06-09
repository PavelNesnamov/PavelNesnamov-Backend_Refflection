package ait.homework01.linemanipulation.infra;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileExecutor {

    public static void execute(String fromFile, String toFile, String action) {

        try (BufferedReader in = new BufferedReader(new FileReader(fromFile));
             PrintWriter wr = new PrintWriter(new FileWriter(toFile))) {

            List<String> text = new ArrayList<>();

            String str = in.readLine();
            while (str != null) {
                text.add(str);
                str = in.readLine();
            }
            char[] chars = action.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            action = new String(chars);
            Class<?> clazz = Class.forName("ait.manipulation.model." + action);
            Manipulation manipulator = (Manipulation) clazz.getDeclaredConstructor().newInstance();
            manipulator.action(text);

            text.forEach(s -> wr.println(s));
            wr.flush();

        } catch (ClassNotFoundException e) {
            System.out.println("Wrong file name");
        } catch (IOException e) {
            System.out.println("Wrong reading data");
        } catch (InstantiationException e) {
            System.out.println("no default constructor");
        } catch (IllegalAccessException e) {
            System.out.println("default constructor isn't public");
        } catch (Exception e) {
            System.out.println("Unknown ERROR");
        }
    }
}
