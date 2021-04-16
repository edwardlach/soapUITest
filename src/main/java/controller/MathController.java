package controller;

import model.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MathService;

@RestController
public class MathController {

    @Autowired
    private MathService mathService;

    @PostMapping("/add")
    public Expression addValues(@RequestBody Expression request) {
        return mathService.sum(request);
    }

    @PostMapping("/subtract")
    public Expression subtractValues(@RequestBody Expression request) {
        return mathService.subtract(request);
    }

    @PostMapping("/multiply")
    public Expression multiplyValues(@RequestBody Expression request) {
        return mathService.multiply(request);
    }

    @PostMapping("/divide")
    public Expression divideValues(@RequestBody Expression request) {
        return mathService.divide(request);
    }
}
