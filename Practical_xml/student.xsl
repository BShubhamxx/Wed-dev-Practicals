<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:tns="http://www.example.org/student">

<xsl:output method="html" indent="yes"/>

<xsl:template match="/">
<html>
<head>
<title>Student Information</title>
</head>

<body>
<h2>Student Information</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Address</th>
    <th>Email</th>
    <th>Contact</th>
</tr>

<xsl:for-each select="tns:info/tns:Student">
<tr>
    <td><xsl:value-of select="@id"/></td>
    <td><xsl:value-of select="tns:name"/></td>
    <td><xsl:value-of select="tns:address"/></td>
    <td><xsl:value-of select="tns:email"/></td>
    <td><xsl:value-of select="tns:contact"/></td>
</tr>
</xsl:for-each>

</table>
</body>
</html>

</xsl:template>
</xsl:stylesheet>