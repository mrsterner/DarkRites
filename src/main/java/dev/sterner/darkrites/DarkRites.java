package dev.sterner.darkrites;

import dev.sterner.darkrites.ritualfunction.DecayRitualFunction;
import ladysnake.requiem.api.v1.RequiemApi;
import ladysnake.requiem.api.v1.event.requiem.RemnantStateChangeCallback;
import ladysnake.requiem.api.v1.remnant.RemnantComponent;
import moriyashiine.bewitchment.api.registry.RitualFunction;
import moriyashiine.bewitchment.common.registry.BWRegistries;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class DarkRites implements ModInitializer {
	public static final String MODID = "darkrites";
	public static final RitualFunction DECAY = new DecayRitualFunction();


	@Override
	public void onInitialize(ModContainer mod) {
		RequiemApi.registerPlugin(new DarkRitesRequiemPlugin());
		Registry.register(BWRegistries.RITUAL_FUNCTIONS, new Identifier(MODID, "decay"), DECAY);

	}


}
