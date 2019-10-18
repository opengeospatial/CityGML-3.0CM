Change Log
==========

### 3.0.0-draft.2019.10.18.1 (2019-10-18)

#### Changes

* Moved attribute `surfaceMaterial` from `TrafficSpace`/`AuxiliaryTrafficSpace` to `TrafficArea`/`AuxiliaryTrafficArea`. [#78](https://github.com/opengeospatial/CityGML-3.0CM/issues/78)
* Class `ImplicitGeometry`: made attribute `transformationMatrix` mandatory. [#73](https://github.com/opengeospatial/CityGML-3.0CM/issues/73)
* Added `class`, `function`, and `usage` to `Door` and `Window`. [#76](https://github.com/opengeospatial/CityGML-3.0CM/issues/76)
* Changed composition between `AbstractBuilding` and `AbstractBuildingSubdivision` to aggregation. [#71](https://github.com/opengeospatial/CityGML-3.0CM/issues/71)
* Introduced the abstract classes `AbstractAppearance`, `AbstractDynamizer`, `AbstractGenericAttribute`, `AbstractPointCloud`, `AbstractVersion`, and `AbstractVersionTransition` to remove dependencies of the Core module to the thematic modules Appearance, Dynamizer, Generics, PointCloud, and Versioning. [#68](https://github.com/opengeospatial/CityGML-3.0CM/issues/68)
* Added code list classes to every module. [#10](https://github.com/opengeospatial/CityGML-3.0CM/issues/10)
* Corrected OCL constraint of the class `PointCloud`. [#91](https://github.com/opengeospatial/CityGML-3.0CM/issues/91)
* Added a `lod0MultiSurface` geometry property to `AbstractThematicSurface`. [#92](https://github.com/opengeospatial/CityGML-3.0CM/issues/92)
* Change stereotype of `ImplicitGeometry` from `<<FeatureType>>` to `<<ObjectType>>`. [#86](https://github.com/opengeospatial/CityGML-3.0CM/issues/86)
* An association from `CityObjectRelation` to `AbstractGenericAttribute` was defined in the Core module. This allowed for removing the class `GenericCityObjectRelation` in the Generics module. [#80](https://github.com/opengeospatial/CityGML-3.0CM/issues/80)

### 3.0.0-draft.2019.06.05.1 (2019-06-05)

#### Changes

* The attributes `occupancyDaytime` and `occupancyNighttime` were removed from the class `AbstractSpace`. Instead, an attribute `occupancy` was introduced to the classes `AbstractConstruction`, `TrafficSpace` and `TransportationComplex`, together with the data type `Occupancy` and the code lists `IntervalValue` and `OccupantTypeValue`. 
[#62](https://github.com/opengeospatial/CityGML-3.0CM/issues/62)
* To make the UML model fully language-independent, a language-independent `DoubleList` type was defined which replaces the `doubleList` type from GML. 
[#16](https://github.com/opengeospatial/CityGML-3.0CM/issues/16)
* To make the UML model fully language-independent, the classes `AbstractFeature` and `AbstractGML` were removed from the UML model; instead, a comment was added to describe which attributes are inherited from these classes in the GML encoding. 
[#18](https://github.com/opengeospatial/CityGML-3.0CM/issues/18)
* The attributes `minHeight` and `maxHeight` were added to the class `PlantCover`. 
[#34](https://github.com/opengeospatial/CityGML-3.0CM/issues/34)
* The attributes `rootBallDiameter` and `maxRootBallDepth` were added to the class `SolitaryVegetationObject`. 
[#50](https://github.com/opengeospatial/CityGML-3.0CM/issues/50)
* The class `AnyFeature` from ISO 19109 was added to the Core model to allow for the relation `featureMember` also in CityGML 3. 
[#61](https://github.com/opengeospatial/CityGML-3.0CM/issues/61)


### 3.0.0-draft.2019.04.09.1 (2019-04-09)

##### Changes

* The classes `Void` and `VoidSurface` were removed. In addition, the class `AbstractSpaceBoundary` was renamed to `AbstractThematicSurface` which allowed for removing the subclass `AbstractThematicSurface`. [#22](https://github.com/opengeospatial/CityGML-3.0CM/issues/22)
* `DoorSuface` and `WindowSurface` were made subclasses of the new superclass `AbstractFillingSurface` which in turn inherits from `AbstractSurfaceBoundary`. In addition, associations from `AbstractConstructionSurface` to `AbstractFillingSurface` and `ClosureSurface` were defined. Furthermore, a class `AbstractFillingElement` was added as superclass of `Door` and `Window` as well as an association from `AbstractConstructiveElement` to `AbstractFillingElement`. [#54](https://github.com/opengeospatial/CityGML-3.0CM/issues/54)
* The class `BridgeConstructionElement` was renamed to `BridgeConstructiveElement`. An attribute `isStructuralElement` was added to the class `AbstractConstructiveElement`. [#21](https://github.com/opengeospatial/CityGML-3.0CM/issues/21)
* The class `Room` was renamed to `BuildingRoom`. [#33](https://github.com/opengeospatial/CityGML-3.0CM/issues/33)
* The attribute `heightAboveGround` was renamed to `height`. [#35](https://github.com/opengeospatial/CityGML-3.0CM/issues/35)
* The attribute `heightReference` was renamed to `highReference`. [#56](https://github.com/opengeospatial/CityGML-3.0CM/issues/56)
* All role names (with few exceptions) use now the name of the target class as role name, starting with a lower case letter. [#55](https://github.com/opengeospatial/CityGML-3.0CM/issues/55)
* The attributes `volume` and `area` were added to the class `AbstractSpace`, the attribute `area` was added to the class `AbstractThematicSurface`. In addition, the data types `QualifiedVolume` and `QualifiedArea` as well as the code lists `QualifiedVolumeValue` and `QualifiedAreaValue` were defined. [#51](https://github.com/opengeospatial/CityGML-3.0CM/issues/51)
* The attribute `dateOfRenovation` was removed. Instead, an attribute `constructionEvent` was added together with the data type `ConstructionEvent` and the code list `EventValue`. [#53](https://github.com/opengeospatial/CityGML-3.0CM/issues/53)


### 3.0.0-draft.2018.12.17.1 (2018-12-17)

##### Changes
* Resolved multiple inheritance in the model by introducing a new stereotype `<<TopLevelFeatureType>>` that replaces the
previous abstract class `AbstractTopLevelFeature`. Top-level feature types are no longer derived from this abstract class,
but are now classified using the new stereotype.
[#32](https://github.com/opengeospatial/CityGML-3.0CM/issues/32), [#9](https://github.com/opengeospatial/CityGML-3.0CM/issues/9)
  * As a consequence, this allowed for reducing the concepts `Space` and `SpaceBoundary` to mostly abstract classes in the
  `Core` module.
* Replaced the aggregation between `Building` and `BuildingPart` by a composition.
[#31](https://github.com/opengeospatial/CityGML-3.0CM/issues/31)
* Removed `PointCloud` from the `Core` module and put it into a separate extension module.
[#14](https://github.com/opengeospatial/CityGML-3.0CM/issues/14)
* The classes `AbstractVoidSurface` and `AbstractVoid` have been made non-abstract and renamed to `Void` and `VoidSurface`.
* Simplified the `Construction` module. The semantics of `Void`, `VoidSurface` and openings (e.g. `Door`, `DoorSurface`)
are now more precise.
[#3](https://github.com/opengeospatial/CityGML-3.0CM/issues/3), [#22](https://github.com/opengeospatial/CityGML-3.0CM/issues/22)
* Removed the classes `ReliefSurface` and `GenericSurface` from the `Core` module.
* Simplified the `SpaceRelation` concept in the `Core` module to allow for relations between any city object.
  * This is now similar to the relation concept in IFC.

### GML application schemas and test datasets
GML application schemas and test datasets are available from the [releases section](https://github.com/opengeospatial/CityGML-3.0Encodings/releases) of the CityGML-3.0Encodings repository. Please make sure to download the matching release.
