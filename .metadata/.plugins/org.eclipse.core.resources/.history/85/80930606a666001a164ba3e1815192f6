<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleStudent_Service_ImplProxyid" scope="session" class="serice_impl.Student_Service_ImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleStudent_Service_ImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        String id_0id=  request.getParameter("id5");
        int id_0idTemp  = Integer.parseInt(id_0id);
        boolean delete2mtemp = sampleStudent_Service_ImplProxyid.delete(id_0idTemp);
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(delete2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
break;
case 7:
        gotMethod = true;
        String id_1id=  request.getParameter("id10");
        int id_1idTemp  = Integer.parseInt(id_1id);
        String name_2id=  request.getParameter("name12");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String age_3id=  request.getParameter("age14");
        int age_3idTemp  = Integer.parseInt(age_3id);
        boolean insert7mtemp = sampleStudent_Service_ImplProxyid.insert(id_1idTemp,name_2idTemp,age_3idTemp);
        String tempResultreturnp8 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insert7mtemp));
        %>
        <%= tempResultreturnp8 %>
        <%
break;
case 16:
        gotMethod = true;
        String id_4id=  request.getParameter("id25");
        int id_4idTemp  = Integer.parseInt(id_4id);
        module.Student search16mtemp = sampleStudent_Service_ImplProxyid.search(id_4idTemp);
if(search16mtemp == null){
%>
<%=search16mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(search16mtemp != null){
%>
<%=search16mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(search16mtemp != null){
java.lang.String typename21 = search16mtemp.getName();
        String tempResultname21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename21));
        %>
        <%= tempResultname21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(search16mtemp != null){
%>
<%=search16mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>