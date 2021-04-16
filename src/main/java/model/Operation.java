package model;

public enum Operation {
    ADDITION("addition"),
    SUBTRACTION("subtraction"),
    MULTIPLICATION("multiplication"),
    DIVISION("division");

    private String name;

    private Operation(String name) {
        this.name = name;
    }
}
