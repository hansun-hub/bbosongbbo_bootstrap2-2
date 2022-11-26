var ctx7 = document.getElementById("tSChart").getContext('2d');

var tSChart = {
    labels : [],
    dataSets : [],
    render : function() {
        new Chart(ctx7, {
            type: 'line',
            data: {
                labels: tSChart.labels,
                datasets: [{
                    label: "취약점 분류",
                    lineTension: 0.3,
                    fill: false,
                    borderColor: "rgba(255,99,132,1)",
                    pointBackgroundColor: "rgba(255,255,255,0.8)",
                    pointBorderColor: "rgba(255,99,132,1)",
                    pointBorderWidth: 2,
                    data: tSChart.dataSets,
                }],
            },
            options: {
                responsive : true,
                scales: {
                    xAxes: [{
                        stacked: true,
                        time: {
                            unit: 'month'
                        },
                        gridLines: {
                            display: false
                        },
                        ticks: {
                            maxTicksLimit: 7
                        }
                    }],
                    yAxes: [{
                        stacked: true,
                        ticks: {
                            min: 0,
                            max: 12,
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
            url : 'trendAccount',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    tSChart.labels.push(obj.schedule_num);
                    tSChart.dataSets.push(obj.vuln_count);
                });
                tSChart.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
    }
};

tSChart.showData();