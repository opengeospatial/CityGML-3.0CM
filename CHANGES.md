Change Log
==========

### 3.0.0-draft.2019.04.05.1 (2019-04-05)

##### Changes

* The class `BridgeConstructionElement` was renamed to `BridgeConstructiveElement`. An attribute `isStructuralElement` was added to the class `AbstractConstructiveElement`. [#21](https://github.com/opengeospatial/CityGML-3.0CM/issues/21)
* The class `Room` was renamed to `BuildingRoom`. [#33](https://github.com/opengeospatial/CityGML-3.0CM/issues/33)
* The attribute `heightAboveGround` was renamed to `height`. [#35](https://github.com/opengeospatial/CityGML-3.0CM/issues/35)
* The attribute `heightReference` was renamed to `highReference`. [#56](https://github.com/opengeospatial/CityGML-3.0CM/issues/56)
* All role names (with few exceptions) use now the name of the target class as role name, starting with a lower case letter. [#55](https://github.com/opengeospatial/CityGML-3.0CM/issues/55)
* The attributes `volume` and `area` were added to the class `AbstractSpace`, the attribute `area` was added to the class `AbstractSpaceBoundary`. In addition, the data types `QualifiedVolume` and `QualifiedArea` as well as the code lists `QualifiedVolumeValue` and `QualifiedAreaValue` were defined. [#51](https://github.com/opengeospatial/CityGML-3.0CM/issues/51)
* The classes `Void` and `VoidSurface` were removed. In addition, the class `AbstractSpaceBoundary` was renamed to `AbstractThematicSurface` which allowed for removing the subclass `AbstractThematicSurface`. [#22](https://github.com/opengeospatial/CityGML-3.0CM/issues/22)
* The attribute `dateOfRenovation` was removed. Instead, an attribute `constructionEvent` was added together with the data type `ConstructionEvent` and the code list `EventValue`. [#53](https://github.com/opengeospatial/CityGML-3.0CM/issues/53)
* `DoorSuface` and `WindowSurface` were made subclasses of the new superclass `AbstractFillingSurface` which in turn inherits from `AbstractSurfaceBoundary`. In addition, associations from `AbstractConstructionSurface` to `AbstractFillingSurface` and `ClosureSurface` were defined. Furthermore, a class `AbstractFillingElement` was added as superclass of `Door` and `Window` as well as an association from `AbstractConstructiveElement` to `AbstractFillingElement`. [#54](https://github.com/opengeospatial/CityGML-3.0CM/issues/54)

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

##### GML application schemas and test datasets
GML application schemas and test datasets are available from the [releases section](https://github.com/opengeospatial/CityGML-3.0Encodings/releases/tag/3.0.0-draft.2018.12.17.1) of the CityGML-3.0Encodings repository. Please make sure to download the matching release.
