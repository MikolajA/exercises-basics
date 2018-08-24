package com.isa;

public class Print {

    public void print(GeometricFigure g) {

        g.figura();
        StringBuilder sb = new StringBuilder();
        sb.append("|-------------|--------------|\n");
        sb.append("|     POLE    |     OBWÓD    |\n");
        sb.append("|-------------|--------------|\n");
        sb.append("|  " + String.format("   %.2f", g.pole()) + "   |   " + String.format("  %.2f", g.obwod()) + "    |\n");
        sb.append("|-------------|--------------|\n");
        System.out.println(sb);
    }
}
