package org.nader.sennet.generator.app;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.nader.sennet.generator.SennetGenerator;
import org.nader.sennet.generator.cli.CommandLineInterface;
import org.nader.sennet.generator.cli.Configuration;
import org.nader.sennet.generator.util.ErrorCodeConstant;


public class GenApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// Print start message
		printStartMessage();
		
		// Get arguments
		String[] arguments = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		
		CommandLineInterface cmdLineInterface = new CommandLineInterface();
		cmdLineInterface.load(arguments);
		
		Configuration configuration = cmdLineInterface.getConfiguration();
		
		if (configuration.isHelp() || arguments.length == 0) {
			return ErrorCodeConstant.SUCCESS;
		}
		
		SennetGenerator generator = new SennetGenerator(configuration);
		
		// Validation
		IStatus validationStatus = generator.validate();
		if(!validationStatus.isOK()){
			System.err.println("Error while validating input model!");
			System.err.println(validationStatus.getMessage());
		}else{
			System.out.println("Validation OK");
		}
		
		// Generation
		IStatus generationStatus = generator.generate();
		if(!generationStatus.isOK()){
			System.err.println("Error while generating!");
			System.err.println(generationStatus.getMessage());
		}else{
			System.out.println("Generation done!");
		}
		
		
		
		return null;
	}

	private void printStartMessage() {
		System.out.println("Sensor Network generator started");
		
	}

	@Override
	public void stop() {
		// Nothing to handle
	}
}
