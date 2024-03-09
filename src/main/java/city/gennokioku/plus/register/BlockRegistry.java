package city.gennokioku.plus.register;

import city.gennokioku.plus.block.MetroFacilities.*;
import city.gennokioku.plus.block.Nature;
import city.gennokioku.plus.util.RegistryKey;
import city.gennokioku.plus.util.Util;
import city.gennokioku.plus.block.MetroLines;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * 本类用于注册所有方块项目
 *
 * */

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Util.MODID);

    public static final RegistryObject<Block> platform_block = BLOCKS.register(RegistryKey.PLATFORM_BLOCK, Platform.PlatformBlock::new);
    public static final RegistryObject<Block> platform_left_1 = BLOCKS.register(RegistryKey.PLATFORM_LEFT_1, Platform.PlatformLeft1::new);
    public static final RegistryObject<Block> platform_left_2 = BLOCKS.register(RegistryKey.PLATFORM_LEFT_2, Platform.PlatformLeft2::new);
    public static final RegistryObject<Block> platform_right_2 = BLOCKS.register(RegistryKey.PLATFORM_RIGHT_2, Platform.PlatformRight2::new);
    public static final RegistryObject<Block> platform_right_1 = BLOCKS.register(RegistryKey.PLATFORM_RIGHT_1, Platform.PlatformRight1::new);
    public static final RegistryObject<Block> light_box_dark = BLOCKS.register(RegistryKey.LIGHT_BOX_DARK, LightBox.LightBoxDark::new);
    public static final RegistryObject<Block> light_box_light = BLOCKS.register(RegistryKey.LIGHT_BOX_LIGHT, LightBox.LightBoxLight::new);
    public static final RegistryObject<Block> light_box_entrance = BLOCKS.register(RegistryKey.LIGHT_BOX_ENTRANCE, LightBoxEntrance.LightBoxEntranceImpl::new);
    public static final RegistryObject<Block> screen_door_cover_dark = BLOCKS.register(RegistryKey.SCREEN_DOOR_COVER_DARK, ScreenDoorCover.ScreenDoorCoverDark::new);
    public static final RegistryObject<Block> screen_door_cover_light = BLOCKS.register(RegistryKey.SCREEN_DOOR_COVER_LIGHT, ScreenDoorCover.ScreenDoorCoverLight::new);
    public static final RegistryObject<Block> screen_door_cover_dark_3 = BLOCKS.register(RegistryKey.SCREEN_DOOR_COVER_DARK_3, ScreenDoorCover.ScreenDoorCoverDark3::new);
    public static final RegistryObject<Block> screen_door_cover_light_3 = BLOCKS.register(RegistryKey.SCREEN_DOOR_COVER_LIGHT_3, ScreenDoorCover.ScreenDoorCoverLight3::new);
    public static final RegistryObject<Block> railway_transit_logo = BLOCKS.register(RegistryKey.RAILWAY_TRANSIT_LOGO, RailwayTransitLogoBlock.RailwayTransitLogoBlockImpl::new);
    public static final RegistryObject<Block> lollipop_column = BLOCKS.register(RegistryKey.LOLLIPOP_COLUMN_INSIDE, LollipopColumn.LollipopColumnInside::new);
    public static final RegistryObject<Block> lollipop_column_entrance = BLOCKS.register(RegistryKey.LOLLIPOP_COLUMN_ENTRANCE, LollipopColumn.LollipopColumnEntrance::new);
    public static final RegistryObject<Block> screen_door_full_left = BLOCKS.register(RegistryKey.SCREEN_DOOR_FULL_LEFT, ScreenDoor.ScreenDoorFullLeft::new);
    public static final RegistryObject<Block> screen_door_full_right = BLOCKS.register(RegistryKey.SCREEN_DOOR_FULL_RIGHT, ScreenDoor.ScreenDoorFullRight::new);
    public static final RegistryObject<Block> screen_door_full_glass = BLOCKS.register(RegistryKey.SCREEN_DOOR_FULL_GLASS, ScreenDoor.ScreenDoorFullGlass::new);
    public static final RegistryObject<Block> screen_door_full_glass_terminus = BLOCKS.register(RegistryKey.SCREEN_DOOR_FULL_GLASS_TERMINUS, ScreenDoor.ScreenDoorFullGlassTerminus::new);
    public static final RegistryObject<Block> entrance_number_a = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_A, EntranceNumber.EntranceNumberA::new);
    public static final RegistryObject<Block> entrance_number_a_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_A_1, EntranceNumber.EntranceNumberA1::new);
    public static final RegistryObject<Block> entrance_number_a_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_A_2, EntranceNumber.EntranceNumberA2::new);
    public static final RegistryObject<Block> entrance_number_a_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_A_3, EntranceNumber.EntranceNumberA3::new);
    public static final RegistryObject<Block> entrance_number_b = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_B, EntranceNumber.EntranceNumberB::new);
    public static final RegistryObject<Block> entrance_number_b_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_B_1, EntranceNumber.EntranceNumberB1::new);
    public static final RegistryObject<Block> entrance_number_b_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_B_2, EntranceNumber.EntranceNumberB2::new);
    public static final RegistryObject<Block> entrance_number_b_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_B_3, EntranceNumber.EntranceNumberB3::new);
    public static final RegistryObject<Block> entrance_number_c = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_C, EntranceNumber.EntranceNumberC::new);
    public static final RegistryObject<Block> entrance_number_c_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_C_1, EntranceNumber.EntranceNumberC1::new);
    public static final RegistryObject<Block> entrance_number_c_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_C_2, EntranceNumber.EntranceNumberC2::new);
    public static final RegistryObject<Block> entrance_number_c_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_C_3, EntranceNumber.EntranceNumberC3::new);
    public static final RegistryObject<Block> entrance_number_d = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_D, EntranceNumber.EntranceNumberD::new);
    public static final RegistryObject<Block> entrance_number_d_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_D_1, EntranceNumber.EntranceNumberD1::new);
    public static final RegistryObject<Block> entrance_number_d_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_D_2, EntranceNumber.EntranceNumberD2::new);
    public static final RegistryObject<Block> entrance_number_d_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_D_3, EntranceNumber.EntranceNumberD3::new);
    public static final RegistryObject<Block> entrance_number_e = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_E, EntranceNumber.EntranceNumberE::new);
    public static final RegistryObject<Block> entrance_number_e_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_E_1, EntranceNumber.EntranceNumberE1::new);
    public static final RegistryObject<Block> entrance_number_e_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_E_2, EntranceNumber.EntranceNumberE2::new);
    public static final RegistryObject<Block> entrance_number_e_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_E_3, EntranceNumber.EntranceNumberE3::new);
    public static final RegistryObject<Block> entrance_number_f = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_F, EntranceNumber.EntranceNumberF::new);
    public static final RegistryObject<Block> entrance_number_f_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_F_1, EntranceNumber.EntranceNumberF1::new);
    public static final RegistryObject<Block> entrance_number_f_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_F_2, EntranceNumber.EntranceNumberF2::new);
    public static final RegistryObject<Block> entrance_number_f_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_F_3, EntranceNumber.EntranceNumberF3::new);
    public static final RegistryObject<Block> entrance_number_g = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_G, EntranceNumber.EntranceNumberG::new);
    public static final RegistryObject<Block> entrance_number_g_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_G_1, EntranceNumber.EntranceNumberG1::new);
    public static final RegistryObject<Block> entrance_number_g_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_G_2, EntranceNumber.EntranceNumberG2::new);
    public static final RegistryObject<Block> entrance_number_g_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_G_3, EntranceNumber.EntranceNumberG3::new);
    public static final RegistryObject<Block> entrance_number_h = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_H, EntranceNumber.EntranceNumberH::new);
    public static final RegistryObject<Block> entrance_number_h_1 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_H_1, EntranceNumber.EntranceNumberH1::new);
    public static final RegistryObject<Block> entrance_number_h_2 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_H_2, EntranceNumber.EntranceNumberH2::new);
    public static final RegistryObject<Block> entrance_number_h_3 = BLOCKS.register(RegistryKey.ENTRANCE_NUMBER_H_3, EntranceNumber.EntranceNumberH3::new);
    public static final RegistryObject<Block> line_1 = BLOCKS.register(RegistryKey.LINE_1, MetroLines.Line1::new);
    public static final RegistryObject<Block> line_2 = BLOCKS.register(RegistryKey.LINE_2, MetroLines.Line2::new);
    public static final RegistryObject<Block> line_3 = BLOCKS.register(RegistryKey.LINE_3, MetroLines.Line3::new);
    public static final RegistryObject<Block> line_4 = BLOCKS.register(RegistryKey.LINE_4, MetroLines.Line4::new);
    public static final RegistryObject<Block> line_5 = BLOCKS.register(RegistryKey.LINE_5, MetroLines.Line5::new);
    public static final RegistryObject<Block> line_6 = BLOCKS.register(RegistryKey.LINE_6, MetroLines.Line6::new);
    public static final RegistryObject<Block> line_7 = BLOCKS.register(RegistryKey.LINE_7, MetroLines.Line7::new);
    public static final RegistryObject<Block> line_8 = BLOCKS.register(RegistryKey.LINE_8, MetroLines.Line8::new);
    public static final RegistryObject<Block> line_9 = BLOCKS.register(RegistryKey.LINE_9, MetroLines.Line9::new);
    public static final RegistryObject<Block> line_10 = BLOCKS.register(RegistryKey.LINE_10, MetroLines.Line10::new);
    public static final RegistryObject<Block> line_11 = BLOCKS.register(RegistryKey.LINE_11, MetroLines.Line11::new);
    public static final RegistryObject<Block> line_12 = BLOCKS.register(RegistryKey.LINE_12, MetroLines.Line12::new);
    public static final RegistryObject<Block> line_13 = BLOCKS.register(RegistryKey.LINE_13, MetroLines.Line13::new);
    public static final RegistryObject<Block> line_15 = BLOCKS.register(RegistryKey.LINE_15, MetroLines.Line15::new);
    public static final RegistryObject<Block> line_16 = BLOCKS.register(RegistryKey.LINE_16, MetroLines.Line16::new);
    public static final RegistryObject<Block> line_17 = BLOCKS.register(RegistryKey.LINE_17, MetroLines.Line17::new);
    public static final RegistryObject<Block> line_18 = BLOCKS.register(RegistryKey.LINE_18, MetroLines.Line18::new);
    public static final RegistryObject<Block> line_20 = BLOCKS.register(RegistryKey.LINE_20, MetroLines.Line20::new);
    public static final RegistryObject<Block> line_21 = BLOCKS.register(RegistryKey.LINE_21, MetroLines.Line21::new);
    public static final RegistryObject<Block> line_24 = BLOCKS.register(RegistryKey.LINE_24, MetroLines.Line24::new);
    public static final RegistryObject<Block> line_25 = BLOCKS.register(RegistryKey.LINE_25, MetroLines.Line25::new);
    public static final RegistryObject<Block> line_s1 = BLOCKS.register(RegistryKey.LINE_S1, MetroLines.LineS1::new);
    public static final RegistryObject<Block> line_s2 = BLOCKS.register(RegistryKey.LINE_S2, MetroLines.LineS2::new);
    public static final RegistryObject<Block> line_s3 = BLOCKS.register(RegistryKey.LINE_S3, MetroLines.LineS3::new);
    public static final RegistryObject<Block> line_s4 = BLOCKS.register(RegistryKey.LINE_S4, MetroLines.LineS4::new);
    public static final RegistryObject<Block> line_ll = BLOCKS.register(RegistryKey.LINE_LL, MetroLines.LineLL::new);
    public static final RegistryObject<Block> line_mn_ms = BLOCKS.register(RegistryKey.LINE_MN_MS, MetroLines.LineMNMS::new);
    public static final RegistryObject<Block> line_c5 = BLOCKS.register(RegistryKey.LINE_C5, MetroLines.LineC5::new);
    public static final RegistryObject<Block> basalt = BLOCKS.register(RegistryKey.BASALT, Nature.BasaltBlock::new);
    public static final RegistryObject<Block> basalt_brick = BLOCKS.register(RegistryKey.BASALT_BRICK, Nature.BasaltBrickBlock::new);
    public static final RegistryObject<Block> basalt_circle = BLOCKS.register(RegistryKey.BASALT_CIRCLE, Nature.BasaltCircleBlock::new);
    public static final RegistryObject<Block> dirt_way = BLOCKS.register(RegistryKey.DIRT_WAY, Nature.DirtWayBlock::new);
    public static final RegistryObject<Block> dirt_way_grey = BLOCKS.register(RegistryKey.DIRT_WAY_GREY, Nature.DirtWayGreyBlock::new);
}
