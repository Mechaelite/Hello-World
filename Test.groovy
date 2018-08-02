import com.onresolve.scriptrunner.runner.rest.common.CustomEndpointDelegate
import groovy.transform.BaseScript

import javax.ws.rs.core.MediaType
import javax.ws.rs.core.MultivaluedMap
import javax.ws.rs.core.Response

@BaseScript CustomEndpointDelegate delegate

showDialog() { MultivaluedMap queryParams ->

    // get a reference to the current page...
    // def page = getPage(queryParams)

    def dialog =
        """<section role="dialog" id="sr-dialog" class="aui-layer aui-dialog2 aui-dialog2-medium" aria-hidden="true" data-aui-remove-on-hide="true">
            <header class="aui-dialog2-header">
                <h2 class="aui-dialog2-header-main">Some dialog</h2>
                <a class="aui-dialog2-header-close">
                    <span class="aui-icon aui-icon-small aui-iconfont-close-dialog">Close</span>
                </a>
            </header>
            <div class="aui-dialog2-content">
                <p>This is a dialog...</p>
            </div>
            <footer class="aui-dialog2-footer">
                <div class="aui-dialog2-footer-actions">
                    <button id="dialog-close-button" class="aui-button aui-button-link">Close</button>
                </div>
                <div class="aui-dialog2-footer-hint">Some hint here if you like</div>
            </footer>
        </section>
        """

    Response.ok().type(MediaType.TEXT_HTML).entity(dialog.toString()).build()
}