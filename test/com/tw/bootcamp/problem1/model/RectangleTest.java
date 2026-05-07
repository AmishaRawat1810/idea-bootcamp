package com.tw.bootcamp.problem1.model;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RectangleTest {
    @Test
    void shouldCreateRectangle() {
        Rectangle mockRectangle = mock(Rectangle.class);

        when(mockRectangle.calculateArea()).thenReturn(20);

        int area = mockRectangle.calculateArea();
        assertEquals(20, area);

        InOrder inOrder = inOrder(mockRectangle);
        inOrder.verify(mockRectangle).calculateArea();
    }
}