$(document).ready(function () {
    $('#EmployeeTable').bootstrapTable({
        url: "/GetEmployeeInfo",  //请求地址
        dataType: "json",
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        search: true,
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 10,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        showRefresh: true,//刷新按钮
        columns: [{
            title: '编号',
            field: 'userid',
            sortable: true
        }, {
            title: '姓名',
            field: 'username',
            sortable: true
        }, {
            title: '性别',
            field: 'nsex',
            sortable: true
        }, {
            title: '部门',
            field: 'deptname',
            sortable: true
        }]
    });

    $('.input-daterange input').each(function () {
        $(this).datepicker({
            language: 'zh-CN', //语言
            autoclose: true, //选择后自动关闭
            clearBtn: true,//清除按钮
            format: "yyyy-mm-dd"//日期格式
        });
    });

    $('#searchByDateBtn').click(function () {
        var startDate = $('#startDate').val();
        var endDate = $('#endDate').val();
        $.ajax({
            type: "GET",
            url: "/SearchEmployeeByDate",
            data: {
                "startDate": startDate,
                "endDate": endDate
            },
            dataType: 'json',
            contentType: "application/json",
            success: function (list) {
                // alert("success");
                // alert(JSON.stringify(list));
                $('#EmployeeTable').bootstrapTable('load',list);
            },
            error: function (xhr) {
                /*错误信息处理*/
                alert("进入error---");
                alert("状态码：" + xhr.status);
                alert("状态:" + xhr.readyState);//当前状态,0-未初始化，1-正在载入，2-已经载入，3-数据进行交互，4-完成。
                alert("错误信息:" + xhr.statusText);
                alert("返回响应信息：" + xhr.responseText);//这里是详细的信息
                alert("请求失败");
            }
        })
    });

});




