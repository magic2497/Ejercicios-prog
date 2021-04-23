public class Service {

    public Service(){
        Double num1;
        Double num2;
        String operacion;

    }


    public boolean validarOperacion ( String operacion) {
        if (operacion.equals("sumar")){
           return true;
        }else if (operacion.equals( "restar")){
            return true;

        }else if (operacion.equals("multiplicar")){
            return true;

        }else if (operacion.equals( "dividir")){

            return true;
        }else if (operacion.equals("resto")){
            return true;

        }else if (operacion.equals("apagar")){
            return true;
        }else {
            return false;
        }

    }

    public double operaciones (Double num1, Double num2, String operacion) {
    double resultado = 0;



        if (operacion.equals("sumar")){
            resultado = num1 + num2;
        }else if (operacion.equals( "restar")){
            resultado = num1 - num2;

        }else if (operacion.equals("multiplicar")){
        resultado = num1 * num2;

        }else if (operacion.equals( "dividir")){
            resultado = num1 / num2;

        }else if (operacion.equals("resto")){
            resultado = num1 % num2;

        }else{

        }
return resultado;
    };
}
