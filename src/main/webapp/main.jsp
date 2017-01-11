<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<a href="<s:url action='main'/>">Home</a> | 
<a href="<s:url action='page1'/>">Página 1</a> |
<a href="<s:url action='page2'/>">Página 2</a>

<h1>Exemplo Struts 2</h1>
<h2><s:property value="mensagem.texto"/></h2>

</body>
</html>