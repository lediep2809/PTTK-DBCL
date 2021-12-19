package com.example.PtitOrder.dto;

import com.example.PtitOrder.model.TblMonanOrder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 11:18 PM
 */
@Data
public class MonanOrderDto {
    private List<TblMonanOrder> monanOrder;

    public MonanOrderDto(List<TblMonanOrder> monanOrder) {
        this.monanOrder = monanOrder;
    }

    public MonanOrderDto() {
        this.monanOrder = new ArrayList<>();
    }

    public List<TblMonanOrder> getMonanOrder() {
        return monanOrder;
    }


    public void setMonanOrder(List<TblMonanOrder> monanOrder) {
        this.monanOrder = monanOrder;
    }


    public void addMonanOrder(TblMonanOrder monanOrder) {
        this.monanOrder.add(monanOrder);
    }
}
