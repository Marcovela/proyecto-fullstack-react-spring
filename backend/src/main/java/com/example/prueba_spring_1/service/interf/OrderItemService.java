package com.example.prueba_spring_1.service.interf;

import com.example.prueba_spring_1.dto.OrderRequest;
import com.example.prueba_spring_1.dto.Response;
import com.example.prueba_spring_1.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);

    Response updateOrderItemStatus(Long orderItemId, String status);

    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId,
            Pageable pageable);
}
