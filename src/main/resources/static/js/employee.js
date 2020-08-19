$(document).ready(function () {
        alert("进入");
        $('#EmployeeTable').bootstrapTable({
            url:"/GetEmployeeInfo",  //请求地址
            dataType: "json",
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            search:true,
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
        });

    $('#mytable').datepicker({
        weekStart: 0, //一周从哪一天开始
        todayBtn: 1, //
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1
    });
    });


    $('#mytable').datepicker({
        weekStart: 0, //一周从哪一天开始
        todayBtn: 1, //
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1
    });





