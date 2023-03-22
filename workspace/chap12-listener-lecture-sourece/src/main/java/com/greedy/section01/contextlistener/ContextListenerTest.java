package com.greedy.section01.contextlistener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerTest implements ServletContextListener,
		ServletContextAttributeListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context init!!");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destroyed!!");
	}
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		
	}
	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		
	}
	@Override
	public void attributeRemove(ServletContextAttributeEvent scae) {
		
	}

}
