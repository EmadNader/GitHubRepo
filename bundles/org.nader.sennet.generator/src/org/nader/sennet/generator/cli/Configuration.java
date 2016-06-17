package org.nader.sennet.generator.cli;

import java.io.File;

public class Configuration {

	private boolean help = false;
	
	private File inputFile;
	private File outputFolder;
	
	
	public boolean isHelp(){
		return help;
	}
	
	public void setHelp(boolean help){
		this.help = help;
	}

	public File getInputFile() {
		return inputFile;
	}

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public File getOutputFolder() {
		return outputFolder;
	}

	public void setOutputFolder(File outputFolder) {
		this.outputFolder = outputFolder;
	}
}
