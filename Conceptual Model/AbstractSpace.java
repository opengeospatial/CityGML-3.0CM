package CityGML.Core;

import ISO 19103 All.ISO 19103:2015 Conceptual schema language.Primitive types.Numerics.Integer;
import  Geometry.Geometric primitive.GM_Solid;
import  Geometry.Geometric primitive.GM_Point;
import  Geometry.Geometric aggregates.GM_MultiCurve;
import  Geometry.Geometric aggregates.GM_MultiSurface;

/**
 * @author kolbe/kutzner
 * @version 1.0
 * @created 01-Jan-2019 9:04:18 PM
 */
public abstract class AbstractSpace extends AbstractCityObject {

	public Integer occupancyDaytime;
	public Integer occupancyNighttime;
	/**
	 * Degree of openness of an abstract space.
	 */
	public SpaceType spaceType;
	public AbstractSpaceBoundary boundary;
	/**
	 * Relation to a  LOD1 solid geometry of AbstractSpace.
	 */
	public GM_Solid lod1Solid;
	/**
	 * Relation to a  LOD2 solid geometry of AbstractSpace.
	 */
	public GM_Solid lod2Solid;
	/**
	 * Relation to a  LOD3 solid geometry of AbstractSpace.
	 */
	public GM_Solid lod3Solid;
	/**
	 * Relation to a  LOD0 point geometry of AbstractSpace.
	 */
	public GM_Point lod0Point;
	/**
	 * Relation to a  LOD2 curve geometry of AbstractSpace.
	 */
	public GM_MultiCurve lod2MultiCurve;
	/**
	 * Relation to a  LOD3 curve geometry of AbstractSpace.
	 */
	public GM_MultiCurve lod3MultiCurve;
	/**
	 * Relation to a  LOD0 surface geometry of AbstractSpace.
	 */
	public GM_MultiSurface lod0MultiSurface;
	/**
	 * Relation to a  LOD2 surface geometry of AbstractSpace.
	 */
	public GM_MultiSurface lod2MultiSurface;
	/**
	 * Relation to a  LOD3 surface geometry of AbstractSpace.
	 */
	public GM_MultiSurface lod3MultiSurface;

	public AbstractSpace(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}