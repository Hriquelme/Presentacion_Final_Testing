/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author carl
 */
public class cuotaM {
    
    String n2 = "";
    String n1 = "";
    String n3 = "";
    String n4 = "";
    
    public cuotaM(){
        
    }
    
    public cuotaM(String n1, String n2, String n3, String n4){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.n4=n4;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }
    
    
public String calculadorCuota(String monto,String cuota){
    
      
        n1 = String.valueOf(Integer.parseInt(monto));
        n2 = String.valueOf(Integer.parseInt(cuota));

        n3 = String.valueOf((int) (1.79*Integer.parseInt(n1)));
        n4 = String.valueOf((int) (Integer.parseInt(n3)/Integer.parseInt(n2) ));
            
       
      
        return "<div><Strong> Monto neto:</Strong> "+n1+" <br> <Strong>Monto con interes %1.79 :</strong> "+n3+" <br> <Strong>Pago mensual de "+n2+" cuotas en:</strong> $"+n4+"</div>";
    }
}
