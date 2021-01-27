Change Log
==========

### 3.0.0-draft.2020.09.17.1 (2020-09-17)

#### Changes

* Definitions for all classes, attributes, data types, enumerations, code lists, basic types, etc. were added.
* The color scheme for the UML model was simplified.
* The dependency to ISO 19136 was replaced by a dependency to ISO 19109.
* The new ADE mechanism was added.
* After review of the draft specification, several conceptual, editorial, typographical, and grammatical issues were applied. See [#117](https://github.com/opengeospatial/CityGML-3.0CM/issues/117), [#118](https://github.com/opengeospatial/CityGML-3.0CM/issues/118), [#119](https://github.com/opengeospatial/CityGML-3.0CM/issues/119), [#136](https://github.com/opengeospatial/CityGML-3.0CM/issues/136), [#137](https://github.com/opengeospatial/CityGML-3.0CM/issues/137), and [#124](https://github.com/opengeospatial/CityGML-3.0CM/issues/124) for details.

* Appearance module
  * Class `TextureAssociation`: The attribute `uri` was renamed to `target`. [#105](https://github.com/opengeospatial/CityGML-3.0CM/issues/105)

* Core module
  * The names of the following code lists were changed: `QualifiedVolumeValue` into `QualifiedVolumeTypeValue`, `QualifiedAreaValue` into `QualifiedAreaTypeValue`, and `MimeValue` -> `MimeTypeValue`.
  * The union class `CityModelMember` was added to allow for arbitrary order of the member properties of `CityModel` in encodings. [#38](https://github.com/opengeospatial/CityGML-3.0Encodings/issues/38)
  * The following changes were applied to avoid GML-dependency in the conceptual model: [#16](https://github.com/opengeospatial/CityGML-3.0CM/issues/16) and [#18](https://github.com/opengeospatial/CityGML-3.0CM/issues/18)
    - A language-independent `MeasureOrNilReasonList` type was added together with the classes `DoubleOrNilReasonList`, `DoubleOrNilReason`, `NilReason`, and `NilReasonEnumeration`.
    - The class `AbstractFeature` with the attributes `featureID`, `identifier`, `name`, and `description` was added, as well as the basic type `ID`.
    - The classes `AbstractPointCloud`, `AbstractSurfaceData`, `AbstractTimeseries`, and `Address` are derived now from the new class `AbstractFeature`.
    - Association between `ImplicitGeometry` and `GM_Object`: The role name `relativeGMLGeometry` was renamed to `relativeGeometry`.
    - Class `CityModelMember`: The type of the attribute `featureMember` was changed from `AnyFeature` to `AbstractFeature`.
  * The basic type `Code` was added.
  * The data type `XALAddressDetails` was renamed to `XALAddress` to support XAL v3.0.
  * The role `bounds` was removed. [#117](https://github.com/opengeospatial/CityGML-3.0CM/issues/117)
  * The name of the class `TopologicRelationTypeValue` was changed to `TopologicalRelationTypeValue`. [#132](https://github.com/opengeospatial/CityGML-3.0CM/issues/132)

* Building module
  * The bi-directional association between `BuildingUnit` and `Storey` was split into two uni-directional associations. [#119](https://github.com/opengeospatial/CityGML-3.0CM/issues/119)

* CityObjectGroup module
  * Class `Role`: The multiplicity of the attribute `role` was changed from [1] to [0..1].
  
* Construction module
  * Class `Door`: The names of the property types were changed from `WindowClassValue`, `WindowFunctionValue`, `WindowUsageValue` to `DoorClassValue`, `DoorFunctionValue`, `DoorUsageValue`. [#106](https://github.com/opengeospatial/CityGML-3.0CM/issues/106)

* Dynamizer module
  * The names of the following code lists were changed: `SensorConnectionValue` into `SensorConnectionTypeValue`, `StandardFileValue` into `StandardFileTypeValue`, `TabulatedFileValue` into `TabulatedFileTypeValue`, and `AuthenticationValue` into `AuthenticationTypeValue`.
  
* Generics module
  * The data type `CodeAttribute` was added.
  
* Transportation module
  * `TransportationSpaceClassValue`, `TransportationSpaceFunctionValue`, and `TransportationSpaceUsageValue` were removed. [#117](https://github.com/opengeospatial/CityGML-3.0CM/issues/117)

### 3.0.0-draft.2019.11.13.1 (2019-11-13)

#### Changes

* The attribute `engineeringCRS` was added to the class `CityModel` to define a local coordinate system in a CityGML file.
The attribute is encoded as metadata property in the XML Schema. [#45](https://github.com/opengeospatial/CityGML-3.0CM/issues/45)

* The Transportation module was refined. [#64](https://github.com/opengeospatial/CityGML-3.0CM/issues/64)
  * The new concepts `Waterway`, `Intersection`, and `Marking` were added
  * The `TransportationComplex` is now modelled as `AbstractTransportationSpace`, and the class
    `TransportationSpace` was removed. [#82](https://github.com/opengeospatial/CityGML-3.0CM/issues/82)
  * The classes `Track`, `Road`, `Waterway`, `Railway`, and `Square` have now the stereotype
   `<<TopLevelFeatureType>>`. [#81](https://github.com/opengeospatial/CityGML-3.0CM/issues/81)
  * The attributes `class`, `function`, and `usage` were removed from the class `AbstractTransportationSpace`
   and are now defined separately for the classes `Track`, `Road`, `Waterway`, `Railway`, and `Square` to
   allow individual codelists for each feature type.
  * `AuxiliaryTrafficSpace` is now a subclass of `AbstractUnoccupiedSpace` instead of `AbstractPhysicalSpace`.
  * The subclasses `Drain`, `Manhole`, and `RoadwayDamage` were removed and instead were added as entries to 
   the codelist for the `class` attribute of the feature type `Hole`.
  * The attribute `granularity` was added to the classes `TrafficSpace` and `AuxiliaryTrafficSpace` to be able
  to model traffic spaces at different levels of granularity. The allowed values `area`, `way` and `lane` 
  are defined as enumeration `GranularityValue`.
  * A class `HoleSurface` was introduced to be able to represent the boundary surface of a hole.
  * The property `trafficFlow` was renamed to `trafficDirection`, its datatype was changed to an enumeration, 
  and it was moved from the class `Section` to the two classes `AbstractTransportationSpace` and `TrafficSpace`.
  * The `GM_Complex` geometry as well as the `network` associations from `TrafficSpace` and 
  `AbstractTransportationSpace` to `GM_Complex` were removed from the Transportation module. Instead, the 
  property `lod0MultiCurve` was added to `AbstractSpace` in the Core module, which allows for representing every
  space through a `GM_MultiCurve` in LOD 0.

* The Dynamizer module was refined. [#94](https://github.com/opengeospatial/CityGML-3.0CM/issues/94)
  * The `SensorConnection` data type contains new attributes to connect to different Sensor APIs using HTTP 
  requests, MQTT Brokers, and Security parameters.
  * The `AbstractAtomicTimeseries` class no longer imports the OGC standards TimeSeriesML and 
  Observations & Measurements (O&M). Instead, by means of the three subclasses `TabulatedFileTimeseries`,
  `StandardFileTimeseries`, and `GenericTimeseries` it is now possible to link to standardized timeseries files
   such as TimeseriesML 1.0 and O&M 2.0, to link to tabulated files such as CSV, and to represent basic 
   time-value pairs for different types of properties such as integer, double, appearances, geometries, and 
   ImplicitGeometries. A main motivation for this change was to reduce the dependencies and tight coupling 
   to other standards, and thus to ease implementations.
  * The properties `firstTimestamp` and `lastTimestamp` were added to the class `AbstractTimeseries` to make
  them available for all subclasses.
  * The data type `URI` was changed to `CharacterString` for the attributes `attributeRef`, `linkToObservation`,
   and `linkToSensorDescription` to be able to represent XPath expressions.
  * The association `isComponent` was renamed into `component`.

- The Relief module was refined. [#97](https://github.com/opengeospatial/CityGML-3.0CM/issues/97)
  * The classes `ReliefFeature` and `AbstractReliefComponent` are now defined as subclasses of the class 
  `AbstractSpaceBoundary`. The class `AbstractSpaceBoundary`, in turn, was introduced in the Core module as
  superclass of `AbstractThematicSurface`.
  * The class `TINRelief` is again associated with `GM_TriangulatedSurface` as in CityGML 2.0.
  * The class `MassPointRelief` is again associated with `GM_MultiPoint` as in CityGML 2.0. In addition, it is
   can also be represented using an `AbstractPointCloud`. 
  
- Building module
  * The class `RoomElevationReferenceValue` was changed from enumeration to code list.
  
- Construction module
  * The class `ElevationReferenceValue` was changed from enumeration to code list.

- Generics module
  * The attribute `name` was moved from the class `AbstractGenericAttribute` to its subclasses `GenericAttributeSet`, `StringAttribute`, `IntAttribute`, `DoubleAttribute`, `DateAttribute`, `UriAttribute`, and `MeasureAttribute`.
  
- WaterBody module
  * The class `WaterClosureSurface` was removed, because the closure surface is already defined by the class `ClosureSurface` in the `Core` module.


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
* The association between `AbstractSpace` and `AbstractThematicSurface` was made uni-directional. In the thematic modules Construction, Building, Transportation, and WaterBody, the subsets of the bounds-boundary relation were replaced by the original bounds-boundary relation. In this way, no additional relationships are derived in the GML application schemas. [#21](https://github.com/opengeospatial/CityGML-3.0Encodings/issues/21)
* Changed sequence of properties in `core:AbstractSpaceType`. [#22](https://github.com/opengeospatial/CityGML-3.0Encodings/issues/22)

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
