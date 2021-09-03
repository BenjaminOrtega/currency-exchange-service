package com.benjamin.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benjamin.microservices.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
