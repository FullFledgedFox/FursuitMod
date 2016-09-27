package com.FullFledgedFox.FursuitMod;

import com.FullFledgedFox.FursuitMod.item.ItemFoxArmor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "fursuitmod", name = "Fursuit Mod", version = "v0.1")

		public class FursuitMod {

	
	
	//armor
		public static Item foxHelmet;
		public static Item foxChestplate;
		public static Item foxleggings;
		public static Item foxBoots;
	
	
	
	
	//How much armor absorbs
		public static final ItemArmor.ArmorMaterial foxArmorMaterial = EnumHelper.addArmorMaterial("foxArmorMaterial",5000,new int[]{2,7,5,3},30);


	/*forge loading stuffz*/
		@Mod.EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{
		//fox armor	
		foxHelmet = new ItemFoxArmor(foxArmorMaterial, 0, 0).setUnlocalizedName("ItemFoxHelmet").setTextureName("fursuitmod:itemfoxhelmet").setCreativeTab(tabFursuitMod);
		foxChestplate = new ItemFoxArmor(foxArmorMaterial, 0, 1).setUnlocalizedName("ItemFoxChestplate").setTextureName("fursuitmod:itemfoxchestplate").setCreativeTab(tabFursuitMod);
		foxleggings = new ItemFoxArmor(foxArmorMaterial, 0, 2).setUnlocalizedName("ItemFoxLeggings").setTextureName("fursuitmod:itemfoxleggings").setCreativeTab(tabFursuitMod);
		foxBoots = new ItemFoxArmor(foxArmorMaterial, 0, 3).setUnlocalizedName("ItemFoxBoots").setTextureName("fursuitmod:itemfoxboots").setCreativeTab(tabFursuitMod);
		
		GameRegistry.registerItem(foxHelmet, foxHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(foxChestplate, foxChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(foxleggings, foxleggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(foxBoots, foxBoots.getUnlocalizedName().substring(5));
		
		}
		@Mod.EventHandler
		public void Init(FMLInitializationEvent event)
		{
		//armor crafting	
		GameRegistry.addRecipe(new ItemStack(foxHelmet), new Object[]{"LLL","L L", 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(foxChestplate), new Object[]{"L L","LLL","LLL", 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(foxleggings), new Object[]{"LLL","L L","L L", 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(foxBoots), new Object[]{"L L","L L", 'L', Items.leather});
			
		
		
		
			
		}
		@Mod.EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{
			
		}
		
		public static CreativeTabs tabFursuitMod = new CreativeTabs("tabFursuitMod"){
			@Override
			public Item getTabIconItem(){
				return new ItemStack(Items.bone).getItem();
			}
		};
}
