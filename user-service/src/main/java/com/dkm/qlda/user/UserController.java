package com.dkm.qlda.user;

import com.dkm.qlda.common.collection.User;
import com.dkm.qlda.common.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(ResponseDto.builder()
                .msg("")
                .data(userService.findAll())
                .success(true)
                .build());
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        System.out.println(user.toString());
        return ResponseEntity.ok(ResponseDto.builder()
                .msg("Đăng nhập thành công")
                .data(userService.login(user))
                .success(true)
                .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id){
        return ResponseEntity.ok(ResponseDto.builder()
                .msg("")
                .data(userService.findById(id))
                .success(true)
                .build());
    }
}
