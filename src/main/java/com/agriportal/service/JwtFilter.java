package com.agriportal.service;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        String requestURI = request.getRequestURI();

        // ✅ Allow login API without token
        if (requestURI.contains("/auth/login")) {
            filterChain.doFilter(request, response);
            return;
        }

        // 🔐 Get Authorization header
        String authHeader = request.getHeader("Authorization");

        // ❌ If no token or invalid format
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Missing or Invalid Token");
            return;
        }

        // ✅ Extract token (for future validation)
        String token = authHeader.substring(7);

        // 👉 (Optional) You can validate token here later

        // ✅ Continue request
        filterChain.doFilter(request, response);
    }
}