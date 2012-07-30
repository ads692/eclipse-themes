package net.jeeeyul.eclipse.themes.preference;

import org.eclipse.swt.graphics.RGB;

public interface IChromeThemeConfig {

	RGB getActivePartGradientEnd();

	RGB getActivePartGradientStart();

	int getSashWidth();

	boolean usePartShadow();
	
	void dispose();

}