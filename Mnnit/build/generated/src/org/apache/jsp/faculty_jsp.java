package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class faculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<center><h1>FACULTY PROFILE</h1>\n");
      out.write("        <FORM NAME=\"form1\" ACTION=\"facultysearch.jsp\" METHOD=\"POST\">\n");
      out.write("            <INPUT TYPE=\"HIDDEN\" NAME=\"buttonName\">\n");
      out.write("            <INPUT TYPE=\"BUTTON\" class=\"btn btn-secondary\"VALUE=\"Applied Mechanics\" ONCLICK=\"mech()\">\n");
      out.write("            <INPUT TYPE=\"BUTTON\" class=\"btn btn-secondary\"VALUE=\"School of Management Studies\" ONCLICK=\"management()\">\n");
      out.write("            <INPUT TYPE=\"BUTTON\" class=\"btn btn-secondary\"VALUE=\"Civil enginneering\" ONCLICK=\"civil()\">\n");
      out.write("            <INPUT TYPE=\"BUTTON\" class=\"btn btn-secondary\"VALUE=\"Biotechnology\" ONCLICK=\"biotech()\">\n");
      out.write("            <INPUT TYPE=\"BUTTON\" class=\"btn btn-secondary\" VALUE=\"Computer Engineering\" ONCLICK=\"comp()\">\n");
      out.write("        </FORM>\n");
      out.write("</center>\n");
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("          \n");
      out.write("               function mech()\n");
      out.write("               {\n");
      out.write("                   document.form1.buttonName.value = \"Applied Mechanics\";\n");
      out.write("                   form1.submit();\n");
      out.write("               }    \n");
      out.write("               function management()\n");
      out.write("               {\n");
      out.write("                   document.form1.buttonName.value = \"School of Management Studies\";\n");
      out.write("                   form1.submit();\n");
      out.write("               }    \n");
      out.write("               function civil()\n");
      out.write("               {\n");
      out.write("                   document.form1.buttonName.value = \"Civil Engineering\";\n");
      out.write("                   form1.submit();\n");
      out.write("               } \n");
      out.write("               function biotech()\n");
      out.write("               {\n");
      out.write("                   document.form1.buttonName.value = \"Biotechnology\";\n");
      out.write("                   form1.submit();\n");
      out.write("               } \n");
      out.write("               function comp()\n");
      out.write("               {\n");
      out.write("                   document.form1.buttonName.value = \"Computer Engineering\";\n");
      out.write("                   form1.submit();\n");
      out.write("               }    \n");
      out.write("            </SCRIPT>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
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
