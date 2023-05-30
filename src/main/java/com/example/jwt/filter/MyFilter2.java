package com.example.jwt.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 계속 reprocess를 하기 위해서
        System.out.println("필터1");
        chain.doFilter(request, response);
    }
}
