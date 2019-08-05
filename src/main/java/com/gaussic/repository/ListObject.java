package com.gaussic.repository;

import java.util.List;

/**
 * Created by 456 on 2018/10/22.
 */
public class ListObject extends AbstractJsonObject {

    // 列表对象
    private List<?> items;

    public List<?> getItems() {
        return items;
    }

    public void setItems(List<?> items) {
        this.items = items;
    }

}
