var ctx6 = document.getElementById("tFDChart").getContext('2d');

var tFDChart = {
    labels : [],
    dataSets : [],
    render : function() {
        new Chart(ctx6, {
            type: 'line',
            data: {
                labels: tFDChart.labels,
                datasets: [{
                    label: "취약점 분류",
                    lineTension: 0.3,
                    pointRadius: 5,
                    pointBackgroundColor: "rgba(255, 159, 64, 1)",
                    pointBorderColor: "rgba(255,255,255,0.8)",
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: "rgba(2,117,216,1)",
                    pointHitRadius: 50,
                    pointBorderWidth: 2,
                    data: tFDChart.dataSets,
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
            url : 'trendFileandDir',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    tFDChart.labels.push(obj.schedule_num);
                    tFDChart.dataSets.push(obj.vuln_count);
                });
                tFDChart.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
    }
};

tFDChart.showData();