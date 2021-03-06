package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <h2 class=\"display-4\">PG Programme</h2>\n");
      out.write("  <hr class=\"my-4\">\n");
      out.write("  <div id=\"demo\">\n");
      out.write("  <b><p>Details:</b><br>\n");
      out.write("\n");
      out.write("  \t<b>1.  Master of Computer Applications (M.C.A.)</b><br>\n");
      out.write("\n");
      out.write("This program is offered by Department of Computer Science and Engineering. Admission to MCA programme of MNNIT will be made on the basis of result of NIMCET (NIT MCA Common Entrance Test)<br>\n");
      out.write("\n");
      out.write("There are total of 93 seats for graduates from Indian Universities. Seats are reserved for OBC,SC, ST and Physically handicapped as per MHRD, Government of India guidelines.<br>\n");
      out.write("\n");
      out.write("Seat Matrix for MCA Programme is<br>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<table border=1 px solid black; align=\"center\" cellpadding=\"10\" >\n");
      out.write("  <tr align=\"center\">\n");
      out.write("    <td>OP</td>\n");
      out.write("    <td>OPPH</td>\n");
      out.write("    <td>OBC</td>\n");
      out.write("    <td>OBCPH</td>\n");
      out.write("    <td>SC</td>\n");
      out.write("    <td>SCPH</td>\n");
      out.write("    <td>ST</td>\n");
      out.write("    <td>STPH</td>\n");
      out.write("    <td>TOTAL</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr align=\"center\">\n");
      out.write("    <td>46</td>\n");
      out.write("    <td >1</td>\n");
      out.write("    <td>24</td>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>13</td>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>-</td>\n");
      out.write("    <td>93</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("              \n");
      out.write("\n");
      out.write("<b>Eligibility Requirement for Admission to MNNIT<br></b>\n");
      out.write("\n");
      out.write("\n");
      out.write("In addition to eligibility requirements of NIMCET the eligibility given below shall be followed for admission to MNNIT, Allahabad:<br>\n");
      out.write("<ul type=\"disc\">\n");
      out.write("<li>The candidates must have a Bachelor's degree in Science or equivalent degree with Maths/Computer Science as one of the subjects in BSc.<br>\n");
      out.write("<li>Candidates having an aggregate of 60% marks in graduation are eligible to apply for admission to MNNIT.<br></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<b>2. Master of Technology (M.Tech.)</b><br>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("The Master of Technology program is offered by all the Engineering Departments. The M. Tech program is of four semester duration first and second semesters are entirely coursework oriented, The third and fourth semester involves THESIS work.<br>\n");
      out.write("\n");
      out.write("In general, admission is given in the following three categories :<br>\n");
      out.write("\n");
      out.write("<ul type=\"disc\">\n");
      out.write("<li>Admission to students who qualify through GATE ( For M. Tech. in Comp. Sc., and M.Tech. Software Engg. there will be an additional entrance test).<br>\n");
      out.write("<li>Admissions to college teachers through the Quality improvement Programme.<br>\n");
      out.write("<li>Admissions to candidates serving in the Industry, sponsored by their employers.<br></li>\n");
      out.write("</ul>\n");
      out.write("The following programmes are offered by the institute provided that at least FIVE(05) candidates take admission for the Programme. All M.Tech. Degree Programme are of 4 semesters duration.<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("S. No.\n");
      out.write("<table class=\"table table-striped\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">S.No:</th>\n");
      out.write("      <th scope=\"col\">Department Offering</th>\n");
      out.write("      <th scope=\"col\">Programme Offered</th>\n");
      out.write("      <th scope=\"col\">Qualifying Degree</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th rowspan=\"4\",scope=\"row\">1</th>\n");
      out.write("      <th rowspan=\"4\">Applied Mechanics</th>\n");
      out.write("      <td >M.Tech. Applied Mechanics Engg.</td>\n");
      out.write("      <td>B.E. or Equivalent degree in Agricultural/Civil Engg.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Fluid Engineering</td>\n");
      out.write("      <td>B.E. or equivalent in Civil Engg./ Agricultural Engg.\n");
      out.write("</td> \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Material Science Engg.</td>\n");
      out.write("      <td>B.E. or equivalent in Aeronautical, Agricultural, Chemical, Civil, Mechanical, Marine or Naval Architecture Engg.</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Water Resources Management</td>\n");
      out.write("      <td>B.E. or equivalent in Civil Engg./ Agricultural Engg.</td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th rowspan=\"3\",scope=\"row\">2</th>\n");
      out.write("      <th rowspan=\"3\",scope=\"row\">Civil Engineering</th>\n");
      out.write("      <td scope=\"row\">M.Tech. Environmental Engineering</td>\n");
      out.write("      <td>B.E. or Equivalent degree in Agricultrue, Architectural, Civil, Chemical or Mechanical Engg.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M. Tech. Environmental Geo Technical Engg.</td>\n");
      out.write("      <td>B.E. or equivalent in Aeronautical, Agricultural, Chemical, Civil, Mechanical, Marine or Naval Architecture Engg.</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("      <tr>\n");
      out.write("      <td scope=\"row\">M. Tech. Structural Engg.</td>\n");
      out.write("      <td>B.E. or equivalent in Aeronautical, Architecture, Civil or Mechanical</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th rowspan=\"3\",scope=\"row\">3</th>\n");
      out.write("      <th rowspan=\"3\",scope=\"row\">Computer Science & Engineering</th>\n");
      out.write("      <td scope=\"row\">M. Tech. Computer Science and Engineering.</td>\n");
      out.write("      <td scope=\"row\">B.E. in Comp. Science and Engg. or its equivalent, Electrical, Electronics, M.C.A. or M.Sc. (Computer Science) or equivalent.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Information Security</td>\n");
      out.write("      <td>B.E. in any Branch of Engineering, M.C.A. or M.Sc.(Computer Science) or equivalent.</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Software Engineering</td>\n");
      out.write("      <td>B.E. in any Branch of Engineering, M.C.A. or M.Sc. (Computer Science) or equivalent.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th rowspan=\"2\",scope=\"row\">4</th>\n");
      out.write("      <th rowspan=\"2\",scope=\"row\">Electrical Engineering</th>\n");
      out.write("      <td scope=\"row\">M.Tech. Electrical Engineering (Control instrumentation / Power Systems)</td>\n");
      out.write("      <td scope=\"row\">B.E. in Electrical or Electronics or equivalent</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Power electronics and AISC design</td>\n");
      out.write("      <td>B.E. in Electrical or Electronics or equivalent</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th rowspan=\"2\",scope=\"row\">5</th>\n");
      out.write("      <th rowspan=\"2\",scope=\"row\">Electronics & Communication  Engineering</th>\n");
      out.write("      <td scope=\"row\">M.Tech. Electronics (Digital System)</td>\n");
      out.write("      <td scope=\"row\">B.E. in Electrical or Electronics or equivalent</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Microelectronics and VLSI Design</td>\n");
      out.write("      <td>B.E. in Electrical or Electronics or equivalent</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">6</th>\n");
      out.write("      <th scope=\"row\">GIS Cell</th>\n");
      out.write("      <td scope=\"row\">M.Tech. GIS and Remote Sensing</td>\n");
      out.write("      <td scope=\"row\">B.E. or equivalent in Civil Engg./ Computer Sc. & Engg./ Information Technology/ Electronics Engg./ Architecture/ Agriculture Engg./ Marine Engg./ Military Engg./ Naval Sc. & Engg./ Aeronautical Engg./ Mining Engg.; or MCA; or M.Sc. in Geology/ Geophysics/ Geography/ Archaeology/ Environmental Science/ Computer Science.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th rowspan=\"4\",scope=\"row\">7</th>\n");
      out.write("      <th rowspan=\"4\",scope=\"row\">Mechanical Engineering</th>\n");
      out.write("      <td scope=\"row\">M.Tech. Computer Aided Design and Manufacturing</td>\n");
      out.write("      <td scope=\"row\">B.E. or equivalent in Mechanical Engg., Production Engg., Industrial Engg., Metallurgy, Automobile Engg., Agriculture Engg., or Chemical Engg.\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Design </td>\n");
      out.write("      <td>B.E. or Equivalent degree in Mechanical Engg., Automobile, Agricultural Engg., Production Engg., Industrial Engg., Chemical Engg. or Aeronautical Engg.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Product Design & Development </td>\n");
      out.write("      <td>B.E. or equivalent in Mechanical Engg., Production Engg., Industrial Engg., Metallurgy, Automobile Engg., Agriculture Engg., or Chemical Engg.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td scope=\"row\">M.Tech. Prod. Engineering</td>\n");
      out.write("      <td>B.E. or equivalent in Mechanical Engg., Production Engg., Industrial Engg., Metallurgy, Automobile Engg., Agricultural Engg., or Chemical Engg.</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">8</th>\n");
      out.write("      <th scope=\"row\">Chemical Engineering</th>\n");
      out.write("      <td scope=\"row\">M. Tech in Chemical Engineering</td>\n");
      out.write("      <td scope=\"row\">B.E / B. Tech in Chemical Engineering or equivalent degree in allied areas with GATE in Chemical Engineering.</td>\n");
      out.write("    </tr>\n");
      out.write("      </tbody>\n");
      out.write("</table>\n");
      out.write("<p><b>3.  Master of Business Administration (MBA).<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("4. Master of Science (M.Sc.) in Mathematics and Scientific Computing.</b>\n");
      out.write("\n");
      out.write("<b>Course offered:<br></b>\n");
      out.write("\n");
      out.write("<p>This program is offered by the Department of Mathematics. Admission to M.Sc. programme of MNNIT will be made on the basis of result of entrance test organized by the department.<br>\n");
      out.write("\n");
      out.write("There are 17 seats at present. Seats are reserved for SC, ST and Physically handicapped as per MHRD, Government of India guidelines.<br><p>\n");
      out.write("\n");
      out.write("<b><p>Eligibility Requirement for Admission to M.Sc.</p></b>\n");
      out.write("\n");
      out.write("> The candidates having an aggregate of 60% marks or equivalent grade in a Bachelor's degree in Science (B.Sc.) or equivalent degree with Mathematics as one of the subjects.\n");
      out.write("\n");
      out.write("<p><b>For course details : Click Here</b></p><br>\n");
      out.write("\n");
      out.write("<b>RESEARCH AND QIP</b><br>\n");
      out.write("\n");
      out.write("All the Department offer doctoral programs. Teachers from other institutions also come here to do their M.Tech. and Ph.D. in various Department, under QIP scheme.<br>\n");
      out.write("\n");
      out.write("In Addition to regular academic programs, the college organizes seminars, conferences, symposia and also extends expert consultancy to industries and institutions.<br>\n");
      out.write("\n");
      out.write("The college also offers M.Tech. courses in the evenings on part time basis for the duration of five semesters.<br>\n");
      out.write("  \t<hr>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("  ");
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
