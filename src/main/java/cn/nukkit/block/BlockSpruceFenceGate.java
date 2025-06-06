package cn.nukkit.block;

import org.jetbrains.annotations.NotNull;

import static cn.nukkit.block.property.CommonBlockProperties.IN_WALL_BIT;
import static cn.nukkit.block.property.CommonBlockProperties.MINECRAFT_CARDINAL_DIRECTION;
import static cn.nukkit.block.property.CommonBlockProperties.OPEN_BIT;

public class BlockSpruceFenceGate extends BlockFenceGate {
    public static final BlockProperties PROPERTIES = new BlockProperties(SPRUCE_FENCE_GATE,  IN_WALL_BIT, MINECRAFT_CARDINAL_DIRECTION, OPEN_BIT);

    @Override
    @NotNull public BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockSpruceFenceGate() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockSpruceFenceGate(BlockState blockstate) {
        super(blockstate);
    }

    @Override
    public String getName() {
        return "Spruce Fence Gate";
    }
}