
package com.example.tourism.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.Date;

public class JwtTokenGenerator {

    public static void main(String[] args) {

        String secret =
        "replace-this-with-the-same-secret-used-to-sign-your-token-123456";

        String token = Jwts.builder()
                .subject("tourism-user")
                .issuedAt(new Date())
                .expiration(
                    new Date(System.currentTimeMillis() + 3600000)
                )
                .signWith(
                    Keys.hmacShaKeyFor(secret.getBytes())
                )
                .compact();

        System.out.println("GENERATED JWT TOKEN:");
        System.out.println(token);
    }
}
