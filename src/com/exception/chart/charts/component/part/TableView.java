package com.exception.chart.charts.component.part;

/**
 * Echarts数据视图设置
 *
 *
 *
 * @author LIBOYI
 * @date 2015-5-26
 * @version 1.0
 *
 */
public class TableView
{
    private boolean show = false;

    public TableView()
    {

    }

    public TableView(boolean show)
    {
        this.show = show;
    }

    public void setShow(boolean show)
    {
        this.show = show;
    }

    public boolean isShow()
    {
        return show;
    }

}
