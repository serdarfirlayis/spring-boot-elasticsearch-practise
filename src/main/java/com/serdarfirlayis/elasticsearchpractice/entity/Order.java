package com.serdarfirlayis.elasticsearchpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "kibana_sample_data_ecommerce")
public class Order {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private List<String> category;

    @Field(type = FieldType.Keyword)
    private String currency;

    @Field(type = FieldType.Keyword, name = "customer_id")
    private String customerId;

    @Field(type = FieldType.Text, name = "customer_first_name")
    private String customerFirstName;

    @Field(type = FieldType.Text, name = "customer_last_name")
    private String customerLastName;

    @Field(type = FieldType.Text, name = "customer_full_name")
    private String customerFullName;

    @Field(type = FieldType.Keyword, name = "customer_gender")
    private String customerGender;

    @Field(type = FieldType.Keyword, name = "customer_phone")
    private String customerPhone;

    @Field(type = FieldType.Keyword, name = "email")
    private String customerEmail;

    @Field(type = FieldType.Keyword, name = "day_of_week")
    private String dayOfWeek;

    @Field(type = FieldType.Integer, name = "day_of_week_i")
    private Integer dayOfWeekI;

    @Field(type = FieldType.Text, name = "manufacturer")
    private List<String> manufacturer;

    @Field(type = FieldType.Date, name = "order_date")
    private String orderDate;
}