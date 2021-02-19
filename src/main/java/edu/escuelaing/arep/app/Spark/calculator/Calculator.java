package edu.escuelaing.arep.app.Spark.calculator;

public class Calculator {
    public Calculator() {

    }

    public String returnJsonResponse(int value, String opera){
        Double result;
        Double newValue = Double.parseDouble(value+"");
        if(opera == "sin"){
            result = Math.sin(newValue);
        } else if(opera == "cos"){
            result = Math.cos(newValue);
        }else {
            result = Math.tan(newValue);
        }
        System.out.println(result);
        return "{\"json\":" +"\""+result +"\""+"}";
    }
}
