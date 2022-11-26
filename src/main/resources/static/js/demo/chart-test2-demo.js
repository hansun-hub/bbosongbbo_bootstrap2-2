var ctx2 = document.getElementById("myChart2").getContext('2d');

var myChart2 = {
    labels : [],
    dataSets : [],
    render : function() {
        new Chart(ctx2, {
            type: 'pie',
            data: {
                labels: myChart2.labels,
                datasets: [{
                    label: " ",
                    lineTension: 0.3,
                    backgroundColor: ['rgba(54, 162, 235, 0.5)',
                    'rgba(255, 206, 86, 0.5)'],
                    borderColor: ['rgba(54, 162, 235, 1.2)',
                    'rgba(255, 206, 86, 1.2)'],
                    pointRadius: 5,
                    pointHoverRadius: 5,
                    pointHitRadius: 50,
                    pointBorderWidth: 2,
                    data: myChart2.dataSets,
                }],
            },
            options: {
                responsive : true,
                legend: {
                    display: true
                },
                pieceLabel: {
                    mode: "label",
                    position:"default",
                    fontSize: 11,
                    fontStyle: 'bold'
                }
            }
        });
    },
    showData : function(){
        labels = [];
        dataSets= [];
        $.ajax({
            type : 'GET',
            url : 'vuln_resultCount_list',
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            //요청결과가 성공일 경우
            success : function(data) {
                //console.log(data);
                $.each(data, function(index,obj){
                    myChart2.labels.push(obj.result);
                    myChart2.dataSets.push(obj.count);
                });
                myChart2.render();
            },
            //요청결과가 실패일 경우
            error : function(xhr, status, error){
            }
        });
    }
};

myChart2.showData();