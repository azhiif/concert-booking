package com.app.concertbooking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "concerts")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String concertName;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(nullable = false)
    private String venue;

    @Column(nullable = false)
    private Double ticketPrice;

    @Column(nullable = false)
    private Integer availableTickets;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}
