package com.crawljax.core.configuration;

import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserOptions {

	public static final int MACBOOK_PRO_RETINA_PIXEL_DENSITY = 2;
	private boolean headless;
	private int pixelDensity;
	private FirefoxProfile profile = null;

	public boolean isUSE_CDP() {
		return USE_CDP;
	}

	/**
	 * Enables/Disables usage of Chrome Developer Protocol (CDP)
	 * @param USE_CDP
	 */
	public void setUSE_CDP(boolean USE_CDP) {
		this.USE_CDP = USE_CDP;
	}

	/**
	 * a flag available for chrome (use chrome developer tools)
	 */
	private boolean USE_CDP;

	public BrowserOptions() {
		this.headless = false;
		this.pixelDensity = -1;
		this.USE_CDP = false;
	}

	/**
	 * @param headless Set true for Chrome and Firefox browsers to run them in headless mode
	 */
	public BrowserOptions(boolean headless) {
//		super();
		this.headless = headless;
		this.pixelDensity = 1;
		this.USE_CDP = false;
	}

	/**
	 * @param pixelDensity Specify the device scale factor or pixel density : For MacBook Pro, it is 2: use
	 *                     the MACBOOK_PRO_RETINA_PIXEL_DENSITY constant
	 */
	public BrowserOptions(int pixelDensity) {
//		super();
		this.pixelDensity = pixelDensity;
		this.headless = false;
		this.USE_CDP = false;
	}

	/**
	 * @param headless     Set true for Chrome and Firefox browsers to run them in headless mode
	 * @param pixelDensity Specify the device scale factor or pixel density : For MacBook Pro, it is 2: use
	 *                     the MACBOOK_PRO_RETINA_PIXEL_DENSITY constant
	 */
	public BrowserOptions(boolean headless, int pixelDensity) {
		this.headless = headless;
		this.pixelDensity = pixelDensity;
		this.USE_CDP = false;
	}

	/**
	 * @param headless     Set true for Chrome and Firefox browsers to run them in headless mode
	 * @param pixelDensity Specify the device scale factor or pixel density : For MacBook Pro, it is 2: use
	 *                     the MACBOOK_PRO_RETINA_PIXEL_DENSITY constant
	 * @param USE_CDP       Set true if you want to enable chrome developer tools (Used in clickable detection)
	 */
	public BrowserOptions(boolean headless, int pixelDensity, boolean USE_CDP) {
		this.headless = headless;
		this.pixelDensity = pixelDensity;
		this.USE_CDP = USE_CDP;
	}
	
	public void setProfile(FirefoxProfile profile) {
		this.profile = profile;
	}

	public boolean isHeadless() {
		return this.headless;
	}

	public int getPixelDensity() {
		return pixelDensity;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "( headless: " + this.headless + ", pixelDensity: " + this.pixelDensity + ", USE_CDP : " + this.USE_CDP
				+ ")";
	}

	public FirefoxProfile getProfile() {
		return this.profile;
	}

}
