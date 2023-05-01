package com.currency.exchange.beans;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="currency")
public class CurrencyExchange {
    @Id
    private Long id;
    
    @Column(name="CURRENCY_FROM")
    private String from;
    
    @Column(name="CURRENCY_TO")
    private String to;
    
    @Column(name="CONVERSION_MULTIPLE")
    private BigDecimal conversionMultiple;
    
    @Column(name="ENV")
    private String env;
}
