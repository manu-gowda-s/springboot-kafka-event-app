package com.manu.s.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// this class is used to transfer the data b/w services
public class OrderEvent
{
    private String message;
    private String status;
    private Order order;
}
