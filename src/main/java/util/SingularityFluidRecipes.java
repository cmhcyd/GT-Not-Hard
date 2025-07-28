package util;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.BWGTMaterialReference;
import bartworks.system.material.WerkstoffLoader;
import galaxyspace.core.register.GSMaterials;
import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.MaterialsBotania;
import gregtech.api.enums.MaterialsKevlar;
import gregtech.api.enums.MaterialsOreAlum;
import gregtech.api.enums.MaterialsUEVplus;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gtnhlanth.common.register.BotWerkstoffMaterialPool;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class SingularityFluidRecipes {

    public static final Map<String, Map<Integer, FluidStack>> VoidFliudRecipes = new HashMap<>();

    public static final RecipeMap<RecipeMapBackend> addVoidFluidRecipes = RecipeMapBuilder.of("Singularity")
        .maxIO(0, 0, 0, 1)
        .minInputs(0, 0)
        .build();

    public static void addSingularityFluidRecipes(String Dim, FluidStack OutPutFluid) {
        GTValues.RA.stdBuilder()
            .fluidOutputs(OutPutFluid)
            // .noOptimize()
            .fake()
            .setNEIDesc(Dim)
            .duration(60)
            .eut(0)
            .addTo(addVoidFluidRecipes);
    }

    public static void addVoidFliudRecipes() {
        // T0 - Overworld - Ow
        Map<Integer, FluidStack> OverworldRecipes = new HashMap<>();
        OverworldRecipes.put(0, Materials.Aluminium.getMolten(1000));
        OverworldRecipes.put(1, Materials.Caesium.getMolten(1000));
        OverworldRecipes.put(2, Materials.Calcium.getMolten(1000));
        OverworldRecipes.put(3, Materials.Chrome.getMolten(1000));
        OverworldRecipes.put(4, Materials.Copper.getMolten(1000));
        OverworldRecipes.put(5, Materials.Gold.getMolten(1000));
        OverworldRecipes.put(6, Materials.Iron.getMolten(1000));
        OverworldRecipes.put(7, Materials.Lithium.getMolten(1000));
        OverworldRecipes.put(8, Materials.Magnesium.getMolten(1000));
        OverworldRecipes.put(9, Materials.Manganese.getMolten(1000));
        OverworldRecipes.put(10, Materials.Nickel.getMolten(1000));
        OverworldRecipes.put(11, Materials.Niobium.getMolten(1000));
        OverworldRecipes.put(12, Materials.Potassium.getMolten(1000));
        OverworldRecipes.put(13, Materials.Redstone.getMolten(1000));
        OverworldRecipes.put(14, Materials.Silicon.getMolten(1000));
        OverworldRecipes.put(15, Materials.Tantalum.getMolten(1000));
        OverworldRecipes.put(16, Materials.Tin.getMolten(1000));
        OverworldRecipes.put(17, Materials.Vanadium.getMolten(1000));

        OverworldRecipes.put(18, Materials.Mercury.getFluid(1000));
        OverworldRecipes.put(19, Materials.Oil.getFluid(1000));
        OverworldRecipes.put(20, Materials.OilHeavy.getFluid(1000));
        OverworldRecipes.put(21, Materials.OilLight.getFluid(1000));
        OverworldRecipes.put(22, Materials.OilMedium.getFluid(1000));

        OverworldRecipes.put(23, Materials.Chlorine.getGas(1000));
        OverworldRecipes.put(24, Materials.Fluorine.getGas(1000));
        OverworldRecipes.put(25, Materials.Hydrogen.getGas(1000));
        OverworldRecipes.put(26, Materials.NatruralGas.getGas(1000));
        OverworldRecipes.put(27, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < OverworldRecipes.size(); i++) {
            FluidStack OutPutFluid = OverworldRecipes.get(i);
            addSingularityFluidRecipes("T0: Overworld", OutPutFluid);
        }

        // T0 - Nether - Ne
        Map<Integer, FluidStack> NetherRecipes = new HashMap<>();
        NetherRecipes.put(0, Materials.Aluminium.getMolten(1000));
        NetherRecipes.put(1, Materials.Antimony.getMolten(1000));
        NetherRecipes.put(2, Materials.Barium.getMolten(1000));
        NetherRecipes.put(3, Materials.Beryllium.getMolten(1000));
        NetherRecipes.put(4, Materials.Calcium.getMolten(1000));
        NetherRecipes.put(5, Materials.Chrome.getMolten(1000));
        NetherRecipes.put(6, Materials.Copper.getMolten(1000));
        NetherRecipes.put(7, Materials.Electrotine.getMolten(1000));
        NetherRecipes.put(8, Materials.Iron.getMolten(1000));
        NetherRecipes.put(9, Materials.Lead.getMolten(1000));
        NetherRecipes.put(10, Materials.Manganese.getMolten(1000));
        NetherRecipes.put(11, Materials.Molybdenum.getMolten(1000));
        NetherRecipes.put(12, Materials.Potassium.getMolten(1000));
        NetherRecipes.put(13, Materials.Silicon.getMolten(1000));
        NetherRecipes.put(14, Materials.Tantalum.getMolten(1000));
        NetherRecipes.put(15, Materials.Thorium.getMolten(1000));
        NetherRecipes.put(16, Materials.Zinc.getMolten(1000));

        NetherRecipes.put(17, Materials.Lava.getFluid(1000));
        NetherRecipes.put(18, Materials.Mercury.getFluid(1000));

        NetherRecipes.put(19, Materials.Hydrogen.getGas(1000));
        NetherRecipes.put(20, Materials.Nitrogen.getGas(1000));
        NetherRecipes.put(21, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < NetherRecipes.size(); i++) {
            FluidStack OutPutFluid = NetherRecipes.get(i);
            addSingularityFluidRecipes("T0: Nether", OutPutFluid);
        }

        // T0 - Twilight - TF
        Map<Integer, FluidStack> TwilightRecipes = new HashMap<>();
        TwilightRecipes.put(0, Materials.Aluminium.getMolten(1000));
        TwilightRecipes.put(1, Materials.Arsenic.getMolten(1000));
        TwilightRecipes.put(2, Materials.Calcium.getMolten(1000));
        TwilightRecipes.put(3, Materials.Cobalt.getMolten(1000));
        TwilightRecipes.put(4, Materials.Copper.getMolten(1000));
        TwilightRecipes.put(5, Materials.Gold.getMolten(1000));
        TwilightRecipes.put(6, Materials.Iron.getMolten(1000));
        TwilightRecipes.put(7, Materials.Lead.getMolten(1000));
        TwilightRecipes.put(8, Materials.Lithium.getMolten(1000));
        TwilightRecipes.put(9, Materials.Magnesium.getMolten(1000));
        TwilightRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        TwilightRecipes.put(11, Materials.Nickel.getMolten(1000));
        TwilightRecipes.put(12, Materials.Niobium.getMolten(1000));
        TwilightRecipes.put(13, Materials.Potassium.getMolten(1000));
        TwilightRecipes.put(14, Materials.Silicon.getMolten(1000));
        TwilightRecipes.put(15, Materials.Silver.getMolten(1000));
        TwilightRecipes.put(16, Materials.Tin.getMolten(1000));
        TwilightRecipes.put(17, Materials.Vanadium.getMolten(1000));

        TwilightRecipes.put(18, Materials.Mercury.getFluid(1000));

        TwilightRecipes.put(19, Materials.Chlorine.getGas(1000));
        TwilightRecipes.put(20, Materials.Fluorine.getGas(1000));
        TwilightRecipes.put(21, Materials.Hydrogen.getGas(1000));
        TwilightRecipes.put(22, Materials.Nitrogen.getGas(1000));
        TwilightRecipes.put(23, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TwilightRecipes.size(); i++) {
            FluidStack OutPutFluid = TwilightRecipes.get(i);
            addSingularityFluidRecipes("T0: Twilight", OutPutFluid);
        }

        // T0 - TheEnd - ED
        Map<Integer, FluidStack> TheEndRecipes = new HashMap<>();
        TheEndRecipes.put(0, Materials.Aluminium.getMolten(1000));
        TheEndRecipes.put(1, Materials.Antimony.getMolten(1000));
        TheEndRecipes.put(2, Materials.Arsenic.getMolten(1000));
        TheEndRecipes.put(3, Materials.Beryllium.getMolten(1000));
        TheEndRecipes.put(4, Materials.Calcium.getMolten(1000));
        TheEndRecipes.put(5, Materials.Cobalt.getMolten(1000));
        TheEndRecipes.put(6, Materials.Copper.getMolten(1000));
        TheEndRecipes.put(7, Materials.Gold.getMolten(1000));
        TheEndRecipes.put(8, Materials.Iron.getMolten(1000));
        TheEndRecipes.put(9, Materials.Lead.getMolten(1000));
        TheEndRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        TheEndRecipes.put(11, Materials.Nickel.getMolten(1000));
        TheEndRecipes.put(12, Materials.Silicon.getMolten(1000));
        TheEndRecipes.put(13, Materials.Thorium.getMolten(1000));
        TheEndRecipes.put(14, Materials.Tin.getMolten(1000));
        TheEndRecipes.put(15, Materials.Vanadium.getMolten(1000));

        TheEndRecipes.put(16, Materials.Hydrogen.getGas(1000));
        TheEndRecipes.put(17, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TheEndRecipes.size(); i++) {
            FluidStack OutPutFluid = TheEndRecipes.get(i);
            addSingularityFluidRecipes("T0: TheEnd", OutPutFluid);
        }

        // T0 - EndAsteroid - EA
        Map<Integer, FluidStack> EndAsteroidRecipes = new HashMap<>();
        EndAsteroidRecipes.put(0, Materials.Aluminium.getMolten(1000));
        EndAsteroidRecipes.put(1, Materials.Antimony.getMolten(1000));
        EndAsteroidRecipes.put(2, Materials.Arsenic.getMolten(1000));
        EndAsteroidRecipes.put(3, Materials.Beryllium.getMolten(1000));
        EndAsteroidRecipes.put(4, Materials.Calcium.getMolten(1000));
        EndAsteroidRecipes.put(5, Materials.Cobalt.getMolten(1000));
        EndAsteroidRecipes.put(6, Materials.Copper.getMolten(1000));
        EndAsteroidRecipes.put(7, Materials.Gold.getMolten(1000));
        EndAsteroidRecipes.put(8, Materials.Iridium.getMolten(1000));
        EndAsteroidRecipes.put(9, Materials.Iron.getMolten(1000));
        EndAsteroidRecipes.put(10, Materials.Lead.getMolten(1000));
        EndAsteroidRecipes.put(11, Materials.Lithium.getMolten(1000));
        EndAsteroidRecipes.put(12, Materials.Magnesium.getMolten(1000));
        EndAsteroidRecipes.put(13, Materials.Manganese.getMolten(1000));
        EndAsteroidRecipes.put(14, Materials.Molybdenum.getMolten(1000));
        EndAsteroidRecipes.put(15, Materials.Naquadah.getMolten(1000));
        EndAsteroidRecipes.put(16, Materials.NaquadahEnriched.getMolten(1000));
        EndAsteroidRecipes.put(17, Materials.Nickel.getMolten(1000));
        EndAsteroidRecipes.put(18, Materials.Palladium.getMolten(1000));
        EndAsteroidRecipes.put(19, Materials.Platinum.getMolten(1000));
        EndAsteroidRecipes.put(20, Materials.Potassium.getMolten(1000));
        EndAsteroidRecipes.put(21, Materials.Silicon.getMolten(1000));
        EndAsteroidRecipes.put(22, Materials.Tantalum.getMolten(1000));
        EndAsteroidRecipes.put(23, Materials.Thorium.getMolten(1000));
        EndAsteroidRecipes.put(24, Materials.Tin.getMolten(1000));
        EndAsteroidRecipes.put(25, Materials.Tungsten.getMolten(1000));
        EndAsteroidRecipes.put(26, Materials.Vanadium.getMolten(1000));

        EndAsteroidRecipes.put(27, Materials.Chlorine.getGas(1000));
        EndAsteroidRecipes.put(28, Materials.Fluorine.getGas(1000));
        EndAsteroidRecipes.put(29, Materials.Hydrogen.getGas(1000));
        EndAsteroidRecipes.put(30, Materials.Nitrogen.getGas(1000));
        EndAsteroidRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < EndAsteroidRecipes.size(); i++) {
            FluidStack OutPutFluid = EndAsteroidRecipes.get(i);
            addSingularityFluidRecipes("T0: EndAsteroid", OutPutFluid);
        }

        // T1 - Moon - Mo
        Map<Integer, FluidStack> MoonRecipes = new HashMap<>();
        MoonRecipes.put(0, Materials.Aluminium.getMolten(1000));
        MoonRecipes.put(1, Materials.Barium.getMolten(1000));
        MoonRecipes.put(2, Materials.Calcium.getMolten(1000));
        MoonRecipes.put(3, Materials.Cerium.getMolten(1000));
        MoonRecipes.put(4, Materials.Chrome.getMolten(1000));
        MoonRecipes.put(5, Materials.Copper.getMolten(1000));
        MoonRecipes.put(6, Materials.Gadolinium.getMolten(1000));
        MoonRecipes.put(7, Materials.Gold.getMolten(1000));
        MoonRecipes.put(8, Materials.Holmium.getMolten(1000));
        MoonRecipes.put(9, Materials.Iron.getMolten(1000));
        MoonRecipes.put(10, Materials.Lanthanum.getMolten(1000));
        MoonRecipes.put(11, Materials.Lead.getMolten(1000));
        MoonRecipes.put(12, Materials.Manganese.getMolten(1000));
        MoonRecipes.put(13, Materials.Molybdenum.getMolten(1000));
        MoonRecipes.put(14, Materials.Neodymium.getMolten(1000));
        MoonRecipes.put(15, Materials.Samarium.getMolten(1000));
        MoonRecipes.put(16, Materials.Silicon.getMolten(1000));
        MoonRecipes.put(17, Materials.Tin.getMolten(1000));
        MoonRecipes.put(18, Materials.Titanium.getMolten(1000));

        MoonRecipes.put(19, Materials.SaltWater.getFluid(1000));

        MoonRecipes.put(20, Materials.Chlorine.getGas(1000));
        MoonRecipes.put(21, Materials.Fluorine.getGas(1000));
        MoonRecipes.put(22, Materials.Helium_3.getGas(1000));
        MoonRecipes.put(23, Materials.Hydrogen.getGas(1000));
        MoonRecipes.put(24, Materials.Nitrogen.getGas(1000));
        MoonRecipes.put(25, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MoonRecipes.size(); i++) {
            FluidStack OutPutFluid = MoonRecipes.get(i);
            addSingularityFluidRecipes("T1: Moon", OutPutFluid);
        }

        // T2 - Deimos - De
        Map<Integer, FluidStack> DeimosRecipes = new HashMap<>();
        DeimosRecipes.put(0, Materials.Aluminium.getMolten(1000));
        DeimosRecipes.put(1, Materials.Antimony.getMolten(1000));
        DeimosRecipes.put(2, Materials.Arsenic.getMolten(1000));
        DeimosRecipes.put(3, Materials.Calcium.getMolten(1000));
        DeimosRecipes.put(4, Materials.Cerium.getMolten(1000));
        DeimosRecipes.put(5, Materials.Cobalt.getMolten(1000));
        DeimosRecipes.put(6, Materials.Copper.getMolten(1000));
        DeimosRecipes.put(7, Materials.Draconium.getMolten(1000));
        DeimosRecipes.put(8, Materials.Electrotine.getMolten(1000));
        DeimosRecipes.put(9, Materials.Gadolinium.getMolten(1000));
        DeimosRecipes.put(10, Materials.Holmium.getMolten(1000));
        DeimosRecipes.put(11, Materials.Iron.getMolten(1000));
        DeimosRecipes.put(12, Materials.Lanthanum.getMolten(1000));
        DeimosRecipes.put(13, Materials.Lithium.getMolten(1000));
        DeimosRecipes.put(14, Materials.Neodymium.getMolten(1000));
        DeimosRecipes.put(15, Materials.Nickel.getMolten(1000));
        DeimosRecipes.put(16, Materials.Oriharukon.getMolten(1000));
        DeimosRecipes.put(17, Materials.Samarium.getMolten(1000));
        DeimosRecipes.put(18, Materials.Silicon.getMolten(1000));
        DeimosRecipes.put(19, Materials.Thaumium.getMolten(1000));
        DeimosRecipes.put(20, Materials.Tungsten.getMolten(1000));
        DeimosRecipes.put(21, Materials.Uranium.getMolten(1000));
        DeimosRecipes.put(22, Materials.Vanadium.getMolten(1000));
        DeimosRecipes.put(23, Materials.Vinteum.getMolten(1000));
        DeimosRecipes.put(24, Materials.Vyroxeres.getMolten(1000));
        DeimosRecipes.put(25, Materials.Zinc.getMolten(1000));

        DeimosRecipes.put(26, Materials.Chlorine.getGas(1000));
        DeimosRecipes.put(27, Materials.Fluorine.getGas(1000));
        DeimosRecipes.put(28, Materials.Hydrogen.getGas(1000));
        DeimosRecipes.put(29, Materials.Nitrogen.getGas(1000));
        DeimosRecipes.put(30, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < DeimosRecipes.size(); i++) {
            FluidStack OutPutFluid = DeimosRecipes.get(i);
            addSingularityFluidRecipes("T2: Deimos", OutPutFluid);
        }

        // T2 - Mars - Ma
        Map<Integer, FluidStack> MarsRecipes = new HashMap<>();
        MarsRecipes.put(0, Materials.Aluminium.getMolten(1000));
        MarsRecipes.put(1, Materials.Antimony.getMolten(1000));
        MarsRecipes.put(2, Materials.Arsenic.getMolten(1000));
        MarsRecipes.put(3, Materials.Barium.getMolten(1000));
        MarsRecipes.put(4, Materials.Beryllium.getMolten(1000));
        MarsRecipes.put(5, Materials.Bismuth.getMolten(1000));
        MarsRecipes.put(6, Materials.Calcium.getMolten(1000));
        MarsRecipes.put(7, Materials.Chrome.getMolten(1000));
        MarsRecipes.put(8, Materials.Cobalt.getMolten(1000));
        MarsRecipes.put(9, Materials.Copper.getMolten(1000));
        MarsRecipes.put(10, Materials.Desh.getMolten(1000));
        MarsRecipes.put(11, Materials.Gold.getMolten(1000));
        MarsRecipes.put(12, Materials.Iron.getMolten(1000));
        MarsRecipes.put(13, Materials.Lead.getMolten(1000));
        MarsRecipes.put(14, Materials.Lithium.getMolten(1000));
        MarsRecipes.put(15, Materials.Nickel.getMolten(1000));
        MarsRecipes.put(16, Materials.Potassium.getMolten(1000));
        MarsRecipes.put(17, Materials.Silicon.getMolten(1000));
        MarsRecipes.put(18, Materials.Thorium.getMolten(1000));
        MarsRecipes.put(19, Materials.Tungsten.getMolten(1000));
        MarsRecipes.put(20, Materials.Uranium.getMolten(1000));
        MarsRecipes.put(21, Materials.Vanadium.getMolten(1000));
        MarsRecipes.put(22, Materials.Zinc.getMolten(1000));

        MarsRecipes.put(23, Materials.Chlorobenzene.getFluid(1000));
        MarsRecipes.put(24, Materials.Mercury.getFluid(1000));
        MarsRecipes.put(25, Materials.SaltWater.getFluid(1000));

        MarsRecipes.put(26, Materials.Chlorine.getGas(1000));
        MarsRecipes.put(27, Materials.Fluorine.getGas(1000));
        MarsRecipes.put(28, Materials.Hydrogen.getGas(1000));
        MarsRecipes.put(29, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MarsRecipes.size(); i++) {
            FluidStack OutPutFluid = MarsRecipes.get(i);
            addSingularityFluidRecipes("T2: Mars", OutPutFluid);
        }

        // T2 - Phobos - Ph
        Map<Integer, FluidStack> PhobosRecipes = new HashMap<>();
        PhobosRecipes.put(0, Materials.Aluminium.getMolten(1000));
        PhobosRecipes.put(1, Materials.Antimony.getMolten(1000));
        PhobosRecipes.put(2, Materials.Arsenic.getMolten(1000));
        PhobosRecipes.put(3, Materials.Barium.getMolten(1000));
        PhobosRecipes.put(4, Materials.Bismuth.getMolten(1000));
        PhobosRecipes.put(5, Materials.Calcium.getMolten(1000));
        PhobosRecipes.put(6, Materials.Cobalt.getMolten(1000));
        PhobosRecipes.put(7, Materials.Draconium.getMolten(1000));
        PhobosRecipes.put(8, Materials.Electrotine.getMolten(1000));
        PhobosRecipes.put(9, Materials.Gold.getMolten(1000));
        PhobosRecipes.put(10, Materials.Iron.getMolten(1000));
        PhobosRecipes.put(11, Materials.Lead.getMolten(1000));
        PhobosRecipes.put(12, Materials.Molybdenum.getMolten(1000));
        PhobosRecipes.put(13, Materials.Nickel.getMolten(1000));
        PhobosRecipes.put(14, Materials.Oriharukon.getMolten(1000));
        PhobosRecipes.put(15, Materials.Silicon.getMolten(1000));
        PhobosRecipes.put(16, Materials.Thaumium.getMolten(1000));
        PhobosRecipes.put(17, Materials.Thorium.getMolten(1000));
        PhobosRecipes.put(18, Materials.Titanium.getMolten(1000));
        PhobosRecipes.put(19, Materials.Uranium.getMolten(1000));
        PhobosRecipes.put(20, Materials.Vanadium.getMolten(1000));
        PhobosRecipes.put(21, Materials.Vinteum.getMolten(1000));
        PhobosRecipes.put(22, Materials.Vyroxeres.getMolten(1000));
        PhobosRecipes.put(23, Materials.Zinc.getMolten(1000));

        PhobosRecipes.put(24, Materials.Chlorine.getGas(1000));
        PhobosRecipes.put(25, Materials.Fluorine.getGas(1000));
        PhobosRecipes.put(26, Materials.Hydrogen.getGas(1000));
        PhobosRecipes.put(27, Materials.Nitrogen.getGas(1000));
        PhobosRecipes.put(28, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < PhobosRecipes.size(); i++) {
            FluidStack OutPutFluid = PhobosRecipes.get(i);
            addSingularityFluidRecipes("T2: Phobos", OutPutFluid);
        }

        // T3 - Asteroids - As
        Map<Integer, FluidStack> AsteroidsRecipes = new HashMap<>();
        AsteroidsRecipes.put(0, Materials.Aluminium.getMolten(1000));
        AsteroidsRecipes.put(1, Materials.Antimony.getMolten(1000));
        AsteroidsRecipes.put(2, Materials.Calcium.getMolten(1000));
        AsteroidsRecipes.put(3, Materials.Chrome.getMolten(1000));
        AsteroidsRecipes.put(4, Materials.Copper.getMolten(1000));
        AsteroidsRecipes.put(5, Materials.Gold.getMolten(1000));
        AsteroidsRecipes.put(6, Materials.Iron.getMolten(1000));
        AsteroidsRecipes.put(7, Materials.Lithium.getMolten(1000));
        AsteroidsRecipes.put(8, Materials.Magnesium.getMolten(1000));
        AsteroidsRecipes.put(9, Materials.Naquadah.getMolten(1000));
        AsteroidsRecipes.put(10, Materials.NaquadahEnriched.getMolten(1000));
        AsteroidsRecipes.put(11, Materials.Silicon.getMolten(1000));
        AsteroidsRecipes.put(12, Materials.Titanium.getMolten(1000));
        AsteroidsRecipes.put(13, Materials.Tungsten.getMolten(1000));
        AsteroidsRecipes.put(14, Materials.Vanadium.getMolten(1000));

        AsteroidsRecipes.put(15, Materials.Hydrogen.getGas(1000));
        AsteroidsRecipes.put(16, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < AsteroidsRecipes.size(); i++) {
            FluidStack OutPutFluid = AsteroidsRecipes.get(i);
            addSingularityFluidRecipes("T3: Asteroids", OutPutFluid);
        }

        // T3 - Callisto - Ca
        Map<Integer, FluidStack> CallistoRecipes = new HashMap<>();
        CallistoRecipes.put(0, Materials.Alduorite.getMolten(1000));
        CallistoRecipes.put(1, Materials.Aluminium.getMolten(1000));
        CallistoRecipes.put(2, Materials.Calcium.getMolten(1000));
        CallistoRecipes.put(3, Materials.CallistoIce.getMolten(1000));
        CallistoRecipes.put(4, Materials.Cerium.getMolten(1000));
        CallistoRecipes.put(5, Materials.Chrome.getMolten(1000));
        CallistoRecipes.put(6, Materials.Copper.getMolten(1000));
        CallistoRecipes.put(7, Materials.Gadolinium.getMolten(1000));
        CallistoRecipes.put(8, Materials.Gold.getMolten(1000));
        CallistoRecipes.put(9, Materials.Holmium.getMolten(1000));
        CallistoRecipes.put(10, Materials.Iron.getMolten(1000));
        CallistoRecipes.put(11, Materials.Lanthanum.getMolten(1000));
        CallistoRecipes.put(12, Materials.Lithium.getMolten(1000));
        CallistoRecipes.put(13, Materials.Magnesium.getMolten(1000));
        CallistoRecipes.put(14, Materials.Neodymium.getMolten(1000));
        CallistoRecipes.put(15, Materials.Nickel.getMolten(1000));
        CallistoRecipes.put(16, Materials.Palladium.getMolten(1000));
        CallistoRecipes.put(17, Materials.Platinum.getMolten(1000));
        CallistoRecipes.put(18, Materials.Plutonium.getMolten(1000));
        CallistoRecipes.put(19, Materials.Samarium.getMolten(1000));
        CallistoRecipes.put(20, Materials.Silicon.getMolten(1000));
        CallistoRecipes.put(21, Materials.Thorium.getMolten(1000));
        CallistoRecipes.put(22, Materials.Titanium.getMolten(1000));
        CallistoRecipes.put(23, Materials.Tungsten.getMolten(1000));
        CallistoRecipes.put(24, Materials.Uranium.getMolten(1000));
        CallistoRecipes.put(25, Materials.Vanadium.getMolten(1000));

        CallistoRecipes.put(26, Materials.LiquidAir.getFluid(1000));
        CallistoRecipes.put(27, Materials.SuperCoolant.getFluid(1000));

        CallistoRecipes.put(28, Materials.Chlorine.getGas(1000));
        CallistoRecipes.put(29, Materials.Fluorine.getGas(1000));
        CallistoRecipes.put(30, Materials.Hydrogen.getGas(1000));
        CallistoRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < CallistoRecipes.size(); i++) {
            FluidStack OutPutFluid = CallistoRecipes.get(i);
            addSingularityFluidRecipes("T3: Callisto", OutPutFluid);
        }

        // T3 - Ceres - Ce
        Map<Integer, FluidStack> CeresRecipes = new HashMap<>();
        CeresRecipes.put(0, Materials.Aluminium.getMolten(1000));
        CeresRecipes.put(1, Materials.Beryllium.getMolten(1000));
        CeresRecipes.put(2, Materials.Calcium.getMolten(1000));
        CeresRecipes.put(3, Materials.Chrome.getMolten(1000));
        CeresRecipes.put(4, Materials.Copper.getMolten(1000));
        CeresRecipes.put(5, Materials.Electrotine.getMolten(1000));
        CeresRecipes.put(6, Materials.Iron.getMolten(1000));
        CeresRecipes.put(7, Materials.Lead.getMolten(1000));
        CeresRecipes.put(8, Materials.Magnesium.getMolten(1000));
        CeresRecipes.put(9, Materials.Manganese.getMolten(1000));
        CeresRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        CeresRecipes.put(11, Materials.Nickel.getMolten(1000));
        CeresRecipes.put(12, Materials.Palladium.getMolten(1000));
        CeresRecipes.put(13, Materials.Platinum.getMolten(1000));
        CeresRecipes.put(14, Materials.Plutonium.getMolten(1000));
        CeresRecipes.put(15, Materials.Potassium.getMolten(1000));
        CeresRecipes.put(16, Materials.Silicon.getMolten(1000));
        CeresRecipes.put(17, Materials.Tantalum.getMolten(1000));
        CeresRecipes.put(18, Materials.Thorium.getMolten(1000));
        CeresRecipes.put(19, Materials.Uranium.getMolten(1000));
        CeresRecipes.put(20, Materials.Vanadium.getMolten(1000));

        CeresRecipes.put(21, Materials.Chlorine.getGas(1000));
        CeresRecipes.put(22, Materials.Fluorine.getGas(1000));
        CeresRecipes.put(23, Materials.Hydrogen.getGas(1000));
        CeresRecipes.put(24, Materials.Nitrogen.getGas(1000));
        CeresRecipes.put(25, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < CeresRecipes.size(); i++) {
            FluidStack OutPutFluid = CeresRecipes.get(i);
            addSingularityFluidRecipes("T3: Ceres", OutPutFluid);
        }

        // T3 - Europa - Eu
        Map<Integer, FluidStack> EuropaRecipes = new HashMap<>();
        EuropaRecipes.put(0, Materials.Aluminium.getMolten(1000));
        EuropaRecipes.put(1, Materials.Calcium.getMolten(1000));
        EuropaRecipes.put(2, Materials.Chrome.getMolten(1000));
        EuropaRecipes.put(3, Materials.Iron.getMolten(1000));
        EuropaRecipes.put(4, Materials.Ledox.getMolten(1000));
        EuropaRecipes.put(5, Materials.Lithium.getMolten(1000));
        EuropaRecipes.put(6, Materials.Magnesium.getMolten(1000));
        EuropaRecipes.put(7, Materials.Manganese.getMolten(1000));
        EuropaRecipes.put(8, Materials.Molybdenum.getMolten(1000));
        EuropaRecipes.put(9, Materials.Orichalcum.getMolten(1000));
        EuropaRecipes.put(10, Materials.Potassium.getMolten(1000));
        EuropaRecipes.put(11, Materials.Rubracium.getMolten(1000));
        EuropaRecipes.put(12, Materials.Silicon.getMolten(1000));
        EuropaRecipes.put(13, Materials.Tin.getMolten(1000));
        EuropaRecipes.put(14, Materials.Tungsten.getMolten(1000));

        EuropaRecipes.put(15, Materials.OilExtraHeavy.getFluid(1000));
        EuropaRecipes.put(16, Materials.SaltWater.getFluid(1000));

        EuropaRecipes.put(17, Materials.Fluorine.getGas(1000));
        EuropaRecipes.put(18, Materials.Hydrogen.getGas(1000));
        EuropaRecipes.put(19, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < EuropaRecipes.size(); i++) {
            FluidStack OutPutFluid = EuropaRecipes.get(i);
            addSingularityFluidRecipes("T3: Europa", OutPutFluid);
        }

        // T3 - Ganymede - Ga
        Map<Integer, FluidStack> GanymedeRecipes = new HashMap<>();
        GanymedeRecipes.put(0, Materials.Aluminium.getMolten(1000));
        GanymedeRecipes.put(1, Materials.Antimony.getMolten(1000));
        GanymedeRecipes.put(2, Materials.Calcium.getMolten(1000));
        GanymedeRecipes.put(3, Materials.Chrome.getMolten(1000));
        GanymedeRecipes.put(4, Materials.Copper.getMolten(1000));
        GanymedeRecipes.put(5, Materials.Iron.getMolten(1000));
        GanymedeRecipes.put(6, Materials.Lead.getMolten(1000));
        GanymedeRecipes.put(7, Materials.Lithium.getMolten(1000));
        GanymedeRecipes.put(8, Materials.Magnesium.getMolten(1000));
        GanymedeRecipes.put(9, Materials.Nickel.getMolten(1000));
        GanymedeRecipes.put(10, Materials.Palladium.getMolten(1000));
        GanymedeRecipes.put(11, Materials.Platinum.getMolten(1000));
        GanymedeRecipes.put(12, Materials.Plutonium.getMolten(1000));
        GanymedeRecipes.put(13, Materials.Silicon.getMolten(1000));
        GanymedeRecipes.put(14, Materials.Silver.getMolten(1000));
        GanymedeRecipes.put(15, Materials.Thorium.getMolten(1000));
        GanymedeRecipes.put(16, Materials.Titanium.getMolten(1000));
        GanymedeRecipes.put(17, Materials.Tungsten.getMolten(1000));
        GanymedeRecipes.put(18, Materials.Uranium.getMolten(1000));

        GanymedeRecipes.put(19, Materials.Mercury.getFluid(1000));

        GanymedeRecipes.put(20, Materials.Hydrogen.getGas(1000));
        GanymedeRecipes.put(21, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < GanymedeRecipes.size(); i++) {
            FluidStack OutPutFluid = GanymedeRecipes.get(i);
            addSingularityFluidRecipes("T3: Ganymede", OutPutFluid);
        }

        // T3 - Ross128b - Rb
        Map<Integer, FluidStack> Ross128bRecipes = new HashMap<>();
        Ross128bRecipes.put(0, Materials.Lava.getFluid(1000));
        Ross128bRecipes.put(1, Materials.NatruralGas.getGas(1000));
        Ross128bRecipes.put(2, Materials.OilExtraHeavy.getFluid(1000));

        for (int i = 0; i < Ross128bRecipes.size(); i++) {
            FluidStack OutPutFluid = Ross128bRecipes.get(i);
            addSingularityFluidRecipes("T3: Ross128b", OutPutFluid);
        }

        // T4 - Io - Io
        Map<Integer, FluidStack> IoRecipes = new HashMap<>();
        IoRecipes.put(0, Materials.Aluminium.getMolten(1000));
        IoRecipes.put(1, Materials.Barium.getMolten(1000));
        IoRecipes.put(2, Materials.Calcium.getMolten(1000));
        IoRecipes.put(3, Materials.Cerium.getMolten(1000));
        IoRecipes.put(4, Materials.Ceruclase.getMolten(1000));
        IoRecipes.put(5, Materials.Chrome.getMolten(1000));
        IoRecipes.put(6, Materials.Gadolinium.getMolten(1000));
        IoRecipes.put(7, Materials.Gold.getMolten(1000));
        IoRecipes.put(8, Materials.Holmium.getMolten(1000));
        IoRecipes.put(9, Materials.InfusedGold.getMolten(1000));
        IoRecipes.put(10, Materials.Iridium.getMolten(1000));
        IoRecipes.put(11, Materials.Iron.getMolten(1000));
        IoRecipes.put(12, Materials.Lanthanum.getMolten(1000));
        IoRecipes.put(13, Materials.Lead.getMolten(1000));
        IoRecipes.put(14, Materials.Manganese.getMolten(1000));
        IoRecipes.put(15, Materials.Mithril.getMolten(1000));
        IoRecipes.put(16, Materials.Mytryl.getMolten(1000));
        IoRecipes.put(17, Materials.Neodymium.getMolten(1000));
        IoRecipes.put(18, Materials.Nickel.getMolten(1000));
        IoRecipes.put(19, Materials.Niobium.getMolten(1000));
        IoRecipes.put(20, Materials.Osmium.getMolten(1000));
        IoRecipes.put(21, Materials.Palladium.getMolten(1000));
        IoRecipes.put(22, Materials.Platinum.getMolten(1000));
        IoRecipes.put(23, Materials.Plutonium.getMolten(1000));
        IoRecipes.put(24, WerkstoffLoader.Rhodium.getMolten(1000));
        IoRecipes.put(25, WerkstoffLoader.Ruthenium.getMolten(1000));
        IoRecipes.put(26, Materials.Samarium.getMolten(1000));
        IoRecipes.put(27, Materials.Silicon.getMolten(1000));
        IoRecipes.put(28, Materials.Tantalum.getMolten(1000));
        IoRecipes.put(29, Materials.Thaumium.getMolten(1000));
        IoRecipes.put(30, Materials.Thorium.getMolten(1000));
        IoRecipes.put(31, Materials.Tin.getMolten(1000));
        IoRecipes.put(32, Materials.Uranium.getMolten(1000));
        IoRecipes.put(33, Materials.Vanadium.getMolten(1000));
        IoRecipes.put(34, Materials.Vulcanite.getMolten(1000));
        IoRecipes.put(35, Materials.Zinc.getMolten(1000));

        IoRecipes.put(36, Materials.SulfuricAcid.getFluid(1000));

        IoRecipes.put(37, Materials.CarbonDioxide.getGas(1000));
        IoRecipes.put(38, Materials.Hydrogen.getGas(1000));
        IoRecipes.put(39, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < IoRecipes.size(); i++) {
            FluidStack OutPutFluid = IoRecipes.get(i);
            addSingularityFluidRecipes("T4: Io", OutPutFluid);
        }

        // T4 - Mercury - Me
        Map<Integer, FluidStack> MercuryRecipes = new HashMap<>();
        MercuryRecipes.put(0, Materials.Aluminium.getMolten(1000));
        MercuryRecipes.put(1, Materials.Antimony.getMolten(1000));
        MercuryRecipes.put(2, Materials.Arsenic.getMolten(1000));
        MercuryRecipes.put(3, Materials.Bismuth.getMolten(1000));
        MercuryRecipes.put(4, Materials.Calcium.getMolten(1000));
        MercuryRecipes.put(5, Materials.Chrome.getMolten(1000));
        MercuryRecipes.put(6, Materials.Copper.getMolten(1000));
        MercuryRecipes.put(7, Materials.Draconium.getMolten(1000));
        MercuryRecipes.put(8, Materials.Electrotine.getMolten(1000));
        MercuryRecipes.put(9, Materials.Iridium.getMolten(1000));
        MercuryRecipes.put(10, Materials.Iron.getMolten(1000));
        MercuryRecipes.put(11, Materials.Lead.getMolten(1000));
        MercuryRecipes.put(12, Materials.Molybdenum.getMolten(1000));
        MercuryRecipes.put(13, Materials.Naquadah.getMolten(1000));
        MercuryRecipes.put(14, Materials.NaquadahEnriched.getMolten(1000));
        MercuryRecipes.put(15, Materials.Naquadria.getMolten(1000));
        MercuryRecipes.put(16, Materials.Nickel.getMolten(1000));
        MercuryRecipes.put(17, Materials.Osmium.getMolten(1000));
        MercuryRecipes.put(18, Materials.Palladium.getMolten(1000));
        MercuryRecipes.put(19, Materials.Platinum.getMolten(1000));
        MercuryRecipes.put(20, WerkstoffLoader.Rhodium.getMolten(1000));
        MercuryRecipes.put(21, WerkstoffLoader.Ruthenium.getMolten(1000));
        MercuryRecipes.put(22, Materials.Silicon.getMolten(1000));
        MercuryRecipes.put(23, Materials.Thaumium.getMolten(1000));
        MercuryRecipes.put(24, Materials.Titanium.getMolten(1000));
        MercuryRecipes.put(25, Materials.Vinteum.getMolten(1000));

        MercuryRecipes.put(26, Materials.Mercury.getFluid(1000));

        MercuryRecipes.put(27, Materials.Chlorine.getGas(1000));
        MercuryRecipes.put(28, Materials.Helium_3.getGas(1000));
        MercuryRecipes.put(29, Materials.Hydrogen.getGas(1000));
        MercuryRecipes.put(30, Materials.Nitrogen.getGas(1000));
        MercuryRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MercuryRecipes.size(); i++) {
            FluidStack OutPutFluid = MercuryRecipes.get(i);
            addSingularityFluidRecipes("T4: Mercury", OutPutFluid);
        }

        // T4 - Venus - Ve
        Map<Integer, FluidStack> VenusRecipes = new HashMap<>();
        VenusRecipes.put(0, Materials.Aluminium.getMolten(1000));
        VenusRecipes.put(1, Materials.Antimony.getMolten(1000));
        VenusRecipes.put(2, Materials.Arsenic.getMolten(1000));
        VenusRecipes.put(3, Materials.Barium.getMolten(1000));
        VenusRecipes.put(4, Materials.Beryllium.getMolten(1000));
        VenusRecipes.put(5, Materials.Cerium.getMolten(1000));
        VenusRecipes.put(6, Materials.Chrome.getMolten(1000));
        VenusRecipes.put(7, Materials.Cobalt.getMolten(1000));
        VenusRecipes.put(8, Materials.Copper.getMolten(1000));
        VenusRecipes.put(9, Materials.Gadolinium.getMolten(1000));
        VenusRecipes.put(10, Materials.Holmium.getMolten(1000));
        VenusRecipes.put(11, Materials.Iridium.getMolten(1000));
        VenusRecipes.put(12, Materials.Iron.getMolten(1000));
        VenusRecipes.put(13, Materials.Lanthanum.getMolten(1000));
        VenusRecipes.put(14, Materials.Lead.getMolten(1000));
        VenusRecipes.put(15, Materials.MeteoricIron.getMolten(1000));
        VenusRecipes.put(16, Materials.Naquadah.getMolten(1000));
        VenusRecipes.put(17, Materials.NaquadahEnriched.getMolten(1000));
        VenusRecipes.put(18, Materials.Naquadria.getMolten(1000));
        VenusRecipes.put(19, Materials.Neodymium.getMolten(1000));
        VenusRecipes.put(20, Materials.Nickel.getMolten(1000));
        VenusRecipes.put(21, Materials.Osmium.getMolten(1000));
        VenusRecipes.put(22, Materials.Palladium.getMolten(1000));
        VenusRecipes.put(23, Materials.Platinum.getMolten(1000));
        VenusRecipes.put(24, Materials.Quantium.getMolten(1000));
        VenusRecipes.put(25, WerkstoffLoader.Rhodium.getMolten(1000));
        VenusRecipes.put(26, WerkstoffLoader.Ruthenium.getMolten(1000));
        VenusRecipes.put(27, Materials.Samarium.getMolten(1000));
        VenusRecipes.put(28, Materials.Silicon.getMolten(1000));
        VenusRecipes.put(29, Materials.Silver.getMolten(1000));
        VenusRecipes.put(30, Materials.Thorium.getMolten(1000));
        VenusRecipes.put(31, Materials.Tin.getMolten(1000));
        VenusRecipes.put(32, Materials.Titanium.getMolten(1000));
        VenusRecipes.put(33, Materials.Uranium.getMolten(1000));
        VenusRecipes.put(34, Materials.Zinc.getMolten(1000));

        VenusRecipes.put(35, Materials.Mercury.getFluid(1000));
        VenusRecipes.put(36, Materials.SulfuricAcid.getFluid(1000));

        VenusRecipes.put(37, Materials.CarbonDioxide.getGas(1000));
        VenusRecipes.put(38, Materials.Hydrogen.getGas(1000));
        VenusRecipes.put(39, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < VenusRecipes.size(); i++) {
            FluidStack OutPutFluid = VenusRecipes.get(i);
            addSingularityFluidRecipes("T4: Venus", OutPutFluid);
        }

        // T5 - Enceladus - En
        Map<Integer, FluidStack> EnceladusRecipes = new HashMap<>();
        EnceladusRecipes.put(0, Materials.Aluminium.getMolten(1000));
        EnceladusRecipes.put(1, Materials.Calcium.getMolten(1000));
        EnceladusRecipes.put(2, Materials.Cerium.getMolten(1000));
        EnceladusRecipes.put(3, Materials.Chrome.getMolten(1000));
        EnceladusRecipes.put(4, Materials.Copper.getMolten(1000));
        EnceladusRecipes.put(5, Materials.Gadolinium.getMolten(1000));
        EnceladusRecipes.put(6, Materials.Holmium.getMolten(1000));
        EnceladusRecipes.put(7, Materials.Iridium.getMolten(1000));
        EnceladusRecipes.put(8, Materials.Iron.getMolten(1000));
        EnceladusRecipes.put(9, Materials.Lanthanum.getMolten(1000));
        EnceladusRecipes.put(10, Materials.Ledox.getMolten(1000));
        EnceladusRecipes.put(11, Materials.Lithium.getMolten(1000));
        EnceladusRecipes.put(12, Materials.Neodymium.getMolten(1000));
        EnceladusRecipes.put(13, Materials.Nickel.getMolten(1000));
        EnceladusRecipes.put(14, Materials.Orichalcum.getMolten(1000));
        EnceladusRecipes.put(15, Materials.Osmium.getMolten(1000));
        EnceladusRecipes.put(16, Materials.Palladium.getMolten(1000));
        EnceladusRecipes.put(17, Materials.Platinum.getMolten(1000));
        EnceladusRecipes.put(18, WerkstoffLoader.Rhodium.getMolten(1000));
        EnceladusRecipes.put(19, Materials.Rubracium.getMolten(1000));
        EnceladusRecipes.put(20, WerkstoffLoader.Ruthenium.getMolten(1000));
        EnceladusRecipes.put(21, Materials.Samarium.getMolten(1000));
        EnceladusRecipes.put(22, Materials.Silicon.getMolten(1000));
        EnceladusRecipes.put(23, Materials.Tungsten.getMolten(1000));
        EnceladusRecipes.put(24, Materials.Vanadium.getMolten(1000));
        EnceladusRecipes.put(25, Materials.Uranium.getMolten(1000));

        EnceladusRecipes.put(26, Materials.Chlorine.getGas(1000));
        EnceladusRecipes.put(27, Materials.Hydrogen.getGas(1000));
        EnceladusRecipes.put(28, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < EnceladusRecipes.size(); i++) {
            FluidStack OutPutFluid = EnceladusRecipes.get(i);
            addSingularityFluidRecipes("T5: Enceladus", OutPutFluid);
        }

        // T5 - Miranda - Mi
        Map<Integer, FluidStack> MirandaRecipes = new HashMap<>();
        MirandaRecipes.put(0, Materials.Aluminium.getMolten(1000));
        MirandaRecipes.put(1, Materials.Antimony.getMolten(1000));
        MirandaRecipes.put(2, Materials.Calcium.getMolten(1000));
        MirandaRecipes.put(3, Materials.Chrome.getMolten(1000));
        MirandaRecipes.put(4, Materials.Copper.getMolten(1000));
        MirandaRecipes.put(5, Materials.Desh.getMolten(1000));
        MirandaRecipes.put(6, Materials.Draconium.getMolten(1000));
        MirandaRecipes.put(7, Materials.Electrotine.getMolten(1000));
        MirandaRecipes.put(8, Materials.Iridium.getMolten(1000));
        MirandaRecipes.put(9, Materials.Iron.getMolten(1000));
        MirandaRecipes.put(10, Materials.Lithium.getMolten(1000));
        MirandaRecipes.put(11, Materials.Magnesium.getMolten(1000));
        MirandaRecipes.put(12, Materials.Manganese.getMolten(1000));
        MirandaRecipes.put(13, Materials.Nickel.getMolten(1000));
        MirandaRecipes.put(14, Materials.Niobium.getMolten(1000));
        MirandaRecipes.put(15, Materials.Osmium.getMolten(1000));
        MirandaRecipes.put(16, Materials.Palladium.getMolten(1000));
        MirandaRecipes.put(17, Materials.Platinum.getMolten(1000));
        MirandaRecipes.put(18, WerkstoffLoader.Rhodium.getMolten(1000));
        MirandaRecipes.put(19, WerkstoffLoader.Ruthenium.getMolten(1000));
        MirandaRecipes.put(20, Materials.Silicon.getMolten(1000));
        MirandaRecipes.put(21, Materials.Tantalum.getMolten(1000));
        MirandaRecipes.put(22, Materials.Thaumium.getMolten(1000));
        MirandaRecipes.put(23, Materials.Titanium.getMolten(1000));
        MirandaRecipes.put(24, Materials.Tin.getMolten(1000));
        MirandaRecipes.put(25, Materials.Tungsten.getMolten(1000));
        MirandaRecipes.put(26, Materials.Vinteum.getMolten(1000));

        MirandaRecipes.put(27, Materials.Mercury.getFluid(1000));

        MirandaRecipes.put(28, Materials.Chlorine.getGas(1000));
        MirandaRecipes.put(29, Materials.Fluorine.getGas(1000));
        MirandaRecipes.put(30, Materials.Hydrogen.getGas(1000));
        MirandaRecipes.put(31, Materials.HydricSulfide.getGas(1000));
        MirandaRecipes.put(32, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MirandaRecipes.size(); i++) {
            FluidStack OutPutFluid = MirandaRecipes.get(i);
            addSingularityFluidRecipes("T5: Miranda", OutPutFluid);
        }

        // T5 - Oberon - Ob
        Map<Integer, FluidStack> OberonRecipes = new HashMap<>();
        OberonRecipes.put(0, Materials.Aluminium.getMolten(1000));
        OberonRecipes.put(1, Materials.Calcium.getMolten(1000));
        OberonRecipes.put(2, Materials.Chrome.getMolten(1000));
        OberonRecipes.put(3, Materials.Copper.getMolten(1000));
        OberonRecipes.put(4, Materials.DeepIron.getMolten(1000));
        OberonRecipes.put(5, Materials.Iridium.getMolten(1000));
        OberonRecipes.put(6, Materials.Iron.getMolten(1000));
        OberonRecipes.put(7, Materials.Lead.getMolten(1000));
        OberonRecipes.put(8, Materials.Lithium.getMolten(1000));
        OberonRecipes.put(9, Materials.Manganese.getMolten(1000));
        OberonRecipes.put(10, Materials.Naquadah.getMolten(1000));
        OberonRecipes.put(11, Materials.NaquadahEnriched.getMolten(1000));
        OberonRecipes.put(12, Materials.Naquadria.getMolten(1000));
        OberonRecipes.put(13, Materials.Nickel.getMolten(1000));
        OberonRecipes.put(14, Materials.Osmium.getMolten(1000));
        OberonRecipes.put(15, Materials.Palladium.getMolten(1000));
        OberonRecipes.put(16, Materials.Platinum.getMolten(1000));
        OberonRecipes.put(17, WerkstoffLoader.Rhodium.getMolten(1000));
        OberonRecipes.put(18, WerkstoffLoader.Ruthenium.getMolten(1000));
        OberonRecipes.put(19, Materials.ShadowIron.getMolten(1000));
        OberonRecipes.put(20, Materials.Silicon.getMolten(1000));
        OberonRecipes.put(21, Materials.Tantalum.getMolten(1000));
        OberonRecipes.put(22, Materials.Thorium.getMolten(1000));
        OberonRecipes.put(23, Materials.Tungsten.getMolten(1000));
        OberonRecipes.put(24, Materials.Uranium.getMolten(1000));

        OberonRecipes.put(25, Materials.CarbonMonoxide.getGas(1000));
        OberonRecipes.put(26, Materials.Chlorine.getGas(1000));
        OberonRecipes.put(27, Materials.Hydrogen.getGas(1000));
        OberonRecipes.put(28, Materials.Nitrogen.getGas(1000));
        OberonRecipes.put(29, Materials.Oxygen.getGas(1000));
        OberonRecipes.put(30, Materials.Tritium.getGas(1000));

        for (int i = 0; i < OberonRecipes.size(); i++) {
            FluidStack OutPutFluid = OberonRecipes.get(i);
            addSingularityFluidRecipes("T5: Oberon", OutPutFluid);
        }

        // T5 - Titan - Ti
        Map<Integer, FluidStack> TitanRecipes = new HashMap<>();
        TitanRecipes.put(0, Materials.Aluminium.getMolten(1000));
        TitanRecipes.put(1, Materials.Antimony.getMolten(1000));
        TitanRecipes.put(2, Materials.Arsenic.getMolten(1000));
        TitanRecipes.put(3, Materials.Beryllium.getMolten(1000));
        TitanRecipes.put(4, Materials.Bismuth.getMolten(1000));
        TitanRecipes.put(5, Materials.Calcium.getMolten(1000));
        TitanRecipes.put(6, Materials.Cerium.getMolten(1000));
        TitanRecipes.put(7, Materials.Chrome.getMolten(1000));
        TitanRecipes.put(8, Materials.Cobalt.getMolten(1000));
        TitanRecipes.put(9, Materials.Gadolinium.getMolten(1000));
        TitanRecipes.put(10, Materials.Gold.getMolten(1000));
        TitanRecipes.put(11, Materials.Holmium.getMolten(1000));
        TitanRecipes.put(12, Materials.InfusedGold.getMolten(1000));
        TitanRecipes.put(13, Materials.Iridium.getMolten(1000));
        TitanRecipes.put(14, Materials.Iron.getMolten(1000));
        TitanRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        TitanRecipes.put(16, Materials.Lead.getMolten(1000));
        TitanRecipes.put(17, Materials.Magnesium.getMolten(1000));
        TitanRecipes.put(18, Materials.Manganese.getMolten(1000));
        TitanRecipes.put(19, Materials.MeteoricIron.getMolten(1000));
        TitanRecipes.put(20, Materials.Molybdenum.getMolten(1000));
        TitanRecipes.put(21, Materials.Naquadah.getMolten(1000));
        TitanRecipes.put(22, Materials.NaquadahEnriched.getMolten(1000));
        TitanRecipes.put(23, Materials.Naquadria.getMolten(1000));
        TitanRecipes.put(24, Materials.Neodymium.getMolten(1000));
        TitanRecipes.put(25, Materials.Nickel.getMolten(1000));
        TitanRecipes.put(26, Materials.Osmium.getMolten(1000));
        TitanRecipes.put(27, Materials.Palladium.getMolten(1000));
        TitanRecipes.put(28, Materials.Platinum.getMolten(1000));
        TitanRecipes.put(29, WerkstoffLoader.Rhodium.getMolten(1000));
        TitanRecipes.put(30, WerkstoffLoader.Ruthenium.getMolten(1000));
        TitanRecipes.put(31, Materials.Samarium.getMolten(1000));
        TitanRecipes.put(32, Materials.Silicon.getMolten(1000));
        TitanRecipes.put(33, Materials.Tantalum.getMolten(1000));
        TitanRecipes.put(34, Materials.Thorium.getMolten(1000));
        TitanRecipes.put(35, Materials.Titanium.getMolten(1000));

        TitanRecipes.put(36, Materials.Argon.getGas(1000));
        TitanRecipes.put(37, Materials.Chlorine.getGas(1000));
        TitanRecipes.put(38, Materials.Deuterium.getGas(1000));
        TitanRecipes.put(39, Materials.Ethane.getGas(1000));
        TitanRecipes.put(40, Materials.Hydrogen.getGas(1000));
        TitanRecipes.put(41, Materials.Methane.getGas(1000));
        TitanRecipes.put(42, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TitanRecipes.size(); i++) {
            FluidStack OutPutFluid = TitanRecipes.get(i);
            addSingularityFluidRecipes("T5: Titan", OutPutFluid);
        }

        // T5 - Ross128ba - Ra
        Map<Integer, FluidStack> Ross128baRecipes = new HashMap<>();
        Ross128baRecipes.put(0, Materials.Helium_3.getGas(1000));
        Ross128baRecipes.put(1, WerkstoffLoader.Krypton.getFluidOrGas(1000));
        Ross128baRecipes.put(2, WerkstoffLoader.Neon.getFluidOrGas(1000));
        Ross128baRecipes.put(3, Materials.SaltWater.getFluid(1000));
        Ross128baRecipes.put(4, WerkstoffLoader.Xenon.getFluidOrGas(1000));

        for (int i = 0; i < Ross128baRecipes.size(); i++) {
            FluidStack OutPutFluid = Ross128baRecipes.get(i);
            addSingularityFluidRecipes("T5: Ross128ba", OutPutFluid);
        }

        // T6 - Proteus - Pr
        Map<Integer, FluidStack> ProteusRecipes = new HashMap<>();
        ProteusRecipes.put(0, Materials.Adamantium.getMolten(1000));
        ProteusRecipes.put(1, Materials.Aluminium.getMolten(1000));
        ProteusRecipes.put(2, Materials.Barium.getMolten(1000));
        ProteusRecipes.put(3, Materials.Calcium.getMolten(1000));
        ProteusRecipes.put(4, Materials.Chrome.getMolten(1000));
        ProteusRecipes.put(5, Materials.Copper.getMolten(1000));
        ProteusRecipes.put(6, Materials.DeepIron.getMolten(1000));
        ProteusRecipes.put(7, Materials.Gold.getMolten(1000));
        ProteusRecipes.put(8, Materials.Iridium.getMolten(1000));
        ProteusRecipes.put(9, Materials.Iron.getMolten(1000));
        ProteusRecipes.put(10, Materials.InfusedGold.getMolten(1000));
        ProteusRecipes.put(11, Materials.Lead.getMolten(1000));
        ProteusRecipes.put(12, Materials.Magnesium.getMolten(1000));
        ProteusRecipes.put(13, Materials.Molybdenum.getMolten(1000));
        ProteusRecipes.put(14, Materials.Naquadah.getMolten(1000));
        ProteusRecipes.put(15, Materials.Neutronium.getMolten(1000));
        ProteusRecipes.put(16, Materials.Nickel.getMolten(1000));
        ProteusRecipes.put(17, Materials.Osmium.getMolten(1000));
        ProteusRecipes.put(18, Materials.Palladium.getMolten(1000));
        ProteusRecipes.put(19, Materials.Platinum.getMolten(1000));
        ProteusRecipes.put(20, WerkstoffLoader.Rhodium.getMolten(1000));
        ProteusRecipes.put(21, WerkstoffLoader.Ruthenium.getMolten(1000));
        ProteusRecipes.put(22, Materials.ShadowIron.getMolten(1000));
        ProteusRecipes.put(23, Materials.Silicon.getMolten(1000));
        ProteusRecipes.put(24, Materials.Titanium.getMolten(1000));
        ProteusRecipes.put(25, Materials.Trinium.getMolten(1000));
        ProteusRecipes.put(26, Materials.Tungsten.getMolten(1000));
        ProteusRecipes.put(27, Materials.Uranium.getMolten(1000));
        ProteusRecipes.put(28, Materials.Vanadium.getMolten(1000));

        ProteusRecipes.put(29, Materials.Ammonia.getGas(1000));
        ProteusRecipes.put(30, Materials.Deuterium.getGas(1000));
        ProteusRecipes.put(31, Materials.Helium_3.getGas(1000));
        ProteusRecipes.put(32, Materials.Hydrogen.getGas(1000));
        ProteusRecipes.put(33, Materials.Oxygen.getGas(1000));
        ProteusRecipes.put(34, Materials.Tritium.getGas(1000));

        for (int i = 0; i < ProteusRecipes.size(); i++) {
            FluidStack OutPutFluid = ProteusRecipes.get(i);
            addSingularityFluidRecipes("T6: Proteus", OutPutFluid);
        }

        // T6 - Triton - Tr
        Map<Integer, FluidStack> TritonRecipes = new HashMap<>();
        TritonRecipes.put(0, Materials.Adamantium.getMolten(1000));
        TritonRecipes.put(1, Materials.Aluminium.getMolten(1000));
        TritonRecipes.put(2, Materials.Arsenic.getMolten(1000));
        TritonRecipes.put(3, Materials.Calcium.getMolten(1000));
        TritonRecipes.put(4, Materials.Cerium.getMolten(1000));
        TritonRecipes.put(5, Materials.Cobalt.getMolten(1000));
        TritonRecipes.put(6, Materials.DeepIron.getMolten(1000));
        TritonRecipes.put(7, Materials.Gadolinium.getMolten(1000));
        TritonRecipes.put(8, Materials.Gallium.getMolten(1000));
        TritonRecipes.put(9, Materials.Gold.getMolten(1000));
        TritonRecipes.put(10, Materials.Holmium.getMolten(1000));
        TritonRecipes.put(11, Materials.Iridium.getMolten(1000));
        TritonRecipes.put(12, Materials.Iron.getMolten(1000));
        TritonRecipes.put(13, Materials.Lanthanum.getMolten(1000));
        TritonRecipes.put(14, Materials.Lead.getMolten(1000));
        TritonRecipes.put(15, Materials.Lithium.getMolten(1000));
        TritonRecipes.put(16, Materials.Manganese.getMolten(1000));
        TritonRecipes.put(17, Materials.Mithril.getMolten(1000));
        TritonRecipes.put(18, Materials.Naquadah.getMolten(1000));
        TritonRecipes.put(19, Materials.Neodymium.getMolten(1000));
        TritonRecipes.put(20, Materials.Neutronium.getMolten(1000));
        TritonRecipes.put(21, Materials.Nickel.getMolten(1000));
        TritonRecipes.put(22, Materials.Niobium.getMolten(1000));
        TritonRecipes.put(23, Materials.Osmium.getMolten(1000));
        TritonRecipes.put(24, Materials.Palladium.getMolten(1000));
        TritonRecipes.put(25, Materials.Platinum.getMolten(1000));
        TritonRecipes.put(26, Materials.Plutonium241.getMolten(1000));
        TritonRecipes.put(27, WerkstoffLoader.Rhodium.getMolten(1000));
        TritonRecipes.put(28, WerkstoffLoader.Ruthenium.getMolten(1000));
        TritonRecipes.put(29, Materials.Samarium.getMolten(1000));
        TritonRecipes.put(30, Materials.ShadowIron.getMolten(1000));
        TritonRecipes.put(31, Materials.Silicon.getMolten(1000));
        TritonRecipes.put(32, Materials.Silver.getMolten(1000));
        TritonRecipes.put(33, Materials.Tantalum.getMolten(1000));
        TritonRecipes.put(34, Materials.Thaumium.getMolten(1000));
        TritonRecipes.put(35, Materials.Thorium.getMolten(1000));
        TritonRecipes.put(36, Materials.Titanium.getMolten(1000));
        TritonRecipes.put(37, Materials.Tungsten.getMolten(1000));
        TritonRecipes.put(38, Materials.Uranium.getMolten(1000));
        TritonRecipes.put(39, Materials.Uranium235.getMolten(1000));
        TritonRecipes.put(40, Materials.Vanadium.getMolten(1000));
        TritonRecipes.put(41, Materials.Yttrium.getMolten(1000));

        TritonRecipes.put(42, Materials.Chlorine.getGas(1000));
        TritonRecipes.put(43, Materials.Ethylene.getGas(1000));
        TritonRecipes.put(44, Materials.Hydrogen.getGas(1000));
        TritonRecipes.put(45, Materials.Nitrogen.getGas(1000));
        TritonRecipes.put(46, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TritonRecipes.size(); i++) {
            FluidStack OutPutFluid = TritonRecipes.get(i);
            addSingularityFluidRecipes("T6: Triton", OutPutFluid);
        }

        // T7 - Haumea - Ha
        Map<Integer, FluidStack> HaumeaRecipes = new HashMap<>();
        HaumeaRecipes.put(0, Materials.Adamantium.getMolten(1000));
        HaumeaRecipes.put(1, Materials.Aluminium.getMolten(1000));
        HaumeaRecipes.put(2, Materials.Beryllium.getMolten(1000));
        HaumeaRecipes.put(3, Materials.Calcium.getMolten(1000));
        HaumeaRecipes.put(4, Materials.Cerium.getMolten(1000));
        HaumeaRecipes.put(5, Materials.Chrome.getMolten(1000));
        HaumeaRecipes.put(6, Materials.Gadolinium.getMolten(1000));
        HaumeaRecipes.put(7, Materials.Gold.getMolten(1000));
        HaumeaRecipes.put(8, Materials.Holmium.getMolten(1000));
        HaumeaRecipes.put(9, Materials.InfusedGold.getMolten(1000));
        HaumeaRecipes.put(10, Materials.Iron.getMolten(1000));
        HaumeaRecipes.put(11, Materials.Lanthanum.getMolten(1000));
        HaumeaRecipes.put(12, Materials.Lead.getMolten(1000));
        HaumeaRecipes.put(13, Materials.Lithium.getMolten(1000));
        HaumeaRecipes.put(14, Materials.Magnesium.getMolten(1000));
        HaumeaRecipes.put(15, Materials.Manganese.getMolten(1000));
        HaumeaRecipes.put(16, Materials.Naquadah.getMolten(1000));
        HaumeaRecipes.put(17, Materials.NaquadahEnriched.getMolten(1000));
        HaumeaRecipes.put(18, Materials.Naquadria.getMolten(1000));
        HaumeaRecipes.put(19, Materials.Neodymium.getMolten(1000));
        HaumeaRecipes.put(20, Materials.Neutronium.getMolten(1000));
        HaumeaRecipes.put(21, Materials.Platinum.getMolten(1000));
        HaumeaRecipes.put(22, Materials.Plutonium241.getMolten(1000));
        HaumeaRecipes.put(23, Materials.Potassium.getMolten(1000));
        HaumeaRecipes.put(24, Materials.Samarium.getMolten(1000));
        HaumeaRecipes.put(25, Materials.Silicon.getMolten(1000));
        HaumeaRecipes.put(26, Materials.Thorium.getMolten(1000));
        HaumeaRecipes.put(27, Materials.Titanium.getMolten(1000));
        HaumeaRecipes.put(28, Materials.Tungsten.getMolten(1000));
        HaumeaRecipes.put(29, Materials.Uranium.getMolten(1000));
        HaumeaRecipes.put(30, Materials.Uranium235.getMolten(1000));

        HaumeaRecipes.put(31, Materials.Hydrogen.getGas(1000));
        HaumeaRecipes.put(32, Materials.Nitrogen.getGas(1000));
        HaumeaRecipes.put(33, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < HaumeaRecipes.size(); i++) {
            FluidStack OutPutFluid = HaumeaRecipes.get(i);
            addSingularityFluidRecipes("T7: Haumea", OutPutFluid);
        }

        // T7 - Kuiperbelt - KB
        Map<Integer, FluidStack> KuiperbeltRecipes = new HashMap<>();
        KuiperbeltRecipes.put(0, Materials.Adamantium.getMolten(1000));
        KuiperbeltRecipes.put(1, Materials.Aluminium.getMolten(1000));
        KuiperbeltRecipes.put(2, Materials.Antimony.getMolten(1000));
        KuiperbeltRecipes.put(3, Materials.Arsenic.getMolten(1000));
        KuiperbeltRecipes.put(4, Materials.Calcium.getMolten(1000));
        KuiperbeltRecipes.put(5, Materials.Chrome.getMolten(1000));
        KuiperbeltRecipes.put(6, Materials.Cobalt.getMolten(1000));
        KuiperbeltRecipes.put(7, Materials.Copper.getMolten(1000));
        KuiperbeltRecipes.put(8, Materials.Iridium.getMolten(1000));
        KuiperbeltRecipes.put(9, Materials.Iron.getMolten(1000));
        KuiperbeltRecipes.put(10, Materials.Lead.getMolten(1000));
        KuiperbeltRecipes.put(11, Materials.Lithium.getMolten(1000));
        KuiperbeltRecipes.put(12, Materials.Mithril.getMolten(1000));
        KuiperbeltRecipes.put(13, Materials.Naquadah.getMolten(1000));
        KuiperbeltRecipes.put(14, Materials.NaquadahEnriched.getMolten(1000));
        KuiperbeltRecipes.put(15, Materials.Naquadria.getMolten(1000));
        KuiperbeltRecipes.put(16, Materials.Neutronium.getMolten(1000));
        KuiperbeltRecipes.put(17, Materials.Nickel.getMolten(1000));
        KuiperbeltRecipes.put(18, Materials.Osmium.getMolten(1000));
        KuiperbeltRecipes.put(19, Materials.Palladium.getMolten(1000));
        KuiperbeltRecipes.put(20, Materials.Platinum.getMolten(1000));
        KuiperbeltRecipes.put(21, WerkstoffLoader.Rhodium.getMolten(1000));
        KuiperbeltRecipes.put(22, WerkstoffLoader.Ruthenium.getMolten(1000));
        KuiperbeltRecipes.put(23, Materials.Thaumium.getMolten(1000));
        KuiperbeltRecipes.put(24, Materials.Thorium.getMolten(1000));
        KuiperbeltRecipes.put(25, Materials.Titanium.getMolten(1000));
        KuiperbeltRecipes.put(26, Materials.Tungsten.getMolten(1000));
        KuiperbeltRecipes.put(27, Materials.Uranium.getMolten(1000));

        KuiperbeltRecipes.put(28, Materials.Hydrogen.getGas(1000));
        KuiperbeltRecipes.put(29, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < KuiperbeltRecipes.size(); i++) {
            FluidStack OutPutFluid = KuiperbeltRecipes.get(i);
            addSingularityFluidRecipes("T7: Kuiperbelt", OutPutFluid);
        }

        // T7 - Makemake - MM
        Map<Integer, FluidStack> MakemakeRecipes = new HashMap<>();
        MakemakeRecipes.put(0, Materials.Adamantium.getMolten(1000));
        MakemakeRecipes.put(1, Materials.Aluminium.getMolten(1000));
        MakemakeRecipes.put(2, Materials.Beryllium.getMolten(1000));
        MakemakeRecipes.put(3, Materials.BlackPlutonium.getMolten(1000));
        MakemakeRecipes.put(4, Materials.Boron.getMolten(1000));
        MakemakeRecipes.put(5, Materials.Calcium.getMolten(1000));
        MakemakeRecipes.put(6, Materials.Cerium.getMolten(1000));
        MakemakeRecipes.put(7, Materials.Chrome.getMolten(1000));
        MakemakeRecipes.put(8, Materials.Gadolinium.getMolten(1000));
        MakemakeRecipes.put(9, Materials.Gallium.getMolten(1000));
        MakemakeRecipes.put(10, Materials.Gold.getMolten(1000));
        MakemakeRecipes.put(11, Materials.Holmium.getMolten(1000));
        MakemakeRecipes.put(12, Materials.Iron.getMolten(1000));
        MakemakeRecipes.put(13, Materials.Lanthanum.getMolten(1000));
        MakemakeRecipes.put(14, Materials.Lead.getMolten(1000));
        MakemakeRecipes.put(15, Materials.Lithium.getMolten(1000));
        MakemakeRecipes.put(16, Materials.Magnesium.getMolten(1000));
        MakemakeRecipes.put(17, Materials.Manganese.getMolten(1000));
        MakemakeRecipes.put(18, Materials.Naquadah.getMolten(1000));
        MakemakeRecipes.put(19, Materials.Neodymium.getMolten(1000));
        MakemakeRecipes.put(20, Materials.Neutronium.getMolten(1000));
        MakemakeRecipes.put(21, Materials.Niobium.getMolten(1000));
        MakemakeRecipes.put(22, Materials.Potassium.getMolten(1000));
        MakemakeRecipes.put(23, Materials.Realgar.getMolten(1000));
        MakemakeRecipes.put(24, Materials.Samarium.getMolten(1000));
        MakemakeRecipes.put(25, Materials.Silicon.getMolten(1000));
        MakemakeRecipes.put(26, Materials.Thorium.getMolten(1000));
        MakemakeRecipes.put(27, Materials.Titanium.getMolten(1000));
        MakemakeRecipes.put(28, Materials.Tungsten.getMolten(1000));
        MakemakeRecipes.put(29, Materials.Uranium.getMolten(1000));
        MakemakeRecipes.put(30, Materials.Vanadium.getMolten(1000));
        MakemakeRecipes.put(31, Materials.Yttrium.getMolten(1000));

        MakemakeRecipes.put(32, Materials.HydrofluoricAcid.getFluid(1000));

        MakemakeRecipes.put(33, Materials.Hydrogen.getGas(1000));
        MakemakeRecipes.put(34, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MakemakeRecipes.size(); i++) {
            FluidStack OutPutFluid = MakemakeRecipes.get(i);
            addSingularityFluidRecipes("T7: Makemake", OutPutFluid);
        }

        // T7 - Pluto - Pl
        Map<Integer, FluidStack> PlutoRecipes = new HashMap<>();
        PlutoRecipes.put(0, Materials.Adamantium.getMolten(1000));
        PlutoRecipes.put(1, Materials.Aluminium.getMolten(1000));
        PlutoRecipes.put(2, Materials.Beryllium.getMolten(1000));
        PlutoRecipes.put(3, Materials.BlackPlutonium.getMolten(1000));
        PlutoRecipes.put(4, Materials.Boron.getMolten(1000));
        PlutoRecipes.put(5, Materials.Calcium.getMolten(1000));
        PlutoRecipes.put(6, Materials.Chrome.getMolten(1000));
        PlutoRecipes.put(7, Materials.Copper.getMolten(1000));
        PlutoRecipes.put(8, Materials.DeepIron.getMolten(1000));
        PlutoRecipes.put(9, Materials.Gold.getMolten(1000));
        PlutoRecipes.put(10, Materials.Iridium.getMolten(1000));
        PlutoRecipes.put(11, Materials.Iron.getMolten(1000));
        PlutoRecipes.put(12, Materials.Lead.getMolten(1000));
        PlutoRecipes.put(13, Materials.Lithium.getMolten(1000));
        PlutoRecipes.put(14, Materials.Magnesium.getMolten(1000));
        PlutoRecipes.put(15, Materials.Manganese.getMolten(1000));
        PlutoRecipes.put(16, Materials.Molybdenum.getMolten(1000));
        PlutoRecipes.put(17, Materials.Naquadah.getMolten(1000));
        PlutoRecipes.put(18, Materials.NaquadahEnriched.getMolten(1000));
        PlutoRecipes.put(19, Materials.Naquadria.getMolten(1000));
        PlutoRecipes.put(20, Materials.Neutronium.getMolten(1000));
        PlutoRecipes.put(21, Materials.Nickel.getMolten(1000));
        PlutoRecipes.put(22, Materials.Osmium.getMolten(1000));
        PlutoRecipes.put(23, Materials.Palladium.getMolten(1000));
        PlutoRecipes.put(24, Materials.Platinum.getMolten(1000));
        PlutoRecipes.put(25, Materials.Plutonium241.getMolten(1000));
        PlutoRecipes.put(26, Materials.Potassium.getMolten(1000));
        PlutoRecipes.put(27, WerkstoffLoader.Rhodium.getMolten(1000));
        PlutoRecipes.put(28, WerkstoffLoader.Ruthenium.getMolten(1000));
        PlutoRecipes.put(29, Materials.ShadowIron.getMolten(1000));
        PlutoRecipes.put(30, Materials.Silicon.getMolten(1000));
        PlutoRecipes.put(31, Materials.Thorium.getMolten(1000));
        PlutoRecipes.put(32, Materials.Titanium.getMolten(1000));
        PlutoRecipes.put(33, Materials.Trinium.getMolten(1000));
        PlutoRecipes.put(34, Materials.Tungsten.getMolten(1000));
        PlutoRecipes.put(35, Materials.Uranium.getMolten(1000));
        PlutoRecipes.put(36, Materials.Uranium235.getMolten(1000));
        PlutoRecipes.put(37, Materials.Vanadium.getMolten(1000));

        PlutoRecipes.put(38, Materials.LiquidAir.getFluid(1000));

        PlutoRecipes.put(39, Materials.Fluorine.getGas(1000));
        PlutoRecipes.put(40, Materials.Hydrogen.getGas(1000));
        PlutoRecipes.put(41, Materials.Nitrogen.getGas(1000));
        PlutoRecipes.put(42, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < PlutoRecipes.size(); i++) {
            FluidStack OutPutFluid = PlutoRecipes.get(i);
            addSingularityFluidRecipes("T7: Pluto", OutPutFluid);
        }

        // T8 - BarnardC - BC
        Map<Integer, FluidStack> BarnardCRecipes = new HashMap<>();
        BarnardCRecipes.put(0, Materials.Aluminium.getMolten(1000));
        BarnardCRecipes.put(1, Materials.Antimony.getMolten(1000));
        BarnardCRecipes.put(2, Materials.Arsenic.getMolten(1000));
        BarnardCRecipes.put(3, Materials.Bismuth.getMolten(1000));
        BarnardCRecipes.put(4, Materials.BlackPlutonium.getMolten(1000));
        BarnardCRecipes.put(5, Materials.Boron.getMolten(1000));
        BarnardCRecipes.put(6, Materials.Caesium.getMolten(1000));
        BarnardCRecipes.put(7, Materials.Calcium.getMolten(1000));
        BarnardCRecipes.put(8, Materials.Cerium.getMolten(1000));
        BarnardCRecipes.put(9, Materials.Chrome.getMolten(1000));
        BarnardCRecipes.put(10, Materials.DeepIron.getMolten(1000));
        BarnardCRecipes.put(11, Materials.Gadolinium.getMolten(1000));
        BarnardCRecipes.put(12, Materials.Holmium.getMolten(1000));
        BarnardCRecipes.put(13, Materials.Iridium.getMolten(1000));
        BarnardCRecipes.put(14, Materials.Iron.getMolten(1000));
        BarnardCRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        BarnardCRecipes.put(16, Materials.Lithium.getMolten(1000));
        BarnardCRecipes.put(17, Materials.Magnesium.getMolten(1000));
        BarnardCRecipes.put(18, Materials.Manganese.getMolten(1000));
        BarnardCRecipes.put(19, Materials.Neodymium.getMolten(1000));
        BarnardCRecipes.put(20, Materials.Nickel.getMolten(1000));
        BarnardCRecipes.put(21, Materials.Potassium.getMolten(1000));
        BarnardCRecipes.put(22, Materials.Samarium.getMolten(1000));
        BarnardCRecipes.put(23, Materials.ShadowIron.getMolten(1000));
        BarnardCRecipes.put(24, Materials.Silicon.getMolten(1000));
        BarnardCRecipes.put(25, Materials.Tartarite.getMolten(1000));
        BarnardCRecipes.put(26, Materials.Thaumium.getMolten(1000));
        BarnardCRecipes.put(27, Materials.Tin.getMolten(1000));
        BarnardCRecipes.put(28, Materials.Tungsten.getMolten(1000));
        BarnardCRecipes.put(29, Materials.Osmium.getMolten(1000));

        BarnardCRecipes.put(30, Materials.OilExtraHeavy.getFluid(1000));
        BarnardCRecipes.put(31, Materials.OilHeavy.getFluid(1000));

        BarnardCRecipes.put(32, Materials.Chlorine.getGas(1000));
        BarnardCRecipes.put(33, Materials.Fluorine.getGas(1000));
        BarnardCRecipes.put(34, Materials.Hydrogen.getGas(1000));
        BarnardCRecipes.put(35, Materials.Nitrogen.getGas(1000));
        BarnardCRecipes.put(36, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < BarnardCRecipes.size(); i++) {
            FluidStack OutPutFluid = BarnardCRecipes.get(i);
            addSingularityFluidRecipes("T8: BarnardC", OutPutFluid);
        }

        // T8 - BarnardE - BE
        Map<Integer, FluidStack> BarnardERecipes = new HashMap<>();
        BarnardERecipes.put(0, Materials.Adamantium.getMolten(1000));
        BarnardERecipes.put(1, Materials.Aluminium.getMolten(1000));
        BarnardERecipes.put(2, Materials.Caesium.getMolten(1000));
        BarnardERecipes.put(3, Materials.Calcium.getMolten(1000));
        BarnardERecipes.put(4, Materials.Cerium.getMolten(1000));
        BarnardERecipes.put(5, Materials.Chrome.getMolten(1000));
        BarnardERecipes.put(6, Materials.Copper.getMolten(1000));
        BarnardERecipes.put(7, Materials.DeepIron.getMolten(1000));
        BarnardERecipes.put(8, Materials.Gold.getMolten(1000));
        BarnardERecipes.put(9, Materials.InfusedGold.getMolten(1000));
        BarnardERecipes.put(10, Materials.Iron.getMolten(1000));
        BarnardERecipes.put(11, Materials.Lanthanum.getMolten(1000));
        BarnardERecipes.put(12, Materials.Lead.getMolten(1000));
        BarnardERecipes.put(13, Materials.Magnesium.getMolten(1000));
        BarnardERecipes.put(14, Materials.Manganese.getMolten(1000));
        BarnardERecipes.put(15, Materials.Molybdenum.getMolten(1000));
        BarnardERecipes.put(16, Materials.Naquadah.getMolten(1000));
        BarnardERecipes.put(17, Materials.NaquadahEnriched.getMolten(1000));
        BarnardERecipes.put(18, Materials.Naquadria.getMolten(1000));
        BarnardERecipes.put(19, Materials.Neutronium.getMolten(1000));
        BarnardERecipes.put(20, Materials.Platinum.getMolten(1000));
        BarnardERecipes.put(21, Materials.Plutonium241.getMolten(1000));
        BarnardERecipes.put(22, Materials.Potassium.getMolten(1000));
        BarnardERecipes.put(23, Materials.ShadowIron.getMolten(1000));
        BarnardERecipes.put(24, Materials.Silicon.getMolten(1000));
        BarnardERecipes.put(25, Materials.Tantalum.getMolten(1000));
        BarnardERecipes.put(26, Materials.Titanium.getMolten(1000));
        BarnardERecipes.put(27, Materials.Thaumium.getMolten(1000));
        BarnardERecipes.put(28, Materials.Thorium.getMolten(1000));
        BarnardERecipes.put(29, Materials.Tungsten.getMolten(1000));
        BarnardERecipes.put(30, Materials.Uranium.getMolten(1000));
        BarnardERecipes.put(31, Materials.Uranium235.getMolten(1000));
        BarnardERecipes.put(32, Materials.Vanadium.getMolten(1000));

        BarnardERecipes.put(33, Materials.LiquidAir.getFluid(1000));

        BarnardERecipes.put(34, Materials.Chlorine.getGas(1000));
        BarnardERecipes.put(35, Materials.Fluorine.getGas(1000));
        BarnardERecipes.put(36, Materials.Hydrogen.getGas(1000));
        BarnardERecipes.put(37, Materials.Nitrogen.getGas(1000));
        BarnardERecipes.put(38, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < BarnardERecipes.size(); i++) {
            FluidStack OutPutFluid = BarnardERecipes.get(i);
            addSingularityFluidRecipes("T8: BarnardE", OutPutFluid);
        }

        // T8 - BarnardF - BF
        Map<Integer, FluidStack> BarnardFRecipes = new HashMap<>();
        BarnardFRecipes.put(0, Materials.Adamantium.getMolten(1000));
        BarnardFRecipes.put(1, Materials.Aluminium.getMolten(1000));
        BarnardFRecipes.put(2, Materials.Beryllium.getMolten(1000));
        BarnardFRecipes.put(3, Materials.Caesium.getMolten(1000));
        BarnardFRecipes.put(4, Materials.Calcium.getMolten(1000));
        BarnardFRecipes.put(5, Materials.Cerium.getMolten(1000));
        BarnardFRecipes.put(6, Materials.Chrome.getMolten(1000));
        BarnardFRecipes.put(7, Materials.Copper.getMolten(1000));
        BarnardFRecipes.put(8, Materials.DeepIron.getMolten(1000));
        BarnardFRecipes.put(9, Materials.Gadolinium.getMolten(1000));
        BarnardFRecipes.put(10, Materials.Gallium.getMolten(1000));
        BarnardFRecipes.put(11, Materials.Gold.getMolten(1000));
        BarnardFRecipes.put(12, Materials.Holmium.getMolten(1000));
        BarnardFRecipes.put(13, Materials.Iron.getMolten(1000));
        BarnardFRecipes.put(14, Materials.Lanthanum.getMolten(1000));
        BarnardFRecipes.put(15, Materials.Lead.getMolten(1000));
        BarnardFRecipes.put(16, Materials.Magnesium.getMolten(1000));
        BarnardFRecipes.put(17, Materials.Manganese.getMolten(1000));
        BarnardFRecipes.put(18, Materials.Naquadah.getMolten(1000));
        BarnardFRecipes.put(19, Materials.NaquadahEnriched.getMolten(1000));
        BarnardFRecipes.put(20, Materials.Naquadria.getMolten(1000));
        BarnardFRecipes.put(21, Materials.Neodymium.getMolten(1000));
        BarnardFRecipes.put(22, Materials.Neutronium.getMolten(1000));
        BarnardFRecipes.put(23, Materials.Niobium.getMolten(1000));
        BarnardFRecipes.put(24, Materials.Plutonium241.getMolten(1000));
        BarnardFRecipes.put(25, Materials.Realgar.getMolten(1000));
        BarnardFRecipes.put(26, Materials.Samarium.getMolten(1000));
        BarnardFRecipes.put(27, Materials.ShadowIron.getMolten(1000));
        BarnardFRecipes.put(28, Materials.Silicon.getMolten(1000));
        BarnardFRecipes.put(29, Materials.Tantalum.getMolten(1000));
        BarnardFRecipes.put(30, Materials.Thaumium.getMolten(1000));
        BarnardFRecipes.put(31, Materials.Thorium.getMolten(1000));
        BarnardFRecipes.put(32, Materials.Tin.getMolten(1000));
        BarnardFRecipes.put(33, Materials.Titanium.getMolten(1000));
        BarnardFRecipes.put(34, Materials.Tungsten.getMolten(1000));
        BarnardFRecipes.put(35, Materials.Uranium.getMolten(1000));
        BarnardFRecipes.put(36, Materials.Uranium235.getMolten(1000));
        BarnardFRecipes.put(37, Materials.Vanadium.getMolten(1000));
        BarnardFRecipes.put(38, Materials.Yttrium.getMolten(1000));

        BarnardFRecipes.put(39, Materials.Mercury.getFluid(1000));

        BarnardFRecipes.put(40, Materials.Chlorine.getGas(1000));
        BarnardFRecipes.put(41, Materials.Fluorine.getGas(1000));
        BarnardFRecipes.put(42, Materials.Hydrogen.getGas(1000));
        BarnardFRecipes.put(43, Materials.Nitrogen.getGas(1000));
        BarnardFRecipes.put(44, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < BarnardFRecipes.size(); i++) {
            FluidStack OutPutFluid = BarnardFRecipes.get(i);
            addSingularityFluidRecipes("T8: BarnardF", OutPutFluid);
        }

        // T8 - α Centauri Bb - CB
        Map<Integer, FluidStack> CentauriBbRecipes = new HashMap<>();
        CentauriBbRecipes.put(0, Materials.Aluminium.getMolten(1000));
        CentauriBbRecipes.put(1, Materials.Antimony.getMolten(1000));
        CentauriBbRecipes.put(2, Materials.Barium.getMolten(1000));
        CentauriBbRecipes.put(3, Materials.Beryllium.getMolten(1000));
        CentauriBbRecipes.put(4, Materials.BlackPlutonium.getMolten(1000));
        CentauriBbRecipes.put(5, Materials.Boron.getMolten(1000));
        CentauriBbRecipes.put(6, Materials.Caesium.getMolten(1000));
        CentauriBbRecipes.put(7, Materials.Calcium.getMolten(1000));
        CentauriBbRecipes.put(8, Materials.Cerium.getMolten(1000));
        CentauriBbRecipes.put(9, Materials.Chrome.getMolten(1000));
        CentauriBbRecipes.put(10, Materials.Copper.getMolten(1000));
        CentauriBbRecipes.put(11, Materials.Electrotine.getMolten(1000));
        CentauriBbRecipes.put(12, Materials.Gadolinium.getMolten(1000));
        CentauriBbRecipes.put(13, Materials.Holmium.getMolten(1000));
        CentauriBbRecipes.put(14, Materials.Iron.getMolten(1000));
        CentauriBbRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        CentauriBbRecipes.put(16, Materials.Lead.getMolten(1000));
        CentauriBbRecipes.put(17, Materials.Magnesium.getMolten(1000));
        CentauriBbRecipes.put(18, Materials.Manganese.getMolten(1000));
        CentauriBbRecipes.put(19, Materials.Neodymium.getMolten(1000));
        CentauriBbRecipes.put(20, Materials.Potassium.getMolten(1000));
        CentauriBbRecipes.put(21, Materials.Samarium.getMolten(1000));
        CentauriBbRecipes.put(22, Materials.Silicon.getMolten(1000));
        CentauriBbRecipes.put(23, Materials.Tantalum.getMolten(1000));
        CentauriBbRecipes.put(24, Materials.Tartarite.getMolten(1000));
        CentauriBbRecipes.put(25, Materials.Thorium.getMolten(1000));
        CentauriBbRecipes.put(26, Materials.Tin.getMolten(1000));
        CentauriBbRecipes.put(27, Materials.Uranium.getMolten(1000));
        CentauriBbRecipes.put(28, Materials.Zinc.getMolten(1000));

        CentauriBbRecipes.put(29, Materials.Mercury.getFluid(1000));

        CentauriBbRecipes.put(30, Materials.Hydrogen.getGas(1000));
        CentauriBbRecipes.put(31, Materials.Nitrogen.getGas(1000));
        CentauriBbRecipes.put(32, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < CentauriBbRecipes.size(); i++) {
            FluidStack OutPutFluid = CentauriBbRecipes.get(i);
            addSingularityFluidRecipes("T8: α Centauri Bb", OutPutFluid);
        }

        // T8 - TCetiE - TE
        Map<Integer, FluidStack> TCetiERecipes = new HashMap<>();
        TCetiERecipes.put(0, Materials.Aluminium.getMolten(1000));
        TCetiERecipes.put(1, Materials.Barium.getMolten(1000));
        TCetiERecipes.put(2, Materials.BlackPlutonium.getMolten(1000));
        TCetiERecipes.put(3, Materials.Boron.getMolten(1000));
        TCetiERecipes.put(4, Materials.Calcium.getMolten(1000));
        TCetiERecipes.put(5, Materials.Chrome.getMolten(1000));
        TCetiERecipes.put(6, Materials.Gold.getMolten(1000));
        TCetiERecipes.put(7, Materials.Iron.getMolten(1000));
        TCetiERecipes.put(8, Materials.Lithium.getMolten(1000));
        TCetiERecipes.put(9, Materials.Magnesium.getMolten(1000));
        TCetiERecipes.put(10, Materials.Manganese.getMolten(1000));
        TCetiERecipes.put(11, Materials.Molybdenum.getMolten(1000));
        TCetiERecipes.put(12, Materials.Niobium.getMolten(1000));
        TCetiERecipes.put(13, Materials.Potassium.getMolten(1000));
        TCetiERecipes.put(14, Materials.Silicon.getMolten(1000));
        TCetiERecipes.put(15, Materials.Tin.getMolten(1000));
        TCetiERecipes.put(16, Materials.Titanium.getMolten(1000));
        TCetiERecipes.put(17, Materials.Tungsten.getMolten(1000));
        TCetiERecipes.put(18, Materials.Vanadium.getMolten(1000));

        TCetiERecipes.put(19, Materials.OilExtraHeavy.getFluid(1000));
        TCetiERecipes.put(20, Materials.OilHeavy.getFluid(1000));

        TCetiERecipes.put(21, Materials.Chlorine.getGas(1000));
        TCetiERecipes.put(22, Materials.Fluorine.getGas(1000));
        TCetiERecipes.put(23, Materials.Hydrogen.getGas(1000));
        TCetiERecipes.put(24, Materials.Nitrogen.getGas(1000));
        TCetiERecipes.put(25, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TCetiERecipes.size(); i++) {
            FluidStack OutPutFluid = TCetiERecipes.get(i);
            addSingularityFluidRecipes("T8: TCetiE", OutPutFluid);
        }

        // T8 - VegaB - VB
        Map<Integer, FluidStack> VegaBRecipes = new HashMap<>();
        VegaBRecipes.put(0, Materials.Adamantium.getMolten(1000));
        VegaBRecipes.put(1, Materials.Aluminium.getMolten(1000));
        VegaBRecipes.put(2, Materials.Antimony.getMolten(1000));
        VegaBRecipes.put(3, Materials.Arsenic.getMolten(1000));
        VegaBRecipes.put(4, Materials.Bismuth.getMolten(1000));
        VegaBRecipes.put(5, Materials.Caesium.getMolten(1000));
        VegaBRecipes.put(6, Materials.Calcium.getMolten(1000));
        VegaBRecipes.put(7, Materials.Cerium.getMolten(1000));
        VegaBRecipes.put(8, Materials.Chrome.getMolten(1000));
        VegaBRecipes.put(9, Materials.Copper.getMolten(1000));
        VegaBRecipes.put(10, Materials.Gallium.getMolten(1000));
        VegaBRecipes.put(11, Materials.Gold.getMolten(1000));
        VegaBRecipes.put(12, Materials.InfusedGold.getMolten(1000));
        VegaBRecipes.put(13, Materials.Iron.getMolten(1000));
        VegaBRecipes.put(14, Materials.Lanthanum.getMolten(1000));
        VegaBRecipes.put(15, Materials.Lead.getMolten(1000));
        VegaBRecipes.put(16, Materials.Lithium.getMolten(1000));
        VegaBRecipes.put(17, Materials.Magnesium.getMolten(1000));
        VegaBRecipes.put(18, Materials.Manganese.getMolten(1000));
        VegaBRecipes.put(19, Materials.Naquadah.getMolten(1000));
        VegaBRecipes.put(20, Materials.NaquadahEnriched.getMolten(1000));
        VegaBRecipes.put(21, Materials.Naquadria.getMolten(1000));
        VegaBRecipes.put(22, Materials.Neutronium.getMolten(1000));
        VegaBRecipes.put(23, Materials.Niobium.getMolten(1000));
        VegaBRecipes.put(24, Materials.Platinum.getMolten(1000));
        VegaBRecipes.put(25, Materials.Plutonium241.getMolten(1000));
        VegaBRecipes.put(26, Materials.Realgar.getMolten(1000));
        VegaBRecipes.put(27, Materials.Silicon.getMolten(1000));
        VegaBRecipes.put(28, Materials.Silver.getMolten(1000));
        VegaBRecipes.put(29, Materials.Thorium.getMolten(1000));
        VegaBRecipes.put(30, Materials.Titanium.getMolten(1000));
        VegaBRecipes.put(31, Materials.Tungsten.getMolten(1000));
        VegaBRecipes.put(32, Materials.Uranium.getMolten(1000));
        VegaBRecipes.put(33, Materials.Uranium235.getMolten(1000));
        VegaBRecipes.put(34, Materials.Vanadium.getMolten(1000));
        VegaBRecipes.put(35, Materials.Yttrium.getMolten(1000));

        VegaBRecipes.put(36, Materials.Mercury.getFluid(1000));

        VegaBRecipes.put(37, Materials.Chlorine.getGas(1000));
        VegaBRecipes.put(38, Materials.Hydrogen.getGas(1000));
        VegaBRecipes.put(39, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < VegaBRecipes.size(); i++) {
            FluidStack OutPutFluid = VegaBRecipes.get(i);
            addSingularityFluidRecipes("T8: VegaB", OutPutFluid);
        }

        // T9 - Anubis - An
        Map<Integer, FluidStack> AnubisRecipes = new HashMap<>();
        AnubisRecipes.put(0, Materials.Adamantium.getMolten(1000));
        AnubisRecipes.put(1, Materials.Alduorite.getMolten(1000));
        AnubisRecipes.put(2, Materials.Aluminium.getMolten(1000));
        AnubisRecipes.put(3, Materials.Bedrockium.getMolten(1000));
        AnubisRecipes.put(4, Materials.Caesium.getMolten(1000));
        AnubisRecipes.put(5, Materials.Calcium.getMolten(1000));
        AnubisRecipes.put(6, Materials.CallistoIce.getMolten(1000));
        AnubisRecipes.put(7, Materials.Ceruclase.getMolten(1000));
        AnubisRecipes.put(8, Materials.Desh.getMolten(1000));
        AnubisRecipes.put(9, Materials.InfinityCatalyst.getMolten(1000));
        AnubisRecipes.put(10, Materials.Iron.getMolten(1000));
        AnubisRecipes.put(11, Materials.Lead.getMolten(1000));
        AnubisRecipes.put(12, Materials.Lithium.getMolten(1000));
        AnubisRecipes.put(13, Materials.Magnesium.getMolten(1000));
        AnubisRecipes.put(14, Materials.MeteoricIron.getMolten(1000));
        AnubisRecipes.put(15, Materials.Mytryl.getMolten(1000));
        AnubisRecipes.put(16, Materials.Neutronium.getMolten(1000));
        AnubisRecipes.put(17, Materials.Nickel.getMolten(1000));
        AnubisRecipes.put(18, Materials.Potassium.getMolten(1000));
        AnubisRecipes.put(19, Materials.Silicon.getMolten(1000));
        AnubisRecipes.put(20, Materials.Silver.getMolten(1000));
        AnubisRecipes.put(21, Materials.Tin.getMolten(1000));
        AnubisRecipes.put(22, Materials.Titanium.getMolten(1000));
        AnubisRecipes.put(23, Materials.Tungsten.getMolten(1000));
        AnubisRecipes.put(24, Materials.Vulcanite.getMolten(1000));
        AnubisRecipes.put(25, Materials.Zinc.getMolten(1000));

        AnubisRecipes.put(26, Materials.Chlorine.getGas(1000));
        AnubisRecipes.put(27, Materials.Fluorine.getGas(1000));
        AnubisRecipes.put(28, Materials.Hydrogen.getGas(1000));
        AnubisRecipes.put(29, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < AnubisRecipes.size(); i++) {
            FluidStack OutPutFluid = AnubisRecipes.get(i);
            addSingularityFluidRecipes("T9: Anubis", OutPutFluid);
        }

        // T9 - Horus - Ho
        Map<Integer, FluidStack> HorusRecipes = new HashMap<>();
        HorusRecipes.put(0, Materials.Aluminium.getMolten(1000));
        HorusRecipes.put(1, Materials.Ardite.getMolten(1000));
        HorusRecipes.put(2, Materials.Barium.getMolten(1000));
        HorusRecipes.put(3, Materials.Bedrockium.getMolten(1000));
        HorusRecipes.put(4, Materials.Boron.getMolten(1000));
        HorusRecipes.put(5, Materials.BlackPlutonium.getMolten(1000));
        HorusRecipes.put(6, Materials.Calcium.getMolten(1000));
        HorusRecipes.put(7, Materials.Ceruclase.getMolten(1000));
        HorusRecipes.put(8, Materials.Chrome.getMolten(1000));
        HorusRecipes.put(9, Materials.CosmicNeutronium.getMolten(1000));
        HorusRecipes.put(10, Materials.Draconium.getMolten(1000));
        HorusRecipes.put(11, Materials.Electrotine.getMolten(1000));
        HorusRecipes.put(12, Materials.Iron.getMolten(1000));
        HorusRecipes.put(13, Materials.Ledox.getMolten(1000));
        HorusRecipes.put(14, Materials.Magnesium.getMolten(1000));
        HorusRecipes.put(15, Materials.Manganese.getMolten(1000));
        HorusRecipes.put(16, Materials.Mytryl.getMolten(1000));
        HorusRecipes.put(17, Materials.Neutronium.getMolten(1000));
        HorusRecipes.put(18, Materials.Orichalcum.getMolten(1000));
        HorusRecipes.put(19, Materials.Oriharukon.getMolten(1000));
        HorusRecipes.put(20, Materials.Quantium.getMolten(1000));
        HorusRecipes.put(21, Materials.Realgar.getMolten(1000));
        HorusRecipes.put(22, Materials.Rubracium.getMolten(1000));
        HorusRecipes.put(23, Materials.Silicon.getMolten(1000));
        HorusRecipes.put(24, Materials.Titanium.getMolten(1000));
        HorusRecipes.put(25, Materials.Vinteum.getMolten(1000));
        HorusRecipes.put(26, Materials.Vulcanite.getMolten(1000));
        HorusRecipes.put(27, Materials.Vyroxeres.getMolten(1000));

        HorusRecipes.put(28, Materials.Chlorine.getGas(1000));
        HorusRecipes.put(29, Materials.Hydrogen.getGas(1000));
        HorusRecipes.put(30, Materials.Nitrogen.getGas(1000));
        HorusRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < HorusRecipes.size(); i++) {
            FluidStack OutPutFluid = HorusRecipes.get(i);
            addSingularityFluidRecipes("T9: Horus", OutPutFluid);
        }

        // T9 - Maahes - Mh
        Map<Integer, FluidStack> MaahesRecipes = new HashMap<>();
        MaahesRecipes.put(0, Materials.Adamantium.getMolten(1000));
        MaahesRecipes.put(1, Materials.Alduorite.getMolten(1000));
        MaahesRecipes.put(2, Materials.Aluminium.getMolten(1000));
        MaahesRecipes.put(3, Materials.Ardite.getMolten(1000));
        MaahesRecipes.put(4, Materials.Calcium.getMolten(1000));
        MaahesRecipes.put(5, Materials.CallistoIce.getMolten(1000));
        MaahesRecipes.put(6, Materials.Chrome.getMolten(1000));
        MaahesRecipes.put(7, Materials.Gold.getMolten(1000));
        MaahesRecipes.put(8, Materials.Iridium.getMolten(1000));
        MaahesRecipes.put(9, Materials.Iron.getMolten(1000));
        MaahesRecipes.put(10, Materials.Lead.getMolten(1000));
        MaahesRecipes.put(11, Materials.Lithium.getMolten(1000));
        MaahesRecipes.put(12, Materials.Magnesium.getMolten(1000));
        MaahesRecipes.put(13, Materials.Manganese.getMolten(1000));
        MaahesRecipes.put(14, Materials.Molybdenum.getMolten(1000));
        MaahesRecipes.put(15, Materials.Naquadah.getMolten(1000));
        MaahesRecipes.put(16, Materials.NaquadahEnriched.getMolten(1000));
        MaahesRecipes.put(17, Materials.Naquadria.getMolten(1000));
        MaahesRecipes.put(18, Materials.Neutronium.getMolten(1000));
        MaahesRecipes.put(19, Materials.Nickel.getMolten(1000));
        MaahesRecipes.put(20, Materials.Osmium.getMolten(1000));
        MaahesRecipes.put(21, Materials.Palladium.getMolten(1000));
        MaahesRecipes.put(22, Materials.Platinum.getMolten(1000));
        MaahesRecipes.put(23, Materials.Potassium.getMolten(1000));
        MaahesRecipes.put(24, Materials.Quantium.getMolten(1000));
        MaahesRecipes.put(25, WerkstoffLoader.Rhodium.getMolten(1000));
        MaahesRecipes.put(26, WerkstoffLoader.Ruthenium.getMolten(1000));
        MaahesRecipes.put(27, Materials.Silicon.getMolten(1000));
        MaahesRecipes.put(28, Materials.Silver.getMolten(1000));
        MaahesRecipes.put(29, Materials.Titanium.getMolten(1000));
        MaahesRecipes.put(30, Materials.Trinium.getMolten(1000));
        MaahesRecipes.put(31, Materials.Tungsten.getMolten(1000));
        MaahesRecipes.put(32, Materials.Vanadium.getMolten(1000));

        MaahesRecipes.put(33, Materials.Chlorine.getGas(1000));
        MaahesRecipes.put(34, Materials.Fluorine.getGas(1000));
        MaahesRecipes.put(35, Materials.Hydrogen.getGas(1000));
        MaahesRecipes.put(36, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MaahesRecipes.size(); i++) {
            FluidStack OutPutFluid = MaahesRecipes.get(i);
            addSingularityFluidRecipes("T9: Maahes", OutPutFluid);
        }

        // T9 - MehenBelt - MB
        Map<Integer, FluidStack> MehenBeltRecipes = new HashMap<>();
        MehenBeltRecipes.put(0, Materials.Adamantium.getMolten(1000));
        MehenBeltRecipes.put(1, Materials.Aluminium.getMolten(1000));
        MehenBeltRecipes.put(2, Materials.Arsenic.getMolten(1000));
        MehenBeltRecipes.put(3, Materials.Calcium.getMolten(1000));
        MehenBeltRecipes.put(4, Materials.Chrome.getMolten(1000));
        MehenBeltRecipes.put(5, Materials.Cobalt.getMolten(1000));
        MehenBeltRecipes.put(6, Materials.Draconium.getMolten(1000));
        MehenBeltRecipes.put(7, Materials.DraconiumAwakened.getMolten(1000));
        MehenBeltRecipes.put(8, Materials.Iridium.getMolten(1000));
        MehenBeltRecipes.put(9, Materials.Iron.getMolten(1000));
        MehenBeltRecipes.put(10, Materials.Magnesium.getMolten(1000));
        MehenBeltRecipes.put(11, Materials.Naquadah.getMolten(1000));
        MehenBeltRecipes.put(12, Materials.Neutronium.getMolten(1000));
        MehenBeltRecipes.put(13, Materials.Nickel.getMolten(1000));
        MehenBeltRecipes.put(14, Materials.Osmium.getMolten(1000));
        MehenBeltRecipes.put(15, Materials.Palladium.getMolten(1000));
        MehenBeltRecipes.put(16, Materials.Platinum.getMolten(1000));
        MehenBeltRecipes.put(17, Materials.Potassium.getMolten(1000));
        MehenBeltRecipes.put(18, WerkstoffLoader.Rhodium.getMolten(1000));
        MehenBeltRecipes.put(19, WerkstoffLoader.Ruthenium.getMolten(1000));
        MehenBeltRecipes.put(20, Materials.Silicon.getMolten(1000));
        MehenBeltRecipes.put(21, Materials.Tin.getMolten(1000));
        MehenBeltRecipes.put(22, Materials.Titanium.getMolten(1000));
        MehenBeltRecipes.put(23, Materials.Uranium.getMolten(1000));

        MehenBeltRecipes.put(24, Materials.Chlorine.getGas(1000));
        MehenBeltRecipes.put(25, Materials.Fluorine.getGas(1000));
        MehenBeltRecipes.put(26, Materials.Hydrogen.getGas(1000));
        MehenBeltRecipes.put(27, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MehenBeltRecipes.size(); i++) {
            FluidStack OutPutFluid = MehenBeltRecipes.get(i);
            addSingularityFluidRecipes("T9: Mehen Belt", OutPutFluid);
        }

        // T9 - Neper - Np
        Map<Integer, FluidStack> NeperRecipes = new HashMap<>();
        NeperRecipes.put(0, Materials.Aluminium.getMolten(1000));
        NeperRecipes.put(1, Materials.Antimony.getMolten(1000));
        NeperRecipes.put(2, Materials.Arsenic.getMolten(1000));
        NeperRecipes.put(3, Materials.Barium.getMolten(1000));
        NeperRecipes.put(4, Materials.Bismuth.getMolten(1000));
        NeperRecipes.put(5, Materials.Caesium.getMolten(1000));
        NeperRecipes.put(6, Materials.Calcium.getMolten(1000));
        NeperRecipes.put(7, Materials.DeepIron.getMolten(1000));
        NeperRecipes.put(8, Materials.Magnesium.getMolten(1000));
        NeperRecipes.put(9, Materials.MysteriousCrystal.getMolten(1000));
        NeperRecipes.put(10, Materials.Potassium.getMolten(1000));
        NeperRecipes.put(11, Materials.ShadowIron.getMolten(1000));
        NeperRecipes.put(12, Materials.Silicon.getMolten(1000));
        NeperRecipes.put(13, Materials.Tin.getMolten(1000));
        NeperRecipes.put(14, Materials.Tungsten.getMolten(1000));
        NeperRecipes.put(15, Materials.Vinteum.getMolten(1000));

        NeperRecipes.put(16, Materials.Mercury.getFluid(1000));

        NeperRecipes.put(17, Materials.Fluorine.getGas(1000));
        NeperRecipes.put(18, Materials.Hydrogen.getGas(1000));
        NeperRecipes.put(19, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < NeperRecipes.size(); i++) {
            FluidStack OutPutFluid = NeperRecipes.get(i);
            addSingularityFluidRecipes("T9: Neper", OutPutFluid);
        }

        // T9 - Seth - Se
        Map<Integer, FluidStack> SethRecipes = new HashMap<>();
        SethRecipes.put(0, Materials.Aluminium.getMolten(1000));
        SethRecipes.put(1, Materials.Caesium.getMolten(1000));
        SethRecipes.put(2, Materials.Chrome.getMolten(1000));
        SethRecipes.put(3, Materials.Draconium.getMolten(1000));
        SethRecipes.put(4, Materials.Electrotine.getMolten(1000));
        SethRecipes.put(5, Materials.Gadolinium.getMolten(1000));
        SethRecipes.put(6, Materials.Gold.getMolten(1000));
        SethRecipes.put(7, Materials.Holmium.getMolten(1000));
        SethRecipes.put(8, Materials.Iridium.getMolten(1000));
        SethRecipes.put(9, Materials.Iron.getMolten(1000));
        SethRecipes.put(10, Materials.Lanthanum.getMolten(1000));
        SethRecipes.put(11, Materials.Neodymium.getMolten(1000));
        SethRecipes.put(12, Materials.Nickel.getMolten(1000));
        SethRecipes.put(13, Materials.Osmium.getMolten(1000));
        SethRecipes.put(14, Materials.Palladium.getMolten(1000));
        SethRecipes.put(15, Materials.Platinum.getMolten(1000));
        SethRecipes.put(16, WerkstoffLoader.Rhodium.getMolten(1000));
        SethRecipes.put(17, WerkstoffLoader.Ruthenium.getMolten(1000));
        SethRecipes.put(18, Materials.Samarium.getMolten(1000));
        SethRecipes.put(19, Materials.Silicon.getMolten(1000));
        SethRecipes.put(20, Materials.Tartarite.getMolten(1000));
        SethRecipes.put(21, Materials.TengamPurified.getMolten(1000));
        SethRecipes.put(22, Materials.Tin.getMolten(1000));
        SethRecipes.put(23, Materials.Titanium.getMolten(1000));
        SethRecipes.put(24, Materials.Vanadium.getMolten(1000));
        SethRecipes.put(25, Materials.Vinteum.getMolten(1000));

        SethRecipes.put(26, Materials.Fluorine.getGas(1000));
        SethRecipes.put(27, Materials.Hydrogen.getGas(1000));
        SethRecipes.put(28, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < SethRecipes.size(); i++) {
            FluidStack OutPutFluid = SethRecipes.get(i);
            addSingularityFluidRecipes("T9: Seth", OutPutFluid);
        }

        // T10 - DeepDark - DD
        Map<Integer, FluidStack> DeepDarkRecipes = new HashMap<>();
        // IndustrialCraft2
        DeepDarkRecipes.put(0, FluidRegistry.getFluidStack("air", 1000));
        DeepDarkRecipes.put(1, FluidRegistry.getFluidStack("hydrogenchloride", 1000));
        DeepDarkRecipes.put(2, FluidRegistry.getFluidStack("hydrofluoricacid", 1000));
        DeepDarkRecipes.put(3, FluidRegistry.getFluidStack("ic2biogas", 1000));
        DeepDarkRecipes.put(4, FluidRegistry.getFluidStack("ic2biomass", 1000));
        DeepDarkRecipes.put(5, FluidRegistry.getFluidStack("ic2constructionfoam", 1000));
        DeepDarkRecipes.put(6, FluidRegistry.getFluidStack("ic2coolant", 1000));
        DeepDarkRecipes.put(7, FluidRegistry.getFluidStack("ic2distilledwater", 1000));
        DeepDarkRecipes.put(8, FluidRegistry.getFluidStack("ic2hotcoolant", 1000));
        DeepDarkRecipes.put(9, FluidRegistry.getFluidStack("ic2pahoehoelava", 1000));
        DeepDarkRecipes.put(10, FluidRegistry.getFluidStack("ic2steam", 1000));
        DeepDarkRecipes.put(11, FluidRegistry.getFluidStack("ic2superheatedsteam", 1000));
        DeepDarkRecipes.put(12, FluidRegistry.getFluidStack("ic2uumatter", 1000));
        DeepDarkRecipes.put(13, FluidRegistry.getFluidStack("lithiumhydroxide", 1000));
        DeepDarkRecipes.put(14, FluidRegistry.getFluidStack("sulfuricapatite", 1000));
        DeepDarkRecipes.put(15, FluidRegistry.getFluidStack("sulfuriclithium", 1000));
        DeepDarkRecipes.put(16, FluidRegistry.getFluidStack("sulfurousacid", 1000));

        // galaxyspace
        DeepDarkRecipes.put(17, GSMaterials.liquidHelium.getFluidOrGas(1000));
        DeepDarkRecipes.put(18, GSMaterials.tantalumHafniumCarbide.getMolten(1000));

        // GoodGenerator
        DeepDarkRecipes.put(19, GGMaterial.acidNaquadahEmulsion.getFluidOrGas(1000));
        DeepDarkRecipes.put(20, GGMaterial.antimonyPentachloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(21, GGMaterial.antimonyPentachlorideSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(22, GGMaterial.antimonyPentafluorideSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(23, GGMaterial.antimonyPentafluoride.getFluidOrGas(1000));
        DeepDarkRecipes.put(24, GGMaterial.antimonyTrichloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(25, GGMaterial.cyclopentadiene.getFluidOrGas(1000));
        DeepDarkRecipes.put(26, GGMaterial.diethylamine.getFluidOrGas(1000));
        DeepDarkRecipes.put(27, GGMaterial.ether.getFluidOrGas(1000));
        DeepDarkRecipes.put(28, GGMaterial.enrichedNaquadahGoo.getFluidOrGas(1000));
        DeepDarkRecipes.put(29, GGMaterial.enrichedNaquadahRichSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(30, GGMaterial.ferroceneSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(31, GGMaterial.ferroceneWaste.getFluidOrGas(1000));
        DeepDarkRecipes.put(32, GGMaterial.ferrousChloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(33, GGMaterial.fluorineRichWasteLiquid.getFluidOrGas(1000));
        DeepDarkRecipes.put(34, GGMaterial.fluoroantimonicAcid.getFluidOrGas(1000));
        DeepDarkRecipes.put(35, GGMaterial.heavyNaquadahFuel.getFluidOrGas(1000));
        DeepDarkRecipes.put(36, GGMaterial.impureFerroceneMixture.getFluidOrGas(1000));
        DeepDarkRecipes.put(37, GGMaterial.ironedFuel.getFluidOrGas(1000));
        DeepDarkRecipes.put(38, GGMaterial.ironedKerosene.getFluidOrGas(1000));
        DeepDarkRecipes.put(39, GGMaterial.lightNaquadahFuel.getFluidOrGas(1000));
        DeepDarkRecipes.put(40, GGMaterial.lowQualityNaquadahEmulsion.getFluidOrGas(1000));
        DeepDarkRecipes.put(41, GGMaterial.lowQualityNaquadahSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(42, GGMaterial.naquadahAdamantiumSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(43, GGMaterial.naquadahAsphalt.getFluidOrGas(1000));
        DeepDarkRecipes.put(44, GGMaterial.naquadahBasedFuelMkI.getFluidOrGas(1000));
        DeepDarkRecipes.put(45, GGMaterial.naquadahBasedFuelMkIDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(46, GGMaterial.naquadahBasedFuelMkII.getFluidOrGas(1000));
        DeepDarkRecipes.put(47, GGMaterial.naquadahBasedFuelMkIIDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(48, GGMaterial.naquadahBasedFuelMkIII.getFluidOrGas(1000));
        DeepDarkRecipes.put(49, GGMaterial.naquadahBasedFuelMkIIIDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(50, GGMaterial.naquadahBasedFuelMkIV.getFluidOrGas(1000));
        DeepDarkRecipes.put(51, GGMaterial.naquadahBasedFuelMkIVDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(52, GGMaterial.naquadahBasedFuelMkV.getFluidOrGas(1000));
        DeepDarkRecipes.put(53, GGMaterial.naquadahBasedFuelMkVDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(54, GGMaterial.naquadahBasedFuelMkVI.getFluidOrGas(1000));
        DeepDarkRecipes.put(55, GGMaterial.naquadahBasedFuelMkVIDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(56, GGMaterial.naquadahEmulsion.getFluidOrGas(1000));
        DeepDarkRecipes.put(57, GGMaterial.naquadahGas.getFluidOrGas(1000));
        DeepDarkRecipes.put(58, GGMaterial.naquadahGoo.getFluidOrGas(1000));
        DeepDarkRecipes.put(59, GGMaterial.naquadahRichSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(60, GGMaterial.naquadahSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(61, GGMaterial.naquadriaRichSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(62, GGMaterial.oxalate.getFluidOrGas(1000));
        DeepDarkRecipes.put(63, GGMaterial.P507.getFluidOrGas(1000));
        DeepDarkRecipes.put(64, GGMaterial.plutoniumBasedLiquidFuel.getFluidOrGas(1000));
        DeepDarkRecipes.put(65, GGMaterial.plutoniumBasedLiquidFuelDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(66, GGMaterial.plutoniumBasedLiquidFuelExcited.getFluidOrGas(1000));
        DeepDarkRecipes.put(67, GGMaterial.thorium232Tetrafluoride.getFluidOrGas(1000));
        DeepDarkRecipes.put(68, GGMaterial.thoriumBasedLiquidFuel.getFluidOrGas(1000));
        DeepDarkRecipes.put(69, GGMaterial.thoriumBasedLiquidFuelDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(70, GGMaterial.thoriumBasedLiquidFuelExcited.getFluidOrGas(1000));
        DeepDarkRecipes.put(71, GGMaterial.thoriumNitrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(72, GGMaterial.thoriumTetrachloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(73, GGMaterial.thoriumTetrafluoride.getFluidOrGas(1000));
        DeepDarkRecipes.put(74, GGMaterial.towEthyl1Hexanol.getFluidOrGas(1000));
        DeepDarkRecipes.put(75, GGMaterial.uraniumBasedLiquidFuel.getFluidOrGas(1000));
        DeepDarkRecipes.put(76, GGMaterial.uraniumBasedLiquidFuelDepleted.getFluidOrGas(1000));
        DeepDarkRecipes.put(77, GGMaterial.uraniumBasedLiquidFuelExcited.getFluidOrGas(1000));
        DeepDarkRecipes.put(78, GGMaterial.wasteLiquid.getFluidOrGas(1000));

        DeepDarkRecipes.put(79, GGMaterial.adamantiumAlloy.getMolten(1000));
        DeepDarkRecipes.put(80, GGMaterial.artheriumSn.getMolten(1000));
        DeepDarkRecipes.put(81, GGMaterial.atomicSeparationCatalyst.getMolten(1000));
        DeepDarkRecipes.put(82, GGMaterial.dalisenite.getMolten(1000));
        DeepDarkRecipes.put(83, GGMaterial.enrichedNaquadahAlloy.getMolten(1000));
        DeepDarkRecipes.put(84, GGMaterial.extremelyUnstableNaquadah.getMolten(1000));
        DeepDarkRecipes.put(85, GGMaterial.hikarium.getMolten(1000));
        DeepDarkRecipes.put(86, GGMaterial.incoloy903.getMolten(1000));
        DeepDarkRecipes.put(87, GGMaterial.lithiumChloride.getMolten(1000));
        DeepDarkRecipes.put(88, GGMaterial.lumiium.getMolten(1000));
        DeepDarkRecipes.put(89, GGMaterial.marCeM200.getMolten(1000));
        DeepDarkRecipes.put(90, GGMaterial.marM200.getMolten(1000));
        DeepDarkRecipes.put(91, GGMaterial.metastableOganesson.getMolten(1000));
        DeepDarkRecipes.put(92, GGMaterial.orundum.getMolten(1000));
        DeepDarkRecipes.put(93, GGMaterial.preciousMetalAlloy.getMolten(1000));
        DeepDarkRecipes.put(94, GGMaterial.shirabon.getMolten(1000));
        DeepDarkRecipes.put(95, GGMaterial.signalium.getMolten(1000));
        DeepDarkRecipes.put(96, GGMaterial.tairitsu.getMolten(1000));
        DeepDarkRecipes.put(97, GGMaterial.titaniumBetaC.getMolten(1000));
        DeepDarkRecipes.put(98, GGMaterial.zircaloy2.getMolten(1000));
        DeepDarkRecipes.put(99, GGMaterial.zircaloy4.getMolten(1000));
        DeepDarkRecipes.put(100, GGMaterial.zincThoriumAlloy.getMolten(1000));

        // gtnhlanth
        DeepDarkRecipes.put(101, BotWerkstoffMaterialPool.Nitromethane.getFluidOrGas(1000));
        DeepDarkRecipes.put(102, BotWerkstoffMaterialPool.Phosgene.getFluidOrGas(1000));
        DeepDarkRecipes.put(103, BotWerkstoffMaterialPool.SodiumTungstate.getFluidOrGas(1000));

        // gtnhlanth
        DeepDarkRecipes.put(104, WerkstoffMaterialPool.AcidicButanediol.getFluidOrGas(1000));
        DeepDarkRecipes.put(105, WerkstoffMaterialPool.AmmoniumNitrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(106, WerkstoffMaterialPool.BoronTrichloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(107, WerkstoffMaterialPool.Butanediol.getFluidOrGas(1000));
        DeepDarkRecipes.put(108, WerkstoffMaterialPool.CalciumFluoride.getFluidOrGas(1000));
        DeepDarkRecipes.put(109, WerkstoffMaterialPool.CeriumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(110, WerkstoffMaterialPool.CeriumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(111, WerkstoffMaterialPool.ChlorinatedRareEarthConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(112, WerkstoffMaterialPool.ChlorinatedRareEarthDilutedSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(113, WerkstoffMaterialPool.ChlorinatedRareEarthEnrichedSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(114, WerkstoffMaterialPool.ConditionedBastnasiteMud.getFluidOrGas(1000));
        DeepDarkRecipes.put(115, WerkstoffMaterialPool.Diaminotoluene.getFluidOrGas(1000));
        DeepDarkRecipes.put(116, WerkstoffMaterialPool.DilutedAcetone.getFluidOrGas(1000));
        DeepDarkRecipes.put(117, WerkstoffMaterialPool.DiltedRareEarthBastnasiteMud.getFluidOrGas(1000));
        DeepDarkRecipes.put(118, WerkstoffMaterialPool.DilutedMonaziteSulfate.getFluidOrGas(1000));
        DeepDarkRecipes.put(119, WerkstoffMaterialPool.DilutedRareEarthMonaziteMud.getFluidOrGas(1000));
        DeepDarkRecipes.put(120, WerkstoffMaterialPool.DilutedSamariumRareEarthSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(121, WerkstoffMaterialPool.Dinitrotoluene.getFluidOrGas(1000));
        DeepDarkRecipes.put(122, WerkstoffMaterialPool.DysprosiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(123, WerkstoffMaterialPool.DysprosiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(124, WerkstoffMaterialPool.ErbiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(125, WerkstoffMaterialPool.ErbiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(126, WerkstoffMaterialPool.EuropiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(127, WerkstoffMaterialPool.EuropiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(128, WerkstoffMaterialPool.FilledCeriumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(129, WerkstoffMaterialPool.FilledDysprosiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(130, WerkstoffMaterialPool.FilledErbiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(131, WerkstoffMaterialPool.FilledEuropiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(132, WerkstoffMaterialPool.FilledGadoliniumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(133, WerkstoffMaterialPool.FilledHolmiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(134, WerkstoffMaterialPool.FilledLanthanumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(135, WerkstoffMaterialPool.FilledLutetiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(136, WerkstoffMaterialPool.FilledNeodymiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(137, WerkstoffMaterialPool.FilledPraseodymiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(138, WerkstoffMaterialPool.FilledPromethiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(139, WerkstoffMaterialPool.FilledSamariumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(140, WerkstoffMaterialPool.FilledTerbiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(141, WerkstoffMaterialPool.FilledThuliumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(142, WerkstoffMaterialPool.FilledYtterbiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(143, WerkstoffMaterialPool.FilteredBastnasiteMud.getFluidOrGas(1000));
        DeepDarkRecipes.put(144, WerkstoffMaterialPool.Fluoroform.getFluidOrGas(1000));
        DeepDarkRecipes.put(145, WerkstoffMaterialPool.FluoroformOxygenMix.getFluidOrGas(1000));
        DeepDarkRecipes.put(146, WerkstoffMaterialPool.GadoliniumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(147, WerkstoffMaterialPool.GadoliniumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(148, WerkstoffMaterialPool.HafniumTetrachlorideSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(149, WerkstoffMaterialPool.HolmiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(150, WerkstoffMaterialPool.HolmiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(151, WerkstoffMaterialPool.HotSuperCoolant.getFluidOrGas(1000));
        DeepDarkRecipes.put(152, WerkstoffMaterialPool.Iodine.getFluidOrGas(1000));
        DeepDarkRecipes.put(153, WerkstoffMaterialPool.LanthanumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(154, WerkstoffMaterialPool.LanthanumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(155, WerkstoffMaterialPool.LutetiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(156, WerkstoffMaterialPool.LutetiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(157, WerkstoffMaterialPool.MuddyRareEarthBastnasiteSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(158, WerkstoffMaterialPool.MuddyRareEarthMonaziteSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(159, WerkstoffMaterialPool.MuddySamariumRareEarthSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(160, WerkstoffMaterialPool.NeodymiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(161, WerkstoffMaterialPool.NeodymiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(162, WerkstoffMaterialPool.NitratedBastnasiteRarerEarthOxides.getFluidOrGas(1000));
        DeepDarkRecipes.put(163, WerkstoffMaterialPool.NitratedRareEarthMonaziteConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(164, WerkstoffMaterialPool.NitricLeachedMonaziteMixture.getFluidOrGas(1000));
        DeepDarkRecipes.put(165, WerkstoffMaterialPool.NitricMonaziteLeachedConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(166, WerkstoffMaterialPool.NitrogenPlasmaSilaneMix.getFluidOrGas(1000));
        DeepDarkRecipes.put(167, WerkstoffMaterialPool.Polytetrahydrofuran.getFluidOrGas(1000));
        DeepDarkRecipes.put(168, WerkstoffMaterialPool.PotassiumPermanganateSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(169, WerkstoffMaterialPool.PraseodymiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(170, WerkstoffMaterialPool.PraseodymiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(171, WerkstoffMaterialPool.PromethiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(172, WerkstoffMaterialPool.PromethiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(173, WerkstoffMaterialPool.SamariumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(174, WerkstoffMaterialPool.SamariumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(175, WerkstoffMaterialPool.SamariumRareEarthMud.getFluidOrGas(1000));
        DeepDarkRecipes.put(176, WerkstoffMaterialPool.SeaweedByproducts.getFluidOrGas(1000));
        DeepDarkRecipes.put(177, WerkstoffMaterialPool.SeaweedConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(178, WerkstoffMaterialPool.SodiumFluorosilicate.getFluidOrGas(1000));
        DeepDarkRecipes.put(179, WerkstoffMaterialPool.SteamCrackedBasnasiteSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(180, WerkstoffMaterialPool.TerbiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(181, WerkstoffMaterialPool.TerbiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(182, WerkstoffMaterialPool.Tetrahydrofuran.getFluidOrGas(1000));
        DeepDarkRecipes.put(183, WerkstoffMaterialPool.ThuliumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(184, WerkstoffMaterialPool.ThuliumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(185, WerkstoffMaterialPool.TolueneDiisocyanate.getFluidOrGas(1000));
        DeepDarkRecipes.put(186, WerkstoffMaterialPool.TolueneTetramethylDiisocyanate.getFluidOrGas(1000));
        DeepDarkRecipes.put(187, WerkstoffMaterialPool.TungstophosphoricAcid.getFluidOrGas(1000));
        DeepDarkRecipes.put(188, WerkstoffMaterialPool.YtterbiumChlorideConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(189, WerkstoffMaterialPool.YtterbiumExtractingNanoResin.getFluidOrGas(1000));
        DeepDarkRecipes.put(190, WerkstoffMaterialPool.ZirconiumTetrachlorideSolution.getFluidOrGas(1000));

        DeepDarkRecipes.put(191, WerkstoffMaterialPool.CeriumDopedLutetiumAluminiumOxygenBlend.getMolten(1000));
        DeepDarkRecipes.put(192, WerkstoffMaterialPool.PotassiumChlorate.getMolten(1000));
        DeepDarkRecipes.put(193, WerkstoffMaterialPool.PTMEGElastomer.getMolten(1000));
        DeepDarkRecipes.put(194, WerkstoffMaterialPool.SamariumChloride.getMolten(1000));

        // BartWorks
        DeepDarkRecipes.put(195, WerkstoffLoader.AcidicIridiumSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(196, WerkstoffLoader.AcidicOsmiumSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(197, WerkstoffLoader.AmmoniumChloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(198, WerkstoffLoader.AquaRegia.getFluidOrGas(1000));
        DeepDarkRecipes.put(199, WerkstoffLoader.CalciumChloride.getFluidOrGas(1000));
        DeepDarkRecipes.put(200, WerkstoffLoader.FormicAcid.getFluidOrGas(1000));
        DeepDarkRecipes.put(201, WerkstoffLoader.HexafluorosilicicAcid.getFluidOrGas(1000));
        DeepDarkRecipes.put(202, WerkstoffLoader.HotRutheniumTetroxideSollution.getFluidOrGas(1000));
        DeepDarkRecipes.put(203, WerkstoffLoader.Krypton.getFluidOrGas(1000));
        DeepDarkRecipes.put(204, WerkstoffLoader.Neon.getFluidOrGas(1000));
        DeepDarkRecipes.put(205, WerkstoffLoader.Oganesson.getFluidOrGas(1000));
        DeepDarkRecipes.put(206, WerkstoffLoader.OsmiumSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(207, WerkstoffLoader.PDAmmonia.getFluidOrGas(1000));
        DeepDarkRecipes.put(208, WerkstoffLoader.PTConcentrate.getFluidOrGas(1000));
        DeepDarkRecipes.put(209, WerkstoffLoader.RHFilterCakeSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(210, WerkstoffLoader.RHSaltSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(211, WerkstoffLoader.RHSulfate.getFluidOrGas(1000));
        DeepDarkRecipes.put(212, WerkstoffLoader.RHSulfateSolution.getFluidOrGas(1000));
        DeepDarkRecipes.put(213, WerkstoffLoader.RutheniumTetroxide.getFluidOrGas(1000));
        DeepDarkRecipes.put(214, WerkstoffLoader.RutheniumTetroxideSollution.getFluidOrGas(1000));
        DeepDarkRecipes.put(215, WerkstoffLoader.Sodiumformate.getFluidOrGas(1000));
        DeepDarkRecipes.put(216, WerkstoffLoader.Xenon.getFluidOrGas(1000));
        DeepDarkRecipes.put(217, WerkstoffLoader.AdemicSteel.getMolten(1000));
        DeepDarkRecipes.put(218, WerkstoffLoader.BArTiMaEuSNeK.getMolten(1000));
        DeepDarkRecipes.put(219, WerkstoffLoader.Calcium.getMolten(1000));
        DeepDarkRecipes.put(220, WerkstoffLoader.Californium.getMolten(1000));
        DeepDarkRecipes.put(221, WerkstoffLoader.HDCS.getMolten(1000));
        DeepDarkRecipes.put(222, WerkstoffLoader.LuVTierMaterial.getMolten(1000));
        DeepDarkRecipes.put(223, WerkstoffLoader.PotassiumDisulfate.getMolten(1000));
        DeepDarkRecipes.put(224, WerkstoffLoader.Rhodium.getMolten(1000));
        DeepDarkRecipes.put(225, WerkstoffLoader.Ruridit.getMolten(1000));
        DeepDarkRecipes.put(226, WerkstoffLoader.Ruthenium.getMolten(1000));

        // BartWorks
        DeepDarkRecipes.put(227, BWGTMaterialReference.Magnesia.getMolten(1000));

        // GregTech
        DeepDarkRecipes.put(228, MaterialsBotania.ElvenElementium.getMolten(1000));
        DeepDarkRecipes.put(229, MaterialsBotania.GaiaSpirit.getMolten(1000));
        DeepDarkRecipes.put(230, MaterialsBotania.Manasteel.getMolten(1000));
        DeepDarkRecipes.put(231, MaterialsBotania.Terrasteel.getMolten(1000));

        DeepDarkRecipes.put(232, MaterialsOreAlum.BauxiteSlurry.getFluid(1000));
        DeepDarkRecipes.put(233, MaterialsOreAlum.GreenSapphireJuice.getFluid(1000));
        DeepDarkRecipes.put(234, MaterialsOreAlum.HeatedBauxiteSlurry.getFluid(1000));
        DeepDarkRecipes.put(235, MaterialsOreAlum.RubyJuice.getFluid(1000));
        DeepDarkRecipes.put(236, MaterialsOreAlum.SapphireJuice.getFluid(1000));
        DeepDarkRecipes.put(237, MaterialsOreAlum.SluiceJuice.getFluid(1000));

        DeepDarkRecipes.put(238, MaterialsKevlar.Kevlar.getMolten(1000));
        DeepDarkRecipes.put(239, MaterialsKevlar.NickelAluminide.getMolten(1000));

        DeepDarkRecipes.put(240, MaterialsKevlar.Butyraldehyde.getFluid(1000));
        DeepDarkRecipes.put(241, MaterialsKevlar.DiaminodiphenylmethanMixture.getFluid(1000));
        DeepDarkRecipes.put(242, MaterialsKevlar.DimethylTerephthalate.getFluid(1000));
        DeepDarkRecipes.put(243, MaterialsKevlar.DiphenylmethaneDiisocyanateMixture.getFluid(1000));
        DeepDarkRecipes.put(244, MaterialsKevlar.Ethyleneglycol.getFluid(1000));
        DeepDarkRecipes.put(245, MaterialsKevlar.GammaButyrolactone.getFluid(1000));
        DeepDarkRecipes.put(246, MaterialsKevlar.IIIDimethylbenzene.getFluid(1000));
        DeepDarkRecipes.put(247, MaterialsKevlar.Isobutyraldehyde.getFluid(1000));
        DeepDarkRecipes.put(248, MaterialsKevlar.IVDimethylbenzene.getFluid(1000));
        DeepDarkRecipes.put(249, MaterialsKevlar.IVNitroaniline.getFluid(1000));
        DeepDarkRecipes.put(250, MaterialsKevlar.IVNitroaniline.getFluid(1000));
        // DeepDarkRecipes.put(250, MaterialsKevlar.KevlarCatalyst.getFluid(1000));
        DeepDarkRecipes.put(251, MaterialsKevlar.NaphthenicAcid.getFluid(1000));
        DeepDarkRecipes.put(252, MaterialsKevlar.NickelTetracarbonyl.getFluid(1000));
        DeepDarkRecipes.put(253, MaterialsKevlar.NMethylIIPyrrolidone.getFluid(1000));
        DeepDarkRecipes.put(254, MaterialsKevlar.PhosphorusTrichloride.getFluid(1000));
        DeepDarkRecipes.put(255, MaterialsKevlar.PolyurethaneResin.getFluid(1000));
        DeepDarkRecipes.put(256, MaterialsKevlar.SiliconOil.getFluid(1000));
        DeepDarkRecipes.put(257, MaterialsKevlar.SulfurDichloride.getFluid(1000));
        DeepDarkRecipes.put(258, MaterialsKevlar.TerephthalicAcid.getFluid(1000));
        DeepDarkRecipes.put(259, MaterialsKevlar.ThionylChloride.getFluid(1000));
        DeepDarkRecipes.put(260, MaterialsKevlar.TrimethylBorate.getFluid(1000));

        DeepDarkRecipes.put(261, MaterialsKevlar.Acetaldehyde.getGas(1000));
        DeepDarkRecipes.put(262, MaterialsKevlar.Acetylene.getGas(1000));
        DeepDarkRecipes.put(263, MaterialsKevlar.EthyleneOxide.getGas(1000));
        DeepDarkRecipes.put(264, MaterialsKevlar.Methylamine.getGas(1000));
        DeepDarkRecipes.put(265, MaterialsKevlar.Trimethylamine.getGas(1000));

        DeepDarkRecipes.put(266, MaterialsUEVplus.BlackDwarfMatter.getMolten(1000));
        DeepDarkRecipes.put(267, MaterialsUEVplus.Creon.getMolten(1000));
        DeepDarkRecipes.put(268, MaterialsUEVplus.Eternity.getMolten(1000));
        DeepDarkRecipes.put(269, MaterialsUEVplus.MagMatter.getMolten(1000));
        DeepDarkRecipes.put(270, MaterialsUEVplus.MagnetohydrodynamicallyConstrainedStarMatter.getMolten(1000));
        DeepDarkRecipes.put(271, MaterialsUEVplus.Mellion.getMolten(1000));
        DeepDarkRecipes.put(272, MaterialsUEVplus.SixPhasedCopper.getMolten(1000));
        DeepDarkRecipes.put(273, MaterialsUEVplus.SpaceTime.getMolten(1000));
        DeepDarkRecipes.put(274, MaterialsUEVplus.TranscendentMetal.getMolten(1000));
        DeepDarkRecipes.put(275, MaterialsUEVplus.Universium.getMolten(1000));
        DeepDarkRecipes.put(276, MaterialsUEVplus.WhiteDwarfMatter.getMolten(1000));

        DeepDarkRecipes.put(277, MaterialsUEVplus.Antimatter.getFluid(1000));
        DeepDarkRecipes.put(278, MaterialsUEVplus.DimensionallyShiftedSuperfluid.getFluid(1000));
        DeepDarkRecipes.put(279, MaterialsUEVplus.DimensionallyTranscendentCrudeCatalyst.getFluid(1000));
        DeepDarkRecipes.put(280, MaterialsUEVplus.DimensionallyTranscendentExoticCatalyst.getFluid(1000));
        DeepDarkRecipes.put(281, MaterialsUEVplus.DimensionallyTranscendentProsaicCatalyst.getFluid(1000));
        DeepDarkRecipes.put(282, MaterialsUEVplus.DimensionallyTranscendentResidue.getFluid(1000));
        DeepDarkRecipes.put(283, MaterialsUEVplus.DimensionallyTranscendentResplendentCatalyst.getFluid(1000));
        DeepDarkRecipes.put(284, MaterialsUEVplus.DimensionallyTranscendentStellarCatalyst.getFluid(1000));
        DeepDarkRecipes.put(285, MaterialsUEVplus.ExcitedDTCC.getFluid(1000));
        DeepDarkRecipes.put(286, MaterialsUEVplus.ExcitedDTEC.getFluid(1000));
        DeepDarkRecipes.put(287, MaterialsUEVplus.ExcitedDTPC.getFluid(1000));
        DeepDarkRecipes.put(288, MaterialsUEVplus.ExcitedDTRC.getFluid(1000));
        DeepDarkRecipes.put(289, MaterialsUEVplus.ExcitedDTSC.getFluid(1000));
        DeepDarkRecipes.put(290, MaterialsUEVplus.MoltenExoHalkoniteBase.getFluid(1000));
        DeepDarkRecipes.put(291, MaterialsUEVplus.MoltenProtoHalkoniteBase.getFluid(1000));
        DeepDarkRecipes.put(292, MaterialsUEVplus.PhononCrystalSolution.getFluid(1000));
        DeepDarkRecipes.put(293, MaterialsUEVplus.PhononMedium.getFluid(1000));
        DeepDarkRecipes.put(294, MaterialsUEVplus.PrimordialMatter.getFluid(1000));
        DeepDarkRecipes.put(295, MaterialsUEVplus.Protomatter.getFluid(1000));
        DeepDarkRecipes.put(296, MaterialsUEVplus.QuarkGluonPlasma.getFluid(1000));
        DeepDarkRecipes.put(297, MaterialsUEVplus.RawStarMatter.getFluid(1000));
        DeepDarkRecipes.put(298, MaterialsUEVplus.StargateCrystalSlurry.getFluid(1000));

        DeepDarkRecipes.put(299, MaterialsUEVplus.Creon.getPlasma(1000));
        DeepDarkRecipes.put(300, MaterialsUEVplus.SixPhasedCopper.getPlasma(1000));

        DeepDarkRecipes.put(301, FluidRegistry.getFluidStack("bacterialsludge", 1000));
        DeepDarkRecipes.put(302, FluidRegistry.getFluidStack("crackedradox", 1000));
        DeepDarkRecipes.put(303, FluidRegistry.getFluidStack("combustionpromotor", 1000));
        DeepDarkRecipes.put(304, FluidRegistry.getFluidStack("ender", 1000));
        DeepDarkRecipes.put(305, FluidRegistry.getFluidStack("enrichedbacterialsludge", 1000));
        DeepDarkRecipes.put(306, FluidRegistry.getFluidStack("enzymessollution", 1000));
        DeepDarkRecipes.put(307, FluidRegistry.getFluidStack("escherichiakolifluid", 1000));
        DeepDarkRecipes.put(308, FluidRegistry.getFluidStack("fermentedbacterialsludge", 1000));
        DeepDarkRecipes.put(309, FluidRegistry.getFluidStack("fieryblood", 1000));
        DeepDarkRecipes.put(310, FluidRegistry.getFluidStack("fluorecentddna", 1000));
        DeepDarkRecipes.put(311, FluidRegistry.getFluidStack("heavyradox", 1000));
        DeepDarkRecipes.put(312, FluidRegistry.getFluidStack("indiumconcentrate", 1000));
        DeepDarkRecipes.put(313, FluidRegistry.getFluidStack("leadzincsolution", 1000));
        DeepDarkRecipes.put(314, FluidRegistry.getFluidStack("lightlyhydrocracked.butadiene", 1000));
        DeepDarkRecipes.put(315, FluidRegistry.getFluidStack("lightlyhydrocracked.butane", 1000));
        DeepDarkRecipes.put(316, FluidRegistry.getFluidStack("lightlyhydrocracked.butene", 1000));
        DeepDarkRecipes.put(317, FluidRegistry.getFluidStack("lightlyhydrocracked.ethane", 1000));
        DeepDarkRecipes.put(318, FluidRegistry.getFluidStack("lightlyhydrocracked.ethylene", 1000));
        DeepDarkRecipes.put(319, FluidRegistry.getFluidStack("lightlyhydrocracked.gas", 1000));
        DeepDarkRecipes.put(320, FluidRegistry.getFluidStack("lightlyhydrocracked.heavyfuel", 1000));
        DeepDarkRecipes.put(321, FluidRegistry.getFluidStack("lightlyhydrocracked.lightfuel", 1000));
        DeepDarkRecipes.put(322, FluidRegistry.getFluidStack("lightlyhydrocracked.naphtha", 1000));
        DeepDarkRecipes.put(323, FluidRegistry.getFluidStack("lightlyhydrocracked.propane", 1000));
        DeepDarkRecipes.put(324, FluidRegistry.getFluidStack("lightlyhydrocracked.propene", 1000));
        DeepDarkRecipes.put(325, FluidRegistry.getFluidStack("lightlysteamcracked.butadiene", 1000));
        DeepDarkRecipes.put(326, FluidRegistry.getFluidStack("lightlysteamcracked.butane", 1000));
        DeepDarkRecipes.put(327, FluidRegistry.getFluidStack("lightlysteamcracked.butene", 1000));
        DeepDarkRecipes.put(328, FluidRegistry.getFluidStack("lightlysteamcracked.ethane", 1000));
        DeepDarkRecipes.put(329, FluidRegistry.getFluidStack("lightlysteamcracked.ethylene", 1000));
        DeepDarkRecipes.put(330, FluidRegistry.getFluidStack("lightlysteamcracked.gas", 1000));
        DeepDarkRecipes.put(331, FluidRegistry.getFluidStack("lightlysteamcracked.heavyfuel", 1000));
        DeepDarkRecipes.put(332, FluidRegistry.getFluidStack("lightlysteamcracked.lightfuel", 1000));
        DeepDarkRecipes.put(333, FluidRegistry.getFluidStack("lightlysteamcracked.naphtha", 1000));
        DeepDarkRecipes.put(334, FluidRegistry.getFluidStack("lightlysteamcracked.propane", 1000));
        DeepDarkRecipes.put(335, FluidRegistry.getFluidStack("lightlysteamcracked.propene", 1000));
        DeepDarkRecipes.put(336, FluidRegistry.getFluidStack("lightradox", 1000));
        DeepDarkRecipes.put(337, FluidRegistry.getFluidStack("liquid_drillingfluid", 1000));
        DeepDarkRecipes.put(338, FluidRegistry.getFluidStack("moderatelyhydrocracked.butadiene", 1000));
        DeepDarkRecipes.put(339, FluidRegistry.getFluidStack("moderatelyhydrocracked.butane", 1000));
        DeepDarkRecipes.put(340, FluidRegistry.getFluidStack("moderatelyhydrocracked.butene", 1000));
        DeepDarkRecipes.put(341, FluidRegistry.getFluidStack("moderatelyhydrocracked.ethane", 1000));
        DeepDarkRecipes.put(342, FluidRegistry.getFluidStack("moderatelyhydrocracked.ethylene", 1000));
        DeepDarkRecipes.put(343, FluidRegistry.getFluidStack("moderatelyhydrocracked.gas", 1000));
        DeepDarkRecipes.put(344, FluidRegistry.getFluidStack("moderatelyhydrocracked.heavyfuel", 1000));
        DeepDarkRecipes.put(345, FluidRegistry.getFluidStack("moderatelyhydrocracked.lightfuel", 1000));
        DeepDarkRecipes.put(346, FluidRegistry.getFluidStack("moderatelyhydrocracked.naphtha", 1000));
        DeepDarkRecipes.put(347, FluidRegistry.getFluidStack("moderatelyhydrocracked.propane", 1000));
        DeepDarkRecipes.put(348, FluidRegistry.getFluidStack("moderatelyhydrocracked.propene", 1000));
        DeepDarkRecipes.put(349, FluidRegistry.getFluidStack("moderatelysteamcracked.butadiene", 1000));
        DeepDarkRecipes.put(350, FluidRegistry.getFluidStack("moderatelysteamcracked.butane", 1000));
        DeepDarkRecipes.put(351, FluidRegistry.getFluidStack("moderatelysteamcracked.butene", 1000));
        DeepDarkRecipes.put(352, FluidRegistry.getFluidStack("moderatelysteamcracked.ethane", 1000));
        DeepDarkRecipes.put(353, FluidRegistry.getFluidStack("moderatelysteamcracked.ethylene", 1000));
        DeepDarkRecipes.put(354, FluidRegistry.getFluidStack("moderatelysteamcracked.gas", 1000));
        DeepDarkRecipes.put(355, FluidRegistry.getFluidStack("moderatelysteamcracked.heavyfuel", 1000));
        DeepDarkRecipes.put(356, FluidRegistry.getFluidStack("moderatelysteamcracked.lightfuel", 1000));
        DeepDarkRecipes.put(357, FluidRegistry.getFluidStack("moderatelysteamcracked.naphtha", 1000));
        DeepDarkRecipes.put(358, FluidRegistry.getFluidStack("moderatelysteamcracked.propane", 1000));
        DeepDarkRecipes.put(359, FluidRegistry.getFluidStack("moderatelysteamcracked.propene", 1000));
        DeepDarkRecipes.put(360, FluidRegistry.getFluidStack("penicillin", 1000));
        DeepDarkRecipes.put(361, FluidRegistry.getFluidStack("pollution", 1000));
        DeepDarkRecipes.put(362, FluidRegistry.getFluidStack("polymerase", 1000));
        DeepDarkRecipes.put(363, FluidRegistry.getFluidStack("seaweedbroth", 1000));
        DeepDarkRecipes.put(364, FluidRegistry.getFluidStack("severelyhydrocracked.butadiene", 1000));
        DeepDarkRecipes.put(365, FluidRegistry.getFluidStack("severelyhydrocracked.butane", 1000));
        DeepDarkRecipes.put(366, FluidRegistry.getFluidStack("severelyhydrocracked.butene", 1000));
        DeepDarkRecipes.put(367, FluidRegistry.getFluidStack("severelyhydrocracked.ethane", 1000));
        DeepDarkRecipes.put(368, FluidRegistry.getFluidStack("severelyhydrocracked.ethylene", 1000));
        DeepDarkRecipes.put(369, FluidRegistry.getFluidStack("severelyhydrocracked.gas", 1000));
        DeepDarkRecipes.put(370, FluidRegistry.getFluidStack("severelyhydrocracked.heavyfuel", 1000));
        DeepDarkRecipes.put(371, FluidRegistry.getFluidStack("severelyhydrocracked.lightfuel", 1000));
        DeepDarkRecipes.put(372, FluidRegistry.getFluidStack("severelyhydrocracked.naphtha", 1000));
        DeepDarkRecipes.put(373, FluidRegistry.getFluidStack("severelyhydrocracked.propane", 1000));
        DeepDarkRecipes.put(374, FluidRegistry.getFluidStack("severelyhydrocracked.propene", 1000));
        DeepDarkRecipes.put(375, FluidRegistry.getFluidStack("severelysteamcracked.butadiene", 1000));
        DeepDarkRecipes.put(376, FluidRegistry.getFluidStack("severelysteamcracked.butane", 1000));
        DeepDarkRecipes.put(377, FluidRegistry.getFluidStack("severelysteamcracked.butene", 1000));
        DeepDarkRecipes.put(378, FluidRegistry.getFluidStack("severelysteamcracked.ethane", 1000));
        DeepDarkRecipes.put(379, FluidRegistry.getFluidStack("severelysteamcracked.ethylene", 1000));
        DeepDarkRecipes.put(380, FluidRegistry.getFluidStack("severelysteamcracked.gas", 1000));
        DeepDarkRecipes.put(381, FluidRegistry.getFluidStack("severelysteamcracked.heavyfuel", 1000));
        DeepDarkRecipes.put(382, FluidRegistry.getFluidStack("severelysteamcracked.lightfuel", 1000));
        DeepDarkRecipes.put(383, FluidRegistry.getFluidStack("severelysteamcracked.naphtha", 1000));
        DeepDarkRecipes.put(384, FluidRegistry.getFluidStack("severelysteamcracked.propane", 1000));
        DeepDarkRecipes.put(385, FluidRegistry.getFluidStack("severelysteamcracked.propene", 1000));
        DeepDarkRecipes.put(386, FluidRegistry.getFluidStack("sodiumpotassium", 1000));
        DeepDarkRecipes.put(387, FluidRegistry.getFluidStack("solution.bluevitriol", 1000));
        DeepDarkRecipes.put(388, FluidRegistry.getFluidStack("solution.greenvitriol", 1000));
        DeepDarkRecipes.put(389, FluidRegistry.getFluidStack("solution.nickelsulfate", 1000));
        DeepDarkRecipes.put(390, FluidRegistry.getFluidStack("squidink", 1000));
        DeepDarkRecipes.put(391, FluidRegistry.getFluidStack("steam", 1000));
        DeepDarkRecipes.put(392, FluidRegistry.getFluidStack("superheavyradox", 1000));
        DeepDarkRecipes.put(393, FluidRegistry.getFluidStack("superlightradox", 1000));
        DeepDarkRecipes.put(394, FluidRegistry.getFluidStack("unknownnutrientagar", 1000));
        DeepDarkRecipes.put(395, FluidRegistry.getFluidStack("xenoxene", 1000));

        // GregTech - A
        DeepDarkRecipes.put(396, Materials.Adamantium.getMolten(1000));
        DeepDarkRecipes.put(397, Materials.Alduorite.getMolten(1000));
        DeepDarkRecipes.put(398, Materials.Aluminium.getMolten(1000));
        DeepDarkRecipes.put(399, Materials.Alumite.getMolten(1000));
        DeepDarkRecipes.put(400, Materials.Americium.getMolten(1000));
        DeepDarkRecipes.put(401, Materials.AnnealedCopper.getMolten(1000));
        DeepDarkRecipes.put(402, Materials.Antimony.getMolten(1000));
        DeepDarkRecipes.put(403, Materials.Ardite.getMolten(1000));
        DeepDarkRecipes.put(404, Materials.Arsenic.getMolten(1000));
        DeepDarkRecipes.put(405, Materials.AstralSilver.getMolten(1000));

        DeepDarkRecipes.put(406, Materials.AceticAcid.getFluid(1000));
        DeepDarkRecipes.put(407, Materials.Acetone.getFluid(1000));
        DeepDarkRecipes.put(408, Materials.AdvancedGlue.getFluid(1000));
        DeepDarkRecipes.put(409, Materials.AllylChloride.getFluid(1000));
        DeepDarkRecipes.put(410, Materials.AntiKnock.getFluid(1000));

        DeepDarkRecipes.put(411, Materials.Ammonia.getGas(1000));
        DeepDarkRecipes.put(412, Materials.Argon.getGas(1000));

        DeepDarkRecipes.put(413, Materials.Americium.getPlasma(1000));
        DeepDarkRecipes.put(414, Materials.Ardite.getPlasma(1000));

        // GregTech - B
        DeepDarkRecipes.put(415, Materials.Barium.getMolten(1000));
        DeepDarkRecipes.put(416, Materials.BatteryAlloy.getMolten(1000));
        DeepDarkRecipes.put(417, Materials.Bedrockium.getMolten(1000));
        DeepDarkRecipes.put(418, Materials.Beryllium.getMolten(1000));
        DeepDarkRecipes.put(419, Materials.Bismuth.getMolten(1000));
        DeepDarkRecipes.put(420, Materials.BismuthBronze.getMolten(1000));
        DeepDarkRecipes.put(421, Materials.BlackBronze.getMolten(1000));
        DeepDarkRecipes.put(422, Materials.BlackPlutonium.getMolten(1000));
        DeepDarkRecipes.put(423, Materials.BlackSteel.getMolten(1000));
        DeepDarkRecipes.put(424, Materials.Blaze.getMolten(1000));
        DeepDarkRecipes.put(425, Materials.BloodInfusedIron.getMolten(1000));
        DeepDarkRecipes.put(426, Materials.BlueAlloy.getMolten(1000));
        DeepDarkRecipes.put(427, Materials.BlueSteel.getMolten(1000));
        DeepDarkRecipes.put(428, Materials.Boron.getMolten(1000));
        DeepDarkRecipes.put(429, Materials.BorosilicateGlass.getMolten(1000));
        DeepDarkRecipes.put(430, Materials.Brass.getMolten(1000));
        DeepDarkRecipes.put(431, Materials.Bronze.getMolten(1000));

        DeepDarkRecipes.put(432, Materials.Benzene.getFluid(1000));
        DeepDarkRecipes.put(433, Materials.BioDiesel.getFluid(1000));
        DeepDarkRecipes.put(434, Materials.Biomass.getFluid(1000));
        DeepDarkRecipes.put(435, Materials.BioMediumRaw.getFluid(1000));
        DeepDarkRecipes.put(436, Materials.BioMediumSterilized.getFluid(1000));
        DeepDarkRecipes.put(437, Materials.BisphenolA.getFluid(1000));

        DeepDarkRecipes.put(438, Materials.Butadiene.getGas(1000));
        DeepDarkRecipes.put(439, Materials.Butane.getGas(1000));
        DeepDarkRecipes.put(440, Materials.Butene.getGas(1000));

        DeepDarkRecipes.put(441, Materials.Bedrockium.getPlasma(1000));
        DeepDarkRecipes.put(442, Materials.Bismuth.getPlasma(1000));
        DeepDarkRecipes.put(443, Materials.Boron.getPlasma(1000));

        // GregTech - C
        DeepDarkRecipes.put(444, Materials.Caesium.getMolten(1000));
        DeepDarkRecipes.put(445, Materials.CallistoIce.getMolten(1000));
        DeepDarkRecipes.put(446, Materials.Cerium.getMolten(1000));
        DeepDarkRecipes.put(447, Materials.Ceruclase.getMolten(1000));
        DeepDarkRecipes.put(448, Materials.Cheese.getMolten(1000));
        DeepDarkRecipes.put(449, Materials.Chrome.getMolten(1000));
        DeepDarkRecipes.put(450, Materials.ChromiumDioxide.getMolten(1000));
        DeepDarkRecipes.put(451, Materials.Chrysotile.getMolten(1000));
        DeepDarkRecipes.put(452, Materials.Cobalt.getMolten(1000));
        DeepDarkRecipes.put(453, Materials.CobaltBrass.getMolten(1000));
        DeepDarkRecipes.put(454, Materials.Concrete.getMolten(1000));
        DeepDarkRecipes.put(455, Materials.ConductiveIron.getMolten(1000));
        DeepDarkRecipes.put(456, Materials.Copper.getMolten(1000));
        DeepDarkRecipes.put(457, Materials.CosmicNeutronium.getMolten(1000));
        DeepDarkRecipes.put(458, Materials.CrudeSteel.getMolten(1000));
        DeepDarkRecipes.put(459, Materials.CrystallineAlloy.getMolten(1000));
        DeepDarkRecipes.put(460, Materials.CrystallinePinkSlime.getMolten(1000));
        DeepDarkRecipes.put(461, Materials.Cupronickel.getMolten(1000));

        DeepDarkRecipes.put(462, Materials.CalciumAcetateSolution.getFluid(1000));
        DeepDarkRecipes.put(463, Materials.Chloramine.getFluid(1000));
        DeepDarkRecipes.put(464, Materials.Chlorobenzene.getFluid(1000));
        DeepDarkRecipes.put(465, Materials.Chloroform.getFluid(1000));
        DeepDarkRecipes.put(466, Materials.Creosote.getFluid(1000));
        DeepDarkRecipes.put(467, Materials.Cumene.getFluid(1000));

        DeepDarkRecipes.put(468, Materials.CarbonDioxide.getGas(1000));
        DeepDarkRecipes.put(469, Materials.CarbonMonoxide.getGas(1000));
        DeepDarkRecipes.put(470, Materials.CharcoalByproducts.getGas(1000));
        DeepDarkRecipes.put(471, Materials.Chlorine.getGas(10000));
        DeepDarkRecipes.put(472, Materials.Chloromethane.getGas(1000));

        DeepDarkRecipes.put(473, Materials.Calcium.getPlasma(1000));
        DeepDarkRecipes.put(474, Materials.CosmicNeutronium.getPlasma(1000));

        // GregTech - D
        DeepDarkRecipes.put(475, Materials.DarkIron.getMolten(1000));
        DeepDarkRecipes.put(476, Materials.DarkSteel.getMolten(1000));
        DeepDarkRecipes.put(477, Materials.DamascusSteel.getMolten(1000));
        DeepDarkRecipes.put(478, Materials.DeepIron.getMolten(1000));
        DeepDarkRecipes.put(479, Materials.Desh.getMolten(1000));
        DeepDarkRecipes.put(480, Materials.Draconium.getMolten(1000));
        DeepDarkRecipes.put(481, Materials.DraconiumAwakened.getMolten(1000));
        DeepDarkRecipes.put(482, Materials.Duralumin.getMolten(1000));
        DeepDarkRecipes.put(483, Materials.Duranium.getMolten(1000));
        DeepDarkRecipes.put(484, Materials.Dysprosium.getMolten(1000));

        DeepDarkRecipes.put(485, Materials.Diaminobenzidin.getFluid(1000));
        DeepDarkRecipes.put(486, Materials.Dichlorobenzene.getFluid(1000));
        DeepDarkRecipes.put(487, Materials.DilutedHydrochloricAcid.getFluid(1000));
        DeepDarkRecipes.put(488, Materials.DilutedSulfuricAcid.getFluid(1000));
        DeepDarkRecipes.put(489, Materials.Dimethylbenzene.getFluid(1000));
        DeepDarkRecipes.put(490, Materials.Dimethyldichlorosilane.getFluid(1000));
        DeepDarkRecipes.put(491, Materials.Dimethylhydrazine.getFluid(1000));
        DeepDarkRecipes.put(492, Materials.Diphenylisophthalate.getFluid(1000));

        DeepDarkRecipes.put(493, Materials.DenseSteam.getGas(1000));
        DeepDarkRecipes.put(494, Materials.DenseSupercriticalSteam.getGas(1000));
        DeepDarkRecipes.put(495, Materials.DenseSuperheatedSteam.getGas(1000));
        DeepDarkRecipes.put(496, Materials.Deuterium.getGas(1000));
        DeepDarkRecipes.put(497, Materials.Dichlorosilane.getGas(1000));
        DeepDarkRecipes.put(498, Materials.Dimethylamine.getGas(1000));
        DeepDarkRecipes.put(499, Materials.DinitrogenTetroxide.getGas(1000));

        DeepDarkRecipes.put(500, Materials.Draconium.getPlasma(1000));
        DeepDarkRecipes.put(501, Materials.DraconiumAwakened.getPlasma(1000));

        // GregTech - E
        DeepDarkRecipes.put(502, Materials.ElectricalSteel.getMolten(1000));
        DeepDarkRecipes.put(503, Materials.Electrotine.getMolten(1000));
        DeepDarkRecipes.put(504, Materials.Electrum.getMolten(1000));
        DeepDarkRecipes.put(505, Materials.ElectrumFlux.getMolten(1000));
        DeepDarkRecipes.put(506, Materials.Enderium.getMolten(1000));
        DeepDarkRecipes.put(507, Materials.EnderiumBase.getMolten(1000));
        DeepDarkRecipes.put(508, Materials.EndSteel.getMolten(1000));
        DeepDarkRecipes.put(509, Materials.EnergeticAlloy.getMolten(1000));
        DeepDarkRecipes.put(510, Materials.EnergeticSilver.getMolten(1000));
        DeepDarkRecipes.put(511, Materials.EnhancedGalgadorian.getMolten(1000));
        DeepDarkRecipes.put(512, Materials.EnrichedHolmium.getMolten(1000));
        DeepDarkRecipes.put(513, Materials.Epoxid.getMolten(1000));
        DeepDarkRecipes.put(514, Materials.EpoxidFiberReinforced.getMolten(1000));
        DeepDarkRecipes.put(515, Materials.Erbium.getMolten(1000));
        DeepDarkRecipes.put(516, Materials.Europium.getMolten(1000));

        DeepDarkRecipes.put(517, Materials.EnrichedNaquadria.getFluid(1000));
        DeepDarkRecipes.put(518, Materials.Epichlorohydrin.getFluid(1000));
        DeepDarkRecipes.put(519, Materials.Ethanol.getFluid(1000));

        DeepDarkRecipes.put(520, Materials.Ethane.getGas(1000));
        DeepDarkRecipes.put(521, Materials.Ethenone.getGas(1000));
        DeepDarkRecipes.put(522, Materials.Ethylene.getGas(1000));

        // GregTech - F
        DeepDarkRecipes.put(523, Materials.Flerovium.getMolten(1000));
        DeepDarkRecipes.put(524, Materials.Force.getMolten(1000));

        DeepDarkRecipes.put(525, Materials.FermentedBiomass.getFluid(1000));
        DeepDarkRecipes.put(526, Materials.FishOil.getFluid(1000));
        DeepDarkRecipes.put(527, Materials.FlocculationWasteLiquid.getFluid(1000));
        DeepDarkRecipes.put(528, Materials.FluidNaquadahFuel.getFluid(1000));
        DeepDarkRecipes.put(529, Materials.FryingOilHot.getFluid(1000));
        DeepDarkRecipes.put(530, Materials.Fuel.getFluid(1000));

        DeepDarkRecipes.put(531, Materials.Fluorine.getGas(1000));

        // GregTech - G
        DeepDarkRecipes.put(532, Materials.Gadolinium.getMolten(1000));
        DeepDarkRecipes.put(533, Materials.Galgadorian.getMolten(1000));
        DeepDarkRecipes.put(534, Materials.Gallium.getMolten(1000));
        DeepDarkRecipes.put(535, Materials.GalliumArsenide.getMolten(1000));
        DeepDarkRecipes.put(536, Materials.Glass.getMolten(1000));
        DeepDarkRecipes.put(537, Materials.Glowstone.getMolten(1000));
        DeepDarkRecipes.put(538, Materials.Gold.getMolten(1000));

        DeepDarkRecipes.put(539, Materials.GasolineRaw.getFluid(1000));
        DeepDarkRecipes.put(540, Materials.GasolineRegular.getFluid(1000));
        DeepDarkRecipes.put(541, Materials.GasolinePremium.getFluid(1000));
        DeepDarkRecipes.put(542, Materials.Glue.getFluid(1000));
        DeepDarkRecipes.put(543, Materials.Glyceryl.getFluid(1000));
        DeepDarkRecipes.put(544, Materials.Grade1PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(545, Materials.Grade2PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(546, Materials.Grade3PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(547, Materials.Grade4PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(548, Materials.Grade5PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(549, Materials.Grade6PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(550, Materials.Grade7PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(551, Materials.Grade8PurifiedWater.getFluid(1000));
        DeepDarkRecipes.put(552, Materials.GrowthMediumRaw.getFluid(1000));
        DeepDarkRecipes.put(553, Materials.GrowthMediumSterilized.getFluid(1000));

        DeepDarkRecipes.put(554, Materials.Gas.getGas(1000));

        // GregTech - H
        DeepDarkRecipes.put(555, Materials.HeeEndium.getMolten(1000));
        DeepDarkRecipes.put(556, Materials.Holmium.getMolten(1000));
        DeepDarkRecipes.put(557, Materials.HSSE.getMolten(1000));
        DeepDarkRecipes.put(558, Materials.HSSG.getMolten(1000));
        DeepDarkRecipes.put(559, Materials.HSSS.getMolten(1000));

        DeepDarkRecipes.put(560, Materials.HeavyFuel.getFluid(1000));
        DeepDarkRecipes.put(561, Materials.Hexachlorodisilane.getFluid(1000));
        DeepDarkRecipes.put(562, Materials.HolyWater.getFluid(1000));
        DeepDarkRecipes.put(563, Materials.Honey.getFluid(1000));
        DeepDarkRecipes.put(564, Materials.HydrofluoricAcid.getFluid(1000));
        DeepDarkRecipes.put(565, Materials.HydrofluoricAcid.getFluid(1000));
        DeepDarkRecipes.put(566, Materials.HypochlorousAcid.getFluid(1000));

        DeepDarkRecipes.put(567, Materials.Helium.getGas(1000));
        DeepDarkRecipes.put(568, Materials.Helium_3.getGas(1000));
        DeepDarkRecipes.put(569, Materials.HydricSulfide.getGas(1000));
        DeepDarkRecipes.put(570, Materials.Hydrogen.getGas(1000));

        DeepDarkRecipes.put(571, Materials.Helium.getPlasma(1000));

        // GregTech - I
        DeepDarkRecipes.put(572, Materials.Ichorium.getMolten(1000));
        DeepDarkRecipes.put(573, Materials.Indium.getMolten(1000));
        DeepDarkRecipes.put(574, Materials.IndiumGalliumPhosphide.getMolten(1000));
        DeepDarkRecipes.put(575, Materials.Infinity.getMolten(1000));
        DeepDarkRecipes.put(576, Materials.InfinityCatalyst.getMolten(1000));
        DeepDarkRecipes.put(577, Materials.InfusedGold.getMolten(1000));
        DeepDarkRecipes.put(578, Materials.Invar.getMolten(1000));
        DeepDarkRecipes.put(579, Materials.Iridium.getMolten(1000));
        DeepDarkRecipes.put(580, Materials.Iron.getMolten(1000));
        DeepDarkRecipes.put(581, Materials.IronMagnetic.getMolten(1000));
        DeepDarkRecipes.put(582, Materials.IronWood.getMolten(1000));

        DeepDarkRecipes.put(583, Materials.Ice.getFluid(1000));
        DeepDarkRecipes.put(584, Materials.IronIIIChloride.getFluid(1000));
        DeepDarkRecipes.put(585, Materials.Isoprene.getFluid(1000));

        DeepDarkRecipes.put(586, Materials.Ichorium.getPlasma(1000));
        DeepDarkRecipes.put(587, Materials.Infinity.getPlasma(1000));
        DeepDarkRecipes.put(588, Materials.Iron.getPlasma(1000));

        // GregTech - J

        // GregTech - K
        DeepDarkRecipes.put(589, Materials.Kanthal.getMolten(1000));
        DeepDarkRecipes.put(590, Materials.Knightmetal.getMolten(1000));

        // GregTech - L
        DeepDarkRecipes.put(591, Materials.Lanthanum.getMolten(1000));
        DeepDarkRecipes.put(592, Materials.Lead.getMolten(1000));
        DeepDarkRecipes.put(593, Materials.Ledox.getMolten(1000));
        DeepDarkRecipes.put(594, Materials.Lithium.getMolten(1000));
        DeepDarkRecipes.put(595, Materials.Longasssuperconductornameforuhvwire.getMolten(1000));
        DeepDarkRecipes.put(596, Materials.Longasssuperconductornameforuvwire.getMolten(1000));
        DeepDarkRecipes.put(597, Materials.Lutetium.getMolten(1000));

        DeepDarkRecipes.put(598, Materials.LifeEssence.getFluid(1000));
        DeepDarkRecipes.put(599, Materials.LightFuel.getFluid(1000));
        DeepDarkRecipes.put(600, Materials.LiquidAir.getFluid(1000));
        DeepDarkRecipes.put(601, Materials.LPG.getFluid(1000));
        DeepDarkRecipes.put(602, Materials.Lubricant.getFluid(1000));

        DeepDarkRecipes.put(603, Materials.Lead.getPlasma(1000));

        // GregTech - M
        DeepDarkRecipes.put(604, Materials.Magnalium.getMolten(1000));
        DeepDarkRecipes.put(605, Materials.Magnesium.getMolten(1000));
        DeepDarkRecipes.put(606, Materials.Manganese.getMolten(1000));
        DeepDarkRecipes.put(607, Materials.Manyullyn.getMolten(1000));
        DeepDarkRecipes.put(608, Materials.MelodicAlloy.getMolten(1000));
        DeepDarkRecipes.put(609, Materials.MeteoricIron.getMolten(1000));
        DeepDarkRecipes.put(610, Materials.MeteoricSteel.getMolten(1000));
        DeepDarkRecipes.put(611, Materials.Mithril.getMolten(1000));
        DeepDarkRecipes.put(612, Materials.Molybdenum.getMolten(1000));
        DeepDarkRecipes.put(613, Materials.MysteriousCrystal.getMolten(1000));
        DeepDarkRecipes.put(614, Materials.Mytryl.getMolten(1000));

        DeepDarkRecipes.put(615, Materials.Mercury.getFluid(1000));
        DeepDarkRecipes.put(616, Materials.Methanol.getFluid(1000));
        DeepDarkRecipes.put(617, Materials.MethylAcetate.getFluid(1000));
        DeepDarkRecipes.put(618, Materials.Milk.getFluid(1000));

        DeepDarkRecipes.put(619, Materials.Methane.getGas(1000));
        DeepDarkRecipes.put(620, Materials.MTBEMixture.getGas(1000));

        // GregTech - N
        DeepDarkRecipes.put(621, Materials.Naquadah.getMolten(1000));
        DeepDarkRecipes.put(622, Materials.NaquadahAlloy.getMolten(1000));
        DeepDarkRecipes.put(623, Materials.NaquadahEnriched.getMolten(1000));
        DeepDarkRecipes.put(624, Materials.Naquadria.getMolten(1000));
        DeepDarkRecipes.put(625, Materials.Neodymium.getMolten(1000));
        DeepDarkRecipes.put(626, Materials.NeodymiumMagnetic.getMolten(1000));
        DeepDarkRecipes.put(627, Materials.Neutronium.getMolten(1000));
        DeepDarkRecipes.put(628, Materials.Nichrome.getMolten(1000));
        DeepDarkRecipes.put(629, Materials.Nickel.getMolten(1000));
        DeepDarkRecipes.put(630, Materials.NickelZincFerrite.getMolten(1000));
        DeepDarkRecipes.put(631, Materials.Niobium.getMolten(1000));
        DeepDarkRecipes.put(632, Materials.NiobiumNitride.getMolten(1000));
        DeepDarkRecipes.put(633, Materials.NiobiumTitanium.getMolten(1000));

        DeepDarkRecipes.put(634, Materials.Naphtha.getFluid(1000));
        DeepDarkRecipes.put(635, Materials.NitrationMixture.getFluid(1000));
        DeepDarkRecipes.put(636, Materials.NitricAcid.getFluid(1000));
        DeepDarkRecipes.put(637, Materials.Nitrochlorobenzene.getFluid(1000));
        DeepDarkRecipes.put(638, Materials.NitroFuel.getFluid(1000));

        DeepDarkRecipes.put(639, Materials.NatruralGas.getGas(1000));
        DeepDarkRecipes.put(640, Materials.NitricOxide.getGas(1000));
        DeepDarkRecipes.put(641, Materials.Nitrogen.getGas(1000));
        DeepDarkRecipes.put(642, Materials.NitrogenDioxide.getGas(1000));
        DeepDarkRecipes.put(643, Materials.NitrousOxide.getGas(1000));
        DeepDarkRecipes.put(644, Materials.NobleGases.getGas(1000));

        DeepDarkRecipes.put(645, Materials.Naquadria.getPlasma(1000));
        DeepDarkRecipes.put(646, Materials.Nickel.getPlasma(1000));
        DeepDarkRecipes.put(647, Materials.Niobium.getPlasma(1000));
        DeepDarkRecipes.put(648, Materials.Nitrogen.getPlasma(1000));

        // GregTech - O
        DeepDarkRecipes.put(649, Materials.Obsidian.getMolten(1000));
        DeepDarkRecipes.put(650, Materials.Orichalcum.getMolten(1000));
        DeepDarkRecipes.put(651, Materials.Oriharukon.getMolten(1000));
        DeepDarkRecipes.put(652, Materials.Osmiridium.getMolten(1000));
        DeepDarkRecipes.put(653, Materials.Osmium.getMolten(1000));

        DeepDarkRecipes.put(654, Materials.Octane.getFluid(1000));
        DeepDarkRecipes.put(655, Materials.Oil.getFluid(1000));
        DeepDarkRecipes.put(656, Materials.OilExtraHeavy.getFluid(1000));
        DeepDarkRecipes.put(657, Materials.OilHeavy.getFluid(1000));
        DeepDarkRecipes.put(658, Materials.OilLight.getFluid(1000));
        DeepDarkRecipes.put(659, Materials.OilMedium.getFluid(1000));

        DeepDarkRecipes.put(660, Materials.Oxygen.getGas(1000));
        DeepDarkRecipes.put(661, Materials.Ozone.getGas(1000));

        DeepDarkRecipes.put(662, Materials.Oxygen.getPlasma(1000));

        // GregTech - P
        DeepDarkRecipes.put(663, Materials.Palladium.getMolten(1000));
        DeepDarkRecipes.put(664, Materials.Pentacadmiummagnesiumhexaoxid.getMolten(1000));
        DeepDarkRecipes.put(665, Materials.PigIron.getMolten(1000));
        DeepDarkRecipes.put(666, Materials.Plastic.getMolten(1000));
        DeepDarkRecipes.put(667, Materials.Platinum.getMolten(1000));
        DeepDarkRecipes.put(668, Materials.Plutonium.getMolten(1000));
        DeepDarkRecipes.put(669, Materials.Plutonium241.getMolten(1000));
        DeepDarkRecipes.put(670, Materials.Polybenzimidazole.getMolten(1000));
        DeepDarkRecipes.put(671, Materials.Polycaprolactam.getMolten(1000));
        DeepDarkRecipes.put(672, Materials.PolyphenyleneSulfide.getMolten(1000));
        DeepDarkRecipes.put(673, Materials.Polystyrene.getMolten(1000));
        DeepDarkRecipes.put(674, Materials.Polytetrafluoroethylene.getMolten(1000));
        DeepDarkRecipes.put(675, Materials.PolyvinylChloride.getMolten(1000));
        DeepDarkRecipes.put(676, Materials.Potassium.getMolten(1000));
        DeepDarkRecipes.put(677, Materials.Praseodymium.getMolten(1000));
        DeepDarkRecipes.put(678, Materials.Promethium.getMolten(1000));
        DeepDarkRecipes.put(679, Materials.PulsatingIron.getMolten(1000));

        DeepDarkRecipes.put(680, Materials.Phenol.getFluid(1000));
        DeepDarkRecipes.put(681, Materials.PhosphoricAcid.getFluid(1000));
        DeepDarkRecipes.put(682, Materials.PhthalicAcid.getFluid(1000));
        DeepDarkRecipes.put(683, Materials.PolyAluminiumChloride.getFluid(1000));
        DeepDarkRecipes.put(684, Materials.PolyvinylAcetate.getFluid(1000));

        DeepDarkRecipes.put(685, Materials.Propane.getGas(1000));
        DeepDarkRecipes.put(686, Materials.Propene.getGas(1000));

        DeepDarkRecipes.put(687, Materials.Plutonium241.getPlasma(1000));

        // GregTech - Q
        DeepDarkRecipes.put(688, Materials.Quantium.getMolten(1000));

        // GregTech - R
        DeepDarkRecipes.put(689, Materials.RadoxPolymer.getMolten(1000));
        DeepDarkRecipes.put(690, Materials.Realgar.getMolten(1000));
        DeepDarkRecipes.put(691, Materials.RedAlloy.getMolten(1000));
        DeepDarkRecipes.put(692, Materials.RedSteel.getMolten(1000));
        DeepDarkRecipes.put(693, Materials.Redstone.getMolten(1000));
        DeepDarkRecipes.put(694, Materials.Reinforced.getMolten(1000));
        DeepDarkRecipes.put(695, Materials.ReinforceGlass.getMolten(1000));
        DeepDarkRecipes.put(696, Materials.RoseGold.getMolten(1000));
        DeepDarkRecipes.put(697, Materials.Rubber.getMolten(1000));
        DeepDarkRecipes.put(698, Materials.Rubidium.getMolten(1000));
        DeepDarkRecipes.put(699, Materials.Rubracium.getMolten(1000));

        DeepDarkRecipes.put(700, Materials.RedMud.getFluid(1000));

        DeepDarkRecipes.put(701, Materials.Radon.getGas(1000));
        DeepDarkRecipes.put(702, Materials.RadoxPolymer.getGas(1000));

        DeepDarkRecipes.put(703, Materials.Radon.getPlasma(1000));

        // GregTech - S
        DeepDarkRecipes.put(704, Materials.Samarium.getMolten(1000));
        DeepDarkRecipes.put(705, Materials.SamariumMagnetic.getMolten(1000));
        DeepDarkRecipes.put(706, Materials.Scandium.getMolten(1000));
        DeepDarkRecipes.put(707, Materials.Shadow.getMolten(1000));
        DeepDarkRecipes.put(708, Materials.ShadowIron.getMolten(1000));
        DeepDarkRecipes.put(709, Materials.ShadowSteel.getMolten(1000));
        DeepDarkRecipes.put(710, Materials.Silicon.getMolten(1000));
        DeepDarkRecipes.put(711, Materials.Silicone.getMolten(1000));
        DeepDarkRecipes.put(712, Materials.SiliconSG.getMolten(1000));
        DeepDarkRecipes.put(713, Materials.Silver.getMolten(1000));
        DeepDarkRecipes.put(714, Materials.SolderingAlloy.getMolten(1000));
        DeepDarkRecipes.put(715, Materials.Soularium.getMolten(1000));
        DeepDarkRecipes.put(716, Materials.StainlessSteel.getMolten(1000));
        DeepDarkRecipes.put(717, Materials.Steel.getMolten(1000));
        DeepDarkRecipes.put(718, Materials.SteelMagnetic.getMolten(1000));
        DeepDarkRecipes.put(719, Materials.StellarAlloy.getMolten(1000));
        DeepDarkRecipes.put(720, Materials.SterlingSilver.getMolten(1000));
        DeepDarkRecipes.put(721, Materials.Strontium.getMolten(1000));
        DeepDarkRecipes.put(722, Materials.StyreneButadieneRubber.getMolten(1000));
        DeepDarkRecipes.put(723, Materials.Sugar.getMolten(1000));
        DeepDarkRecipes.put(724, Materials.Sunnarium.getMolten(1000));
        DeepDarkRecipes.put(725, Materials.SuperconductorUEVBase.getMolten(1000));
        DeepDarkRecipes.put(726, Materials.SuperconductorUIVBase.getMolten(1000));
        DeepDarkRecipes.put(727, Materials.SuperconductorUMVBase.getMolten(1000));

        DeepDarkRecipes.put(728, Materials.SaltWater.getFluid(1000));
        DeepDarkRecipes.put(729, Materials.SeedOil.getFluid(1000));
        DeepDarkRecipes.put(730, Materials.SiliconTetrachloride.getFluid(1000));
        DeepDarkRecipes.put(731, Materials.Sodium.getFluid(1000));
        DeepDarkRecipes.put(732, Materials.SodiumPersulfate.getFluid(1000));
        DeepDarkRecipes.put(733, Materials.StableBaryonicMatter.getFluid(1000));
        DeepDarkRecipes.put(734, Materials.Styrene.getFluid(1000));
        DeepDarkRecipes.put(735, Materials.SulfuricAcid.getFluid(1000));
        DeepDarkRecipes.put(736, Materials.SulfuricHeavyFuel.getFluid(1000));
        DeepDarkRecipes.put(737, Materials.SulfuricLightFuel.getFluid(1000));
        DeepDarkRecipes.put(738, Materials.SulfuricNaphtha.getFluid(1000));
        DeepDarkRecipes.put(739, Materials.SuperCoolant.getFluid(1000));

        DeepDarkRecipes.put(740, Materials.Silane.getGas(1000));
        DeepDarkRecipes.put(741, Materials.SiliconTetrafluoride.getGas(1000));
        DeepDarkRecipes.put(742, Materials.SulfurDioxide.getGas(1000));
        DeepDarkRecipes.put(743, Materials.SulfuricGas.getGas(1000));
        DeepDarkRecipes.put(744, Materials.SulfurTrioxide.getGas(1000));

        DeepDarkRecipes.put(745, Materials.Silver.getPlasma(1000));
        DeepDarkRecipes.put(746, Materials.Sulfur.getPlasma(1000));

        // GregTech - T
        DeepDarkRecipes.put(747, Materials.Tantalum.getMolten(1000));
        DeepDarkRecipes.put(748, Materials.Tartarite.getMolten(1000));
        DeepDarkRecipes.put(749, Materials.Tellurium.getMolten(1000));
        DeepDarkRecipes.put(750, Materials.TengamAttuned.getMolten(1000));
        DeepDarkRecipes.put(751, Materials.TengamPurified.getMolten(1000));
        DeepDarkRecipes.put(752, Materials.Terbium.getMolten(1000));
        DeepDarkRecipes.put(753, Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.getMolten(1000));
        DeepDarkRecipes.put(754, Materials.Tetranaquadahdiindiumhexaplatiumosminid.getMolten(1000));
        DeepDarkRecipes.put(755, Materials.Thaumium.getMolten(1000));
        DeepDarkRecipes.put(756, Materials.Thorium.getMolten(1000));
        DeepDarkRecipes.put(757, Materials.Thulium.getMolten(1000));
        DeepDarkRecipes.put(758, Materials.Tin.getMolten(1000));
        DeepDarkRecipes.put(759, Materials.TinAlloy.getMolten(1000));
        DeepDarkRecipes.put(760, Materials.Titanium.getPlasma(1000));
        DeepDarkRecipes.put(761, Materials.Titanium.getMolten(1000));
        DeepDarkRecipes.put(762, Materials.Titaniumonabariumdecacoppereikosaoxid.getMolten(1000));
        DeepDarkRecipes.put(763, Materials.TPV.getMolten(1000));
        DeepDarkRecipes.put(764, Materials.Trinium.getMolten(1000));
        DeepDarkRecipes.put(765, Materials.Tritanium.getMolten(1000));
        DeepDarkRecipes.put(766, Materials.Tungsten.getMolten(1000));
        DeepDarkRecipes.put(767, Materials.TungstenCarbide.getMolten(1000));
        DeepDarkRecipes.put(768, Materials.TungstenSteel.getMolten(1000));

        DeepDarkRecipes.put(769, Materials.Tetranitromethane.getFluid(1000));
        DeepDarkRecipes.put(770, Materials.Titaniumtetrachloride.getFluid(1000));
        DeepDarkRecipes.put(771, Materials.Toluene.getFluid(1000));
        DeepDarkRecipes.put(772, Materials.Trichlorosilane.getFluid(1000));

        DeepDarkRecipes.put(773, Materials.Tetrafluoroethylene.getGas(1000));
        DeepDarkRecipes.put(774, Materials.Tritium.getGas(1000));

        DeepDarkRecipes.put(775, Materials.Thorium.getPlasma(1000));
        DeepDarkRecipes.put(776, Materials.Tin.getPlasma(1000));

        // GregTech - U
        DeepDarkRecipes.put(777, Materials.Ultimet.getMolten(1000));
        DeepDarkRecipes.put(778, Materials.Uranium.getMolten(1000));
        DeepDarkRecipes.put(779, Materials.Uranium235.getMolten(1000));
        DeepDarkRecipes.put(780, Materials.Uraniumtriplatinid.getMolten(1000));

        DeepDarkRecipes.put(781, Materials.UUAmplifier.getFluid(1000));

        // GregTech - V
        DeepDarkRecipes.put(782, Materials.Vanadium.getMolten(1000));
        DeepDarkRecipes.put(783, Materials.VanadiumGallium.getMolten(1000));
        DeepDarkRecipes.put(784, Materials.VanadiumSteel.getMolten(1000));
        DeepDarkRecipes.put(785, Materials.Vanadiumtriindinid.getMolten(1000));
        DeepDarkRecipes.put(786, Materials.VibrantAlloy.getMolten(1000));
        DeepDarkRecipes.put(787, Materials.Vinteum.getMolten(1000));
        DeepDarkRecipes.put(788, Materials.VividAlloy.getMolten(1000));
        DeepDarkRecipes.put(789, Materials.Void.getMolten(1000));
        DeepDarkRecipes.put(790, Materials.Vulcanite.getMolten(1000));
        DeepDarkRecipes.put(791, Materials.Vyroxeres.getMolten(1000));

        DeepDarkRecipes.put(792, Materials.VinylAcetate.getFluid(1000));

        DeepDarkRecipes.put(793, Materials.VinylChloride.getGas(1000));

        // GregTech - W
        DeepDarkRecipes.put(794, Materials.WroughtIron.getMolten(1000));

        DeepDarkRecipes.put(795, Materials.WoodTar.getFluid(1000));
        DeepDarkRecipes.put(796, Materials.WoodVinegar.getFluid(1000));

        DeepDarkRecipes.put(797, Materials.WoodGas.getGas(1000));

        // GregTech - X

        // GregTech - Y
        DeepDarkRecipes.put(798, Materials.Ytterbium.getMolten(1000));
        DeepDarkRecipes.put(799, Materials.Yttrium.getMolten(1000));
        DeepDarkRecipes.put(800, Materials.YttriumBariumCuprate.getMolten(1000));

        // GregTech - Z
        DeepDarkRecipes.put(801, Materials.Zinc.getMolten(1000));

        DeepDarkRecipes.put(802, Materials.Zinc.getPlasma(1000));

        // GregTechPlusPlus
        DeepDarkRecipes.put(803, FluidRegistry.getFluidStack("neon", 1000));
        DeepDarkRecipes.put(804, FluidRegistry.getFluidStack("plasma.neon", 1000));
        DeepDarkRecipes.put(805, FluidRegistry.getFluidStack("molten.germanium", 1000));
        DeepDarkRecipes.put(806, FluidRegistry.getFluidStack("plasma.germanium", 1000));
        DeepDarkRecipes.put(807, FluidRegistry.getFluidStack("molten.selenium", 1000));
        DeepDarkRecipes.put(808, FluidRegistry.getFluidStack("plasma.selenium", 1000));
        DeepDarkRecipes.put(809, FluidRegistry.getFluidStack("molten.bromine", 1000));
        DeepDarkRecipes.put(810, FluidRegistry.getFluidStack("plasma.bromine", 1000));
        DeepDarkRecipes.put(811, FluidRegistry.getFluidStack("krypton", 1000));
        DeepDarkRecipes.put(812, FluidRegistry.getFluidStack("plasma.krypton", 1000));
        DeepDarkRecipes.put(813, FluidRegistry.getFluidStack("molten.zirconium", 1000));
        DeepDarkRecipes.put(814, FluidRegistry.getFluidStack("plasma.zirconium", 1000));
        DeepDarkRecipes.put(815, FluidRegistry.getFluidStack("molten.ruthenium", 1000));
        DeepDarkRecipes.put(816, FluidRegistry.getFluidStack("plasma.ruthenium", 1000));
        DeepDarkRecipes.put(817, FluidRegistry.getFluidStack("molten.rhodium", 1000));
        DeepDarkRecipes.put(818, FluidRegistry.getFluidStack("plasma.rhodium", 1000));
        DeepDarkRecipes.put(819, FluidRegistry.getFluidStack("molten.technetium", 1000));
        DeepDarkRecipes.put(820, FluidRegistry.getFluidStack("plasma.technetium", 1000));
        DeepDarkRecipes.put(821, FluidRegistry.getFluidStack("molten.neptunium", 1000));
        DeepDarkRecipes.put(822, FluidRegistry.getFluidStack("plasma.neptunium", 1000));
        DeepDarkRecipes.put(823, FluidRegistry.getFluidStack("molten.iodine", 1000));
        DeepDarkRecipes.put(824, FluidRegistry.getFluidStack("plasma.iodine", 1000));
        DeepDarkRecipes.put(825, FluidRegistry.getFluidStack("xenon", 1000));
        DeepDarkRecipes.put(826, FluidRegistry.getFluidStack("plasma.xenon", 1000));
        DeepDarkRecipes.put(827, FluidRegistry.getFluidStack("molten.hafnium", 1000));
        DeepDarkRecipes.put(828, FluidRegistry.getFluidStack("plasma.hafnium", 1000));
        DeepDarkRecipes.put(829, FluidRegistry.getFluidStack("molten.rhenium", 1000));
        DeepDarkRecipes.put(830, FluidRegistry.getFluidStack("plasma.rhenium", 1000));
        DeepDarkRecipes.put(831, FluidRegistry.getFluidStack("molten.thallium", 1000));
        DeepDarkRecipes.put(832, FluidRegistry.getFluidStack("plasma.thallium", 1000));
        DeepDarkRecipes.put(833, FluidRegistry.getFluidStack("molten.polonium", 1000));
        DeepDarkRecipes.put(834, FluidRegistry.getFluidStack("plasma.polonium", 1000));

        DeepDarkRecipes.put(835, FluidRegistry.getFluidStack("molten.radium", 1000));
        DeepDarkRecipes.put(836, FluidRegistry.getFluidStack("plasma.radium", 1000));
        DeepDarkRecipes.put(837, FluidRegistry.getFluidStack("molten.protactinium", 1000));
        DeepDarkRecipes.put(838, FluidRegistry.getFluidStack("plasma.protactinium", 1000));
        DeepDarkRecipes.put(839, FluidRegistry.getFluidStack("molten.curium", 1000));
        DeepDarkRecipes.put(840, FluidRegistry.getFluidStack("plasma.curium", 1000));
        DeepDarkRecipes.put(841, FluidRegistry.getFluidStack("molten.californium", 1000));
        DeepDarkRecipes.put(842, FluidRegistry.getFluidStack("plasma.californium", 1000));
        DeepDarkRecipes.put(843, FluidRegistry.getFluidStack("molten.fermium", 1000));
        DeepDarkRecipes.put(844, FluidRegistry.getFluidStack("plasma.fermium", 1000));
        DeepDarkRecipes.put(845, FluidRegistry.getFluidStack("molten.uranium232", 1000));
        DeepDarkRecipes.put(846, FluidRegistry.getFluidStack("plasma.uranium232", 1000));
        DeepDarkRecipes.put(847, FluidRegistry.getFluidStack("molten.uranium233", 1000));
        DeepDarkRecipes.put(848, FluidRegistry.getFluidStack("plasma.uranium233", 1000));
        DeepDarkRecipes.put(849, FluidRegistry.getFluidStack("molten.thorium232", 1000));
        DeepDarkRecipes.put(850, FluidRegistry.getFluidStack("plasma.thorium232", 1000));
        DeepDarkRecipes.put(851, FluidRegistry.getFluidStack("molten.plutonium238", 1000));
        DeepDarkRecipes.put(852, FluidRegistry.getFluidStack("plasma.plutonium238", 1000));
        DeepDarkRecipes.put(853, FluidRegistry.getFluidStack("molten.celestialtungsten", 1000));
        DeepDarkRecipes.put(854, FluidRegistry.getFluidStack("plasma.celestialtungsten", 1000));
        DeepDarkRecipes.put(855, FluidRegistry.getFluidStack("molten.astraltitanium", 1000));
        DeepDarkRecipes.put(856, FluidRegistry.getFluidStack("plasma.astraltitanium", 1000));
        DeepDarkRecipes.put(857, FluidRegistry.getFluidStack("molten.chromaticglass", 1000));
        DeepDarkRecipes.put(858, FluidRegistry.getFluidStack("plasma.chromaticglass", 1000));
        DeepDarkRecipes.put(859, FluidRegistry.getFluidStack("molten.energycrystal", 1000));
        DeepDarkRecipes.put(860, FluidRegistry.getFluidStack("molten.bloodsteel", 1000));
        DeepDarkRecipes.put(861, FluidRegistry.getFluidStack("molten.staballoy", 1000));
        DeepDarkRecipes.put(862, FluidRegistry.getFluidStack("molten.tantalloy60", 1000));
        DeepDarkRecipes.put(863, FluidRegistry.getFluidStack("molten.tantalloy61", 1000));
        DeepDarkRecipes.put(864, FluidRegistry.getFluidStack("molten.tumbaga", 1000));
        DeepDarkRecipes.put(865, FluidRegistry.getFluidStack("molten.potin", 1000));
        DeepDarkRecipes.put(866, FluidRegistry.getFluidStack("molten.inconel625", 1000));
        DeepDarkRecipes.put(867, FluidRegistry.getFluidStack("molten.inconel690", 1000));
        DeepDarkRecipes.put(868, FluidRegistry.getFluidStack("molten.inconel792", 1000));
        DeepDarkRecipes.put(869, FluidRegistry.getFluidStack("molten.nitinol60", 1000));
        DeepDarkRecipes.put(870, FluidRegistry.getFluidStack("molten.zeron100", 1000));
        DeepDarkRecipes.put(871, FluidRegistry.getFluidStack("molten.maragingsteel250", 1000));
        DeepDarkRecipes.put(872, FluidRegistry.getFluidStack("molten.maragingsteel300", 1000));
        DeepDarkRecipes.put(873, FluidRegistry.getFluidStack("molten.maragingsteel350", 1000));
        DeepDarkRecipes.put(874, FluidRegistry.getFluidStack("molten.watertightsteel", 1000));
        DeepDarkRecipes.put(875, FluidRegistry.getFluidStack("molten.stellite", 1000));
        DeepDarkRecipes.put(876, FluidRegistry.getFluidStack("molten.talonite", 1000));
        DeepDarkRecipes.put(877, FluidRegistry.getFluidStack("molten.hastelloyw", 1000));
        DeepDarkRecipes.put(878, FluidRegistry.getFluidStack("molten.hastelloyx", 1000));
        DeepDarkRecipes.put(879, FluidRegistry.getFluidStack("molten.hastelloyn", 1000));
        DeepDarkRecipes.put(880, FluidRegistry.getFluidStack("molten.hastelloyc276", 1000));
        DeepDarkRecipes.put(881, FluidRegistry.getFluidStack("molten.incoloy020", 1000));

        DeepDarkRecipes.put(882, FluidRegistry.getFluidStack("molten.incoloyds", 1000));
        DeepDarkRecipes.put(883, FluidRegistry.getFluidStack("molten.incoloyma956", 1000));
        DeepDarkRecipes.put(884, FluidRegistry.getFluidStack("molten.tungstentitaniumcarbide", 1000));
        DeepDarkRecipes.put(885, FluidRegistry.getFluidStack("molten.siliconcarbide", 1000));
        DeepDarkRecipes.put(886, FluidRegistry.getFluidStack("molten.tantalumcarbide", 1000));
        DeepDarkRecipes.put(887, FluidRegistry.getFluidStack("molten.zirconiumcarbide", 1000));
        DeepDarkRecipes.put(888, FluidRegistry.getFluidStack("molten.niobiumcarbide", 1000));
        DeepDarkRecipes.put(889, FluidRegistry.getFluidStack("molten.arcanite", 1000));
        DeepDarkRecipes.put(890, FluidRegistry.getFluidStack("molten.grisium", 1000));
        DeepDarkRecipes.put(891, FluidRegistry.getFluidStack("molten.eglinsteelbasecompound", 1000));
        DeepDarkRecipes.put(892, FluidRegistry.getFluidStack("molten.eglinsteel", 1000));
        DeepDarkRecipes.put(893, FluidRegistry.getFluidStack("molten.hg1223", 1000));
        DeepDarkRecipes.put(894, FluidRegistry.getFluidStack("molten.hs188a", 1000));
        DeepDarkRecipes.put(895, FluidRegistry.getFluidStack("molten.triniumtitaniumalloy", 1000));
        DeepDarkRecipes.put(896, FluidRegistry.getFluidStack("molten.triniumnaquadahalloy", 1000));
        DeepDarkRecipes.put(897, FluidRegistry.getFluidStack("molten.triniumnaquadahcarbonite", 1000));
        DeepDarkRecipes.put(898, FluidRegistry.getFluidStack("molten.arceusalloy2b", 1000));
        DeepDarkRecipes.put(899, FluidRegistry.getFluidStack("molten.koboldite", 1000));
        DeepDarkRecipes.put(900, FluidRegistry.getFluidStack("molten.helicopter", 1000));
        DeepDarkRecipes.put(901, FluidRegistry.getFluidStack("molten.lafiumcompound", 1000));
        DeepDarkRecipes.put(902, FluidRegistry.getFluidStack("molten.cinobitea243", 1000));
        DeepDarkRecipes.put(903, FluidRegistry.getFluidStack("molten.pikyonium64b", 1000));
        DeepDarkRecipes.put(904, FluidRegistry.getFluidStack("molten.abyssalalloy", 1000));
        DeepDarkRecipes.put(905, FluidRegistry.getFluidStack("molten.laurenium", 1000));
        DeepDarkRecipes.put(906, FluidRegistry.getFluidStack("molten.botmium", 1000));
        DeepDarkRecipes.put(907, FluidRegistry.getFluidStack("molten.titansteel", 1000));
        DeepDarkRecipes.put(908, FluidRegistry.getFluidStack("molten.octiron", 1000));
        DeepDarkRecipes.put(909, FluidRegistry.getFluidStack("molten.blacktitanium", 1000));
        DeepDarkRecipes.put(910, FluidRegistry.getFluidStack("molten.babbitalloy", 1000));
        DeepDarkRecipes.put(911, FluidRegistry.getFluidStack("molten.indalloy140", 1000));
        DeepDarkRecipes.put(912, FluidRegistry.getFluidStack("molten.quantum", 1000));
        DeepDarkRecipes.put(913, FluidRegistry.getFluidStack("molten.advancednitinol", 1000));
        DeepDarkRecipes.put(914, FluidRegistry.getFluidStack("plasma.advancednitinol", 1000));
        DeepDarkRecipes.put(915, FluidRegistry.getFluidStack("molten.hypogen", 1000));
        DeepDarkRecipes.put(916, FluidRegistry.getFluidStack("plasma.hypogen", 1000));
        DeepDarkRecipes.put(917, FluidRegistry.getFluidStack("molten.rhugnor", 1000));
        DeepDarkRecipes.put(918, FluidRegistry.getFluidStack("plasma.rhugnor", 1000));
        DeepDarkRecipes.put(919, FluidRegistry.getFluidStack("molten.force", 1000));
        DeepDarkRecipes.put(920, FluidRegistry.getFluidStack("plasma.force", 1000));
        DeepDarkRecipes.put(921, FluidRegistry.getFluidStack("molten.blackmetal", 1000));
        DeepDarkRecipes.put(922, FluidRegistry.getFluidStack("molten.whitemetal", 1000));
        DeepDarkRecipes.put(923, FluidRegistry.getFluidStack("molten.runite", 1000));
        DeepDarkRecipes.put(924, FluidRegistry.getFluidStack("plasma.runite", 1000));
        DeepDarkRecipes.put(925, FluidRegistry.getFluidStack("molten.dragonblood", 1000));
        DeepDarkRecipes.put(926, FluidRegistry.getFluidStack("plasma.dragonblood", 1000));
        DeepDarkRecipes.put(927, FluidRegistry.getFluidStack("molten.solarsaltcold", 1000));
        DeepDarkRecipes.put(928, FluidRegistry.getFluidStack("molten.solarsalthot", 1000));
        DeepDarkRecipes.put(929, FluidRegistry.getFluidStack("molten.seleniumdioxide", 1000));

        DeepDarkRecipes.put(930, FluidRegistry.getFluidStack("molten.seleniousacid", 1000));
        DeepDarkRecipes.put(931, FluidRegistry.getFluidStack("hydrogencyanide", 1000));
        DeepDarkRecipes.put(932, FluidRegistry.getFluidStack("molten.hydroxide", 1000));
        DeepDarkRecipes.put(933, FluidRegistry.getFluidStack("molten.ammonium", 1000));
        DeepDarkRecipes.put(934, FluidRegistry.getFluidStack("molten.hydrogenchloridemix", 1000));
        DeepDarkRecipes.put(935, FluidRegistry.getFluidStack("molten.aceticanhydride", 1000));
        DeepDarkRecipes.put(936, FluidRegistry.getFluidStack("molten.chloroaceticacid", 1000));
        DeepDarkRecipes.put(937, FluidRegistry.getFluidStack("molten.dichloroaceticacid", 1000));
        DeepDarkRecipes.put(938, FluidRegistry.getFluidStack("molten.trichloroaceticacid", 1000));
        DeepDarkRecipes.put(939, FluidRegistry.getFluidStack("molten.chloroaceticmixture", 1000));
        DeepDarkRecipes.put(940, FluidRegistry.getFluidStack("molten.solidacidcatalystmixture", 1000));
        DeepDarkRecipes.put(941, FluidRegistry.getFluidStack("molten.ethylcyanoacetate", 1000));
        DeepDarkRecipes.put(942, FluidRegistry.getFluidStack("molten.cyanoacrylatepolymer", 1000));
        DeepDarkRecipes.put(943, FluidRegistry.getFluidStack("molten.ethylcyanoacrylatesuperglue", 1000));
        DeepDarkRecipes.put(944, FluidRegistry.getFluidStack("molten.mutatedlivingsolder", 1000));
        DeepDarkRecipes.put(945, FluidRegistry.getFluidStack("molten.thoriumtetrafluoride", 1000));
        DeepDarkRecipes.put(946, FluidRegistry.getFluidStack("molten.thoriumhexafluoride", 1000));
        DeepDarkRecipes.put(947, FluidRegistry.getFluidStack("molten.uraniumtetrafluoride", 1000));
        DeepDarkRecipes.put(948, FluidRegistry.getFluidStack("molten.uraniumhexafluoride", 1000));
        DeepDarkRecipes.put(949, FluidRegistry.getFluidStack("molten.berylliumfluoride", 1000));
        DeepDarkRecipes.put(950, FluidRegistry.getFluidStack("molten.lithiumfluoride", 1000));
        DeepDarkRecipes.put(951, FluidRegistry.getFluidStack("molten.ammoniumbifluoride", 1000));
        DeepDarkRecipes.put(952, FluidRegistry.getFluidStack("molten.berylliumhydroxide", 1000));
        DeepDarkRecipes.put(953, FluidRegistry.getFluidStack("molten.ammoniumtetrafluoroberyllate", 1000));
        DeepDarkRecipes.put(954, FluidRegistry.getFluidStack("neptuniumhexafluoride", 1000));
        DeepDarkRecipes.put(955, FluidRegistry.getFluidStack("technetiumhexafluoride", 1000));
        DeepDarkRecipes.put(956, FluidRegistry.getFluidStack("seleniumhexafluoride", 1000));
        DeepDarkRecipes.put(957, FluidRegistry.getFluidStack("molten.sodiumfluoride", 1000));
        DeepDarkRecipes.put(958, FluidRegistry.getFluidStack("molten.lithiumtetrafluoroberyllatelftb", 1000));
        DeepDarkRecipes.put(959, FluidRegistry.getFluidStack("molten.lftrfuel3", 1000));
        DeepDarkRecipes.put(960, FluidRegistry.getFluidStack("molten.lftrfuel2", 1000));
        DeepDarkRecipes.put(961, FluidRegistry.getFluidStack("molten.lftrfuel1", 1000));
        DeepDarkRecipes.put(962, FluidRegistry.getFluidStack("molten.burntreactorfueli", 1000));
        DeepDarkRecipes.put(963, FluidRegistry.getFluidStack("molten.burntreactorfuelii", 1000));
        DeepDarkRecipes.put(964, FluidRegistry.getFluidStack("molten.uraniumdepletedmoltensaltusalt", 1000));
        DeepDarkRecipes.put(965, FluidRegistry.getFluidStack("molten.heliumspargedusalt", 1000));
        DeepDarkRecipes.put(966, FluidRegistry.getFluidStack("molten.phosphorousuraniumhexafluoridepuf6", 1000));
        DeepDarkRecipes.put(967, FluidRegistry.getFluidStack("molten.stablemoltensaltbase", 1000));
        DeepDarkRecipes.put(968, FluidRegistry.getFluidStack("molten.lftrfuelbase", 1000));
        DeepDarkRecipes.put(969, FluidRegistry.getFluidStack("molten.thoriumdepletedmoltensalttsalt", 1000));
        DeepDarkRecipes.put(970, FluidRegistry.getFluidStack("molten.thoriumberylliumdepletedmoltensalttbsalt", 1000));
        DeepDarkRecipes.put(971, FluidRegistry.getFluidStack("molten.fluorinespargedtsalt", 1000));
        DeepDarkRecipes.put(972, FluidRegistry.getFluidStack("molten.fluorinespargedtbsalt", 1000));
        DeepDarkRecipes.put(973, FluidRegistry.getFluidStack("molten.fluorinateduraniumhexafluoridefuf6", 1000));

        DeepDarkRecipes.put(974, FluidRegistry.getFluidStack("zirconiumtetrafluoride", 1000));
        DeepDarkRecipes.put(975, FluidRegistry.getFluidStack("fluid.fertiliser", 1000));
        DeepDarkRecipes.put(976, FluidRegistry.getFluidStack("fluid.un32fertiliser", 1000));
        DeepDarkRecipes.put(977, FluidRegistry.getFluidStack("fluid.un18fertiliser", 1000));
        DeepDarkRecipes.put(978, FluidRegistry.getFluidStack("fluid.raisinjuice", 1000));
        DeepDarkRecipes.put(979, FluidRegistry.getFluidStack("mobessence", 1000));
        DeepDarkRecipes.put(980, FluidRegistry.getFluidStack("fluid.coalgas", 1000));
        DeepDarkRecipes.put(981, FluidRegistry.getFluidStack("fluid.ethylbenzene", 1000));
        DeepDarkRecipes.put(982, FluidRegistry.getFluidStack("fluid.anthracene", 1000));
        DeepDarkRecipes.put(983, FluidRegistry.getFluidStack("fluid.coaltar", 1000));
        DeepDarkRecipes.put(984, FluidRegistry.getFluidStack("fluid.coaltaroil", 1000));
        DeepDarkRecipes.put(985, FluidRegistry.getFluidStack("fluid.sulfuriccoaltaroil", 1000));
        DeepDarkRecipes.put(986, FluidRegistry.getFluidStack("fluid.naphthalene", 1000));
        DeepDarkRecipes.put(987, FluidRegistry.getFluidStack("fluid.kerosene", 1000));
        DeepDarkRecipes.put(988, FluidRegistry.getFluidStack("fluid.rp1fuel", 1000));
        DeepDarkRecipes.put(989, FluidRegistry.getFluidStack("fluid.nitrogentetroxide", 1000));
        DeepDarkRecipes.put(990, FluidRegistry.getFluidStack("fluid.hydrazine", 1000));
        DeepDarkRecipes.put(991, FluidRegistry.getFluidStack("fluid.monomethylhydrazine", 1000));
        DeepDarkRecipes.put(992, FluidRegistry.getFluidStack("fluid.liquidhydrogen", 1000));
        DeepDarkRecipes.put(993, FluidRegistry.getFluidStack("fluid.formaldehyde", 1000));
        DeepDarkRecipes.put(994, FluidRegistry.getFluidStack("fluid.rocketfuelmixa", 1000));
        DeepDarkRecipes.put(995, FluidRegistry.getFluidStack("fluid.rocketfuelmixb", 1000));
        DeepDarkRecipes.put(996, FluidRegistry.getFluidStack("fluid.rocketfuelmixc", 1000));
        DeepDarkRecipes.put(997, FluidRegistry.getFluidStack("fluid.rocketfuelmixd", 1000));
        DeepDarkRecipes.put(998, FluidRegistry.getFluidStack("fluid.burntlifbef2thf4uf4", 1000));
        DeepDarkRecipes.put(999, FluidRegistry.getFluidStack("fluid.burntlifbef2zrf4uf4", 1000));
        DeepDarkRecipes.put(1000, FluidRegistry.getFluidStack("fluid.burntlifbef2zrf4u235", 1000));
        DeepDarkRecipes.put(1001, FluidRegistry.getFluidStack("fluid.impurelifbef2", 1000));
        DeepDarkRecipes.put(1002, FluidRegistry.getFluidStack("fluid.geneticmutagen", 1000));
        DeepDarkRecipes.put(1003, FluidRegistry.getFluidStack("fluid.raw.waste", 1000));
        DeepDarkRecipes.put(1004, FluidRegistry.getFluidStack("fluid.manure.slurry", 1000));
        DeepDarkRecipes.put(1005, FluidRegistry.getFluidStack("fluid.fertile.manure.slurry", 1000));
        DeepDarkRecipes.put(1006, FluidRegistry.getFluidStack("mud.red.slurry", 1000));
        DeepDarkRecipes.put(1007, FluidRegistry.getFluidStack("molten.teflon", 1000));
        DeepDarkRecipes.put(1008, FluidRegistry.getFluidStack("nitrobenzene", 1000));
        DeepDarkRecipes.put(1009, FluidRegistry.getFluidStack("aniline", 1000));
        DeepDarkRecipes.put(1010, FluidRegistry.getFluidStack("boricacid", 1000));
        DeepDarkRecipes.put(1011, FluidRegistry.getFluidStack("polyurethane", 1000));
        DeepDarkRecipes.put(1012, FluidRegistry.getFluidStack("cyclohexane", 1000));
        DeepDarkRecipes.put(1013, FluidRegistry.getFluidStack("cyclohexanone", 1000));
        DeepDarkRecipes.put(1014, FluidRegistry.getFluidStack("cadaverine", 1000));
        DeepDarkRecipes.put(1015, FluidRegistry.getFluidStack("putrescine", 1000));
        DeepDarkRecipes.put(1016, FluidRegistry.getFluidStack("fluid.2ethylanthraquinone", 1000));

        DeepDarkRecipes.put(1017, FluidRegistry.getFluidStack("fluid.2ethylanthrahydroquinone", 1000));
        DeepDarkRecipes.put(1018, FluidRegistry.getFluidStack("fluid.hydrogenperoxide", 1000));
        DeepDarkRecipes.put(1019, FluidRegistry.getFluidStack("fluid.lithiumperoxide", 1000));
        DeepDarkRecipes.put(1020, FluidRegistry.getFluidStack("carbondisulfide", 1000));
        DeepDarkRecipes.put(1021, FluidRegistry.getFluidStack("froth.zincflotation", 1000));
        DeepDarkRecipes.put(1022, FluidRegistry.getFluidStack("froth.nickelflotation", 1000));
        DeepDarkRecipes.put(1023, FluidRegistry.getFluidStack("froth.platinumflotation", 1000));
        DeepDarkRecipes.put(1024, FluidRegistry.getFluidStack("froth.pentlanditeflotation", 1000));
        DeepDarkRecipes.put(1025, FluidRegistry.getFluidStack("froth.redstoneflotation", 1000));
        DeepDarkRecipes.put(1026, FluidRegistry.getFluidStack("froth.spessartineflotation", 1000));
        DeepDarkRecipes.put(1027, FluidRegistry.getFluidStack("froth.grossularflotation", 1000));
        DeepDarkRecipes.put(1028, FluidRegistry.getFluidStack("froth.almandineflotation", 1000));
        DeepDarkRecipes.put(1029, FluidRegistry.getFluidStack("froth.pyropeflotation", 1000));
        DeepDarkRecipes.put(1030, FluidRegistry.getFluidStack("froth.monaziteflotation", 1000));
        DeepDarkRecipes.put(1031, FluidRegistry.getFluidStack("pineoil", 1000));
        DeepDarkRecipes.put(1032, FluidRegistry.getFluidStack("cryotheum", 1000));
        DeepDarkRecipes.put(1033, FluidRegistry.getFluidStack("pyrotheum", 1000));
        DeepDarkRecipes.put(1034, FluidRegistry.getFluidStack("propionicacid", 1000));
        DeepDarkRecipes.put(1035, FluidRegistry.getFluidStack("fermentation.base", 1000));
        DeepDarkRecipes.put(1036, FluidRegistry.getFluidStack("ureamix", 1000));
        DeepDarkRecipes.put(1037, FluidRegistry.getFluidStack("liquidresin", 1000));
        DeepDarkRecipes.put(1038, FluidRegistry.getFluidStack("butanol", 1000));

        for (int i = 0; i < DeepDarkRecipes.size(); i++) {
            FluidStack OutPutFluid = DeepDarkRecipes.get(i);
            addSingularityFluidRecipes("T10: DeepDark", OutPutFluid);
        }

        // T0
        VoidFliudRecipes.put("Ow", OverworldRecipes);
        VoidFliudRecipes.put("Ne", NetherRecipes);
        VoidFliudRecipes.put("TF", TwilightRecipes);
        VoidFliudRecipes.put("ED", TheEndRecipes);
        VoidFliudRecipes.put("EA", EndAsteroidRecipes);
        // T1
        VoidFliudRecipes.put("Mo", MoonRecipes);
        // T2
        VoidFliudRecipes.put("De", DeimosRecipes);
        VoidFliudRecipes.put("Ma", MarsRecipes);
        VoidFliudRecipes.put("Ph", PhobosRecipes);
        // T3
        VoidFliudRecipes.put("As", AsteroidsRecipes);
        VoidFliudRecipes.put("Ca", CallistoRecipes);
        VoidFliudRecipes.put("Ce", CeresRecipes);
        VoidFliudRecipes.put("Eu", EuropaRecipes);
        VoidFliudRecipes.put("Ga", GanymedeRecipes);
        VoidFliudRecipes.put("Rb", Ross128bRecipes);
        // T4
        VoidFliudRecipes.put("Io", IoRecipes);
        VoidFliudRecipes.put("Me", MercuryRecipes);
        VoidFliudRecipes.put("Ve", VenusRecipes);
        // T5
        VoidFliudRecipes.put("En", EnceladusRecipes);
        VoidFliudRecipes.put("Mi", MirandaRecipes);
        VoidFliudRecipes.put("Ob", OberonRecipes);
        VoidFliudRecipes.put("Ti", TitanRecipes);
        VoidFliudRecipes.put("Ra", Ross128baRecipes);
        // T6
        VoidFliudRecipes.put("Pr", ProteusRecipes);
        VoidFliudRecipes.put("Tr", TritonRecipes);
        // T7
        VoidFliudRecipes.put("Ha", HaumeaRecipes);
        VoidFliudRecipes.put("KB", KuiperbeltRecipes);
        VoidFliudRecipes.put("MM", MakemakeRecipes);
        VoidFliudRecipes.put("Pl", PlutoRecipes);
        // T8
        VoidFliudRecipes.put("BC", BarnardCRecipes);
        VoidFliudRecipes.put("BE", BarnardERecipes);
        VoidFliudRecipes.put("BF", BarnardFRecipes);
        VoidFliudRecipes.put("CB", CentauriBbRecipes);
        VoidFliudRecipes.put("TE", TCetiERecipes);
        VoidFliudRecipes.put("VB", VegaBRecipes);
        // T9
        VoidFliudRecipes.put("An", AnubisRecipes);
        VoidFliudRecipes.put("Ho", HorusRecipes);
        VoidFliudRecipes.put("Mh", MaahesRecipes);
        VoidFliudRecipes.put("MB", MehenBeltRecipes);
        VoidFliudRecipes.put("Np", NeperRecipes);
        VoidFliudRecipes.put("Se", SethRecipes);
        // T10
        VoidFliudRecipes.put("DD", DeepDarkRecipes);
    }
}
