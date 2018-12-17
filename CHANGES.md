Change Log
==========

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
