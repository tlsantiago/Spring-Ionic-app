package com.santiago.springionicstore.services;

import org.springframework.mail.SimpleMailMessage;

import com.santiago.springionicstore.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
