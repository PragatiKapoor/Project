package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addfaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" ");

   response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
 
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("        body\n");
      out.write("        {\n");
      out.write("            padding-top:3.5%;\n");
      out.write("            padding-bottom:3.5%;\n");
      out.write("            padding-right:3.5%;\n");
      out.write("            padding-left:3.5%;\n");
      out.write("            \n");
      out.write("            background-color:black;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<nav>\n");
      out.write("            <a href=\"logout.jsp\" class=\"btn btn-primary \">Logout</a> </nav>        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("    <center>\n");
      out.write("        <form method=\"get\" action=\"\">\n");
      out.write("<table class=\"table, table table-bordered table-light\">\n");
      out.write("    <tr>\n");
      out.write("\t<td><input type=\"number\" class=\"form-control\" name=\"a\" placeholder=\"Enter ID \" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t1\" placeholder=\"Enter Faculty Name \" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t2\" placeholder=\"Enter Designation \" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t3\" placeholder=\"Enter Qualification \" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t4\" placeholder=\"Area Of interest \" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t5\" placeholder=\"Phone No\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"email\" class=\"form-control\" name=\"t6\" placeholder=\"Email\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t7\" placeholder=\"Department\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"b\" placeholder=\"Position\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"c\" placeholder=\"Place\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t8\" placeholder=\"imagename\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><input type=\"text\" class=\"form-control\" name=\"t9\" placeholder=\"View profile\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><input type=\"submit\" class=\"btn btn-primary btn-lg btn-block\"  name=\"b1\" value=\"submit\" /></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("   ");
 if(request.getParameter("b1")!=null){
       Connection con=null;
		Statement st;
		
		try{
                    
                    Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
			st=con.createStatement();
                        String ide=request.getParameter("a");
                        int n=Integer.parseInt(ide);
		
                        String fn=request.getParameter("t1");
                        			

	                 String des=request.getParameter("t2");
                                               

                         String q =request.getParameter("t3");
                                                 			
	              String a=request.getParameter("t4");
                                    			

                      String phn=request.getParameter("t5");
                                              
                      String m=request.getParameter("t6");
	             String dep=request.getParameter("t7");
                     String pos=request.getParameter("b");
                     String pl=request.getParameter("c");
                     String img=request.getParameter("t8");
	             String vp=request.getParameter("t9");
                                             

                     String sql="insert into faculty values("+n+",'"+fn+"','"+des+"','"+q+"','"+a+"','"+phn+"','"+m+"','"+dep+"','"+pos+"','"+pl+"','"+img+"','"+vp+"');";
                     int res=st.executeUpdate(sql);
			if(res!=0)
				out.println("Record Inserted");
			else
				out.println("Record Not Inserted");
                    
		}catch(Exception e)
		{     
			out.println(e.toString());
		}
		}
	

      out.write("\n");
      out.write("        </form></table></center></body></html>\n");

	if(session.getAttribute("username")==null){
            		response.sendRedirect("admin123456.jsp");		

        }
        
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
