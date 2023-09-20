package com.serdarfirlayis.elasticsearchpractice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    private String id;
    private List<String> category;
    private String currency;
    private String customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerFullName;
    private String customerGender;
    private String customerPhone;
    private String customerEmail;
    private String dayOfWeek;
    private Integer dayOfWeekI;
    private List<String> manufacturer;
    private String orderDate;
}