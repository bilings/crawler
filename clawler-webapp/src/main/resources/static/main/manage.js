var index_obj={

    init:function () {
        var _this=this;
            _this.UserTree();
    },

    UserTree:function () {
        var _this=this;
        layui.use('element', function(){
            var element = layui.element;
            element.on('nav(demo)', function(elem){
                if ($(elem).attr("data-url")){
                    _this.addTab($(elem).text(),$(elem).attr("data-url"),$(elem).attr("data-layId"));
                }
            });
        });
    },
    addTab:function (title,src,id) {
        layui.use('element', function(){
            var element = layui.element;
            var aa = $('.layui-tab-title li[lay-id="'+id+'"]');
            if (aa.length>0){
                element.tabChange('tabs', id);
            } else {
                element.tabAdd('tabs', {
                    title: title
                    ,content: '<iframe src="'+src+'"> </iframe>' //支持传入html
                    ,id: id
                });
                element.tabChange('tabs', id);
            }
        });
    }

}
$(function () {
   index_obj.init(); 
});