package sia.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import org.springframework.cloud.gateway.filter.GlobalFilter;

public class CustomGlobalFilter implements Ordered, GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
        System.out.println(exchange.getRequest().getPath());

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 100;
    }
}
