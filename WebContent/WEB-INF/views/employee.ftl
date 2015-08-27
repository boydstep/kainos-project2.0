<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
</head>
<body>
<h1>Employee</h1>
<table border=1>
<tr><th>Employee</th></tr>
<#list employee as employee>
<tr>
<td>${employee}</td>
</tr>
</#list>
</table>
</body>
</html>