package com.isa;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] slowa = line.split(",");
        List<String> list = Arrays.asList(slowa);
        list.sort((o1, o2) -> o1.compareTo(o2));
        for (String w : list) {
            System.out.println(w);
        }
    }
}
