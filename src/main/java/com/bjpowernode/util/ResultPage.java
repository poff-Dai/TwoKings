package com.bjpowernode.util;

import java.util.List;

/**
 * Company : BJPowernode
 * Date : 2020/8/31
 * Description :
 */
public class ResultPage<T> {

    private long total;

    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "ResultPage{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
