package com.serdarfirlayis.elasticsearchpractice.repository;

import com.serdarfirlayis.elasticsearchpractice.entity.Order;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface OrderRepository extends ElasticsearchRepository<Order, String> {

    List<Order> findAll();
}