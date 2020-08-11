package com.gmail.sneakdevs;

import com.gmail.sneakdevs.content.blocks.LavaSponges;
import com.gmail.sneakdevs.content.blocks.WaterSponges;
import net.fabricmc.api.ModInitializer;


public class SpongesPlus implements ModInitializer {

	@Override
	public void onInitialize() {

		new LavaSponges();
		new WaterSponges();

	}

}
