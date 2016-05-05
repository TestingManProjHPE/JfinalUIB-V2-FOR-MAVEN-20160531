/**
 * Created by yxin on 4/27/2016.
 */
var DimpleInContent = function() {
    "use strict";

    //For the Ring
    var ringDimpleContent = function() {
        var svg = dimple.newSvg("#dimpleRingContent", 590, 400);
        data = [
            { "系统":"结算系统","缺陷统计":1000 },
            { "系统":"前台UI","缺陷统计":1200 }
        ];
        var myChart = new dimple.chart(svg, data);
        myChart.setBounds(20, 20, 460, 360);
        myChart.addMeasureAxis("p", "缺陷统计");
        var ring = myChart.addSeries("系统", dimple.plot.pie);
        ring.innerRadius = "50%";
        myChart.addLegend(500, 20, 90, 300, "left");
        myChart.draw();
    };

    return {
        //main function to initiate template pages
        init: function() {
            ringDimpleContent();
        }
    };

}();
