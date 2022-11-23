var ctx4 = document.getElementById("vwsChart").getContext('2d');

var vwsChart = {
    labels : [],
    dataSets : [],
    dataSetsFD : [],
    dataSetsSE : [],
    render : function() {
        new Chart(ctx4, {
            type: 'bar',
            data: {
                labels: vwsChart.labels,
                datasets: [{
                    label: "계정관리",
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
                },
                    {
                        label: "서비스 관리",
                        lineTension: 0.3,
                        backgroundColor: 'rgba(75, 192, 192, 0.2)',
                        borderColor: 'rgba(75, 192, 192, 1)',
                        pointRadius: 5,
                        pointBackgroundColor: "rgba(2,117,216,1)",
                        pointBorderColor: "rgba(255,255,255,0.8)",
                        pointHoverRadius: 5,
                        pointHoverBackgroundColor: "rgba(2,117,216,1)",
                        pointHitRadius: 50,
                        pointBorderWidth: 2,
                        data: vwsChart.dataSetsSE,
                    },
                    {
                        label: "파일 및 디렉토리 관리",
                        lineTension: 0.3,
                        backgroundColor: 'rgba(255, 159, 64, 0.2)',
                        borderColor: 'rgba(255, 159, 64, 1)',
                        pointRadius: 5,
                        pointBackgroundColor: "rgba(2,117,216,1)",
                        pointBorderColor: "rgba(255,255,255,0.8)",
                        pointHoverRadius: 5,
                        pointHoverBackgroundColor: "rgba(2,117,216,1)",
                        pointHitRadius: 50,
                        pointBorderWidth: 2,
                        data: vwsChart.dataSetsFD,
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
        dataSetsFD= [];
        dataSetsSE= [];
        $.ajax({
            type : 'GET',
            url : 'vuln_week_stats/AC',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    vwsChart.labels.push(obj.stats_week+"주");
                    vwsChart.dataSets.push(obj.stats_count);
                });
                //vwsChart.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
        $.ajax({
            type : 'GET',
            url : 'vuln_week_stats/FD',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    vwsChart.dataSetsFD.push(obj.stats_count);
                });
                //vwsChart.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
        $.ajax({
            type : 'GET',
            url : 'vuln_week_stats/SE',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    vwsChart.dataSetsSE.push(obj.stats_count);
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