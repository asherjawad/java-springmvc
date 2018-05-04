<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebLogin</title>
</head>
<body>
<form action="auth">
 <input type="text" id="uname" name="uname">
 <input type="text" id="pword" name="pword">
 <input type="submit">
 ${result}
</form>
</body>
</html>