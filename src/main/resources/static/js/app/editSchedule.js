var action = '';
var url = '';
var type = '';
var bno = 0;

$(document).ready(function(){

    // 수정하기 버튼 클릭
    $("button[name='modify']").click(function(){
        action='modify';
        type = 'PUT';
        schedule_num = this.value;

        // content 담기
        var row = $(this).parent().parent().parent();
        var tr = row.children();

        var schedule_run_date = tr.eq(2).text();
        var schedule_id = tr.eq(3).text();
        var shell_num = tr.eq(4).text();
        var schedule_reg_date = tr.eq(5).text();

        $("#modal-title").text("Edit");

        $("#schedule_run_date").val(schedule_run_date);
        $("#schedule_id").val(schedule_id);
        $("#shell_num").val(shell_num);
        $("#schedule_reg_date").val(schedule_reg_date);

        $("#myModal").modal();
    });

    // 삭제하기 버튼 클릭
    $("button[name='Delete']").click(function(){
        bno = this.value;
        $.ajax({
            url : '/app/' + schedule_num,
            type : 'DELETE',
        });
        location.reload();
    })

});