package com.example.demoreactivefsm.routing.greetings;

import com.example.demoreactivefsm.services.greetings.Core;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class GreetingRouter {
	@Bean
	public RouterFunction<ServerResponse> routeGreeting(@NotNull Core core) {
		return RouterFunctions.route(
						GET("/hello").and(accept(MediaType.APPLICATION_JSON)),
						core::hello);
	}
}