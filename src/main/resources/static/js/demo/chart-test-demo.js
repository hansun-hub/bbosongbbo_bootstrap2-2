var ctx = document.getElementById("myChart").getContext('2d');
var input_date = document.getElementById('input_date').value;
let myChart = null;

if(myChart != null){ // 이미 그래프를 그렸으면
    $('#myChart').remove(); //그래프 그리는 영역 지움
    $('#div_myChart').append('<canvas id="myChart"></canvas>');//그래프를 감싸고 있는 div안에 다시 그래프 영역 작성

    if(document.getElementById("myChart") != null){ //그래프 그릴 영역이 생겼으면
        ctx = document.getElementById("myChart").getContext('2d');
        draw_vts1_chart(); // 그래프를 그리는 함수
    }

}else{ //그래프를 처음 그릴 때
    draw_vts1_chart(); // 그래프를 그리는 함수
}

function draw_vts1_chart(){

    myChart = {
        labels : [],
        dataSets : [],
        render : function() {
            new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: myChart.labels,
                    datasets: [{
                        label: "취약한 개수",
                        lineTension: 0.3,
                        backgroundColor: [
                            'rgba(255, 99, 132, 0.5)',
                            'rgba(255, 159, 64, 0.5)',
                            'rgba(255, 206, 86, 0.5)'],
                        borderColor: [
                            'rgba(255,99,132,1.5)',
                            'rgba(255, 159, 64, 1.5)',
                            'rgba(255, 206, 86, 1.5)'],
                        //borderWidth: 2,
                        data: myChart.dataSets,
                    }],
                },
                options: {
                    indexAxis: 'y',
                    responsive : true,
                    scales: {
                        xAxes: [{
                            gridLines: {
                                display: false
                            },
                            ticks: {
                                maxTicksLimit: 7
                            }
                        }],
                        yAxes: [{
                            ticks: {
                                min: 0,
                                max: 7,
                            },
                            gridLines: {
                                color: "rgba(0, 0, 0, .125)",
                            }
                        }],
                    },
                    legend: {
                        display: false
                    }
                }
            });
        },
        showData : function(){
            labels = [];
            dataSets= [];
            $.ajax({
                type : 'GET',
                url : 'vuln_type_stats/' + input_date,
                contentType: 'application/json',
                //dataType 정의
                dataType: 'json',
                //요청결과가 성공일 경우
                success : function(data) {
                    myChart.labels = [];
                    myChart.dataSets = [];

                    $.each(data, function(index,obj){
                        myChart.labels.push(obj.stats_type);
                        myChart.dataSets.push(obj.stats_count);
                    });

                    myChart.render();

                },
                //요청결과가 실패일 경우
                error : function(xhr, status, error){
                    alert("error")
                }
            });
        }
    };

    myChart.showData();

}

$("#input_date").change(function(){
    input_date = document.getElementById('input_date').value;
    $('#myChart').remove();
    $('#div_myChart').append('<canvas id="myChart"></canvas>');//그래프를 감싸고 있는 div안에 다시 그래프 영역 작성

    if(document.getElementById("myChart") != null){ //그래프 그릴 영역이 생겼으면
        ctx = document.getElementById("myChart").getContext('2d');
        draw_vts1_chart(); // 그래프를 그리는 함수
    }
});