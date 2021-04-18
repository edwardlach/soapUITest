package controller;

import model.Expression;
import model.TermsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.MathService;

@RestController
public class MathController {

    @Autowired
    private MathService mathService;

    @PostMapping("/add")
    public Expression addValues(@RequestBody TermsDto request) {
        Expression expression = new Expression();
        expression.setTerms(request.getTerms());
        return mathService.sum(expression);
    }

    @PostMapping("/subtract")
    public Expression subtractValues(@RequestBody TermsDto request) {
        Expression expression = new Expression();
        expression.setTerms(request.getTerms());
        return mathService.subtract(expression);
    }

    @PostMapping("/multiply")
    public Expression multiplyValues(@RequestBody TermsDto request) {
        Expression expression = new Expression();
        expression.setTerms(request.getTerms());
        return mathService.multiply(expression);
    }

    @PostMapping("/divide")
    public Expression divideValues(@RequestBody TermsDto request) {
        Expression expression = new Expression();
        expression.setTerms(request.getTerms());
        return mathService.divide(expression);
    }
}
