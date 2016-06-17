package org.nader.sennet.generator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.nader.sennet.generator.cli.Configuration;

public class SennetGenerator {

	private Configuration configuration;
	
	public SennetGenerator(Configuration configuration){
		this.configuration = configuration;
	}
	
	public IStatus validate(){
		return Status.OK_STATUS;
	}
	
	public IStatus generate(){
		return Status.OK_STATUS;
	}
}
