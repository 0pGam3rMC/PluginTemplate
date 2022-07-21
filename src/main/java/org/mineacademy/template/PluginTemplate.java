package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.Valid;
import org.mineacademy.fo.model.HookManager;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 *
 */
public final class PluginTemplate extends SimplePlugin {
			/*
		- Java is Object Oriented

		- Some Variables are objects and some are not
		- The Variables that are not objects are called "primitive types"
		- Difference? Primitive types are generally
		colored in my IDE and lower-cased.
		Objects are in plain black and start with a capital
		boolean isAlive = true; // boolean is not an Object( its a primitive type)
		String isAlive2 = "Is Alive"; // String is an Object

        */
		/*
		Primitive Types you cant really do much with
		their variables.. 'calling' the variable isAlive will
		not be able to do much with it, but calling the variable
		isAlive2 has other methods listed that you can use.

		 */
	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {


		System.out.println("The Plugin Template has been loaded" + "....Thanks to NajeeSlays being so wonderful LOL. By the way 1+1 is " + ( 1 + 1 ) );

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.COW)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
	}
}