$(function() {
    function reposition() {

        var modal = $(this),
            dialog = modal.find('.modal-dialog');

        modal.css('display', 'block');
        
        // Dividing by two centers the modal exactly, but dividing by three 
        // or four works better for larger screens.
        dialog.css("margin-top", Math.max(0, ($(window).height() - dialog.height()) / 2));
    }
    // Reposition when a modal is shown
    $('.modal').on('show.bs.modal', reposition);

    // Reposition when the window is resized
    $(window).on('resize', function() {
        $('.modal:visible').each(reposition);
    });

    $(document).ready(function () {
        alert("进入");
        $('#EmployeeTable').bootstrapTable({
            url:"/GetEmployeeInfo",  //请求地址
            dataType: "json",
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            sidePagination : 'client',//server:服务器端分页|client：前端分页
            pageSize : 5,//单页记录数
            pageList : [ 5, 10],//可选择单页记录数
            showRefresh : true,//刷新按钮
            columns : [ {
                title : '编号',
                field : 'userid',
                sortable : true
            }, {
                title : '姓名',
                field : 'username',
                sortable : true
            }, {
                title : '性别',
                field : 'nsex',
                sortable : true
            },{
                title : '部门',
                field : 'deptname',
                sortable : true
            }]
        })
    })

});

$(document).load(function () {
    alert("进入2");
    $('#EmployeeTable').bootstrapTable({
        url:"/GetEmployeeInfo",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 10,//单页记录数
        pageList : [ 5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮
        columns : [ {
            title : '编号',
            field : 'userid',
            sortable : true
        }, {
            title : '姓名',
            field : 'username',
            sortable : true
        }, {
            title : '性别',
            field : 'nsex',
            sortable : true
        },{
            title : '部门',
            field : 'deptname',
            sortable : true
        }]
    })
})