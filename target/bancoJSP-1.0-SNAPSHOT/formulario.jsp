<%-- 
    Document   : formulario
    Created on : 12-10-2017, 17:13:15
    Author     : carl
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simulacion</title>
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
        <script>
            $(function () {
            $("#fecha").datepicker();
             });
            </script>

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
 

 <div class="container"> 
 	<div class="row">
 		<div class="col-md-12">
      <form name="formulario" id="formulario" action="resultado.jsp"> 
        <center> 
       
       <table>
           <tr>
              <td colspan="2" bgcolor="white"><span class="Estilo1"><h2>Simulación de Credito de consumo</h2></span></td>      
           </tr>
           <tr>
              <td width="164" bgcolor=""><span class="Estilo21">RUT</span> </td>
              <td><input class="medium bold validateRut required errorSim" type="text"  name="rut" maxlength="13"onclick="activa(this.value)">  
                  <em>Ej: 12851195-2</em></td>    
           </tr>
           <tr>
               <td bgcolor=""><span class="Estilo21">Monto liquido Solicitar</span></td>
               <td><input name="monto" type="text" maxlength="11" autocomplete="off">
                           <em>Monto entre 500.000 y 100.000.000</em></td>
           </tr>
     <tr>
        <td>cantidad de cuotas: </td>
       <td><select name="cuota">
       <option value="select"></option>
       <%
           int n=6;
           String usertype;
       while(n<=60)
       {

       usertype=Integer.toString(n);
       n++;

       %>
       <option value=<%=n%>><%=n%></option>
       <% }%>        
         </td>
     </tr>        
 </select>  
       <tr>
              <td for="fecha">Fecha de vencimiento: </td>
                    <td><input type="text" id="fecha" name="fecha" value="" />
                  
                  </div>

                      <button class="btn btn-primary btn-sm" style="text-align: center; margin-bottom: 5px  "
                                <a name="simular" type="submit" value="simular" style="text-align: center;color: white">simular<span class="glyphicon glyphicon-ok"></span>
                            </a> </button></td>
                    
       </tr>
      </table>
   </form>   
     </div>
       </div>
        </div> 
         </body>
</html>
