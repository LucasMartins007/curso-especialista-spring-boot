package com.smart.esrfood.di.notificador;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("notificador.email")
public class NotificadoProperties {

	/**
	 * Host do servidor de E-mail
	 */
	private String hostServidor;
	
	/**
	 * Porta do servidor de E-mail
	 */
	private Integer portaServidor = 25;
	
	
	public String getHostServidor() {
		return hostServidor;
	}
	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}
	public Integer getPortaServidor() {
		return portaServidor;
	}
	public void setPortaServidor(Integer portaServidor) {
		this.portaServidor = portaServidor;
	}
	
	
}
