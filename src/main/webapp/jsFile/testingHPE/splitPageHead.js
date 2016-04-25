/**
 * Created by yxin on 3/14/2016.
 */
/**
 * 分页处理方法集合
 */
var common_splitPageHead = function() {

    /**
     * 分页链接HTML
     * @param divId
     * @param formId
     * @param totalRow
     * @param pageSize
     * @param pageNumber
     * @param totalPages
     * @param isSelectPage
     * @param isSelectSize
     * @param orderColunm
     * @param orderMode
     * @param currentPageCount
     * @returns {String}
     */
    var splitPageHtml = function(divId, formId, totalRow, pageSize, pageNumber, totalPages, isSelectPage, isSelectSize, orderColunm, orderMode, currentPageCount){
        var start = 1;
        var end = currentPageCount;

        if(pageNumber != 1){
            start = (pageNumber - 1) * pageSize + 1;
            end = start + currentPageCount - 1;
        }

        var splitStr = '';

        //splitStr += '<div class="col-md-12 space20">';
        //splitStr += '<span class="dataTables_paginate paging_bootstrap" style="float:left">';
        splitStr += '<ul class="pagination pagination-blue" style="margin-bottom: 0px;margin-top: 0px;">';

        if(isSelectSize == true){
            splitStr += '<li><select name="pageSize" onChange="common_splitPage.splitPageLink(\''+divId+'\', \''+formId+'\', 1);" style="width: auto; height:30px;">';

            var optionStr = '<option value="10">' +  '10'  + '</option>';
            optionStr += '<option value="20">' +  '20'  + '</option>';
            optionStr += '<option value="40">' +  '40'  + '</option>';
            optionStr += '<option value="80">' +  '80'  + '</option>';
            optionStr = optionStr.replace('"' + pageSize + '"', '"' + pageSize + '" selected="selected"');

            splitStr += optionStr;

            splitStr += '</select>条记录/页</li>';
        }else{
            splitStr += '<input type="hidden" name="pageSize">';
        }

        //splitStr += '&nbsp;&nbsp;<li>显示<strong>' + start + '至<strong>' + end + '</strong>条，共<strong>' + totalRow + '</strong>' + i18n_common_splitPage_records + '</li>';

        splitStr += '</ul>';

        //splitStr += '<input type="hidden" name="orderColunm" value="'+orderColunm+'"/>';
        //splitStr += '<input type="hidden" name="orderMode" value="'+orderMode+'"/>';

        //splitStr += '</div>';
        //splitStr += '</div>';

        return splitStr;
    }

    /**
     * 分页链接处理
     * @param divId
     * @param formId
     * @param toPage
     */
    var splitPageLink = function(divId, formId, toPage){
        //alert($("#" + formId + " select[name=pageNumber]").attr("name"));//input[name=pageNumber]
        $("#" + formId + " select[name=pageNumber],input[name=pageNumber] ").val(toPage);
        if(divId == "mainPanel"){
            common_ajax.ajaxFormMainPanel(formId);
        }else{
            common_ajax.ajaxFormDiv(divId, formId);
        }
    }

    /**
     * 分页列排序点击事件处理
     * @param divId
     * @param formId
     * @param colunmName
     */
    var orderbyFun = function(divId, formId, colunmName){
        var orderColunmNode = $("#" + formId + " input[name=orderColunm]");
        var orderColunm = orderColunmNode.val();

        var orderModeNode = $("#" + formId + " input[name=orderMode]");
        var orderMode = orderModeNode.val();

        if(colunmName == orderColunm){
            if(orderMode == ""){
                orderModeNode.val("asc");
            }else if(orderMode == "asc"){
                orderModeNode.val("desc");
            }else if(orderMode == "desc"){
                orderModeNode.val("");
            }
        }else{
            orderColunmNode.val(colunmName);
            orderModeNode.val("asc");
        }

        //alert(orderColunmNode.val()+"--"+orderModeNode.val());

        if(divId == "mainPanel"){
            common_ajax.ajaxFormMainPanel(formId);
        }else{
            common_ajax.ajaxFormDiv(divId, formId);
        }
    }

    return {
        splitPage : splitPageHtml,
        splitPageLink : splitPageLink,
        orderbyFun : orderbyFun
    };

}();
