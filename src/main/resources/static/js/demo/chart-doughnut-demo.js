var ctx3 = document.getElementById("doughnutChart").getContext('2d');

var doughnutChart = {
    labels : [],
    dataSets : [],
    render : function() {
        new Chart(ctx3, {
            type: 'doughnut',
            data: {
                labels: doughnutChart.labels,
                datasets: [{
                    label: " ",
                    lineTension: 0.3,
                    backgroundColor: ['rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)'],
                    borderColor: ['rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'],
                    pointRadius: 5,
                    pointBackgroundColor: "rgba(2,117,216,1)",
                    pointBorderColor: "rgba(255,255,255,0.8)",
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: "rgba(2,117,216,1)",
                    pointHitRadius: 50,
                    pointBorderWidth: 2,
                    data: doughnutChart.dataSets,
                }],
            },
            options: {
                responsive : true,
                legend: {
                    display: true
                }
            }
        });
    },
    showData : function(){
        labels = [];
        dataSets= [];
        $.ajax({
            type : 'GET',
            url : 'vuln_type_stats/2022-10-21',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    doughnutChart.labels.push(obj.stats_type);
                    doughnutChart.dataSets.push(obj.stats_count);
                });
                doughnutChart.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
    }
};

doughnutChart.showData();