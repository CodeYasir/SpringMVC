<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
      <title>Student Registration Form</title>
</head>

<body>
    <h2>Please Enter your details</h2><br><br>
    
 <!--Step-2: Display error message on HTML form   -->
    
	<form:form action="processForm" modelAttribute="student">
	
		Person Name:<form:input path="name" />
		                <form:errors path="name"/>
		Pass count: <form:input path="freePass" />
		                <form:errors path="freePass"/>   
		Postal code:<form:input path="postal" />
		                <form:errors path="postal"/> 
		Course code:<form:input path="course" />
		                <form:errors path="course"/> 
		                
<!-- 		Gender:      -->
<%-- 		           Male<form:radiobutton path="gender" value="Male"/>  --%>
<%-- 		           Female<form:radiobutton path="gender" value="Female"/> --%>
<!-- 		Languages:    -->
<%-- 		           Chinese<form:checkbox path="lang" value="Hindi"/>  --%>
<%-- 		           English<form:checkbox path="lang" value="English"/> --%>
<%-- 		           Spanish<form:checkbox path="lang" value="Spanish"/>        --%>
		                        
<%-- 		Country:   <form:select path="country"> --%>
<%-- 		              <form:option value="India" label="India"/> --%>
<%-- 	                  <form:option value="China" label="China"/> --%>
<%-- 	                  <form:option value="USA" label="America"/> --%>
<%-- 	                  <form:option value="Russia" label="Russia"/> --%>
<%-- 	               </form:select>  --%>
	               
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>