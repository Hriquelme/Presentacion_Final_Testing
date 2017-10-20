<%-- 
    Document   : resultado
    Created on : 12-10-2017, 19:42:27
    Author     : carl
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.validadores"%>
<%@page import="modelo.cuotaM"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>resultado</title>
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <style type="text/css">
           
                .navbar-header {                  
                    margin-left: 450px;                   
                }       
         </style>
    </head>
    <body>
             <header>	
         
	  <div class="container-fluid">
	    <div class="row">
                <div class="col-md-12 hidden-xs hidden-sm"> 
                  <nav class="navbar navbar-default" role="navigation">
                      <div class="navbar-header">
                          <a class="navbar-brand" href="formulario.jsp"><img class="img-responsive" src="https://upload.wikimedia.org/wikipedia/commons/a/aa/Banco_de_Chile_Logo.png" width="366" height="90"></a>	    
                      </div>
                  </nav> 
	      </div>
	    </div>
            <div class="row">
	      <div class="col-xs-12 hidden-lg hidden-md"> 
                  <nav class="navbar navbar-default" role="navigation">
                      <div class="header">
                          <a class="navbar-brand" href="formulario.jsp"><img class="img-responsive" src="https://upload.wikimedia.org/wikipedia/commons/a/aa/Banco_de_Chile_Logo.png" width="366" height="90"></a>	    
                      </div>
                  </nav> 
	      </div>
	    </div>
          </div>   
        
     </header>
        
        
        
        <%
               
            String Rut = request.getParameter("rut");
            String Monto = request.getParameter("monto");
            String Cuota = request.getParameter("cuota");
            String Fecha = request.getParameter("fecha");
          
            cuotaM m= new cuotaM();
            validadores v= new validadores(); 
        
        if(Rut.equals("") || Monto.equals("") || Cuota.equals("") ||Fecha.equals("")  ){
                    out.write("<div class ='alert alert-warning'>");
                    out.write("<strong>ATENCIÓN!<strong> Debe rellenar todos los campos");
                    out.write("</div>");
                    out.write("<button type='button' class='btn btn-primary'><a style='text-align: center;color: white' href='formulario.jsp'>Volver</a></button>");
        }else{
           
            if(v.validadorRut(Rut)==true){
                
                Monto = v.validateMontoLiquido(Monto);
                if(!Monto.equals("")){               
                    
                    
                   out.write("<div class='container'>"); 
                   out.write("<div class='row'>");
                   out.write("<div class='col-md-12'>");
                   out.write("<table border='1'>"); 
                   out.write("<tr><td>RUT</td><td>"+Rut+"</td></tr>");  
                   out.write("<tr><td>Cuotas</td><td>"+Cuota+"</td></tr>");   
                   out.write("<tr><td>Monto</td><td>"+m.calculadorCuota(Monto,Cuota)+"</td></tr>");  
                   out.write("<tr><td>Pagar primera cuota en:</td><td>"+Fecha+"</td></tr>");   
                   out.write("</table>"); 
                   out.write("<button type='button' class='btn btn-primary'><a style='text-align: center;color: white' href='formulario.jsp'>Volver</a></button>");
                   out.write("</div>");
                   out.write("</div>");
                   out.write("</div>");
                   
                    
                    
                }else{
                    out.write("<div class ='alert alert-warning'>");
                    out.write("<strong>ATENCIÓN!<strong> ingrese un monto valido entre 500.000 y 100.000.000");
                    out.write("</div>");
                    
                    out.write("<button type='button' class='btn btn-primary'><a style='text-align: center;color: white' href='formulario.jsp'>Volver</a></button>");
                    }
            }else {
            
                    out.write("<div class ='alert alert-warning'>");
                    out.write("<strong>ATENCIÓN!<strong> Debe instroducir un Rut Válido");
                    out.write("</div>");
                    out.write("<button type='button' class='btn btn-primary'><a style='text-align: center;color: white' href='formulario.jsp'>Volver</a></button>");
 
            }
        }
        
        %>
        
    </body>
</html>
