package com.exception.chart.charts;

import java.util.List;

import com.exception.chart.charts.component.ChartsGaugeSeriesBean;
import com.exception.chart.charts.component.ChartsTitleBean;
import com.exception.chart.charts.component.ChartsToolBoxBean;
import com.exception.chart.charts.component.ChartsToolTipBean;
/**
 * 
 *仪表盘
 *
 *
 * @author LIBOYI
 * @date 2015-5-27
 * @version 1.0
 *
 */
public class GaugeOptionBean {
     private ChartsTitleBean title;
     private ChartsToolTipBean tooltip;
     private ChartsToolBoxBean toolbox;
     private List<ChartsGaugeSeriesBean> series;
     public GaugeOptionBean(){
    	 
     }
     public GaugeOptionBean(String text,int fontSize){
    	 
     }
	public void setToolbox(ChartsToolBoxBean toolbox) {
		this.toolbox = toolbox;
	}
	public ChartsToolBoxBean getToolbox() {
		return toolbox;
	}
	public List<ChartsGaugeSeriesBean> getSeries() {
		return series;
	}
	public void setSeries(List<ChartsGaugeSeriesBean> series) {
		this.series = series;
	}
	public ChartsTitleBean getTitle() {
		return title;
	}
	public void setTitle(ChartsTitleBean title) {
		this.title = title;
	}
	public ChartsToolTipBean getTooltip() {
		return tooltip;
	}
	public void setTooltip(ChartsToolTipBean tooltip) {
		this.tooltip = tooltip;
	}
	
     
}
