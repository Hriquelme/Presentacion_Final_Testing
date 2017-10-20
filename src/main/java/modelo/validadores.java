/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class validadores {
    
    public validadores(){
    }
    
    public String quitaEspacios(String rut){
        String run;
        run = (rut.replaceAll("\\s",""));
        return run;
    }
    
    public String sacapuntos(String rut){
        String run;
        run = (rut.replaceAll("\\.",""));
        return run;
    }
    
    public String sacaComas(String rut){
        String run;
        run = (rut.replaceAll("\\,",""));
        return run;
    }
    
    public String quitarGuiones(String rut){
        String run;
        run = (rut.replaceAll("\\-",""));
        return run;
    }
    
    public boolean digitoVerificador(String rut) {
 
        boolean validacion = false;
        try {
            int ah = rut.length();
            rut =  rut.toUpperCase();
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
       }
    
    public Boolean verificarCaracteres(String rut){
        try{
            Integer.parseInt(rut);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    /**
     *
     * @param rut
     * @return
     */
    public Boolean validadorRut(String rut){
        boolean mutex = true;
	String run = rut;
	run = quitaEspacios(run);
        run = quitarGuiones(run);
		
	String tmpRut2;
	String tmpDv;
	String dv;
        
	tmpRut2 = sacapuntos(run);
        if(verificarCaracteres(tmpRut2)==true){
            if(tmpRut2.length()>9 || tmpRut2.length()<3){
                //System.out.println("ERROR: El largo máximo del RUT es de 10 carácteres y el mínimo es de 3 carácteres");
                return false;
            }else{
                if(digitoVerificador(tmpRut2)==true){
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            //System.out.println("El RUT no debe tener letras");
            return false;
        }
    }
    
    public String validateMontoLiquido(String monto){
	String montoOriginal = monto;
        String montoAux = sacapuntos(monto);
        //montoAux = sacaComas(montoAux);
        if(verificarCaracteres(montoAux)==true){
            try{
                if (Integer.parseInt(montoAux) > 499999 && Integer.parseInt(montoAux) <= 100000000){
                    return montoAux;
                }
                else
                    return "";
            }catch(NumberFormatException ex){
                return "";
            }
            
        }
	return "";

    }
}
