package service;

import model.Expression;
import model.Operation;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public static Expression sum(Expression exp) {
        exp.setSolution(
            exp.getTerms().stream().reduce(0.0, MathService::sum));
        exp.setOperation(Operation.ADDITION);
        return exp;
    }

    public static Double sum(Double x, Double y) {
        return x + y;
    }

    public static Expression subtract(Expression exp) {
        Double solution = null;
        for (Double term : exp.getTerms()) {
            if (solution == null) {
                solution = term;
            } else {
                solution = solution - term;
            }
        }
        exp.setSolution(solution);
        exp.setOperation(Operation.SUBTRACTION);
        return exp;
    }

    public static Expression multiply(Expression exp) {
        exp.setSolution(
            exp.getTerms().stream().reduce(1.0, MathService::multiply));
        exp.setOperation(Operation.MULTIPLICATION);
        return exp;
    }

    public static Double multiply(Double x, Double y) {
        return x * y;
    }

    public static Expression divide(Expression exp) {
        Double solution = null;
        for (Double term : exp.getTerms()) {
            if (solution == null) {
                solution = term;
            } else {
                solution = solution / term;
            }
        }
        exp.setSolution(solution);
        exp.setOperation(Operation.DIVISION);
        return exp;
    }

}
