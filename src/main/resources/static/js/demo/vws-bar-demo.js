var ctx4 = document.getElementById("vwsChart").getContext('2d');

var vwsChart = {
    labels : [],
    dataSets : [],
    render : function() {
        new Chart(ctx4, {
            type: 'bar',
            data: {
                labels: vwsChart.labels,
                datasets: [{
                    label: "취약점 분류",
                    lineTension: 0.3,
                    backgroundColor: 'rgba(255, 99, 132, 0.2)',
                    borderColor: 'rgba(255,99,132,1)',
                    pointRadius: 5,
                    pointBackgroundColor: "rgba(2,117,216,1)",
                    pointBorderColor: "rgba(255,255,255,0.8)",
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: "rgba(2,117,216,1)",
                    pointHitRadius: 50,
                    pointBorderWidth: 2,
                    data: vwsChart.dataSets,
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
            url : 'vuln_week_stats/list',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    vwsChart.labels.push(obj.stats_week);
                    vwsChart.dataSets.push(obj.stats_count);
                });
                vwsChart.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
    }
};

vwsChart.showData();