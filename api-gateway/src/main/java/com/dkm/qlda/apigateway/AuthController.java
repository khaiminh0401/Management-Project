package com.dkm.qlda.apigateway;

import com.dkm.qlda.common.collection.User;
import com.dkm.qlda.common.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // Thực hiện xác thực user, kiểm tra mật khẩu, v.v.
        // Nếu xác thực thành công, sinh token và trả về
        String token = jwtUtil.generateToken(user.getUsername());
        return ResponseEntity.ok(token);
    }

    @GetMapping("/user/{token}")
    public ResponseEntity<String> getUserFromToken(@PathVariable String token) {
        String username = jwtUtil.getUsernameFromToken(token);
        return ResponseEntity.ok(username);
    }
}