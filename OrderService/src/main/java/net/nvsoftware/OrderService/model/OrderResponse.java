package net.nvsoftware.OrderService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class OrderResponse {
    private long orderId;
    private Instant orderDate;
    private long totalAmount;
    private String orderStatus;
    private ProductResponse productResponse;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProductResponse {
        private Long id;
        private String name;
        private Long price;
        private Long quantity;
    }
}
