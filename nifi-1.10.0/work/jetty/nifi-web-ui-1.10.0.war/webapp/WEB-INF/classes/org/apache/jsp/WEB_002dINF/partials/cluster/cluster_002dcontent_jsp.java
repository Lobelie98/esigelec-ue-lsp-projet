/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2019-10-29 16:46:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.cluster;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cluster_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n<div id=\"cluster\">\n    <div id=\"cluster-header-and-filter\">\n        <div id=\"cluster-header-text\">NiFi Cluster</div>\n    </div>\n    <div id=\"cluster-tabs\" class=\"tab-container\"></div>\n    <div id=\"cluster-tabs-content\">\n        <div id=\"cluster-filter-controls\" class=\"filter-controls\">\n            <div id=\"cluster-filter-stats\" class=\"filter-status\">\n                Displaying&nbsp;<span id=\"displayed-rows\"></span>&nbsp;of&nbsp;<span id=\"total-rows\"></span>\n            </div>\n            <div id=\"cluster-filter-container\" class=\"filter-container\">\n                <input type=\"text\" id=\"cluster-filter\" class=\"filter\" placeholder=\"Filter\"/>\n                <div id=\"cluster-filter-type\" class=\"filter-type\"></div>\n            </div>\n        </div>\n        <div id=\"cluster-nodes-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-nodes-table\" class=\"cluster-tabbed-table\"></div>\n        </div>\n        <div id=\"cluster-system-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-system-table\" class=\"cluster-tabbed-table\"></div>\n");
      out.write("        </div>\n        <div id=\"cluster-jvm-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-jvm-table\" class=\"cluster-tabbed-table\"></div>\n        </div>\n        <div id=\"cluster-flowfile-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-flowfile-table\" class=\"cluster-tabbed-table\"></div>\n        </div>\n        <div id=\"cluster-content-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-content-table\" class=\"cluster-tabbed-table\"></div>\n        </div>\n        <div id=\"cluster-provenance-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-provenance-table\" class=\"cluster-tabbed-table\"></div>\n        </div>\n        <div id=\"cluster-version-tab-content\" class=\"configuration-tab\">\n            <div id=\"cluster-version-table\" class=\"cluster-tabbed-table\"></div>\n        </div>\n    </div>\n</div>\n<div id=\"cluster-refresh-container\">\n    <button id=\"refresh-button\" class=\"refresh-button pointer fa fa-refresh\" title=\"Refresh\"></button>\n    <div id=\"cluster-last-refreshed-container\" class=\"last-refreshed-container\">\n");
      out.write("        Last updated:&nbsp;<span id=\"cluster-last-refreshed\"></span>\n    </div>\n    <div id=\"cluster-loading-container\" class=\"loading-container\"></div>\n</div>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
