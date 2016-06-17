package org.nader.sennet.generator.cli;

import java.io.File;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.nader.sennet.generator.Activator;
import org.nader.sennet.generator.util.ErrorCodeConstant;


public class CommandLineInterface {

	private Option cli_help = new Option("h", "help", false, "print this message");
	
	@SuppressWarnings("static-access")
	private Option output_Folder = OptionBuilder.withArgName("folder").hasArg().withDescription("generation folder").withLongOpt("outputFolder").create( //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
			"o");
	@SuppressWarnings("static-access")
	private Option in_file = OptionBuilder.withArgName("file").hasArg().withDescription("input model file").withLongOpt("inputFile").create( //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
			"i");
	
	private Options options = new Options();
	private CommandLineParser parser = new GnuParser();
	
	private Configuration configuration = new Configuration();
	
	public void load(String[] args) throws CoreException {
		if (0 == args.length) {

		} else {
			CommandLine commandLine;
			try {
				commandLine = parser.parse(options, args);
				
				// Help option
				if (commandLine.hasOption(cli_help.getOpt())) {
					configuration.setHelp(true);
					printHelp();
				}

				// Output folder option
				if (commandLine.hasOption(output_Folder.getOpt())) {
					configuration.setOutputFolder(new File(commandLine.getOptionValue(output_Folder.getOpt())));
				}


				// Input file option
				if (commandLine.hasOption(in_file.getOpt())) {
					configuration.setInputFile(new File(commandLine.getOptionValue(in_file.getOpt())));
				}


			} catch (ParseException e) {
				IStatus statusError = new Status(IStatus.ERROR, Activator.PLUGIN_ID, ErrorCodeConstant.CMD_LINE_ERROR,
						"Internal: Could not parse options for CommandLineInterface: " + e.getMessage(), e);//$NON-NLS-1$
				throw new CoreException(statusError);
			}
		}
	}

	private void printHelp() {
		System.out.println("<<<< Print the help >>>>");
	}
	
	public Configuration getConfiguration(){
		return configuration;
	}
}
