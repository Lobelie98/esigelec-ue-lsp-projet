/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2019-10-29 16:46:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<nf-breadcrumbs\n        breadcrumbs=\"appCtrl.serviceProvider.breadcrumbsCtrl.getBreadcrumbs();\"\n        click-func=\"appCtrl.nf.CanvasUtils.getComponentByType('ProcessGroup').enterGroup\"\n        highlight-crumb-id=\"appCtrl.nf.CanvasUtils.getGroupId();\"\n        separator-func=\"appCtrl.nf.Common.isDefinedAndNotNull\"\n        is-tracking=\"appCtrl.serviceProvider.breadcrumbsCtrl.isTracking\"\n        get-version-control-class=\"appCtrl.serviceProvider.breadcrumbsCtrl.getVersionControlClass\"\n        get-version-control-tooltip=\"appCtrl.serviceProvider.breadcrumbsCtrl.getVersionControlTooltip\">\n</nf-breadcrumbs>\n<div id=\"graph-controls\">\n    <div id=\"navigation-control\" class=\"graph-control\">\n        <div class=\"graph-control-docked pointer fa fa-compass\" title=\"Navigate\"\n             ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.undock($event)\">\n        </div>\n        <div class=\"graph-control-header-container hidden pointer\"\n             ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.expand($event)\">\n            <div class=\"graph-control-header-icon fa fa-compass\">\n");
      out.write("            </div>\n            <div class=\"graph-control-header\">Navigate</div>\n            <div class=\"graph-control-header-action\">\n                <div class=\"graph-control-expansion fa fa-plus-square-o pointer\"></div>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n        <div class=\"graph-control-content hidden\">\n            <div id=\"navigation-buttons\">\n                <div id=\"naviagte-zoom-in\" class=\"action-button\" title=\"Zoom In\"\n                     ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.navigateCtrl.zoomIn();\">\n                    <button><div class=\"graph-control-action-icon fa fa-search-plus\"></div></button>\n                </div>\n                <div class=\"button-spacer-small\">&nbsp;</div>\n                <div id=\"naviagte-zoom-out\" class=\"action-button\" title=\"Zoom Out\"\n                     ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.navigateCtrl.zoomOut();\">\n                    <button><div class=\"graph-control-action-icon fa fa-search-minus\"></div></button>\n");
      out.write("                </div>\n                <div class=\"button-spacer-large\">&nbsp;</div>\n                <div id=\"naviagte-zoom-fit\" class=\"action-button\" title=\"Fit\"\n                     ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.navigateCtrl.zoomFit();\">\n                    <button><div class=\"graph-control-action-icon icon icon-zoom-fit\"></div></button>\n                </div>\n                <div class=\"button-spacer-small\">&nbsp;</div>\n                <div id=\"naviagte-zoom-actual-size\" class=\"action-button\" title=\"Actual\"\n                     ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.navigateCtrl.zoomActualSize();\">\n                    <button><div class=\"graph-control-action-icon icon icon-zoom-actual\"></div></button>\n                </div>\n                <div class=\"clear\"></div>\n            </div>\n            <div id=\"birdseye\"></div>\n        </div>\n    </div>\n    <div id=\"operation-control\" class=\"graph-control\">\n        <div class=\"graph-control-docked pointer fa fa-hand-o-up\" title=\"Operate\"\n");
      out.write("             ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.undock($event)\">\n        </div>\n        <div class=\"graph-control-header-container hidden pointer\"\n             ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.expand($event)\">\n            <div class=\"graph-control-header-icon fa fa-hand-o-up\">\n            </div>\n            <div class=\"graph-control-header\">Operate</div>\n            <div class=\"graph-control-header-action\">\n                <div class=\"graph-control-expansion fa fa-plus-square-o pointer\"></div>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n        <div class=\"graph-control-content hidden\">\n            <div id=\"operation-context\">\n                <div id=\"operation-context-logo\">\n                    <i class=\"icon\" ng-class=\"appCtrl.serviceProvider.graphControlsCtrl.getContextIcon()\"></i>\n                </div>\n                <div id=\"operation-context-details-container\">\n                    <div id=\"operation-context-name\">{{appCtrl.serviceProvider.graphControlsCtrl.getContextName()}}</div>\n");
      out.write("                    <div id=\"operation-context-type\" ng-class=\"appCtrl.serviceProvider.graphControlsCtrl.hide()\">{{appCtrl.serviceProvider.graphControlsCtrl.getContextType()}}</div>\n                </div>\n                <div class=\"clear\"></div>\n                <div id=\"operation-context-id\" ng-class=\"appCtrl.serviceProvider.graphControlsCtrl.hide()\">{{appCtrl.serviceProvider.graphControlsCtrl.getContextId()}}</div>\n            </div>\n            <div id=\"operation-buttons\">\n                <div>\n                    <div id=\"operate-configure\" class=\"action-button\" title=\"Configuration\">\n                        <button ng-click=\"appCtrl.serviceProvider.graphControlsCtrl.openConfigureOrDetailsView();\"\n                                ng-disabled=\"!(appCtrl.serviceProvider.graphControlsCtrl.canConfigureOrOpenDetails())\">\n                            <div class=\"graph-control-action-icon fa fa-gear\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-small\" ng-if=\"appCtrl.nf.CanvasUtils.isManagedAuthorizer()\">&nbsp;</div>\n");
      out.write("                    <div id=\"operate-policy\" class=\"action-button\" title=\"Access Policies\" ng-if=\"appCtrl.nf.CanvasUtils.isManagedAuthorizer()\">\n                        <button ng-click=\"appCtrl.nf.Actions['managePolicies'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!(appCtrl.nf.CanvasUtils.canManagePolicies())\">\n                            <div class=\"graph-control-action-icon fa fa-key\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-large\">&nbsp;</div>\n                    <div id=\"operate-enable\" class=\"action-button\" title=\"Enable\">\n                        <button ng-click=\"appCtrl.nf.Actions['enable'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.getSelection().empty() && !appCtrl.nf.CanvasUtils.canModify(appCtrl.nf.CanvasUtils.getSelection());\">\n                            <div class=\"graph-control-action-icon fa fa-flash\"></div></button>\n                    </div>\n");
      out.write("                    <div class=\"button-spacer-small\">&nbsp;</div>\n                    <div id=\"operate-disable\" class=\"action-button\" title=\"Disable\">\n                        <button ng-click=\"appCtrl.nf.Actions['disable'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.getSelection().empty() && !appCtrl.nf.CanvasUtils.canModify(appCtrl.nf.CanvasUtils.getSelection());\">\n                            <div class=\"graph-control-action-icon icon icon-enable-false\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-large\">&nbsp;</div>\n                    <div id=\"operate-start\" class=\"action-button\" title=\"Start\">\n                        <button ng-click=\"appCtrl.nf.Actions['start'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.getSelection().empty() && !appCtrl.nf.CanvasUtils.canModify(appCtrl.nf.CanvasUtils.getSelection());\">\n                            <div class=\"graph-control-action-icon fa fa-play\"></div></button>\n");
      out.write("                    </div>\n                    <div class=\"button-spacer-small\">&nbsp;</div>\n                    <div id=\"operate-stop\" class=\"action-button\" title=\"Stop\">\n                        <button ng-click=\"appCtrl.nf.Actions['stop'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.getSelection().empty() && !appCtrl.nf.CanvasUtils.canModify(appCtrl.nf.CanvasUtils.getSelection());\">\n                            <div class=\"graph-control-action-icon fa fa-stop\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-large\">&nbsp;</div>\n                    <div id=\"operate-template\" class=\"action-button\" title=\"Create Template\">\n                        <button ng-click=\"appCtrl.nf.Actions['template'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!(appCtrl.nf.CanvasUtils.canWriteCurrentGroup() && (appCtrl.nf.CanvasUtils.getSelection().empty() || appCtrl.nf.CanvasUtils.canRead(appCtrl.nf.CanvasUtils.getSelection())));\">\n");
      out.write("                            <div class=\"graph-control-action-icon icon icon-template-save\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-small\">&nbsp;</div>\n                    <div id=\"operate-template-upload\" class=\"action-button\" title=\"Upload Template\">\n                        <button ng-click=\"appCtrl.nf.Actions['uploadTemplate']();\"\n                                ng-disabled=\"!(appCtrl.nf.CanvasUtils.canWriteCurrentGroup() && appCtrl.nf.CanvasUtils.getSelection().empty());\">\n                            <div class=\"graph-control-action-icon icon icon-template-import\"></div></button>\n                    </div>\n                    <div class=\"clear\"></div>\n                </div>\n                <div style=\"margin-top: 5px;\">\n                    <div id=\"operate-copy\" class=\"action-button\" title=\"Copy\">\n                        <button ng-click=\"appCtrl.nf.Actions['copy'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.isCopyable(appCtrl.nf.CanvasUtils.getSelection());\">\n");
      out.write("                            <div class=\"graph-control-action-icon fa fa-copy\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-small\">&nbsp;</div>\n                    <div id=\"operate-paste\" class=\"action-button\" title=\"Paste\">\n                        <button ng-click=\"appCtrl.nf.Actions['paste'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.isPastable()\">\n                            <div class=\"graph-control-action-icon fa fa-paste\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-large\">&nbsp;</div>\n                    <div id=\"operate-group\" class=\"action-button\" title=\"Group\">\n                        <button ng-click=\"appCtrl.nf.Actions['group'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!(appCtrl.nf.CanvasUtils.getComponentByType('Connection').isDisconnected(appCtrl.nf.CanvasUtils.getSelection()) && appCtrl.nf.CanvasUtils.canModify(appCtrl.nf.CanvasUtils.getSelection()));\">\n");
      out.write("                            <div class=\"graph-control-action-icon icon icon-group\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-large\">&nbsp;</div>\n                    <div id=\"operate-color\" class=\"action-button\" title=\"Change Color\">\n                        <button ng-click=\"appCtrl.nf.Actions['fillColor'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.isColorable(appCtrl.nf.CanvasUtils.getSelection());\">\n                            <div class=\"graph-control-action-icon fa fa-paint-brush\"></div></button>\n                    </div>\n                    <div class=\"button-spacer-large\">&nbsp;</div>\n                    <div id=\"operate-delete\" class=\"action-button\" title=\"Delete\">\n                        <button ng-click=\"appCtrl.nf.Actions['delete'](appCtrl.nf.CanvasUtils.getSelection());\"\n                                ng-disabled=\"!appCtrl.nf.CanvasUtils.areDeletable(appCtrl.nf.CanvasUtils.getSelection());\">\n");
      out.write("                            <div class=\"graph-control-action-icon fa fa-trash\"></div><span>Delete</span></button>\n                    </div>\n                    <div class=\"clear\"></div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>");
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
