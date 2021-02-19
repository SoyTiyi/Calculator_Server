package edu.escuelaing.arep.app.Spark.calculator;

public class Calculator {
    public Calculator() {

    }

    public String returnJsonResponse(int value, String opera){
        Double result;
        Double newValue = Double.parseDouble(value+"");
        System.out.println(opera);
        if(opera.equals("sin")){
            System.out.println("SIN");
            result = Math.sin(newValue);
        } else if(opera.equals("cos")){
            System.out.println("COS");
            result = Math.cos(newValue);
        }else {
            System.out.println("TAN");
            result = Math.tan(newValue);
        }
        System.out.println(result);
        return "{\"json\":" +"\""+result +"\""+"}";
    }
}
