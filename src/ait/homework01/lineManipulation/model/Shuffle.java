package ait.homework01.lineManipulation.model;

import ait.homework01.lineManipulation.intra.Manipulation;

import java.util.Collections;
import java.util.List;

public class Shuffle implements Manipulation {

    @Override
    public void action(List<String> text) {
        Collections.shuffle(text);
    }
}
