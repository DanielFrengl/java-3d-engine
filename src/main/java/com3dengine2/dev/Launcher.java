package com3dengine2.dev;

import comcore.EngineManager;
import comcore.WindowManager;
import comcore.utils.Consts;
import org.lwjgl.Version;

import java.awt.*;

public class Launcher {
    private static WindowManager window;
    private static EngineManager engine;

    public static void main(String[] args) {
         window = new WindowManager(Consts.TITLE, 1280, 720, false);
         engine = new EngineManager();

         try{
             engine.start();
         }
         catch(Exception e){
             e.printStackTrace();
         }
    }

    public static WindowManager getWindow() {
        return window;
    }
}
