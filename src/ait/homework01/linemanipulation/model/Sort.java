package ait.homework01.linemanipulation.model;

import ait.homework01.linemanipulation.infra.Manipulation;

import java.util.List;

public class Sort implements Manipulation {
    @Override
    public void action(List<String> text) {
        text.sort((s1, s2) -> s1.compareTo(s2));
    }
}
