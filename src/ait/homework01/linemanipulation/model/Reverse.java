package ait.homework01.linemanipulation.model;

import ait.homework01.linemanipulation.infra.Manipulation;

import java.util.Collections;
import java.util.List;

public class Reverse implements Manipulation {
    @Override
    public void action(List<String> text) {
        Collections.reverse(text);
    }
}
