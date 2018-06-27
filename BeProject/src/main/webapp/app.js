$(document).ready(function(){
	$.ajax({
		url: "graph_values.json",
		method: "GET",
		success: function(data) {
			console.log(data);
            var positive_percent = data.positive_percent;
            console.log(positive_percent);
            var negative_percent = data.negative_percent;
            console.log(negative_percent);

  

        var myChart = document.getElementById('mycanvas').getContext('2d');
             // Global Options
        Chart.defaults.global.defaultFontFamily = 'Lato';
        Chart.defaults.global.defaultFontSize = 18;
        Chart.defaults.global.defaultFontColor = '#777';

        var analysisChart = new Chart(myChart, {
            type:'bar', // bar, horizontalBar, pie, line, doughnut, radar, polarArea
            data:{
              labels:['Positive', 'Negative'],
              datasets:[{
                label:'Analysis',
                data:[
                  positive_percent,
                  negative_percent,
                ],
                //backgroundColor:'green',
                backgroundColor:[
                    'rgba(54, 162, 235, 0.6)',
                    'rgba(255, 99, 132, 0.6)',
                  
  
                ],
                borderWidth:1,
                borderColor:'#777',
                hoverBorderWidth:3,
                hoverBorderColor:'#000'
              }]
            },
            options:{
                title:{
                  display:true,
                  text:'Analysis',
                  fontSize:25
                },
                legend:{
                  display:false,
                  position:'right',
                  labels:{
                    fontColor:'#000'
                  }
                },
                layout:{
                  padding:{
                    left:50,
                    right:0,
                    bottom:0,
                    top:0
                  }
                },
                tooltips:{
                  enabled:true
                }
              }
            });
		},
        
		error: function(data) {
			console.log(data);
		}
	});
});