/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2019-10-29 16:46:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.summary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class system_002ddiagnostics_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<div id=\"system-diagnostics-dialog\" class=\"hidden large-dialog\">\n    <div class=\"dialog-content\">\n        <div id=\"system-diagnostics-tabs\" class=\"tab-container\"></div>\n        <div id=\"system-diagnostics-tabs-content\">\n            <div id=\"jvm-tab-content\" class=\"configuration-tab\">\n                <div class=\"settings-left\">\n                    <div class=\"setting\">\n                        <input type=\"hidden\" id=\"\"/>\n                        <div class=\"setting-header\">Heap <span id=\"utilization-heap\"></span></div>\n                        <div class=\"setting-field\">\n                            <table id=\"heap-table\">\n                                <tbody>\n                                <tr>\n                                    <td class=\"memory-header setting-name\">Max:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"max-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n");
      out.write("                                </tr>\n                                <tr>\n                                    <td class=\"setting-name\">Total:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"total-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                <tr>\n                                    <td class=\"setting-name\">Used:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"used-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                <tr>\n                                    <td class=\"setting-name\">Free:</td>\n                                </tr>\n                                <tr>\n");
      out.write("                                    <td><span id=\"free-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                </tbody>\n                            </table>\n                        </div>\n                        <div class=\"clear\"></div>\n                    </div>\n                </div>\n                <div class=\"spacer\"></div>\n                <div class=\"settings-right\">\n                    <div class=\"setting\">\n                        <div class=\"setting-header\">Non-heap <span id=\"utilization-non-heap\"></span></div>\n                        <div class=\"setting-field\">\n                            <table id=\"non-heap-table\">\n                                <tbody>\n                                <tr>\n                                    <td class=\"memory-header setting-name\">Max:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"max-non-heap\"></span></td>\n");
      out.write("                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                <tr>\n                                    <td class=\"setting-name\">Total:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"total-non-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                <tr>\n                                    <td class=\"setting-name\">Used:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"used-non-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                <tr>\n");
      out.write("                                    <td class=\"setting-name\">Free:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"free-non-heap\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                                </tbody>\n                            </table>\n                        </div>\n                        <div class=\"clear\"></div>\n                    </div>\n                </div>\n                <div class=\"clear\"></div>\n                <div class=\"setting\">\n                    <div class=\"setting-header\">Garbage Collection</div>\n                    <div id=\"garbage-collection-container\" class=\"setting-field\">\n                        <table id=\"garbage-collection-table\">\n                            <tbody></tbody>\n                        </table>\n                    </div>\n                </div>\n                <div class=\"setting\">\n");
      out.write("                    <div class=\"setting-header\">Runtime</div>\n                    <div id=\"jvm-runtime-container\" class=\"setting-field\">\n                        <table id=\"jvm-runtime-table\">\n                            <tbody>\n                                <tr>\n                                    <td class=\"setting-name\">Uptime:</td>\n                                </tr>\n                                <tr>\n                                    <td><span id=\"uptime\"></span></td>\n                                </tr>\n                                <tr>\n                                    <td></td>\n                                </tr>\n                            </tbody>\n                        </table>\n                    </div>\n                </div>\n            </div>\n            <div id=\"system-tab-content\"class=\"configuration-tab\">\n                <div class=\"settings-left\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">Available Cores:</div>\n                        <div class=\"setting-field\">\n");
      out.write("                            <div id=\"available-processors\"></div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"spacer\"></div>\n                <div class=\"settings-right\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            Core Load Average:\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Core load average for the last minute. Not available on all platforms.\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <div id=\"processor-load-average\"></div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"clear\"></div>\n                <div class=\"setting\">\n                    <div class=\"setting-header\">FlowFile Repository Storage</div>\n                    <div class=\"setting-field\">\n                        <div id=\"flow-file-repository-storage-usage-container\"></div>\n");
      out.write("                    </div>\n                </div>\n                <div class=\"setting\">\n                    <div class=\"setting-header\">Content Repository Storage</div>\n                    <div class=\"setting-field\">\n                        <div id=\"content-repository-storage-usage-container\"></div>\n                    </div>\n                </div>\n                <div class=\"setting\">\n                    <div class=\"setting-header\">Provenance Repository Storage</div>\n                    <div class=\"setting-field\">\n                        <div id=\"provenance-repository-storage-usage-container\"></div>\n                    </div>\n                </div>\n            </div>\n            <div id=\"version-tab-content\" class=\"configuration-tab\">\n                <div class=\"setting\">\n                    <div class=\"setting-header\">NiFi</div>\n                    <dl class=\"setting-attributes-list\">\n                        <dt>NiFi Version</dt><dd><span id=\"version-nifi\"></span></dd>\n                        <dt>Tag</dt><dd><span id=\"version-build-tag\"></span></dd>\n");
      out.write("                        <dt>Build Date/Time</dt><dd><span id=\"version-build-timestamp\"></span></dd>\n                        <dt>Branch</dt><dd><span id=\"version-build-branch\"></span></dd>\n                        <dt>Revision</dt><dd><span id=\"version-build-revision\"></span></dd>\n                    </dl>\n                </div>\n                <div class=\"setting\">\n                    <div class=\"setting-header\">Java</div>\n                    <dl class=\"setting-attributes-list\">\n                        <dt>Version</dt><dd><span id=\"version-java-version\"></span></dd>\n                        <dt>Vendor</dt><dd><span id=\"version-java-vendor\"></span></dd>\n                    </dl>\n                </div>\n                <div class=\"setting\">\n                    <div class=\"setting-header\">Operating System</div>\n                    <dl class=\"setting-attributes-list\">\n                        <dt>Name</dt><dd><span id=\"version-os-name\"></span></dd>\n                        <dt>Version</dt><dd><span id=\"version-os-version\"></span></dd>\n");
      out.write("                        <dt>Architecture</dt><dd><span id=\"version-os-arch\"></span></dd>\n                    </dl>\n                </div>\n            </div>\n        </div>\n        <div id=\"system-diagnostics-refresh-container\">\n            <button id=\"system-diagnostics-refresh-button\" class=\"refresh-button pointer fa fa-refresh\" title=\"Refresh\"></button>\n            <div id=\"system-diagnostics-last-refreshed-container\" class=\"last-refreshed-container\">\n                <span id=\"system-diagnostics-last-refreshed\" class=\"value-color\"></span>\n            </div>\n            <div id=\"system-diagnostics-loading-container\" class=\"loading-container\"></div>\n        </div>\n    </div>\n</div>\n");
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
