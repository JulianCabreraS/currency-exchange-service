package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>
{
    ExchangeValue findByFromAndTo(String from, String to);
}
