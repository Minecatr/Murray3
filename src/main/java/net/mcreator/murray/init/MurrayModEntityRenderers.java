
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.murray.client.renderer.VexxesGunRenderer;
import net.mcreator.murray.client.renderer.VexxRenderer;
import net.mcreator.murray.client.renderer.UltraEndBowRenderer;
import net.mcreator.murray.client.renderer.ShurikenRenderer;
import net.mcreator.murray.client.renderer.RedPlasmaRenderer;
import net.mcreator.murray.client.renderer.PurpleSoldierRenderer;
import net.mcreator.murray.client.renderer.PurplePlasmaRenderer;
import net.mcreator.murray.client.renderer.OrnateRenderer;
import net.mcreator.murray.client.renderer.OrangePlasmaRenderer;
import net.mcreator.murray.client.renderer.MoltronRocketRenderer;
import net.mcreator.murray.client.renderer.MoltronMechRenderer;
import net.mcreator.murray.client.renderer.MagicSwordRenderer;
import net.mcreator.murray.client.renderer.LightningPlasmaRenderer;
import net.mcreator.murray.client.renderer.GreenPlasmaRenderer;
import net.mcreator.murray.client.renderer.GreenPlasmaMk2Renderer;
import net.mcreator.murray.client.renderer.FireballRenderer;
import net.mcreator.murray.client.renderer.ExplosiveShurikenRenderer;
import net.mcreator.murray.client.renderer.BruteRenderer;
import net.mcreator.murray.client.renderer.BluePlasmaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MurrayModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MurrayModEntities.ULTRA_END_BOW.get(), UltraEndBowRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.RED_PLASMA.get(), RedPlasmaRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.LIGHTNING_PLASMA.get(), LightningPlasmaRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.ORANGE_PLASMA.get(), OrangePlasmaRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.GREEN_PLASMA.get(), GreenPlasmaRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.BLUE_PLASMA.get(), BluePlasmaRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.PURPLE_PLASMA.get(), PurplePlasmaRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.SHURIKEN.get(), ShurikenRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.EXPLOSIVE_SHURIKEN.get(), ExplosiveShurikenRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.GREEN_PLASMA_MK_2.get(), GreenPlasmaMk2Renderer::new);
		event.registerEntityRenderer(MurrayModEntities.VEXXES_GUN.get(), VexxesGunRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.BLOW_ABILITY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.TELEPORT_ABILITY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.CHOMP_SPIT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.MOLTRON_MECH.get(), MoltronMechRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.MOLTRON_ROCKET.get(), MoltronRocketRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.PURPLE_SOLDIER.get(), PurpleSoldierRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.ORNATE.get(), OrnateRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.VEXX.get(), VexxRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.BRUTE.get(), BruteRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.MAGIC_SWORD.get(), MagicSwordRenderer::new);
		event.registerEntityRenderer(MurrayModEntities.FIREBALL.get(), FireballRenderer::new);
	}
}
