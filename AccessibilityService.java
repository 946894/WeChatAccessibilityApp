package com.example.wechataccessibilityapp;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.util.Log;

public class MyAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.d("AccessibilityService", "Event: " + event.toString());
        // 这里可以根据事件类型或内容来执行自动化操作
    }

    @Override
    public void onInterrupt() {
        // 当服务中断时处理
    }
}
