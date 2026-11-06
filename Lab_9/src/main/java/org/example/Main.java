package org.example;

public class Main {

    public static void main(String[] args) {

        Tool[] tools = new Tool[5];

        tools[0] = new Drill("Bosch GSB 13", 650, 1.8, 3000);
        tools[1] = new Drill("Makita HP1630", 710, 1.9, 3200);
        tools[2] = new Drill("DeWalt DWD024", 650, 2.0, 2800);

        tools[3] = new Saw("Makita 5008MG", 1800, 5.0, 21.0);
        tools[4] = new Saw("Bosch GKS 190", 1400, 4.5, 19.0);

        System.out.println("Все инструменты");
        for (Tool tool : tools) {
            tool.displayInfo();
            tool.use();
        }
    }
}