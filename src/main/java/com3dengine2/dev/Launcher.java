package com3dengine2.dev;

import comcore.WindowManager;
import org.lwjgl.Version;

import java.awt.*;

public class Launcher {

    public static void main(String[] args) {
        System.out.println(Version.getVersion());
        WindowManager window = new WindowManager("Engine 3D", 1280, 720, false);
        window.init();

        while(!window.windowShouldClose()) {
            window.update();
        }

        window.cleanup();
    }

}
