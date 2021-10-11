package com.wiqer.lua.lib;

import com.wiqer.lua.LuaValue;

class TableLibFunction extends LibFunction {
	@Override
	public LuaValue call() {
		return argerror(1, "table expected, got no value");
	}
}
