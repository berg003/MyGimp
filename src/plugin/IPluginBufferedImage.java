package plugin;

import java.awt.image.BufferedImage;

/**
 * All your plugins must implement this interface.
 * Don't modify it.
 */
public interface IPluginBufferedImage
{
	public BufferedImage perform (BufferedImage img);
	String getName();
}
