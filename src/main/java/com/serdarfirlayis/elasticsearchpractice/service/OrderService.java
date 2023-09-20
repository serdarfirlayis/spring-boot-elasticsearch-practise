package com.serdarfirlayis.elasticsearchpractice.service;

import com.serdarfirlayis.elasticsearchpractice.entity.Order;
import com.serdarfirlayis.elasticsearchpractice.model.OrderResponse;
import com.serdarfirlayis.elasticsearchpractice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    public List<OrderResponse> findAll() {

        return orderRepository.findAll().stream()
                .map(this::toOrderResponse)
                .toList();
    }

    public OrderResponse toOrderResponse(Order order) {
        return modelMapper.map(order, OrderResponse.class);
    }
}