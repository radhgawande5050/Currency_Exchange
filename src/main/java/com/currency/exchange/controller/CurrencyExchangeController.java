package com.currency.exchange.controller;


import com.currency.exchange.beans.CurrencyExchange;
import com.currency.exchange.repository.CurrencyExchangeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
  @Autowired
  private CurrencyExchangeRepository repo;
  
  @Autowired
  Environment env;

  @GetMapping("/currencyEx/from/{from}/to/{to}")
  public CurrencyExchange retrivecurrencyExchange(@PathVariable String from, @PathVariable String to) {
      CurrencyExchange currencyExchange = repo.findByFromAndTo(from, to);
           String property = env.getProperty("local.server.port");
      currencyExchange.setEnv(property);
      return currencyExchange;
	
	}
}
