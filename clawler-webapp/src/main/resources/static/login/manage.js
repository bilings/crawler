var index_obj={

    init:function () {
        layui.use('form', function(){
            var form = layui.form;
            // form.on('formLogin', function(data){
            //     $.post("/index/manage",{},function () {
            //
            //     });
            //     return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
            // });
        });
    }

}
$(function () {
   index_obj.init(); 
});