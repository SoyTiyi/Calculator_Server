package edu.escuelaing.arep.app.Spark;

import static spark.Spark.*;

import edu.escuelaing.arep.app.Spark.calculator.Calculator;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        get("/fachada", (req, res) -> {
            try {
                int value = Integer.parseInt(req.queryParams("value"));
                String opera = req.queryParams("opera");
                Calculator calculator = new Calculator();
                return calculator.returnJsonResponse(value, opera);
            } catch (Exception e) {
                System.out.println(e.toString());
                throw new Exception(e.toString());
            }
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}