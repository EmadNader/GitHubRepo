/*
 * generated by Xtext
 */
package org.nader.sennet.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSNDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet/nt"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet/jb"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet/pt"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet/sn"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet/nd"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.nader.org/sennet/jb/ac"));
		return result;
	}
}