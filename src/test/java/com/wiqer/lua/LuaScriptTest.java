package com.wiqer.lua;

import com.wiqer.lua.lib.jse.JsePlatform;
import org.junit.Test;

import java.io.File;

public class LuaScriptTest {
    @Test
    public void hello() {
        String script = "print( 'hello, world' )";
        Globals globals = JsePlatform.standardGlobals();
        LuaValue chunk =  globals.load(script);
        chunk.call( LuaValue.valueOf(script) );
    }
    @Test
    public void hello2() {
        String script = "src\\test\\java\\com\\wiqer\\lua\\luascript/hello.lua";

        File file= new File(script);
        System.out.println(file.toURI());

        // create an environment to run in
        Globals globals = JsePlatform.standardGlobals();

        // Use the convenience function on Globals to load a chunk.
        LuaValue chunk = globals.loadfile(script);

        // Use any of the "call()" or "invoke()" functions directly on the chunk.
        chunk.call( LuaValue.valueOf(script) );
    }

}
