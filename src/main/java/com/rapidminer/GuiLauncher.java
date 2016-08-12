package com.rapidminer;

import java.nio.file.Paths;

import com.rapidminer.gui.RapidMinerGUI;
import com.rapidminer.tools.PlatformUtilities;

public class GuiLauncher {

	public static void main(String args[]) throws Exception {
		System.setProperty(PlatformUtilities.PROPERTY_RAPIDMINER_HOME, Paths.get("").toAbsolutePath().toString());
		PlatformUtilities.initialize();
		RapidMinerGUI.main(args);
	}

}
