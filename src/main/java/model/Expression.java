package model;

import java.util.List;

public class Expression {
    private List<Double> terms;
    private Operation operation;
    private Double solution;

    public List<Double> getTerms() {
        return terms;
    }

    public void setTerms(List<Double> terms) {
        this.terms = terms;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Double getSolution() {
        return solution;
    }

    public void setSolution(Double solution) {
        this.solution = solution;
    }
}
