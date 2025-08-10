package com.example.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    private HelloController controller = new HelloController();

    @Test
    void hello_WithoutName_ShouldReturnDefaultMessage() {
        // テスト実行
        HelloController.HelloResponse response = controller.hello(null);
        
        // 検証
        assertNotNull(response);
        assertEquals("Hello, world!", response.getMessage());
    }

    @Test
    void hello_WithName_ShouldReturnCustomMessage() {
        // テスト実行
        HelloController.HelloResponse response = controller.hello("Amano");
        
        // 検証
        assertNotNull(response);
        assertEquals("Hello, Amano!", response.getMessage());
    }

    @Test
    void hello_WithEmptyName_ShouldReturnDefaultMessage() {
        // テスト実行
        HelloController.HelloResponse response = controller.hello("");
        
        // 検証
        assertNotNull(response);
        assertEquals("Hello, !", response.getMessage());
    }
}
