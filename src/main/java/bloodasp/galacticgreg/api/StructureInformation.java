package bloodasp.galacticgreg.api;

import bloodasp.galacticgreg.api.Enums.TargetBlockPosition;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Vec3;

/**
 * Structural information container. Holds X/Y/Z and block/meta information
 */
public class StructureInformation {
	private Vec3 _mCoordinates;
	private TargetBlockPosition _mBlockPosition;
	private BlockMetaComb _mBlockMetaComb;
	private NBTTagCompound _mNBT;
	
	public TargetBlockPosition getBlockPosition()
	{
		return _mBlockPosition;
	}
	
	public int getX()
	{
		return (int) Math.round(_mCoordinates.xCoord);
	}
	
	public int getY()
	{
		return (int) Math.round(_mCoordinates.yCoord);
	}
	
	public int getZ()
	{
		return (int) Math.round(_mCoordinates.zCoord);
	}
	
	public BlockMetaComb getBlock()
	{
		return _mBlockMetaComb;
	}

	/**
	 * Init StructureInfo only with Coords and block position
	 * @param pCoordinates The coords in question
	 * @param pPosition The position-enum value
	 */
	public StructureInformation(Vec3 pCoordinates, TargetBlockPosition pPosition) {
		this(pCoordinates, pPosition, null);
	}
	
	/**
	 * Init StructureInfo with Coords, block position and a populated block/meta info
	 * @param pCoordinates The coords in question
	 * @param pPosition The position-enum value
	 * @param pTargetBlock The target block in question
	 */
	public StructureInformation(Vec3 pCoordinates, TargetBlockPosition pPosition, BlockMetaComb pTargetBlock) {
		this(pCoordinates, pPosition, pTargetBlock, null);
	}

	/**
	 * Init StructureInfo with Coords, block position and a populated block/meta info
	 * @param pCoordinates The coords in question
	 * @param pPosition The position-enum value
	 * @param pTargetBlock The target block in question
	 */
	public StructureInformation(Vec3 pCoordinates, TargetBlockPosition pPosition, BlockMetaComb pTargetBlock, NBTTagCompound pNBT) {
		_mCoordinates = pCoordinates;
		_mBlockPosition = pPosition;
		_mBlockMetaComb = pTargetBlock;
		_mNBT = pNBT;
	}

	public NBTTagCompound getNBTCompound() {
		return _mNBT;
	}
}
