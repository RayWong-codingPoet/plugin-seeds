package com.dotcms.viewtool;

import org.apache.velocity.tools.view.tools.ViewTool;

public class HelloViewTool implements ViewTool {
	
	public String hello() {
		return "Hello World viewtool";
	}


    public void init(Object obj) {
    
    }
}

