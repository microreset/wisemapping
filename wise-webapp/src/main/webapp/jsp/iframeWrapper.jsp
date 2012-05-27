<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<%@ include file="/jsp/init.jsp" %>

<div>
    <iframe src='${url}' style="border: 0;width: 100%;height:100%" id="dialogContentIframe"></iframe>
    <div style="float: right;margin-right: 25px">
        <input type="button" class="btn-primary" value="Accept" id="submitBtn"/>
        <input type="button" class="btn-secondary" value="Cancel" id="cancelBtn"/>
    </div>
</div>

<script type="text/javascript">
    $('submitBtn').addEvent('click', function() {
        var iframeWindow = $('dialogContentIframe').contentWindow;
        iframeWindow.submitDialogForm();

        if (MooDialog.Request.active) {
            MooDialog.Request.active.close();
        }
    });

    $('cancelBtn').addEvent('click', function() {
        if (MooDialog.Request.active) {
            MooDialog.Request.active.close();
        }
    });
</script>