/*
 * generated by Xtext
 */
package org.nader.sennet.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.nader.sennet.xtext.ui.internal.DslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.ORG_NADER_SENNET_XTEXT_DSL);
	}
	
}
