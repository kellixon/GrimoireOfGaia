package gaia.proxy;

import gaia.GaiaConfig;
import gaia.entity.EntityMobAssistBase;
import gaia.entity.EntityMobHostileBase;
import gaia.items.ItemWeaponBookBattle;
import gaia.items.ItemWeaponBookBuff;
import gaia.items.ItemWeaponBookEnder;
import gaia.items.ItemWeaponBookFreezing;
import gaia.items.ItemWeaponBookHunger;
import gaia.items.ItemWeaponBookMetal;
import gaia.items.ItemWeaponBookNature;
import gaia.items.ItemWeaponBookNightmare;
import gaia.items.ItemWeaponBookWither;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy {
	public void registerRenders() {
	}

	@SuppressWarnings("squid:S1186") // Overridden in @ClientProxy
	public void addClientRegister(IClientRegister register) {
	}

	public void registerHandlers() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	// TODO Needs further tweaking
//	@SubscribeEvent
//	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
//		if (GaiaConfig.SPAWN.spawnDaysPassed) {
//			event.player.sendMessage(new TextComponentString("" + TextFormatting.BOLD + TextFormatting.YELLOW + "[Grimoire of Gaia]" + I18n.format("text.grimoireofgaia.spawnDaysPassed")));
//			event.player.sendMessage(new TextComponentString(TextFormatting.YELLOW + I18n.format("text.grimoireofgaia.SpawnDaysSet", GaiaConfig.SPAWN.spawnDaysSet)));
//		}
//	}

	@SubscribeEvent
	public void debugGaiaSpawn(CheckSpawn event) {
		if (GaiaConfig.DEBUG.debugSpawn) {
			if (event.getEntity() instanceof EntityMobAssistBase || event.getEntity() instanceof EntityMobHostileBase) {
				EntityLiving living = (EntityLiving) event.getEntity();
				if (living.getCanSpawnHere()) {
					event.setResult(Event.Result.ALLOW);
				} else {
					event.setResult(Event.Result.DENY);
				}
			} else {
				event.setResult(Event.Result.DENY);
			}
		}
	}

	@SubscribeEvent
	public void onAttackWithWeaponBooks(AttackEntityEvent event) {
		if (event.getTarget() == null || event.getEntityPlayer() == null) {
			return;
		}
		EntityPlayer player = event.getEntityPlayer();
		Entity mob = event.getTarget();
		if (player.getHeldItemOffhand().isEmpty()) {
			return;
		}
		ItemStack offHand = player.getHeldItemOffhand();

		if (offHand.getItem() instanceof ItemWeaponBookBattle) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookBuff) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 600, 0));
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 600, 0));
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 80, 3));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookEnder) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookFreezing) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookHunger) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.HUNGER, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookMetal) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookNature) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.POISON, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookNightmare) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 80, 0));
			damageBook(player, offHand);
		}

		if (offHand.getItem() instanceof ItemWeaponBookWither) {
			((EntityLivingBase) mob).addPotionEffect(new PotionEffect(MobEffects.WITHER, 80, 0));
			damageBook(player, offHand);
		}
	}

	/**
	 * Method used for handling book damage while in off-hand slot
	 */
	private void damageBook(EntityPlayer player, ItemStack stack) {
		// Creative check
		if (player.capabilities.isCreativeMode) {
			return;
		}
		stack.damageItem(2, player);

		// Manually send an update to destroy the item otherwise client doesn't sync correctly here
		if (stack.getItemDamage() <= 0) {
			player.inventory.setInventorySlotContents(40, ItemStack.EMPTY);
		}
	}

	public void registerTileRenders() {
	}

	public void registerLayerRenders() {
	}
}
